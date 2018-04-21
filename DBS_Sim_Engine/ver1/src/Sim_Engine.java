
import com.comsol.model.*;
import com.comsol.model.util.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Date;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;
import javax.swing.JFileChooser;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

import org.apache.commons.lang3.ArrayUtils;


public class Sim_Engine {

	//	Global parameters 
	//		Set by Config file
	private static String globalSettingsDIR = "";
	
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
	
	public static void main(String[] args) {
		
		//Load in global parameters from a general
		//settings in the same folder as class file 
		JFileChooser openSettings = new JFileChooser();
		openSettings.showOpenDialog(null);
		
		String SettingsDIR= openSettings.getSelectedFile().getAbsolutePath();
		
		//Read file and parse arguments into global parameters		
		if(!SettingsDIR.isEmpty()){
			try{
			loadGlobals(SettingsDIR);
			}catch(FileNotFoundException e){
				e.printStackTrace();
			}
			
		}
		
		//Execute simulation with set parameters
		run();
	}
	
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

	public static Model run() {
		//Model Creation begin
		Model model = ModelUtil.create("Model");

		model
		.modelPath(globalModelDIR);

		//Definitions
		
		model.modelNode().create("mod1");

		model.geom().create("geom1", 3);

		model.mesh().create("mesh1", "geom1");

		model.physics().create("es", "Electrostatics", "geom1");

		model.study().create("std1");
		model.study("std1").feature().create("stat", "Stationary");
		model.study("std1").feature("stat").activate("es", true);
		
		
		//
		//	Geometry start
		//

		model.geom("geom1").lengthUnit("mm");
		model.geom("geom1").feature().create("cyl1", "Cylinder");
		model.geom("geom1").feature("cyl1").set("r", "0.635");
		model.geom("geom1").feature("cyl1").set("h", "15");
		model.geom("geom1").run("cyl1");
		model.geom("geom1").feature().create("cyl2", "Cylinder");
		model.geom("geom1").feature("cyl2").setIndex("pos", "0.625", 0);
		model.geom("geom1").feature("cyl2").set("h", "0.01");
		model.geom("geom1").feature("cyl2").set("r", "0.25");
		model.geom("geom1").run("cyl2");
		model.geom("geom1").feature("cyl2").set("rot", "90");
		model.geom("geom1").run("cyl2");
		model.geom("geom1").feature("cyl2").set("axistype", "y");
		model.geom("geom1").run("cyl2");
		model.geom("geom1").feature("cyl2").set("axistype", "x");
		model.geom("geom1").run("cyl2");
		model.geom("geom1").feature("cyl2").setIndex("pos", "0.2", 2);
		model.geom("geom1").run("cyl2");
		model.geom("geom1").feature("cyl2").setIndex("pos", "0.3", 2);
		model.geom("geom1").run("cyl2");
		model.geom("geom1").feature("cyl2").setIndex("pos", "0.4", 2);
		model.geom("geom1").run("cyl2");
		model.geom("geom1").feature("cyl2").set("type", "surface");
		model.geom("geom1").feature().duplicate("cyl3", "cyl2");
		model.geom("geom1").feature("cyl3").setIndex("pos", "0.65", 2);
		model.geom("geom1").run("cyl3");
		model.geom("geom1").feature("cyl3").setIndex("pos", "0.9", 2);
		model.geom("geom1").run("cyl3");
		model.geom("geom1").feature("cyl3").setIndex("pos", "1", 2);
		model.geom("geom1").run("cyl3");
		model.geom("geom1").feature().duplicate("cyl4", "cyl3");
		model.geom("geom1").feature("cyl4").setIndex("pos", "1.25", 2);
		model.geom("geom1").run("cyl4");
		model.geom("geom1").feature("cyl4").setIndex("pos", "1.6", 2);
		model.geom("geom1").run("cyl4");
		model.geom("geom1").feature().duplicate("cyl5", "cyl4");
		model.geom("geom1").feature("cyl5").setIndex("pos", "2.2", 2);
		model.geom("geom1").run("cyl5");
		model.geom("geom1").feature().duplicate("cyl6", "cyl5");
		model.geom("geom1").feature("cyl6").setIndex("pos", "2.8", 2);
		model.geom("geom1").run("cyl6");
		model.geom("geom1").feature().duplicate("cyl7", "cyl6");
		model.geom("geom1").feature("cyl7").setIndex("pos", "3.4", 2);
		model.geom("geom1").run("cyl7");
		model.geom("geom1").feature().duplicate("cyl8", "cyl7");
		model.geom("geom1").feature("cyl8").setIndex("pos", "4", 2);
		model.geom("geom1").run("cyl8");
		model.geom("geom1").feature().duplicate("cyl9", "cyl8");
		model.geom("geom1").feature("cyl9").setIndex("pos", "4.6", 2);
		model.geom("geom1").run("cyl9");
		model.geom("geom1").feature().duplicate("cyl10", "cyl9");
		model.geom("geom1").feature("cyl10").set("axistype", "y");
		model.geom("geom1").run("cyl10");
		model.geom("geom1").feature("cyl10").setIndex("pos", "0.625", 1);
		model.geom("geom1").run("cyl10");
		model.geom("geom1").feature("cyl10").setIndex("pos", "-0.625", 1);
		model.geom("geom1").run("cyl10");
		model.geom("geom1").feature("cyl10").setIndex("pos", "0", 0);
		model.geom("geom1").run("cyl10");
		model.geom("geom1").feature("cyl10").setIndex("pos", "0.4", 2);
		model.geom("geom1").run("cyl10");
		model.geom("geom1").feature().duplicate("cyl11", "cyl10");
		model.geom("geom1").feature("cyl11").setIndex("pos", "1", 2);
		model.geom("geom1").run("cyl11");
		model.geom("geom1").feature().duplicate("cyl12", "cyl11");
		model.geom("geom1").feature("cyl12").setIndex("pos", "1.6", 2);
		model.geom("geom1").run("cyl12");
		model.geom("geom1").feature().duplicate("cyl13", "cyl12");
		model.geom("geom1").feature("cyl13").setIndex("pos", "2.2", 2);
		model.geom("geom1").run("cyl13");
		model.geom("geom1").feature().duplicate("cyl14", "cyl13");
		model.geom("geom1").feature("cyl14").setIndex("pos", "2.", 2);
		model.geom("geom1").feature("cyl14").setIndex("pos", "2.8", 2);
		model.geom("geom1").run("cyl14");
		model.geom("geom1").feature().duplicate("cyl15", "cyl14");
		model.geom("geom1").feature("cyl15").setIndex("pos", "3.4", 2);
		model.geom("geom1").run("cyl15");
		model.geom("geom1").feature().duplicate("cyl16", "cyl15");
		model.geom("geom1").feature("cyl16").setIndex("pos", "4", 2);
		model.geom("geom1").run("cyl16");
		model.geom("geom1").feature().duplicate("cyl17", "cyl16");
		model.geom("geom1").feature("cyl17").setIndex("pos", "4.6", 2);
		model.geom("geom1").run("cyl17");
		model.geom("geom1").feature().duplicate("cyl18", "cyl17");
		model.geom("geom1").feature("cyl18").setIndex("pos", "0.625", 1);
		model.geom("geom1").run("cyl18");
		model.geom("geom1").feature("cyl18").setIndex("pos", "0.4", 2);
		model.geom("geom1").run("cyl18");
		model.geom("geom1").feature().duplicate("cyl19", "cyl18");
		model.geom("geom1").feature("cyl19").setIndex("pos", "1", 2);
		model.geom("geom1").run("cyl19");
		model.geom("geom1").feature().duplicate("cyl20", "cyl19");
		model.geom("geom1").feature("cyl20").setIndex("pos", "1.6", 2);
		model.geom("geom1").run("cyl20");
		model.geom("geom1").feature().duplicate("cyl21", "cyl20");
		model.geom("geom1").feature("cyl21").setIndex("pos", "2.2", 2);
		model.geom("geom1").run("cyl21");
		model.geom("geom1").feature().duplicate("cyl22", "cyl21");
		model.geom("geom1").feature("cyl22").setIndex("pos", "2.8", 2);
		model.geom("geom1").run("cyl22");
		model.geom("geom1").feature("cyl22").setIndex("pos", "3.4", 2);
		model.geom("geom1").run("cyl22");
		model.geom("geom1").feature("cyl22").setIndex("pos", "2.2", 2);
		model.geom("geom1").run("cyl22");
		model.geom("geom1").feature("cyl22").setIndex("pos", "2.85", 2);
		model.geom("geom1").feature("cyl22").setIndex("pos", "2.8", 2);
		model.geom("geom1").run("cyl22");
		model.geom("geom1").feature().duplicate("cyl23", "cyl22");
		model.geom("geom1").feature("cyl23").setIndex("pos", "3.4", 2);
		model.geom("geom1").run("cyl23");
		model.geom("geom1").feature().duplicate("cyl24", "cyl23");
		model.geom("geom1").feature("cyl24").setIndex("pos", "4", 2);
		model.geom("geom1").run("cyl24");
		model.geom("geom1").feature().duplicate("cyl25", "cyl24");
		model.geom("geom1").feature("cyl25").setIndex("pos", "4.6", 2);
		model.geom("geom1").run("cyl25");
		model.geom("geom1").feature().duplicate("cyl26", "cyl25");
		model.geom("geom1").feature("cyl26").set("axistype", "z");
		model.geom("geom1").feature("cyl26").setIndex("pos", "0", 1);
		model.geom("geom1").feature("cyl26").setIndex("pos", "-0.625", 0);
		model.geom("geom1").run("cyl26");
		model.geom("geom1").feature("cyl26").set("rot", "0");
		model.geom("geom1").run("cyl26");
		model.geom("geom1").feature("cyl26").set("rot", "90");
		model.geom("geom1").run("cyl26");
		model.geom("geom1").feature("cyl26").set("axistype", "y");
		model.geom("geom1").run("cyl26");
		model.geom("geom1").feature("cyl26").set("axistype", "x");
		model.geom("geom1").run("cyl26");
		model.geom("geom1").feature("cyl26").setIndex("pos", "0.", 2);
		model.geom("geom1").feature("cyl26").setIndex("pos", "0.4", 2);
		model.geom("geom1").run("cyl26");
		model.geom("geom1").feature().duplicate("cyl27", "cyl26");
		model.geom("geom1").feature("cyl27").setIndex("pos", "1", 2);
		model.geom("geom1").run("cyl27");
		model.geom("geom1").feature().duplicate("cyl28", "cyl27");
		model.geom("geom1").feature("cyl28").setIndex("pos", "1.6", 2);
		model.geom("geom1").run("cyl28");
		model.geom("geom1").feature().duplicate("cyl29", "cyl28");
		model.geom("geom1").feature("cyl29").setIndex("pos", "2.2", 2);
		model.geom("geom1").run("cyl29");
		model.geom("geom1").feature().duplicate("cyl30", "cyl29");
		model.geom("geom1").feature("cyl30").setIndex("pos", "2.8", 2);
		model.geom("geom1").run("cyl30");
		model.geom("geom1").feature().duplicate("cyl31", "cyl30");
		model.geom("geom1").feature("cyl31").setIndex("pos", "3.4", 2);
		model.geom("geom1").run("cyl31");
		model.geom("geom1").feature().duplicate("cyl32", "cyl31");
		model.geom("geom1").feature("cyl32").setIndex("pos", "4", 2);
		model.geom("geom1").run("cyl32");
		model.geom("geom1").feature().duplicate("cyl33", "cyl32");
		model.geom("geom1").feature("cyl33").setIndex("pos", "4.6", 2);
		model.geom("geom1").run("cyl33");
		model.geom("geom1").feature().create("sph1", "Sphere");
		model.geom("geom1").feature("sph1").set("r", "20");
		model.geom("geom1").run("sph1");

		
		//
		//	Viewpoint stuff
		//		
		
		model.view("view1").hideObjects().create("hide1");
		model.view("view1").hideObjects("hide1").init();
		model.view("view1").hideObjects("hide1").add(new String[]{"sph1"});

		
		
		model.geom("geom1").run();

		//
		//	Create material 1
		//
		
		
		model.material().create("mat1");
		model.material("mat1").name("Acrylic plastic");
		model.material("mat1").set("family", "custom");
		model.material("mat1").set("lighting", "phong");
		model.material("mat1").set("fresnel", 0.5);
		model.material("mat1").set("roughness", 0.1);
		model.material("mat1").set("specular", "custom");
		model.material("mat1")
		.set("customspecular", new double[]{0.9803921568627451, 0.9803921568627451, 0.9803921568627451});
		model.material("mat1").set("diffuse", "custom");
		model.material("mat1")
		.set("customdiffuse", new double[]{0.39215686274509803, 0.7843137254901961, 0.39215686274509803});
		model.material("mat1").set("ambient", "custom");
		model.material("mat1")
		.set("customambient", new double[]{0.39215686274509803, 0.7843137254901961, 0.39215686274509803});
		model.material("mat1").set("shininess", 1000);
		model.material("mat1").propertyGroup("def")
		.set("thermalexpansioncoefficient", "7.0e-5[1/K]");
		model.material("mat1").propertyGroup("def")
		.set("heatcapacity", "1470[J/(kg*K)]");
		model.material("mat1").propertyGroup("def")
		.set("density", "1190[kg/m^3]");
		model.material("mat1").propertyGroup("def")
		.set("thermalconductivity", "0.18[W/(m*K)]");
		model.material("mat1").propertyGroup()
		.create("Enu", "Young's modulus and Poisson's ratio");
		model.material("mat1").propertyGroup("Enu").set("poissonsratio", "0.35");
		model.material("mat1").propertyGroup("Enu")
		.set("youngsmodulus", "3.2e9[Pa]");
		model.material("mat1").set("family", "custom");
		model.material("mat1").set("lighting", "phong");
		model.material("mat1").set("fresnel", 0.5);
		model.material("mat1").set("roughness", 0.1);
		model.material("mat1").set("specular", "custom");
		model.material("mat1")
		.set("customspecular", new double[]{0.9803921568627451, 0.9803921568627451, 0.9803921568627451});
		model.material("mat1").set("diffuse", "custom");
		model.material("mat1")
		.set("customdiffuse", new double[]{0.39215686274509803, 0.7843137254901961, 0.39215686274509803});
		model.material("mat1").set("ambient", "custom");
		model.material("mat1")
		.set("customambient", new double[]{0.39215686274509803, 0.7843137254901961, 0.39215686274509803});
		model.material("mat1").set("shininess", 1000);

		model.view("view1").hideEntities().create("hide1");
		model.view("view1").hideEntities("hide1").geom(3);
		model.view("view1").hideEntities("hide1").add(new int[]{});
		model.view("view1").hideEntities("hide1").add(new int[]{1});

		model.material("mat1").propertyGroup("def")
		.set("relpermittivity", new String[]{"2.7"});
		model.material("mat1").selection().geom("geom1", 2);
		model.material("mat1").selection().geom("geom1", 1);
		model.material("mat1").selection().all();
		model.material("mat1").selection().geom("geom1", 3);
		model.material("mat1").selection().set(new int[]{2});

		model.view("view1").set("geomhidestatus", "showonlyhidden");

		model.material("mat1").selection().set(new int[]{1, 2});

		model.view("view1").set("geomhidestatus", "hide");
		
		
		//
		//	Create material 2
		//

		model.material().create("mat2");
		model.material("mat2").name("Titanium [solid,alpha]");
		model.material("mat2").set("family", "titanium");
		model.material("mat2").propertyGroup("def")
		.set("dL", "(dL(T[1/K])-dL(Tempref[1/K]))/(1+dL(Tempref[1/K]))");
		model.material("mat2").propertyGroup("def")
		.set("thermalconductivity", "k(T[1/K])[W/(m*K)]");
		model.material("mat2").propertyGroup("def")
		.set("resistivity", "res_solid_alpha_1(T[1/K])[ohm*m]");
		model.material("mat2").propertyGroup("def")
		.set("thermalexpansioncoefficient", "(alpha(T[1/K])[1/K]+(Tempref-293[K])*if(abs(T-Tempref)>1e-3,(alpha(T[1/K])[1/K]-alpha(Tempref[1/K])[1/K])/(T-Tempref),d(alpha(T[1/K]),T)[1/K]))/(1+alpha(Tempref[1/K])[1/K]*(Tempref-293[K]))");
		model.material("mat2").propertyGroup("def")
		.set("heatcapacity", "C_solid_1(T[1/K])[J/(kg*K)]");
		model.material("mat2").propertyGroup("def")
		.set("HC", "HC_solid_1(T[1/K])[J/(mol*K)]");
		model.material("mat2").propertyGroup("def").set("mu", "mu(T[1/K])[Pa]");
		model.material("mat2").propertyGroup("def")
		.set("electricconductivity", "sigma_solid_alpha_1(T[1/K])[S/m]");
		model.material("mat2").propertyGroup("def")
		.set("density", "rho(T[1/K])[kg/m^3]");
		model.material("mat2").propertyGroup("def")
		.set("TD", "TD(T[1/K])[m^2/s]");
		model.material("mat2").propertyGroup("def")
		.set("VP", "VP_solid_1(T[1/K])[Pa]");
		model.material("mat2").propertyGroup("def")
		.set("kappa", "kappa(T[1/K])[Pa]");
		model.material("mat2").propertyGroup("def").func()
		.create("dL", "Piecewise");
		model.material("mat2").propertyGroup("def").func("dL")
		.set("funcname", "dL");
		model.material("mat2").propertyGroup("def").func("dL").set("arg", "T");
		model.material("mat2").propertyGroup("def").func("dL")
		.set("extrap", "constant");
		model.material("mat2").propertyGroup("def").func("dL")
		.set("pieces", new String[][]{{"0.0", "40.0", "-0.001489666-2.5E-7*T^1+1.25E-8*T^2"}, {"40.0", "200.0", "-0.001535+4.39824E-6*T^1-1.3978E-7*T^2+1.930653E-9*T^3-9.582605E-12*T^4+1.682692E-14*T^5"}, {"200.0", "1144.0", "-0.002006083+4.790918E-6*T^1+9.116775E-9*T^2-8.086306E-12*T^3+3.131446E-15*T^4"}});
		model.material("mat2").propertyGroup("def").func()
		.create("k", "Piecewise");
		model.material("mat2").propertyGroup("def").func("k")
		.set("funcname", "k");
		model.material("mat2").propertyGroup("def").func("k").set("arg", "T");
		model.material("mat2").propertyGroup("def").func("k")
		.set("extrap", "constant");
		model.material("mat2").propertyGroup("def").func("k")
		.set("pieces", new String[][]{{"0.0", "50.0", "1.46129*T^1-0.006261944*T^2+6.355161E-4*T^3-2.974167E-5*T^4+2.851803E-7*T^5"}, {"50.0", "326.0", "58.17412-0.4851624*T^1+0.00288092*T^2-8.255595E-6*T^3+8.903946E-9*T^4"}, {"326.0", "977.0", "41.95804-0.1227486*T^1+2.33331E-4*T^2-1.937431E-7*T^3+6.191111E-11*T^4"}, {"977.0", "1950.0", "15.13513+0.004158454*T^1+1.376649E-6*T^2"}});
		model.material("mat2").propertyGroup("def").func()
		.create("res_solid_alpha_1", "Piecewise");
		model.material("mat2").propertyGroup("def").func("res_solid_alpha_1")
		.set("funcname", "res_solid_alpha_1");
		model.material("mat2").propertyGroup("def").func("res_solid_alpha_1")
		.set("arg", "T");
		model.material("mat2").propertyGroup("def").func("res_solid_alpha_1")
		.set("extrap", "constant");
		model.material("mat2").propertyGroup("def").func("res_solid_alpha_1")
		.set("pieces", new String[][]{{"77.0", "1100.0", "2.470175E-9+1.446126E-9*T^1+8.367811E-13*T^2-7.327418E-16*T^3"}});
		model.material("mat2").propertyGroup("def").func()
		.create("alpha", "Piecewise");
		model.material("mat2").propertyGroup("def").func("alpha")
		.set("funcname", "alpha");
		model.material("mat2").propertyGroup("def").func("alpha").set("arg", "T");
		model.material("mat2").propertyGroup("def").func("alpha")
		.set("extrap", "constant");
		model.material("mat2").propertyGroup("def").func("alpha")
		.set("pieces", new String[][]{{"0.0", "1144.0", "5.034683E-6+2.527512E-8*T^1-7.155452E-11*T^2+1.068357E-13*T^3-7.796841E-17*T^4+2.218768E-20*T^5"}});
		model.material("mat2").propertyGroup("def").func()
		.create("C_solid_1", "Piecewise");
		model.material("mat2").propertyGroup("def").func("C_solid_1")
		.set("funcname", "C_solid_1");
		model.material("mat2").propertyGroup("def").func("C_solid_1")
		.set("arg", "T");
		model.material("mat2").propertyGroup("def").func("C_solid_1")
		.set("extrap", "constant");
		model.material("mat2").propertyGroup("def").func("C_solid_1")
		.set("pieces", new String[][]{{"100.0", "300.0", "-167.7468+7.086583*T^1-0.02978493*T^2+6.044771E-5*T^3-4.762589E-8*T^4"}, {"300.0", "900.0", "464.052+0.1524656*T^1+2.12593E-4*T^2-1.720171E-7*T^3"}, {"900.0", "1156.0", "-33066.63+136.7738*T^1-0.2048109*T^2+1.335042E-4*T^3-3.171822E-8*T^4"}, {"1156.0", "1944.0", "352.8258+0.1230479*T^1+6.657229E-5*T^2"}});
		model.material("mat2").propertyGroup("def").func()
		.create("HC_solid_1", "Piecewise");
		model.material("mat2").propertyGroup("def").func("HC_solid_1")
		.set("funcname", "HC_solid_1");
		model.material("mat2").propertyGroup("def").func("HC_solid_1")
		.set("arg", "T");
		model.material("mat2").propertyGroup("def").func("HC_solid_1")
		.set("extrap", "constant");
		model.material("mat2").propertyGroup("def").func("HC_solid_1")
		.set("pieces", new String[][]{{"100.0", "300.0", "-8.035071+0.3394473*T^1-0.001426698*T^2+2.895446E-6*T^3-2.28128E-9*T^4"}, {"300.0", "900.0", "22.2281+0.007303101*T^1+1.01832E-5*T^2-8.239618E-9*T^3"}, {"900.0", "1156.0", "-1583.892+6.551466*T^1-0.009810442*T^2+6.394851E-6*T^3-1.519302E-9*T^4"}, {"1156.0", "1944.0", "16.90036+0.005893992*T^1+3.188813E-6*T^2"}});
		model.material("mat2").propertyGroup("def").func()
		.create("mu", "Piecewise");
		model.material("mat2").propertyGroup("def").func("mu")
		.set("funcname", "mu");
		model.material("mat2").propertyGroup("def").func("mu").set("arg", "T");
		model.material("mat2").propertyGroup("def").func("mu")
		.set("extrap", "constant");
		model.material("mat2").propertyGroup("def").func("mu")
		.set("pieces", new String[][]{{"293.0", "1073.0", "4.783492E10-2.376622E7*T^1"}});
		model.material("mat2").propertyGroup("def").func()
		.create("sigma_solid_alpha_1", "Piecewise");
		model.material("mat2").propertyGroup("def").func("sigma_solid_alpha_1")
		.set("funcname", "sigma_solid_alpha_1");
		model.material("mat2").propertyGroup("def").func("sigma_solid_alpha_1")
		.set("arg", "T");
		model.material("mat2").propertyGroup("def").func("sigma_solid_alpha_1")
		.set("extrap", "constant");
		model.material("mat2").propertyGroup("def").func("sigma_solid_alpha_1")
		.set("pieces", new String[][]{{"77.0", "1100.0", "1/(-7.327418E-16*T^3+8.367811E-13*T^2+1.446126E-09*T+2.470175E-09)"}});
		model.material("mat2").propertyGroup("def").func()
		.create("rho", "Piecewise");
		model.material("mat2").propertyGroup("def").func("rho")
		.set("funcname", "rho");
		model.material("mat2").propertyGroup("def").func("rho").set("arg", "T");
		model.material("mat2").propertyGroup("def").func("rho")
		.set("extrap", "constant");
		model.material("mat2").propertyGroup("def").func("rho")
		.set("pieces", new String[][]{{"0.0", "20.0", "4520.168"}, {"20.0", "160.0", "4520.925-0.07042247*T^1+0.002149145*T^2-2.875466E-5*T^3+1.417353E-7*T^4-2.481938E-10*T^5"}, {"160.0", "1144.0", "4525.567-0.05296616*T^1-1.538843E-4*T^2+1.427212E-7*T^3-5.386443E-11*T^4"}});
		model.material("mat2").propertyGroup("def").func()
		.create("TD", "Piecewise");
		model.material("mat2").propertyGroup("def").func("TD")
		.set("funcname", "TD");
		model.material("mat2").propertyGroup("def").func("TD").set("arg", "T");
		model.material("mat2").propertyGroup("def").func("TD")
		.set("extrap", "constant");
		model.material("mat2").propertyGroup("def").func("TD")
		.set("pieces", new String[][]{{"247.0", "863.0", "2.220338E-5-8.696256E-8*T^1+1.863542E-10*T^2-1.807157E-13*T^3+6.620199E-17*T^4"}});
		model.material("mat2").propertyGroup("def").func()
		.create("VP_solid_1", "Piecewise");
		model.material("mat2").propertyGroup("def").func("VP_solid_1")
		.set("funcname", "VP_solid_1");
		model.material("mat2").propertyGroup("def").func("VP_solid_1")
		.set("arg", "T");
		model.material("mat2").propertyGroup("def").func("VP_solid_1")
		.set("extrap", "constant");
		model.material("mat2").propertyGroup("def").func("VP_solid_1")
		.set("pieces", new String[][]{{"293.0", "1941.0", "(exp((-2.499100e+004/T-1.337600e+000*log10(T)+1.480581e+001)*log(10.0)))*1.333200e+002"}});
		model.material("mat2").propertyGroup("def").func()
		.create("kappa", "Piecewise");
		model.material("mat2").propertyGroup("def").func("kappa")
		.set("funcname", "kappa");
		model.material("mat2").propertyGroup("def").func("kappa").set("arg", "T");
		model.material("mat2").propertyGroup("def").func("kappa")
		.set("extrap", "constant");
		model.material("mat2").propertyGroup("def").func("kappa")
		.set("pieces", new String[][]{{"293.0", "1073.0", "1.056124E11+4.642769E7*T^1-82798.6*T^2"}});
		model.material("mat2").propertyGroup("def").addInput("temperature");
		model.material("mat2").propertyGroup("def")
		.addInput("strainreferencetemperature");
		model.material("mat2").propertyGroup()
		.create("Enu", "Young's modulus and Poisson's ratio");
		model.material("mat2").propertyGroup("Enu")
		.set("youngsmodulus", "E(T[1/K])[Pa]");
		model.material("mat2").propertyGroup("Enu")
		.set("poissonsratio", "nu(T[1/K])");
		model.material("mat2").propertyGroup("Enu").func()
		.create("E", "Piecewise");
		model.material("mat2").propertyGroup("Enu").func("E")
		.set("funcname", "E");
		model.material("mat2").propertyGroup("Enu").func("E").set("arg", "T");
		model.material("mat2").propertyGroup("Enu").func("E")
		.set("extrap", "constant");
		model.material("mat2").propertyGroup("Enu").func("E")
		.set("pieces", new String[][]{{"93.0", "293.0", "1.263539E11-4.823066E7*T^1-32810.22*T^2"}, {"293.0", "1073.0", "1.267923E11-5.931971E7*T^1"}});
		model.material("mat2").propertyGroup("Enu").func()
		.create("nu", "Piecewise");
		model.material("mat2").propertyGroup("Enu").func("nu")
		.set("funcname", "nu");
		model.material("mat2").propertyGroup("Enu").func("nu").set("arg", "T");
		model.material("mat2").propertyGroup("Enu").func("nu")
		.set("extrap", "constant");
		model.material("mat2").propertyGroup("Enu").func("nu")
		.set("pieces", new String[][]{{"293.0", "1073.0", "0.3207911+6.715403E-5*T^1-4.131016E-8*T^2+5.510325E-11*T^3"}});
		model.material("mat2").propertyGroup("Enu").addInput("temperature");
		model.material("mat2").set("family", "titanium");
		model.material("mat2").selection().geom("geom1", 1);
		model.material("mat2").selection().geom("geom1", 0);
		model.material("mat2").selection().geom("geom1", 2);
		model.material("mat2").selection().geom("geom1", 3);
		model.material("mat2").selection().geom("geom1", 2);
		model.material("mat2").selection().geom("geom1", 1);
		model.material("mat2").selection().geom("geom1", 0);
		model.material("mat2").selection().geom("geom1", 1);
		model.material("mat2").selection().geom("geom1", 0);

		model.geom("geom1").feature("cyl2").set("type", "solid");
		model.geom("geom1").run("cyl2");
		model.geom("geom1").feature("cyl3").set("type", "solid");
		model.geom("geom1").run("cyl3");
		model.geom("geom1").runAll();
		model.geom("geom1").run();

		model.view("view1").set("geomhidestatus", "hide");

		model.material("mat2").selection().geom("geom1", 3);

		model.view("view1").hideEntities("hide1").add(new int[]{1});
		model.view("view1").hideEntities("hide1").add(new int[]{1});
		model.view("view1").hideEntities("hide1").add(new int[]{1});
		model.view("view1").hideEntities("hide1").add(new int[]{1});
		model.view("view1").hideEntities("hide1").add(new int[]{1});
		model.view("view1").set("geomhidestatus", "ignore");
		model.view("view1").hideEntities("hide1").add(new int[]{1});
		model.view("view1").hideEntities("hide1").add(new int[]{1});
		model.view("view1").hideEntities().clear();
		model.view("view1").hideEntities().create("hide1");
		model.view("view1").hideEntities("hide1").geom(3);
		model.view("view1").hideEntities("hide1").add(new int[]{1});
		model.view("view1").hideEntities().clear();

		model.material("mat2").selection().set(new int[]{});

		model.view("view1").hideEntities().create("hide1");
		model.view("view1").hideEntities("hide1").geom(3);
		model.view("view1").hideEntities("hide1").add(new int[]{1});
		model.view("view1").hideEntities().clear();

		model.material("mat2").selection().geom("geom1", 2);

		model.view("view1").hideEntities().create("hide1");
		model.view("view1").hideEntities("hide1").geom(2);
		model.view("view1").hideEntities("hide1")
		.add(new int[]{1, 2, 3, 4, 137, 138, 157});
		model.view("view1").hideEntities().clear();

		model.material("mat2").selection().geom("geom1", 3);

		model.view("view1").hideEntities().create("hide1");
		model.view("view1").hideEntities("hide1").geom(3);
		model.view("view1").hideEntities("hide1").add(new int[]{1});
		model.view("view1").set("renderwireframe", false);
		model.view("view1").set("transparency", "on");

		model.material("mat2").selection().geom("geom1", 2);
		model.material("mat2").selection().geom("geom1", 3);

		model.view("view1").hideEntities("hide1").add(new int[]{2});
		model.view("view1").set("geomhidestatus", "ignore");

		model.view("view1").hideEntities().clear();
		model.view("view1").hideEntities().create("hide1");
		model.view("view1").hideEntities("hide1").geom(3);
		model.view("view1").hideEntities("hide1").add(new int[]{2});
		model.view("view1").set("geomhidestatus", "showonlyhidden");

		model.material("mat2").selection().geom("geom1", 2);
		model.material("mat2").selection().geom("geom1", 1);
		model.material("mat2").selection().geom("geom1", 0);
		model.material("mat2").selection().geom("geom1", 3);

		model.geom("geom1").feature("fin").set("action", "union");
		//model.geom("geom1").feature("fin").set("pairtype", "contact");
		model.geom("geom1").runAll();
		model.geom("geom1").run();

		model.view("view1").hideEntities("hide1").add(new int[]{1});
		model.view("view1").set("geomhidestatus", "ignore");
		model.view("view1").hideEntities().clear();

		model.view("view1").hideEntities().create("hide1");
		model.view("view1").hideEntities("hide1").geom(3);
		model.view("view1").hideEntities("hide1").add(new int[]{1});
		model.view("view1").set("geomhidestatus", "hide");

		model.material("mat2").selection().geom("geom1", 2);
		model.material("mat2").selection().geom("geom1", 1);
		model.material("mat2").selection().geom("geom1", 0);
		model.material("mat2").selection().geom("geom1", 2);
		
		//
		//	Material 3
		//
		
		model.material().create("mat3");
	    model.material("mat3").name("Water, liquid");
	    model.material("mat3").set("family", "water");
	    model.material("mat3").propertyGroup("def")
	         .set("dynamicviscosity", "eta(T[1/K])[Pa*s]");
	    model.material("mat3").propertyGroup("def")
	         .set("ratioofspecificheat", "1.0");
	    model.material("mat3").propertyGroup("def")
	         .set("electricconductivity", "0.11[S/m]");
	    model.material("mat3").propertyGroup("def")
	         .set("heatcapacity", "Cp(T[1/K])[J/(kg*K)]");
	    model.material("mat3").propertyGroup("def")
	         .set("density", "rho(T[1/K])[kg/m^3]");
	    model.material("mat3").propertyGroup("def")
	         .set("thermalconductivity", "k(T[1/K])[W/(m*K)]");
	    model.material("mat3").propertyGroup("def")
	         .set("soundspeed", "cs(T[1/K])[m/s]");
	    model.material("mat3").propertyGroup("def").func()
	         .create("eta", "Piecewise");
	    model.material("mat3").propertyGroup("def").func("eta")
	         .set("funcname", "eta");
	    model.material("mat3").propertyGroup("def").func("eta").set("arg", "T");
	    model.material("mat3").propertyGroup("def").func("eta")
	         .set("extrap", "constant");
	    model.material("mat3").propertyGroup("def").func("eta")
	         .set("pieces", new String[][]{{"273.15", "413.15", "1.3799566804-0.021224019151*T^1+1.3604562827E-4*T^2-4.6454090319E-7*T^3+8.9042735735E-10*T^4-9.0790692686E-13*T^5+3.8457331488E-16*T^6"}, {"413.15", "553.75", "0.00401235783-2.10746715E-5*T^1+3.85772275E-8*T^2-2.39730284E-11*T^3"}});
	    model.material("mat3").propertyGroup("def").func()
	         .create("Cp", "Piecewise");
	    model.material("mat3").propertyGroup("def").func("Cp")
	         .set("funcname", "Cp");
	    model.material("mat3").propertyGroup("def").func("Cp").set("arg", "T");
	    model.material("mat3").propertyGroup("def").func("Cp")
	         .set("extrap", "constant");
	    model.material("mat3").propertyGroup("def").func("Cp")
	         .set("pieces", new String[][]{{"273.15", "553.75", "12010.1471-80.4072879*T^1+0.309866854*T^2-5.38186884E-4*T^3+3.62536437E-7*T^4"}});
	    model.material("mat3").propertyGroup("def").func()
	         .create("rho", "Piecewise");
	    model.material("mat3").propertyGroup("def").func("rho")
	         .set("funcname", "rho");
	    model.material("mat3").propertyGroup("def").func("rho").set("arg", "T");
	    model.material("mat3").propertyGroup("def").func("rho")
	         .set("extrap", "constant");
	    model.material("mat3").propertyGroup("def").func("rho")
	         .set("pieces", new String[][]{{"273.15", "553.75", "838.466135+1.40050603*T^1-0.0030112376*T^2+3.71822313E-7*T^3"}});
	    model.material("mat3").propertyGroup("def").func()
	         .create("k", "Piecewise");
	    model.material("mat3").propertyGroup("def").func("k")
	         .set("funcname", "k");
	    model.material("mat3").propertyGroup("def").func("k").set("arg", "T");
	    model.material("mat3").propertyGroup("def").func("k")
	         .set("extrap", "constant");
	    model.material("mat3").propertyGroup("def").func("k")
	         .set("pieces", new String[][]{{"273.15", "553.75", "-0.869083936+0.00894880345*T^1-1.58366345E-5*T^2+7.97543259E-9*T^3"}});
	    model.material("mat3").propertyGroup("def").func()
	         .create("cs", "Interpolation");
	    model.material("mat3").propertyGroup("def").func("cs")
	         .set("sourcetype", "user");
	    model.material("mat3").propertyGroup("def").func("cs")
	         .set("source", "table");
	    model.material("mat3").propertyGroup("def").func("cs")
	         .set("funcname", "cs");
	    model.material("mat3").propertyGroup("def").func("cs")
	         .set("table", new String[][]{{"273", "1403"}, {"278", "1427"}, {"283", "1447"}, {"293", "1481"}, {"303", "1507"}, {"313", "1526"}, {"323", "1541"}, {"333", "1552"}, {"343", "1555"}, {"353", "1555"}, 
	         {"363", "1550"}, {"373", "1543"}});
	    model.material("mat3").propertyGroup("def").func("cs")
	         .set("interp", "piecewisecubic");
	    model.material("mat3").propertyGroup("def").func("cs")
	         .set("extrap", "const");
	    model.material("mat3").propertyGroup("def").addInput("temperature");
	    model.material("mat3").set("family", "water");

	    model.view("view1").set("geomhidestatus", "showonlyhidden");
	    model.view("view1").set("renderwireframe", true);

	    model.material("mat3").selection().set(new int[]{1});
	    model.material("mat3").propertyGroup("def")
	         .set("relpermittivity", new String[]{"1.1"});

		

		//
		//	Geometry changes
		//
		
		
		model.geom("geom1").feature("cyl2").set("h", "0.02");
		model.geom("geom1").runAll();
		model.geom("geom1").feature("cyl2").set("h", "0.04");
		model.geom("geom1").runAll();
		model.geom("geom1").feature("cyl3").set("h", "0.04");
		model.geom("geom1").feature("cyl4").set("h", "0.04");
		model.geom("geom1").feature("cyl5").set("h", "0.04");
		model.geom("geom1").feature("cyl6").set("h", "0.04");
		model.geom("geom1").feature("cyl7").set("h", "0.04");
		model.geom("geom1").feature("cyl8").set("h", "0.04");
		model.geom("geom1").feature("cyl9").set("h", "0.04");
		model.geom("geom1").feature("cyl10").set("h", "0.04");
		model.geom("geom1").feature("cyl11").set("h", "0.04");
		model.geom("geom1").feature("cyl12").set("h", "0.04");
		model.geom("geom1").feature("cyl13").set("h", "0.04");
		model.geom("geom1").feature("cyl14").set("h", "0.04");
		model.geom("geom1").feature("cyl15").set("h", "0.04");
		model.geom("geom1").feature("cyl16").set("h", "0.04");
		model.geom("geom1").feature("cyl17").set("h", "0.04");
		model.geom("geom1").feature("cyl18").set("h", "0.04");
		model.geom("geom1").feature("cyl19").set("h", "0.04");
		model.geom("geom1").feature("cyl20").set("h", "0.04");
		model.geom("geom1").feature("cyl21").set("h", "0.04");
		model.geom("geom1").feature("cyl22").set("h", "0.04");
		model.geom("geom1").feature("cyl23").set("h", "0.04");
		model.geom("geom1").feature("cyl24").set("h", "0.04");
		model.geom("geom1").feature("cyl25").set("h", "0.04");
		model.geom("geom1").feature("cyl26").set("h", "0.04");
		model.geom("geom1").feature("cyl27").set("h", "0.04");
		model.geom("geom1").feature("cyl28").set("h", "0.04");
		model.geom("geom1").feature("cyl29").set("h", "0.04");
		model.geom("geom1").feature("cyl30").set("h", "0.04");
		model.geom("geom1").feature("cyl31").set("h", "0.04");
		model.geom("geom1").feature("cyl32").set("h", "0.04");
		model.geom("geom1").feature("cyl33").set("h", "0.04");

		model.geom("geom1").feature("cyl10").set("h", "-0.04");
		model.geom("geom1").run("cyl9");
		model.geom("geom1").feature("cyl10").set("h", "0.04");
		model.geom("geom1").run("cyl10");

		model.geom("geom1").feature("cyl10").set("h", "0.1");
		model.geom("geom1").runAll();
		model.geom("geom1").feature("cyl10").set("h", "0.04");
		model.geom("geom1").runAll();
		model.geom("geom1").feature("cyl10").setIndex("pos", "-0.621", 1);
		model.geom("geom1").run("cyl10");
		model.geom("geom1").feature("cyl10").setIndex("pos", "-0.629", 1);
		model.geom("geom1").run("cyl10");
		model.geom("geom1").feature("cyl10").setIndex("pos", "-0.625", 1);
		model.geom("geom1").run("cyl10");
		model.geom("geom1").feature("cyl10").setIndex("pos", "-0.65", 1);
		model.geom("geom1").feature("cyl10").setIndex("pos", "-0.665", 1);
		model.geom("geom1").run("cyl10");
		model.geom("geom1").feature("cyl11").setIndex("pos", "-0.665", 1);
		model.geom("geom1").feature("cyl12").setIndex("pos", "-0.65", 1);
		model.geom("geom1").feature("cyl12").setIndex("pos", "-0.665", 1);
		model.geom("geom1").feature("cyl13").setIndex("pos", "-0.65", 1);
		model.geom("geom1").feature("cyl13").setIndex("pos", "-0.665", 1);
		model.geom("geom1").feature("cyl14").setIndex("pos", "-0.665", 1);
		model.geom("geom1").feature("cyl15").setIndex("pos", "-0.665", 1);
		model.geom("geom1").feature("cyl16").setIndex("pos", "-0.665", 1);
		model.geom("geom1").feature("cyl17").setIndex("pos", "-0.65", 1);
		model.geom("geom1").feature("cyl17").setIndex("pos", "-0.665", 1);
		model.geom("geom1").feature("cyl18").setIndex("pos", "0.665", 1);
		model.geom("geom1").feature("cyl19").setIndex("pos", "0.665", 1);
		model.geom("geom1").runAll();
		model.geom("geom1").feature("cyl18").setIndex("pos", "0.625", 1);
		model.geom("geom1").runAll();
		model.geom("geom1").feature("cyl19").setIndex("pos", "0.605", 1);
		model.geom("geom1").feature("cyl19").setIndex("pos", "0.625", 1);
		model.geom("geom1").runAll();
		model.geom("geom1").feature("cyl26").setIndex("pos", "-0.665", 0);
		model.geom("geom1").run("cyl26");
		model.geom("geom1").feature("cyl27").setIndex("pos", "-0.665", 0);
		model.geom("geom1").run("cyl27");
		model.geom("geom1").feature("cyl28").setIndex("pos", "-0.665", 0);
		model.geom("geom1").run("cyl28");
		model.geom("geom1").feature("cyl29").setIndex("pos", "-0.665", 0);
		model.geom("geom1").run("cyl29");
		model.geom("geom1").feature("cyl30").setIndex("pos", "-0.65", 0);
		model.geom("geom1").feature("cyl30").setIndex("pos", "-0.665", 0);
		model.geom("geom1").run("cyl30");
		model.geom("geom1").feature("cyl31").setIndex("pos", "-0.665", 0);
		model.geom("geom1").run("cyl31");
		model.geom("geom1").feature("cyl32").setIndex("pos", "-0.6625", 0);
		model.geom("geom1").feature("cyl32").setIndex("pos", "-0.665", 0);
		model.geom("geom1").run("cyl32");
		model.geom("geom1").feature("cyl33").setIndex("pos", "-0.665", 0);
		model.geom("geom1").run("cyl33");
		model.geom("geom1").runAll();
		model.geom("geom1").run();

		model.view("view1").set("geomhidestatus", "hide");

		model.material("mat2").selection().geom("geom1", 3);

		model.view("view1").hideEntities("hide1").add(new int[]{1});
		model.view("view1").set("geomhidestatus", "ignore");
		model.view("view1").hideEntities().clear();

		model.view("view1").hideEntities().create("hide1");
		model.view("view1").hideEntities("hide1").geom(3);
		model.view("view1").hideEntities("hide1").add(new int[]{1});
		model.view("view1").set("transparency", "on");
		model.view("view1").set("geomhidestatus", "hide");

		model.material("mat2").selection().geom("geom1", 2);
		model.material("mat2").selection().geom("geom1", 1);
		model.material("mat2").selection().set(new int[]{399, 406, 407, 408});
		model.material("mat2").selection().geom("geom1", 0);
		model.material("mat2").selection().geom("geom1", 1);
		model.material("mat2").selection()
		.set(new int[]{387, 393, 394, 395, 396, 399, 406, 407, 408});

		model.geom("geom1").feature("cyl4").set("type", "solid");
		model.geom("geom1").run();

		model.view("view1").set("geomhidestatus", "hide");

		model.material("mat2").selection().geom("geom1", 2);

		model.geom("geom1").feature("cyl5").set("type", "solid");
		model.geom("geom1").feature("cyl6").set("type", "solid");
		model.geom("geom1").feature("cyl7").set("type", "solid");
		model.geom("geom1").feature("cyl8").set("type", "solid");
		model.geom("geom1").feature("cyl9").set("type", "solid");
		model.geom("geom1").feature("cyl10").set("type", "solid");
		model.geom("geom1").feature("cyl11").set("type", "solid");
		model.geom("geom1").feature("cyl12").set("type", "solid");
		model.geom("geom1").feature("cyl13").set("type", "solid");
		model.geom("geom1").feature("cyl14").set("type", "solid");
		model.geom("geom1").feature("cyl15").set("type", "solid");
		model.geom("geom1").feature("cyl16").set("type", "solid");
		model.geom("geom1").feature("cyl17").set("type", "solid");
		model.geom("geom1").feature("cyl18").set("type", "solid");
		model.geom("geom1").feature("cyl19").set("type", "solid");
		model.geom("geom1").feature("cyl20").set("type", "solid");
		model.geom("geom1").feature("cyl21").set("type", "solid");
		model.geom("geom1").feature("cyl22").set("type", "solid");
		model.geom("geom1").feature("cyl23").set("type", "solid");
		model.geom("geom1").feature("cyl24").set("type", "solid");
		model.geom("geom1").feature("cyl25").set("type", "solid");
		model.geom("geom1").feature("cyl26").set("type", "solid");
		model.geom("geom1").feature("cyl27").set("type", "solid");
		model.geom("geom1").feature("cyl28").set("type", "solid");
		model.geom("geom1").feature("cyl29").set("type", "solid");
		model.geom("geom1").feature("cyl30").set("type", "solid");
		model.geom("geom1").feature("cyl31").set("type", "solid");
		model.geom("geom1").feature("cyl32").set("type", "solid");
		model.geom("geom1").feature("cyl33").set("type", "solid");
		model.geom("geom1").runAll();
		model.geom("geom1").run();

		model.view("view1").set("geomhidestatus", "hide");
		model.view("view1").hideEntities().clear();
		model.view("view1").hideEntities().clear();

		model.material("mat2").selection().geom("geom1", 3);

		model.view("view1").hideEntities().create("hide1");
		model.view("view1").hideEntities("hide1").geom(3);
		model.view("view1").hideEntities("hide1").add(new int[]{1});

		model.material("mat2").selection().geom("geom1", 2);
		model.material("mat2").selection()
		.set(new int[]{164, 170, 176, 182, 188, 194, 200, 206});

		model.view("view1").set("transparency", "off");

		model.material("mat2").selection()
		.set(new int[]{9, 15, 21, 27, 33, 39, 45, 51, 65, 71, 77, 83, 89, 95, 101, 107, 114, 120, 126, 132, 138, 144, 150, 156, 164, 170, 176, 182, 188, 194, 200, 206});
		model.material("mat2").selection().geom("geom1", 1);
		model.material("mat2").selection().geom("geom1", 2);
		model.material("mat2").selection()
		.set(new int[]{9, 15, 21, 27, 33, 39, 45, 51, 65, 71, 77, 83, 89, 95, 101, 107, 114, 120, 126, 132, 138, 144, 150, 156, 164, 170, 176, 182, 188, 194, 200, 206});
		model.material("mat1").selection().all();
		
		
		//
		//	Mesh creation
		//

		model.mesh("mesh1").autoMeshSize(4);
		model.mesh("mesh1").run();
		
		//
		//	Physics setup
		//
		
		//Setup floating potential in the brain domain
		model.physics("es").feature("ccn1").set("materialType", 1, "from_mat");
		model.physics("es").feature().create("gnd1", "Ground", 2);
		model.physics("es").feature("gnd1").selection().set(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
		
		
		//Adding Terminals
		
		model.physics("es").feature().create("fp1", "FloatingPotential", 2);
		
		model.physics("es").feature().create("term1", "Terminal", 2);
		model.physics("es").feature().create("term2", "Terminal", 2);
		model.physics("es").feature().create("term3", "Terminal", 2);
		model.physics("es").feature().create("term4", "Terminal", 2);
		model.physics("es").feature().create("term5", "Terminal", 2);
		model.physics("es").feature().create("term6", "Terminal", 2);
		model.physics("es").feature().create("term7", "Terminal", 2);
		model.physics("es").feature().create("term8", "Terminal", 2);
		
		model.physics("es").feature().create("term9", "Terminal", 2);
		model.physics("es").feature().create("term10", "Terminal", 2);
		model.physics("es").feature().create("term11", "Terminal", 2);
		model.physics("es").feature().create("term12", "Terminal", 2);
		model.physics("es").feature().create("term13", "Terminal", 2);
		model.physics("es").feature().create("term14", "Terminal", 2);
		model.physics("es").feature().create("term15", "Terminal", 2);
		model.physics("es").feature().create("term16", "Terminal", 2);
		
		model.physics("es").feature().create("term17", "Terminal", 2);
		model.physics("es").feature().create("term18", "Terminal", 2);
		model.physics("es").feature().create("term19", "Terminal", 2);
		model.physics("es").feature().create("term20", "Terminal", 2);
		model.physics("es").feature().create("term21", "Terminal", 2);
		model.physics("es").feature().create("term22", "Terminal", 2);
		model.physics("es").feature().create("term23", "Terminal", 2);
		model.physics("es").feature().create("term24", "Terminal", 2);
		
		model.physics("es").feature().create("term25", "Terminal", 2);
		model.physics("es").feature().create("term26", "Terminal", 2);
		model.physics("es").feature().create("term27", "Terminal", 2);
		model.physics("es").feature().create("term28", "Terminal", 2);
		model.physics("es").feature().create("term29", "Terminal", 2);
		model.physics("es").feature().create("term30", "Terminal", 2);
		model.physics("es").feature().create("term31", "Terminal", 2);
		model.physics("es").feature().create("term32", "Terminal", 2);
		
		//Define potentials
		
		model.physics("es").feature("term1").set("TerminalType", 1, "Voltage");
	    model.physics("es").feature("term1").set("V0", 1, globalPotentialValues[0]);
			    
	    model.physics("es").feature("term2").set("TerminalType", 1, "Voltage");
	    model.physics("es").feature("term2").set("V0", 1, globalPotentialValues[1]);
	    
	    model.physics("es").feature("term3").set("TerminalType", 1, "Voltage");
	    model.physics("es").feature("term3").set("V0", 1, globalPotentialValues[2]);
	    
	    model.physics("es").feature("term4").set("TerminalType", 1, "Voltage");
	    model.physics("es").feature("term4").set("V0", 1, globalPotentialValues[3]);
	    
	    model.physics("es").feature("term5").set("TerminalType", 1, "Voltage");
	    model.physics("es").feature("term5").set("V0", 1, globalPotentialValues[4]);
	    
	    model.physics("es").feature("term6").set("TerminalType", 1, "Voltage");
	    model.physics("es").feature("term6").set("V0", 1, globalPotentialValues[5]);
	    
	    model.physics("es").feature("term7").set("TerminalType", 1, "Voltage");
	    model.physics("es").feature("term7").set("V0", 1, globalPotentialValues[6]);
	    
	    model.physics("es").feature("term8").set("TerminalType", 1, "Voltage");
	    model.physics("es").feature("term8").set("V0", 1, globalPotentialValues[7]);
	    
	    model.physics("es").feature("term9").set("TerminalType", 1, "Voltage");
	    model.physics("es").feature("term9").set("V0", 1, globalPotentialValues[8]);
	    
	    model.physics("es").feature("term10").set("TerminalType", 1, "Voltage");
	    model.physics("es").feature("term10").set("V0", 1, globalPotentialValues[9]);
	    
	    model.physics("es").feature("term11").set("TerminalType", 1, "Voltage");
	    model.physics("es").feature("term11").set("V0", 1, globalPotentialValues[10]);
	    
	    model.physics("es").feature("term12").set("TerminalType", 1, "Voltage");
	    model.physics("es").feature("term12").set("V0", 1, globalPotentialValues[11]);
	    
	    model.physics("es").feature("term13").set("TerminalType", 1, "Voltage");
	    model.physics("es").feature("term13").set("V0", 1, globalPotentialValues[12]);
	    
		model.physics("es").feature("term14").set("TerminalType", 1, "Voltage");
	    model.physics("es").feature("term14").set("V0", 1, globalPotentialValues[13]);
			    
	    model.physics("es").feature("term15").set("TerminalType", 1, "Voltage");
	    model.physics("es").feature("term15").set("V0", 1, globalPotentialValues[14]);
	    
	    model.physics("es").feature("term16").set("TerminalType", 1, "Voltage");
	    model.physics("es").feature("term16").set("V0", 1, globalPotentialValues[15]);
	    
	    model.physics("es").feature("term17").set("TerminalType", 1, "Voltage");
	    model.physics("es").feature("term17").set("V0", 1, globalPotentialValues[16]);
	    
	    model.physics("es").feature("term18").set("TerminalType", 1, "Voltage");
	    model.physics("es").feature("term18").set("V0", 1, globalPotentialValues[17]);
	    
	    model.physics("es").feature("term19").set("TerminalType", 1, "Voltage");
	    model.physics("es").feature("term19").set("V0", 1, globalPotentialValues[18]);
	    
	    model.physics("es").feature("term20").set("TerminalType", 1, "Voltage");
	    model.physics("es").feature("term20").set("V0", 1, globalPotentialValues[19]);
	    
	    model.physics("es").feature("term21").set("TerminalType", 1, "Voltage");
	    model.physics("es").feature("term21").set("V0", 1, globalPotentialValues[20]);
	    
	    model.physics("es").feature("term22").set("TerminalType", 1, "Voltage");
	    model.physics("es").feature("term22").set("V0", 1, globalPotentialValues[21]);
	    
	    model.physics("es").feature("term23").set("TerminalType", 1, "Voltage");
	    model.physics("es").feature("term23").set("V0", 1, globalPotentialValues[22]);
	    
	    model.physics("es").feature("term24").set("TerminalType", 1, "Voltage");
	    model.physics("es").feature("term24").set("V0", 1, globalPotentialValues[23]);
	    
	    model.physics("es").feature("term25").set("TerminalType", 1, "Voltage");
	    model.physics("es").feature("term25").set("V0", 1, globalPotentialValues[24]);
	    
	    model.physics("es").feature("term26").set("TerminalType", 1, "Voltage");
	    model.physics("es").feature("term26").set("V0", 1, globalPotentialValues[25]);
	    
		model.physics("es").feature("term27").set("TerminalType", 1, "Voltage");
	    model.physics("es").feature("term27").set("V0", 1, globalPotentialValues[26]);
			    
	    model.physics("es").feature("term28").set("TerminalType", 1, "Voltage");
	    model.physics("es").feature("term28").set("V0", 1, globalPotentialValues[27]);
	    
	    model.physics("es").feature("term29").set("TerminalType", 1, "Voltage");
	    model.physics("es").feature("term29").set("V0", 1, globalPotentialValues[28]);
	    
	    model.physics("es").feature("term30").set("TerminalType", 1, "Voltage");
	    model.physics("es").feature("term30").set("V0", 1, globalPotentialValues[29]);
	    
	    model.physics("es").feature("term31").set("TerminalType", 1, "Voltage");
	    model.physics("es").feature("term31").set("V0", 1, globalPotentialValues[30]);
	    
	    model.physics("es").feature("term32").set("TerminalType", 1, "Voltage");
	    model.physics("es").feature("term32").set("V0", 1, globalPotentialValues[31]);
	    	    
	    //Set physics location - Applying the potentials to the set plates
	    
	    /*  
	    model.physics("es").feature("fp1").selection()
        .set(new int[]{5, 8, 11, 14, 17, 20, 23, 26, 123, 126, 129, 132, 135, 138, 141, 144, 177, 178, 179, 180, 181, 182, 455, 456, 457, 458, 459, 460, 461, 462});
	    */
	    
	    //Need if clause for gnd/0 states
	    List<Integer> gnd_List = new ArrayList<Integer>();
	    
	    String gndValue = "0";
	    
	    //Front
	    if(globalPotentialValues[0].equals(gndValue)){
	    	gnd_List.add(114);
	    }else{
	    	model.physics("es").feature("term1").selection().set(new int[]{114});	
	    }
	    
	    if(globalPotentialValues[1].equals(gndValue)){
	    	gnd_List.add(120);
	    }else{
	    	model.physics("es").feature("term2").selection().set(new int[]{120});
	    }
	    
	    if(globalPotentialValues[2].equals(gndValue)){
	    	gnd_List.add(126);
	    }else{
	    	model.physics("es").feature("term3").selection().set(new int[]{126});
	    }
	    
	    if(globalPotentialValues[3].equals(gndValue)){
	    	gnd_List.add(132);
	    }else{
	    	model.physics("es").feature("term4").selection().set(new int[]{132});
	    }
	    
	    if(globalPotentialValues[4].equals(gndValue)){
	    	gnd_List.add(138);
	    }else{
	    	model.physics("es").feature("term5").selection().set(new int[]{138});
	    }
	    
	    if(globalPotentialValues[5].equals(gndValue)){
	    	gnd_List.add(144);
	    }else{
	    	model.physics("es").feature("term6").selection().set(new int[]{144});
	    }
	    
	    if(globalPotentialValues[6].equals(gndValue)){
	    	gnd_List.add(150);
	    }else{
	    	model.physics("es").feature("term7").selection().set(new int[]{150});
	    }
	    	
	    if(globalPotentialValues[7].equals(gndValue)){
	    	gnd_List.add(156);
	    }else{
	    	model.physics("es").feature("term8").selection().set(new int[]{156});
	    }
	    
	    //Left
	    
	    if(globalPotentialValues[8].equals(gndValue)){
	    	gnd_List.add(164);
	    }else{
	    	model.physics("es").feature("term9").selection().set(new int[]{164});
	    }
	    
	    if(globalPotentialValues[9].equals(gndValue)){
	    	gnd_List.add(170);
	    }else{
	    	model.physics("es").feature("term10").selection().set(new int[]{170});
	    }
	    
	    
	    if(globalPotentialValues[10].equals(gndValue)){
	    	gnd_List.add(176);
	    }else{
	    	model.physics("es").feature("term11").selection().set(new int[]{176});
	    }
	    
	    if(globalPotentialValues[11].equals(gndValue)){
	    	gnd_List.add(182);
	    }else{
	    	model.physics("es").feature("term12").selection().set(new int[]{182});
	    }
	    	
	    if(globalPotentialValues[12].equals(gndValue)){
	    	gnd_List.add(188);
	    }else{
	    	model.physics("es").feature("term13").selection().set(new int[]{188});
	    }
	    	
	    if(globalPotentialValues[13].equals(gndValue)){
	    	gnd_List.add(194);
	    }else{
	    	model.physics("es").feature("term14").selection().set(new int[]{194});
	    }
	    	
	    if(globalPotentialValues[14].equals(gndValue)){
	    	gnd_List.add(200);
	    }else{
	    	model.physics("es").feature("term15").selection().set(new int[]{200});
	    }
	    	
	    if(globalPotentialValues[15].equals(gndValue)){
	    	gnd_List.add(206);
	    }else{
	    	model.physics("es").feature("term16").selection().set(new int[]{206});
	    }
	    
	    //Back
	    if(globalPotentialValues[16].equals(gndValue)){
	    	gnd_List.add(65);
	    }else{
	    	model.physics("es").feature("term17").selection().set(new int[]{65});
	    }
	    
	    if(globalPotentialValues[17].equals(gndValue)){
	    	gnd_List.add(71);
	    }else{
	    	model.physics("es").feature("term18").selection().set(new int[]{71});
	    }
	    
	    if(globalPotentialValues[18].equals(gndValue)){
	    	gnd_List.add(77);
	    }else{	
	    	model.physics("es").feature("term19").selection().set(new int[]{77});
	    }
	    	
	    if(globalPotentialValues[19].equals(gndValue)){
	    	gnd_List.add(83);
	    }else{
	    	model.physics("es").feature("term20").selection().set(new int[]{83});	
	    }
	    
	    if(globalPotentialValues[20].equals(gndValue)){
	    	gnd_List.add(89);
	    }else{
	    	model.physics("es").feature("term21").selection().set(new int[]{89});
	    }
	    
	    if(globalPotentialValues[21].equals(gndValue)){
	    	gnd_List.add(95);
	    }else{
	    	model.physics("es").feature("term22").selection().set(new int[]{95});
	    }
	    
	    if(globalPotentialValues[22].equals(gndValue)){
	    	gnd_List.add(101);
	    }else{
	    	model.physics("es").feature("term23").selection().set(new int[]{101});
	    }
	    
	    if(globalPotentialValues[23].equals(gndValue)){
	    	gnd_List.add(107);
	    }else{
	    	model.physics("es").feature("term24").selection().set(new int[]{107});
	    }
	    
	    //Right
	    if(globalPotentialValues[24].equals(gndValue)){
	    	gnd_List.add(9);
	    }else{
	    	model.physics("es").feature("term25").selection().set(new int[]{9});
	    }
	    
	    if(globalPotentialValues[25].equals(gndValue)){
	    	gnd_List.add(15);
	    }else{
	    	model.physics("es").feature("term26").selection().set(new int[]{15});
	    }
	    
	    if(globalPotentialValues[26].equals(gndValue)){
	    	gnd_List.add(21);
	    }else{
	    	model.physics("es").feature("term27").selection().set(new int[]{21});
	    }
	    
	    if(globalPotentialValues[27].equals(gndValue)){
	    	gnd_List.add(27);
	    }else{
	    	model.physics("es").feature("term28").selection().set(new int[]{27});
	    }
	    
	    if(globalPotentialValues[28].equals(gndValue)){
	    	gnd_List.add(33);
	    }else{
	    	model.physics("es").feature("term29").selection().set(new int[]{33});
	    }
	    	
	    if(globalPotentialValues[29].equals(gndValue)){
	    	gnd_List.add(39);
	    }else{
	    	model.physics("es").feature("term30").selection().set(new int[]{39});
	    }
	    	
	    if(globalPotentialValues[30].equals(gndValue)){
	    	gnd_List.add(45);
	    }else{
	    	model.physics("es").feature("term31").selection().set(new int[]{45});
	    }
	    
	    if(globalPotentialValues[31].equals(gndValue)){
	    	gnd_List.add(51);
	    }else{
	    	model.physics("es").feature("term32").selection().set(new int[]{51});
	    }
	        
	    
	    //Setup gnd selection
	    int inpArr[] = new int[gnd_List.size()];
	    
	    Iterator<Integer> it = gnd_List.iterator();
	    
	    int lp_co = 0;
	    
	    while(it.hasNext()){
	    	int tmp;
	    	tmp = it.next();
	    	inpArr[lp_co] = tmp;
	    	lp_co++;
	    }
	     
	    
	    model.physics("es").feature("fp1").selection().set(inpArr);
	    
		//
		//
		//

		model.result().create("pg1", "PlotGroup3D");
		model.result("pg1").run();

		model.sol().create("sol1");
		model.sol("sol1").study("std1");
		model.sol("sol1").feature().create("st1", "StudyStep");
		model.sol("sol1").feature("st1").set("study", "std1");
		model.sol("sol1").feature("st1").set("studystep", "stat");
		model.sol("sol1").feature().create("v1", "Variables");
		model.sol("sol1").feature("v1").set("control", "stat");
		model.sol("sol1").feature().create("s1", "Stationary");
		model.sol("sol1").feature("s1").feature().create("fc1", "FullyCoupled");
		model.sol("sol1").feature("s1").feature().create("i1", "Iterative");
		model.sol("sol1").feature("s1").feature("i1").set("linsolver", "cg");
		model.sol("sol1").feature("s1").feature("fc1").set("linsolver", "i1");
		model.sol("sol1").feature("s1").feature("i1").feature()
		.create("mg1", "Multigrid");
		model.sol("sol1").feature("s1").feature("i1").feature("mg1")
		.set("prefun", "amg");
		model.sol("sol1").feature("s1").feature().remove("fcDef");
		model.sol("sol1").attach("std1");

		model.result().create("pg2", "PlotGroup3D");
		model.result("pg2").name("Electric Potential (es)");
		model.result("pg2").set("oldanalysistype", "noneavailable");
		model.result("pg2").set("data", "dset1");
		model.result("pg2").feature().create("mslc1", "Multislice");
		model.result("pg2").feature("mslc1").name("Multislice");
		model.result("pg2").feature("mslc1")
		.set("oldanalysistype", "noneavailable");
		model.result("pg2").feature("mslc1").set("data", "parent");


		model.study("std1").feature("stat").set("initstudyhide", "on");
		model.study("std1").feature("stat").set("initsolhide", "on");
		model.study("std1").feature("stat").set("notstudyhide", "on");
		model.study("std1").feature("stat").set("notsolhide", "on");
	    

		model.sol("sol1").attach("std1");
		model.sol("sol1").feature("st1").name("Compile Equations: Stationary");


		model.sol("sol1").feature("s1").set("control", "stat");

		model.sol("sol1").runAll();

		//
		//	Result plot exported
		//
		model.result().export().create("plot1", "pg2", "mslc1", "Plot");

		// Create parameters
		//xcoords - ie range(-10,0.1,10)
		String xcoordsconstruct = "range("+globalOutputXMin+","+globalOutputRes+","+globalOutputXMax+")";
		String ycoordsconstruct = "range("+globalOutputYMin+","+globalOutputRes+","+globalOutputYMax+")";
		String zcoordsconstruct = "range("+globalOutputZMin+","+globalOutputRes+","+globalOutputZMax+")";
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MMdd_HH_mm");
		
		String genfilename = "Data"+sdf.format(date)+".csv";
		
		model.result("pg2").name("Electric Potential (es)");
		model.result("pg2").set("showhiddenobjects", true);
		model.result("pg2").set("frametype", "spatial");
		model.result("pg2").feature("mslc1").name("Multislice");
		model.result("pg2").feature("mslc1").set("multiplanezmethod", "coord");
		model.result("pg2").feature("mslc1").set("multiplaneymethod", "coord");
		model.result("pg2").feature("mslc1").set("ycoord", ycoordsconstruct);
		model.result("pg2").feature("mslc1").set("multiplanexmethod", "coord");
		model.result("pg2").feature("mslc1").set("colortable", "ThermalLight");
		model.result("pg2").feature("mslc1").set("zcoord", zcoordsconstruct);
		model.result("pg2").feature("mslc1").set("xcoord", xcoordsconstruct);
		model.result().export("plot1")
		.set("filename", globalOutputDIR+"\\"+genfilename);

		model.result("pg2").run();

		model.result().export("plot1").run();


		return model;
	}

}
