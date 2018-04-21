/*
 * 		SimExec.java
 * 
 * 
 * 
 */


import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.awt.Graphics.*;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import java.io.StringWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

import com.bytecode.opencsv.CSVReader;


import java.util.Date;
import java.text.SimpleDateFormat;


public class SimExec {

	private JFrame frame;
	private Container contentPane; 
	private SpringLayout layout;

	//Create all elements
	//	Title/Instruction section
	private JLabel lbl_title_instructions;
	private JLabel lbl_title_loadstatus;
	private JButton btn_title_createconfig;
	private JButton btn_title_loadconfig;

	//	Middle/Result config section
	private JLabel lbl_middle_title;
	private JLabel lbl_middle_note1;
	private JLabel lbl_middle_noteX;
	private JLabel lbl_middle_noteY;
	private JLabel lbl_middle_noteZ;


	private JLabel lbl_middle_Xmax;
	private JTextField txt_middle_Xmax;

	private JLabel lbl_middle_Xmin;
	private JTextField txt_middle_Xmin;

	private JLabel lbl_middle_Ymax;
	private JTextField txt_middle_Ymax;

	private JLabel lbl_middle_Ymin;
	private JTextField txt_middle_Ymin;

	private JLabel lbl_middle_Zmax;
	private JTextField txt_middle_Zmax;

	private JLabel lbl_middle_Zmin;
	private JTextField txt_middle_Zmin;

	private JLabel lbl_middle_resolution;
	private JTextField txt_middle_resolution;

	//	Bottom/Output section
	private JLabel lbl_bottom_outputlocation;
	private JButton btn_setOutput;
	private JButton btn_Execute;
	
	
	//	Local storage
	private String Output_Dir = "";  
	private String Config_Dir = "";
	
	
	//Simulation arguments
	


	public SimExec(){
		//Begins new class for gui
		createAndShowGUI();

	}

	private void createAndShowGUI(){

		//Create and set up the window.
		frame = new JFrame("DBS Simulation Executor");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = frame.getContentPane();

		layout = new SpringLayout();
		contentPane.setLayout(layout);


		//Create all elements
		//	Title/Instruction section
		lbl_title_instructions = new JLabel("This dialog is used to setup and execute a simulation.");
		lbl_title_loadstatus = new JLabel("None loaded");
		btn_title_createconfig = new JButton("Create Configuration");
		btn_title_loadconfig = new JButton("Load Configuration");

		//	Middle/Result config section
		lbl_middle_title = new JLabel("Result Configuration - Specify area focus");
		lbl_middle_note1 = new JLabel("Domain limits (min/max) are currently:");
		lbl_middle_noteX = new JLabel("X: -20/20");
		lbl_middle_noteY = new JLabel("Y: -20/20");
		lbl_middle_noteZ = new JLabel("Z: -20/20");


		lbl_middle_Xmax = new JLabel("X Max");
		txt_middle_Xmax = new JTextField("",5);

		lbl_middle_Xmin = new JLabel("X Min");
		txt_middle_Xmin = new JTextField("",5);

		lbl_middle_Ymax = new JLabel("Y Max");
		txt_middle_Ymax = new JTextField("",5);

		lbl_middle_Ymin = new JLabel("Y Min");
		txt_middle_Ymin = new JTextField("",5);

		lbl_middle_Zmax = new JLabel("Z Max");
		txt_middle_Zmax = new JTextField("",5);

		lbl_middle_Zmin = new JLabel("Z Min");
		txt_middle_Zmin = new JTextField("",5);

		lbl_middle_resolution = new JLabel("Resolution (mm):");
		txt_middle_resolution = new JTextField("",5);

		//	Bottom/Output section
		lbl_bottom_outputlocation = new JLabel("Output Location: ");
		btn_setOutput = new JButton("Set Output");
		btn_Execute = new JButton("Execute Simulation");


		//Add components to content pane
		contentPane.add(lbl_title_instructions);
		contentPane.add(btn_title_createconfig);
		contentPane.add(lbl_title_loadstatus);
		contentPane.add(btn_title_loadconfig);

		contentPane.add(lbl_middle_title);
		contentPane.add(lbl_middle_note1);
		contentPane.add(lbl_middle_noteX);
		contentPane.add(lbl_middle_noteY);
		contentPane.add(lbl_middle_noteZ);

		contentPane.add(lbl_middle_Xmax);
		contentPane.add(lbl_middle_Xmin);
		contentPane.add(txt_middle_Xmax);
		contentPane.add(txt_middle_Xmin);

		contentPane.add(lbl_middle_Ymax);
		contentPane.add(lbl_middle_Ymin);
		contentPane.add(txt_middle_Ymax);
		contentPane.add(txt_middle_Ymin);

		contentPane.add(lbl_middle_Zmax);
		contentPane.add(lbl_middle_Zmin);
		contentPane.add(txt_middle_Zmax);
		contentPane.add(txt_middle_Zmin);

		contentPane.add(lbl_middle_resolution);
		contentPane.add(txt_middle_resolution);


		contentPane.add(lbl_bottom_outputlocation);
		contentPane.add(btn_setOutput);
		contentPane.add(btn_Execute);


		//Layout components
		setLayout();
		
		//Configure events
		EventSetup();
		
		//Display the window and set size
		frame.setSize(500,400);
		frame.setVisible(true);

	}

