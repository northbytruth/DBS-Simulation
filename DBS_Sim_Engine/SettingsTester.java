import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;

import java.util.Date;
import java.text.SimpleDateFormat;

public class SettingsTester{

	//	Model location and name
	private static String globalModelName = "";
	private static String globalModelDIR = "";
	
	//	Config Creator Import
	private static String[] globalPotentialValues = new String[32];
	
	//	Results Settings
	private static String globalOutputXMax = "";
	private static String globalOutputXMin = "";
	
	private static String globalOutputYMax = "";
	private static String globalOutputYMin = "";
	
	private static String globalOutputZMax = "";
	private static String globalOutputZMin = "";
	
	private static String globalOutputRes = "";
	
	//	Results Output
	private static String globalOutputDIR = "";

public static void loadGlobals(String fileDir) throws FileNotFoundException{
		
		//
		//Read settings file
		
		FileReader fr;
		
		int FileLen = 43;
		
		String[] FileContents = new String[FileLen];
			
		fr = new FileReader(fileDir);
		
		BufferedReader tr_fr= new BufferedReader(fr);
				
		try{
			for(int i=0;i<FileLen;i++){
				
				FileContents[i] = tr_fr.readLine();
								
			}
		}catch(IOException e){
			e.printStackTrace();
		}
		
		//Parse string arguments
		//in global variables
		//	Model location and name
		globalModelName = FileContents[1];
		globalModelDIR = FileContents[2];
		
		//	Config Creator Import
		for(int i=0;i<32;i++){
			globalPotentialValues[i]=FileContents[i+2];
		}
		
		//	Results Settings
		globalOutputXMax = FileContents[34];
		globalOutputXMin = FileContents[35];
		
		globalOutputYMax = FileContents[36];
		globalOutputYMin = FileContents[37];
		
		globalOutputZMax = FileContents[38];
		globalOutputZMin = FileContents[39];
		
		globalOutputRes = FileContents[40];
		
		//	Results Output
		globalOutputDIR = FileContents[41];
		
	}



	public static void main(String[] args){
	
		try{
		loadGlobals(args[0]);
		}catch(FileNotFoundException e){
		}
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MMdd_HH_mm");
		
		System.out.println(sdf.format(date));
		
		System.out.println("Model Name:" + globalModelName);
		System.out.println("Model DIR:" + globalModelDIR);
		System.out.println("First Potential: " + globalPotentialValues[0]);
		System.out.println("Last Potential: " + globalPotentialValues[31]);
		System.out.println("globalOutputXMax: " + globalOutputXMax);
		System.out.println("globalOutputXMin: " + globalOutputXMin);
		System.out.println("globalOutputYMax: " + globalOutputYMax);
		System.out.println("globalOutputYMin: " + globalOutputYMin);
		System.out.println("globalOutputZMax: " + globalOutputZMax);
		System.out.println("globalOutputZMin: " + globalOutputZMin);
		System.out.println("globalOutputRes: " + globalOutputRes);
		System.out.println("globalOutputDIR: " + globalOutputDIR);
		
	}




}