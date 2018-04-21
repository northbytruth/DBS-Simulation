
/*
		DBS Config Creator

Description: To create configurations quickly and allow the 
batch execution of them.

*/

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import com.bytecode.opencsv.CSVReader;

public class ConfigCreator{

	//Declare the gui components on the form
	//Main and layout
	private JLabel lbl_title;
	private JFrame frame;
	private Container contentPane;
	private SpringLayout layout;
	
	//diagram right aligned
	private JLabel picLabel;
	
	//form items label||text
	private JLabel label;
	private JTextField text;
	
	private JLabel[] labels;
	private JTextField texts[];
	
	//buttons
	private JButton LoadButton;	
	private JButton SaveButton;
	
	public ConfigCreator(){
		createAndShowGUI();
	}

    private void createAndShowGUI() {
        //Create and set up the window.
        frame = new JFrame("DBS Config Creator");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = frame.getContentPane();
		layout = new SpringLayout();
        contentPane.setLayout(layout);
		
		//Create labels and text boxes
		lbl_title = new JLabel("DBS Config Creator");
		//dynamically generate form
		labels = new JLabel[32];
		texts = new JTextField[32];
		
		for(int i=0;i<32;i++){
			labels[i] = new JLabel("Electrode "+(i+1)+" Potential: ");
			texts[i] = new JTextField("0",5);
			contentPane.add(labels[i]);
			contentPane.add(texts[i]);
		}
		
		
		//Add diagram of electrode location
		try{
		    //String dir = System.getProperty("user.dir");
			//BufferedImage myPicture = ImageIO.read(new File(dir+"/diag.gif"));
			BufferedImage myPicture = ImageIO.read(this.getClass().getResource("diag.gif"));
			picLabel = new JLabel(new ImageIcon(myPicture));
			contentPane.add(picLabel);	
		}catch(IOException e){
			text.setText("Error "+e);
		}
		
		
        //Add components to content pane
        contentPane.add(lbl_title);		
        
        EventSetup();

		//Display the window and set size
		frame.setSize(500,800);
        frame.setVisible(true);
    }
	
	private void EventSetup(){
		
		//Declare buttons
		LoadButton = new JButton("Load");
		SaveButton = new JButton("Save");
		
		//Set events and callbacks
		LoadButton.setActionCommand("Load");
		SaveButton.setActionCommand("Save");
		
		LoadButton.addActionListener(new ButtonClickListener());
		SaveButton.addActionListener(new ButtonClickListener());
		
		contentPane.add(LoadButton);
		contentPane.add(SaveButton);
		
		setLayout();
	}
	
	private void setLayout(){
		
		//Add constraints to layout
		
		//Title
        layout.putConstraint(SpringLayout.WEST, lbl_title, 10, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, lbl_title, 10, SpringLayout.NORTH, contentPane);
		
		//First label
		layout.putConstraint(SpringLayout.WEST, labels[0], 10, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, labels[0], 20, SpringLayout.NORTH, lbl_title);
		
		//First text box
		layout.putConstraint(SpringLayout.WEST, texts[0], 180,SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, texts[0], 20,SpringLayout.NORTH, lbl_title);
		
		for(int i=1;i<32;++i){
		
			//ith label
			layout.putConstraint(SpringLayout.WEST, labels[i], 10, SpringLayout.WEST, contentPane);
			layout.putConstraint(SpringLayout.NORTH, labels[i], 20, SpringLayout.NORTH, labels[i-1]);
			
			//ith text box
			layout.putConstraint(SpringLayout.WEST, texts[i], 180,SpringLayout.WEST, contentPane);
			layout.putConstraint(SpringLayout.NORTH, texts[i], 20,SpringLayout.NORTH, labels[i-1]);
					
		}
		
		//Load button
		layout.putConstraint(SpringLayout.WEST, LoadButton, 5,SpringLayout.EAST, labels[31]);
		layout.putConstraint(SpringLayout.NORTH, LoadButton, 40,SpringLayout.NORTH, labels[31]);
		//Save button
		layout.putConstraint(SpringLayout.WEST, SaveButton, 5,SpringLayout.EAST, LoadButton);
		layout.putConstraint(SpringLayout.NORTH, SaveButton, 40,SpringLayout.NORTH, labels[31]);
		
		//Diagram
		layout.putConstraint(SpringLayout.WEST, picLabel, 10,SpringLayout.EAST, texts[0]);
		layout.putConstraint(SpringLayout.NORTH, picLabel, 20,SpringLayout.NORTH, contentPane);
		
	}
	
	
   private class ButtonClickListener implements ActionListener{
      public void actionPerformed(ActionEvent e) {
         String command = e.getActionCommand();  
         if(command.equals("Load")){
		 
			JFileChooser openFile = new JFileChooser();
			openFile.showOpenDialog(frame);
			
			LoadAndPopulate(openFile.getSelectedFile().getAbsolutePath());
			
         }else if(command.equals("Save")){
		 
			JFileChooser saveFile = new JFileChooser();
			saveFile.showSaveDialog(frame);
			
			SaveAndGrab(saveFile.getSelectedFile().getAbsolutePath());
			
		 }
		 
      }		
   }
   
   private void LoadAndPopulate(String dirLoad){
   
		//Loads file from given location and populates form
		//Check dir and type
		
		
		//Read CSV
		
		CSVReader reader;
		
		String[] Potentials = new String[32];
		
		int i = 0;
		
		try{
			reader = new CSVReader(new FileReader(dirLoad));						
	
			String[] nextline;
				
			while((nextline= reader.readNext())!=null){
				if(i<32){//only grabs potential values
					Potentials[i]=nextline[1];
				}
				i++;
			}
		}catch(IOException e){
			
		}
		
		//Add to text fields
		for(i=0;i<32;i++){
			texts[i].setText(Potentials[i]);
		}
		
		
   }
   
   private void SaveAndGrab(String dirSave){
   
		//Grabs and writes to a csv
		//Grabs text field data
		try{
			
			FileWriter writer = new FileWriter(dirSave);
			StringWriter sw = new StringWriter();
			
			for(int i=0;i<32;i++){
				sw.write(new String("e"+i+","+texts[i].getText()+"\n"));
			}
			
			//Writes to CSV
			writer.write(sw.toString());
			writer.close();
			
		}catch(IOException e){
		
		}
		  
   }
   
   

}