	private void setLayout(){

		//Add constraints to layout

		//
		//Title Section
		//
		layout.putConstraint(SpringLayout.WEST, lbl_title_instructions, 10, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, lbl_title_instructions, 10, SpringLayout.NORTH, contentPane);

		layout.putConstraint(SpringLayout.WEST, btn_title_createconfig, 10, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, btn_title_createconfig, 20, SpringLayout.NORTH, lbl_title_instructions);

		layout.putConstraint(SpringLayout.WEST, btn_title_loadconfig, 10, SpringLayout.EAST, btn_title_createconfig);
		layout.putConstraint(SpringLayout.NORTH, btn_title_loadconfig, 20, SpringLayout.NORTH, lbl_title_instructions);

		layout.putConstraint(SpringLayout.WEST, lbl_title_loadstatus, 10, SpringLayout.EAST, btn_title_loadconfig);
		layout.putConstraint(SpringLayout.NORTH, lbl_title_loadstatus, 20, SpringLayout.NORTH, lbl_title_instructions);

		//
		//Middle Section
		//

		layout.putConstraint(SpringLayout.WEST, lbl_middle_title, 10, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, lbl_middle_title, 40, SpringLayout.NORTH, btn_title_createconfig);
		//	X config
		layout.putConstraint(SpringLayout.WEST, lbl_middle_Xmax, 10, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.WEST, txt_middle_Xmax, 10, SpringLayout.EAST, lbl_middle_Xmax);
		layout.putConstraint(SpringLayout.NORTH, lbl_middle_Xmax, 20, SpringLayout.NORTH, lbl_middle_title);
		layout.putConstraint(SpringLayout.NORTH, txt_middle_Xmax, 20, SpringLayout.NORTH, lbl_middle_title);

		layout.putConstraint(SpringLayout.WEST, lbl_middle_Xmin, 10, SpringLayout.EAST, txt_middle_Xmax);
		layout.putConstraint(SpringLayout.WEST, txt_middle_Xmin, 10, SpringLayout.EAST, lbl_middle_Xmin);
		layout.putConstraint(SpringLayout.NORTH, lbl_middle_Xmin, 20, SpringLayout.NORTH, lbl_middle_title);
		layout.putConstraint(SpringLayout.NORTH, txt_middle_Xmin, 20, SpringLayout.NORTH, lbl_middle_title);

		//	Y config
		layout.putConstraint(SpringLayout.WEST, lbl_middle_Ymax, 10, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.WEST, txt_middle_Ymax, 10, SpringLayout.EAST, lbl_middle_Ymax);
		layout.putConstraint(SpringLayout.NORTH, lbl_middle_Ymax, 20, SpringLayout.NORTH, lbl_middle_Xmax);
		layout.putConstraint(SpringLayout.NORTH, txt_middle_Ymax, 20, SpringLayout.NORTH, lbl_middle_Xmax);

		layout.putConstraint(SpringLayout.WEST, lbl_middle_Ymin, 10, SpringLayout.EAST, txt_middle_Ymax);
		layout.putConstraint(SpringLayout.WEST, txt_middle_Ymin, 10, SpringLayout.EAST, lbl_middle_Ymin);
		layout.putConstraint(SpringLayout.NORTH, lbl_middle_Ymin, 20, SpringLayout.NORTH, lbl_middle_Xmax);
		layout.putConstraint(SpringLayout.NORTH, txt_middle_Ymin, 20, SpringLayout.NORTH, lbl_middle_Xmax);

		//	Z config
		layout.putConstraint(SpringLayout.WEST, lbl_middle_Zmax, 10, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.WEST, txt_middle_Zmax, 10, SpringLayout.EAST, lbl_middle_Zmax);
		layout.putConstraint(SpringLayout.NORTH, lbl_middle_Zmax, 20, SpringLayout.NORTH, lbl_middle_Ymax);
		layout.putConstraint(SpringLayout.NORTH, txt_middle_Zmax, 20, SpringLayout.NORTH, lbl_middle_Ymax);

		layout.putConstraint(SpringLayout.WEST, lbl_middle_Zmin, 10, SpringLayout.EAST, txt_middle_Zmax);
		layout.putConstraint(SpringLayout.WEST, txt_middle_Zmin, 10, SpringLayout.EAST, lbl_middle_Zmin);
		layout.putConstraint(SpringLayout.NORTH, lbl_middle_Zmin, 20, SpringLayout.NORTH, lbl_middle_Ymax);
		layout.putConstraint(SpringLayout.NORTH, txt_middle_Zmin, 20, SpringLayout.NORTH, lbl_middle_Ymax);

		//	Resolution
		layout.putConstraint(SpringLayout.WEST, lbl_middle_resolution, 10, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.WEST, txt_middle_resolution, 10, SpringLayout.EAST, lbl_middle_resolution);
		layout.putConstraint(SpringLayout.NORTH, lbl_middle_resolution, 25, SpringLayout.NORTH, lbl_middle_Zmin);
		layout.putConstraint(SpringLayout.NORTH, txt_middle_resolution, 25, SpringLayout.NORTH, lbl_middle_Zmin);


		//	Notes
		layout.putConstraint(SpringLayout.WEST, lbl_middle_note1, 10, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, lbl_middle_note1, 20, SpringLayout.NORTH, lbl_middle_resolution);
		layout.putConstraint(SpringLayout.WEST, lbl_middle_noteX, 10, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, lbl_middle_noteX, 20, SpringLayout.NORTH, lbl_middle_note1);
		layout.putConstraint(SpringLayout.WEST, lbl_middle_noteY, 10, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, lbl_middle_noteY, 20, SpringLayout.NORTH, lbl_middle_noteX);
		layout.putConstraint(SpringLayout.WEST, lbl_middle_noteZ, 10, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, lbl_middle_noteZ, 20, SpringLayout.NORTH, lbl_middle_noteY);


		//
		//Bottom section
		//

		//	Output
		layout.putConstraint(SpringLayout.WEST, btn_setOutput, 10, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, btn_setOutput, 50, SpringLayout.NORTH, lbl_middle_noteZ);

		layout.putConstraint(SpringLayout.WEST, lbl_bottom_outputlocation, 10, SpringLayout.EAST, btn_setOutput);
		layout.putConstraint(SpringLayout.NORTH, lbl_bottom_outputlocation, 50, SpringLayout.NORTH, lbl_middle_noteZ);

		//	Execute
		layout.putConstraint(SpringLayout.WEST, btn_Execute, 10, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, btn_Execute, 30, SpringLayout.NORTH, btn_setOutput);

	}


	private void EventSetup(){

		//Set events and call-backs
		btn_title_createconfig.setActionCommand("create");
		btn_title_loadconfig.setActionCommand("load");
		btn_setOutput.setActionCommand("setOut");
		btn_Execute.setActionCommand("execute");

		btn_title_createconfig.addActionListener(new ButtonClickListener());
		btn_title_loadconfig.addActionListener(new ButtonClickListener());
		btn_setOutput.addActionListener(new ButtonClickListener());
		btn_Execute.addActionListener(new ButtonClickListener());


	}

	private class ButtonClickListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			String command = e.getActionCommand();  
			
			if(command.equals("create")){
				//Creates an instance of config creator
				//and opens window
								
				ConfigCreator ConfCre = new ConfigCreator();
				

			}else if(command.equals("load")){
				//Loads existing config and sets up args
				// for the simulation
				JFileChooser openFile = new JFileChooser();
				openFile.showOpenDialog(frame);

				//Store location
				Config_Dir = openFile.getSelectedFile().getAbsolutePath();				
							
				//LoadAndPopulate(openFile.getSelectedFile().getAbsolutePath());
				
				//Show location
				lbl_title_loadstatus.setText(Config_Dir);


			}else if(command.equals("setOut")){
				//Set the output file for the
				//simulation
				JFileChooser outFile = new JFileChooser();
				outFile.showOpenDialog(frame);
				
				//Store location
				Output_Dir = outFile.getSelectedFile().getAbsolutePath();
				
				//Show location
				lbl_bottom_outputlocation.setText(Output_Dir);
				
				
			}else if(command.equals("execute")){
				
				//Create new config file for SimEngine
				//using the set preferences
				
				JFileChooser outFile = new JFileChooser();
				outFile.showSaveDialog(frame);
				
				Date date = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MMdd_HH_mm");
								
				//Store location
				 writeSettingsFile(outFile.getSelectedFile().getAbsolutePath(),"Model_Exec_"+sdf.format(date));
					
				//Execute SimEngine through 
				//external COMSOL call
				
				
			}

		}		
	}
	
	private String[] LoadAndParse(String dirLoad){

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
			
			reader.close();
			
		}catch(IOException e){

		}
		
		return Potentials;
	}
	
	private void writeSettingsFile(String dirSave, String modelName){
		//
		//Take settings and store in file
			
		//Grabs and writes
		//Grabs text field data
		try{
			
			FileWriter writer = new FileWriter(dirSave);
			BufferedWriter sw = new BufferedWriter(writer);
			
			//Read in Potential Settings
			String[] Potentials = new String[32];
			
			Potentials = LoadAndParse(Config_Dir);
			
			//Write Model name and save directory
			sw.write(modelName);
			sw.newLine();
			sw.write(dirSave);
			sw.newLine();
			
			//Write potential values
			for(int i=0;i<32;i++){
				sw.write(Potentials[i]);
				sw.newLine();
			}
			
			//Write results settings
			sw.write(txt_middle_Xmax.getText());
			sw.newLine();
			sw.write(txt_middle_Xmin.getText());
			sw.newLine();
			sw.write(txt_middle_Ymax.getText());
			sw.newLine();
			sw.write(txt_middle_Ymin.getText());
			sw.newLine();
			sw.write(txt_middle_Zmax.getText());
			sw.newLine();
			sw.write(txt_middle_Zmin.getText());
			sw.newLine();
			sw.write(txt_middle_resolution.getText());
			sw.newLine();
			sw.write(Output_Dir);
			sw.newLine();
			
			
			sw.close();
			
			
		}catch(IOException e){
		
		}
		  
		
	}

	public static void main(String[] args) {

		SimExec Sesame = new SimExec();

	}


}
