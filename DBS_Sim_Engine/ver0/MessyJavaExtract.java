/*
 * MessyJavaExtract.java
 */

import com.comsol.model.*;
import com.comsol.model.util.*;

/** Model exported on Mar 17 2014, 18:31 by COMSOL 4.3.2.152. */
public class MessyJavaExtract {

  public static void main(String[] args) {
    run();
  }

  public static Model run() {
    Model model = ModelUtil.create("Model");

    model
         .modelPath("C:\\Users\\A\\Dropbox\\DBS_Project\\Code\\AranCode\\DBS_Comsol");

    model.modelNode().create("mod1");

    model.geom().create("geom1", 3);

    model.mesh().create("mesh1", "geom1");

    model.physics().create("es", "Electrostatics", "geom1");

    model.study().create("std1");
    model.study("std1").feature().create("stat", "Stationary");
    model.study("std1").feature("stat").activate("es", true);

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

    model.view("view1").hideObjects().create("hide1");
    model.view("view1").hideObjects("hide1").init();
    model.view("view1").hideObjects("hide1").add(new String[]{"sph1"});

    model.geom("geom1").run();

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

    model.geom("geom1").feature("fin").set("action", "assembly");
    model.geom("geom1").feature("fin").set("pairtype", "contact");
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

    model.mesh("mesh1").autoMeshSize(4);
    model.mesh("mesh1").run();

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

    model.sol("sol1").runFromTo("st1", "s1");

    model.result("pg2").run();
    model.result("pg1").run();

    model.view("view1").set("geomhidestatus", "ignore");
    model.view("view1").hideEntities("hide1").add(new int[]{1});
    model.view("view1").hideEntities().clear();
    model.view("view1").set("transparency", "on");
    model.view("view1").hideEntities().create("hide1");
    model.view("view1").hideEntities("hide1").geom(3);
    model.view("view1").hideEntities("hide1").add(new int[]{1});
    model.view("view1").set("geomhidestatus", "hide");
    model.view("view1").set("transparency", "off");

    model.physics("es").feature().create("fp1", "FloatingPotential", 2);
    model.physics("es").feature("fp1").selection().set(new int[]{200, 206});
    model.physics("es").feature().remove("fp1");
    model.physics("es").feature().create("pot1", "ElectricPotential", 2);
    model.physics("es").feature("pot1").set("V0", 1, "1");
    model.physics("es").feature("pot1").selection().set(new int[]{200, 206});
    model.physics("es").feature().create("pot2", "ElectricPotential", 2);
    model.physics("es").feature("pot2").set("V0", 1, "-1");
    model.physics("es").feature("pot2").selection().set(new int[]{164, 170});

    model.sol("sol1").runAll();

    model.result("pg2").run();
    model.result("pg2").set("showhiddenobjects", "on");
    model.result("pg2").run();
    model.result("pg2").set("allowtableupdate", true);
    model.result("pg2").set("renderdatacached", true);
    model.result("pg1").run();
    model.result("pg1").set("data", "dset1");
    model.result("pg1").run();
    model.result("pg1").set("allowtableupdate", true);
    model.result("pg1").set("renderdatacached", true);
    model.result("pg1").set("frametype", "mesh");
    model.result("pg1").run();
    model.result("pg1").set("showhiddenobjects", "on");
    model.result("pg1").run();
    model.result("pg1").set("edgecolor", "black");
    model.result("pg1").set("allowtableupdate", true);
    model.result("pg1").set("renderdatacached", true);
    model.result("pg2").run();
    model.result("pg2").run();
    model.result("pg2").set("allowtableupdate", true);
    model.result("pg2").set("renderdatacached", true);

    model.study("std1").feature("stat").set("useinitsol", "on");
    model.study("std1").feature("stat").set("initstudy", "std1");

    model.sol("sol1").updateSolution();

    model.result("pg1").run();
    model.result("pg2").run();

    model.sol("sol1").feature("v1").feature("mod1_V")
         .set("scalemethod", "init");
    model.sol("sol1").runAll();

    model.result("pg2").run();

    model.material("mat2").selection().geom("geom1", 3);
    model.material("mat2").selection()
         .set(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34});
    model.material().move("mat2", 0);
    model.material().move("mat2", 1);
    model.material("mat2").propertyGroup("def")
         .set("relpermittivity", new String[]{"1"});

    model.sol("sol1").runAll();

    model.result("pg1").run();

    model.result("pg2").set("showhiddenobjects", "off");
    model.result("pg2").run();

    model.study("std1").feature("stat").set("initstudy", "zero");

    model.sol("sol1").runAll();


    model.result("pg1").run();
    model.result().remove("pg1");
    model.result("pg2").run();

    model.study("std1").feature("stat").set("initmethod", "sol");
    model.study("std1").feature("stat").set("initstudy", "std1");


    model.result("pg2").run();

    model.physics("es").feature().create("init2", "init", 3);
    model.physics("es").feature("init2").selection().set(new int[]{9});
    model.physics("es").feature("init2").set("V", 1, "1");


    model.physics("es").feature("init1").set("V", 1, "1");

    model.sol("sol1").runAll();

    model.result("pg2").run();
    model.result("pg2").set("showhiddenobjects", "on");
    model.result("pg2").run();
    model.result("pg2").set("allowtableupdate", true);
    model.result("pg2").set("renderdatacached", true);
    model.result().table().create("evl3", "Table");
    model.result().table("evl3").comments("Interactive 3D values");
    model.result().table("evl3").name("Evaluation 3D");
    model.result().table("evl3")
         .addRow(new double[]{-0.06867250209314157, 3.552713678800501E-15, -19.738720733532265, 0});
    model.result().table("evl3")
         .addRow(new double[]{-9.196705694238371, -1.7763568394002505E-15, 2.3120464746613125, 0});
    model.result("pg2").set("frametype", "spatial");
    model.result("pg2").run();

    model.study("std1").feature("stat").set("initmethod", "init");

    model.sol("sol1").runAll();

    model.result("pg2").run();

    model.physics("es").feature("init1").set("V", 1, "0");

    model.sol("sol1").runAll();

    model.result("pg2").run();

    model.physics("es").feature("init2").selection()
         .set(new int[]{7, 9, 16, 18, 24, 26, 32, 34});

    model.sol("sol1").runAll();

    model.result("pg2").set("showhiddenobjects", "off");
    model.result("pg2").run();

    model.physics("es").feature("ccn1").set("materialType", 1, "solid");
    model.physics("es").feature().move("init2", 4);
    model.physics("es").feature().move("init2", 3);
    model.physics("es").feature().move("init2", 4);
    model.physics("es").feature().move("init2", 3);

    model.study("std1").feature().create("stat2", "Stationary");
    model.study("std1").feature("stat2").set("useinitsol", "on");
    model.study("std1").feature("stat2").set("initstudy", "std1");

    model.sol("sol1").runAll();

    model.result("pg2").run();

    model.study("std1").feature().remove("stat2");
    model.study("std1").feature().create("time", "Transient");

    model.sol("sol1").runAll();

    model.result("pg2").run();


    model.study("std1").feature("time").set("useinitsol", "on");
    model.study("std1").feature("time").set("initstudy", "std1");
    model.study("std1").feature("time").set("usesol", "off");

    model.sol("sol1").runAll();

    model.result("pg2").run();

    model.study("std1").feature().remove("time");

    model.physics("es").feature().remove("init2");


    model.view("view1").set("geomhidestatus", "hide");

    model.physics("es").feature().remove("pot2");

    model.study("std1").feature("stat").set("useinitsol", "off");

    model.sol("sol1").runAll();

    model.result("pg2").run();

    model.view("view1").set("renderwireframe", true);
    model.view("view1").set("transparency", "on");
    model.view("view1").hideEntities("hide1").add(new int[]{1});
    model.view("view1").set("renderwireframe", false);
    model.view("view1").set("geomhidestatus", "hide");
    model.view("view1").hideEntities("hide1").add(new int[]{1});
    model.view("view1").hideEntities("hide1").add(new int[]{1});
    model.view("view1").set("geomhidestatus", "ignore");
    model.view("view1").hideEntities().clear();
    model.view("view1").hideEntities().clear();
    model.view("view1").hideEntities().create("hide1");
    model.view("view1").hideEntities("hide1").geom(3);
    model.view("view1").hideEntities("hide1").add(new int[]{1});
    model.view("view1").set("geomhidestatus", "hide");

    model.physics("es").feature("pot1").selection()
         .set(new int[]{200, 203, 205, 206});

    model.view("view1").set("transparency", "off");

    model.physics("es").feature("pot1").selection()
         .set(new int[]{196, 197, 198, 199, 200, 202, 203, 204, 205, 206});

    model.sol("sol1").runAll();

    model.result("pg2").run();
    model.result("pg2").set("showhiddenobjects", "on");
    model.result("pg2").run();
    model.result("pg2").set("allowtableupdate", true);
    model.result("pg2").set("renderdatacached", true);
    model.result().table("evl3")
         .addRow(new double[]{2.1081359594416256, 4.440892098500626E-16, 3.5309642289245424, 0});
    model.result().table("evl3")
         .addRow(new double[]{0.6561550900737068, -1.7763568394002505E-15, 4.525476130211008, 0});
    model.result().table("evl3")
         .addRow(new double[]{0.47493000842566957, -3.552713678800501E-15, 4.389250410746614, 0});
    model.result().table("evl3")
         .addRow(new double[]{0.22293976941582372, 1.7763568394002505E-15, 3.9037449536967777, 0});
    model.result().table("evl3")
         .addRow(new double[]{0.34682072732466196, 1.2434497875801753E-14, 3.320095182855173, 0});
    model.result().table("evl3")
         .addRow(new double[]{1.2992842296716844, -3.552713678800501E-15, 3.312067670240793, 0});
    model.result().table("evl3")
         .addRow(new double[]{0.6130691877132008, 5.329070518200751E-15, 3.9859675999700923, 0});
    model.result().table("evl3")
         .addRow(new double[]{0.6130691877132008, 5.329070518200751E-15, 3.9859675999700923, 0});
    model.result().table("evl3")
         .addRow(new double[]{-3.552713678800501E-15, 0.6952630227547552, 5.607084658875989, 0});
    model.result().table("evl3")
         .addRow(new double[]{0.6556989775822681, -1.0658141036401503E-14, 3.8891135442386275, 0});
    model.result().table("evl3")
         .addRow(new double[]{0.6556989775822681, -1.0658141036401503E-14, 3.8891135442386275, 0});
    model.result().table("evl3")
         .addRow(new double[]{0.6556989775822681, -1.0658141036401503E-14, 3.8891135442386275, 0});
    model.result().table("evl3")
         .addRow(new double[]{0.663894978093837, 3.552713678800501E-15, 4.446457490385772, 0});
    model.result().table("evl3")
         .addRow(new double[]{0.6720913969684184, 3.552713678800501E-15, 4.339906464091573, 0});
    model.result().table("evl3")
         .addRow(new double[]{-0.9343707729724047, 3.552713678800501E-15, 2.8973692123119816, 0});
    model.result().table("evl3")
         .addRow(new double[]{-2.220446049250313E-15, -0.1348457245287733, 2.0231365909106804, 0});
    model.result().table("evl3")
         .addRow(new double[]{-15.836626195782678, 3.552713678800501E-15, -9.652744771284198, 0});

    model.sol("sol1").runAll();

    model.result("pg2").run();

    model.physics("es").feature("ccn1").set("materialType", 1, "nonSolid");
    model.physics("es").feature("ccn1").set("materialType", 1, "from_mat");

    model.sol("sol1").runAll();

    model.result("pg2").run();

    model.geom("geom1").feature("fin").set("action", "union");
    model.geom("geom1").runAll();

    model.sol("sol1").runAll();

    model.result("pg2").run();


    model.view("view1").hideEntities("hide1").add(new int[]{1});
    model.view("view1").hideEntities("hide1").add(new int[]{1});
    model.view("view1").set("geomhidestatus", "ignore");
    model.view("view1").hideEntities("hide1").add(new int[]{1});
    model.view("view1").hideEntities().create("hide2");
    model.view("view1").hideEntities("hide2").geom(2);
    model.view("view1").hideEntities("hide2").add(new int[]{2});
    model.view("view1").hideEntities("hide2").add(new int[]{4});
    model.view("view1").hideEntities("hide1").add(new int[]{1});
    model.view("view1").hideEntities().clear();
    model.view("view1").hideEntities().create("hide1");
    model.view("view1").hideEntities("hide1").geom(3);
    model.view("view1").hideEntities("hide1").add(new int[]{1});
    model.view("view1").hideEntities().clear();
    model.view("view1").hideEntities().create("hide1");
    model.view("view1").hideEntities("hide1").geom(3);
    model.view("view1").hideEntities("hide1").add(new int[]{1});
    model.view("view1").set("geomhidestatus", "hide");

    model.result("pg2").run();
    model.result("pg2").set("allowtableupdate", true);
    model.result("pg2").set("renderdatacached", true);

    model.view("view1").set("geomhidestatus", "hide");

    model.result().table("evl3").set("storetable", "onfile");
    model.result().table("evl3")
         .set("filename", "C:\\Users\\A\\Dropbox\\DBS_Project\\Code\\DBS_Comsol\\3011_DBS_Simulation.csv");
    model.result().table("evl3").ensureUpdated(true);
    model.result("pg2").run();
    model.result("pg2").run();

    model.sol("sol1").runAll();

    model.result("pg2").run();
    model.result().dataset("dset1").set("frametype", "material");
    model.result("pg2").run();

    model.coordSystem("sys1").set("frametype", "geometry");

    model.physics("es").feature("pot1").selection().set(new int[]{461, 462});

    model.sol("sol1").runAll();

    model.result("pg2").run();
    model.result("pg2").set("allowtableupdate", true);
    model.result("pg2").set("renderdatacached", true);
    model.result().table("evl3")
         .addRow(new double[]{-7.105427357601002E-15, 5.245590706475239, -1.3769678673471804, 0.9999999618649044});
    model.result().table("evl3")
         .addRow(new double[]{3.552713678800501E-15, -0.7824553951645896, 5.569815428723668, 1.0000001459244359});
    model.result().table("evl3")
         .addRow(new double[]{-2.557226533150117, 3.552713678800501E-15, 15.605632811384506, 1.0000001973308132});

    model.view("view1").set("transparency", "off");

    model.result().table("evl3")
         .addRow(new double[]{-15.543882164672636, -3.4112890077108133, 0, 1.000000061326419});
    model.result().table("evl3")
         .addRow(new double[]{-15.224960789593057, -2.3100636898031723, 1.7763568394002505E-15, 1.0000000613725306});

    model.material().create("mat3");
    model.material("mat3").name("Water, liquid");
    model.material("mat3").set("family", "water");
    model.material("mat3").propertyGroup("def")
         .set("dynamicviscosity", "eta(T[1/K])[Pa*s]");
    model.material("mat3").propertyGroup("def")
         .set("ratioofspecificheat", "1.0");
    model.material("mat3").propertyGroup("def")
         .set("electricconductivity", "5.5e-6[S/m]");
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

    model.sol("sol1").runAll();

    model.result("pg2").run();

    model.physics("es").feature().remove("pot1");

    model.view("view1").set("geomhidestatus", "hide");

    model.physics("es").feature().create("gnd1", "Ground", 2);

    model.view("view1").set("renderwireframe", false);

    model.physics("es").feature("gnd1").selection()
         .set(new int[]{177, 178, 179, 180, 181, 182, 455, 456, 457, 458, 459, 460, 461, 462});
    model.physics("es").feature().create("pot1", "ElectricPotential", 2);
    model.physics("es").feature().remove("pot1");
    model.physics("es").feature().create("term1", "Terminal", 2);
    model.physics("es").feature().create("fp1", "FloatingPotential", 2);
    model.physics("es").feature("gnd1").selection()
         .set(new int[]{5, 8, 11, 14, 17, 20, 23, 26, 123, 126, 129, 132, 135, 138, 141, 144, 177, 178, 179, 180, 181, 182, 455, 456, 457, 458, 459, 460, 461, 462});
    model.physics("es").feature("term1").selection().set(new int[]{183, 184});
    model.physics("es").feature("term1").set("TerminalType", 1, "Voltage");
    model.physics("es").feature("term1").set("V0", 1, "2");
    model.physics("es").feature("term1").set("V0", 1, "1");

    model.view("view1").set("geomhidestatus", "showonlyhidden");
    model.view("view1").set("renderwireframe", true);

    model.physics("es").feature("fp1").selection()
         .set(new int[]{1, 2, 3, 4, 249, 250, 292, 293});

    model.view("view1").set("geomhidestatus", "hide");
    model.view("view1").set("renderwireframe", false);

    model.sol("sol1").runAll();

    model.material("mat3").propertyGroup("def")
         .set("electricconductivity", new String[]{"5.5[S/m]"});

    model.result("pg2").run();

    model.sol("sol1").runAll();

    model.result("pg2").feature().create("arwv1", "ArrowVolume");

    model.result("pg2").feature("arwv1").set("data", "dset1");

    model.result("pg2").feature("arwv1").set("data", "parent");

    model.result("pg2").feature().create("vol1", "Volume");

    model.result("pg2").set("allowtableupdate", true);
    model.result("pg2").set("renderdatacached", true);
    model.result().table("evl3")
         .addRow(new double[]{16.40408633317231, 3.050905089955326, 10.90245240327796, 0.07818253725305536});
    model.result().table("evl3")
         .addRow(new double[]{19.452158009751717, 3.807020872822804, 2.3872500813750825, 0.07818253725305536});
    model.result().table("evl3")
         .addRow(new double[]{19.493633811945557, 3.8214884540946157, 1.871898765259445, 0.07818253725305536});
    model.result().table("evl3")
         .addRow(new double[]{15.789730759917807, -0.08966025325100802, 12.180857137638602, 0.07818253725305536});
    model.result().table("evl3")
         .addRow(new double[]{15.350990507153563, 5.455063206102515, 11.512714853407987, 0.07818253725305538});
    model.result().table("evl3")
         .addRow(new double[]{15.350990507153563, 5.455063206102515, 11.512714853407987, 0.07818253725305538});

    model.result("pg2").feature().remove("vol1");
    model.result("pg2").feature("arwv1").set("arrowlength", "normalized");
    model.result("pg2").feature().remove("arwv1");
    model.result("pg2").run();

    model.physics("es").feature("term1").set("V0", 1, "10");


    model.result("pg2").run();

    model.material("mat3").propertyGroup("def")
         .set("electricconductivity", new String[]{"100000[S/m]"});

    model.sol("sol1").runAll();

    model.result("pg2").run();

    model.name("32ElectrodeModelRefined_mk2.mph");

    model.physics("es").feature("term1").set("V0", 1, "1");

    model.material("mat3").name("Water, liquid mod STN");
    model.material("mat3").propertyGroup("def")
         .set("relpermittivity", new String[]{"3.9*10^6"});
    model.material("mat3").propertyGroup("def")
         .set("electricconductivity", new String[]{"0.11[S/m]"});

    model.sol("sol1").runAll();

    model.result("pg2").run();

    model.study("std1").feature().create("freq", "Frequency");
    model.study("std1").feature("freq").set("plist", "range(1,999/9,1000)");

    model.sol("sol1").runAll();

    model.result("pg2").run();

    model.study("std1").feature("freq").set("plot", "off");

    model.result("pg2").run();

    model.study("std1").feature().remove("freq");


    model.result("pg2").run();


    model.physics("es").feature().create("term2", "Terminal", 2);
    model.physics("es").feature("term2").set("TerminalType", 1, "Voltage");
    model.physics("es").feature("term2").set("V0", 1, "-1");

    model.view("view1").set("geomhidestatus", "hide");

    model.physics("es").feature("term2").selection().set(new int[]{177, 178});

    model.sol("sol1").runAll();

    model.result("pg2").run();
    model.result("pg2").set("allowtableupdate", true);
    model.result("pg2").set("renderdatacached", true);
    model.result().table("evl3")
         .addRow(new double[]{-8.425025014572563, 0, 11.896646230434644, 4.338090494536085E-4});
    model.result("pg2").feature("mslc1").set("colortable", "Thermal");
    model.result("pg2").run();


    model.result("pg2").set("allowtableupdate", true);
    model.result("pg2").set("renderdatacached", true);
    model.result().table("evl3")
         .addRow(new double[]{4.021852257815034, -3.552713678800501E-15, 1.3225083604599304, -0.006835694286196305});



    model.result("pg2").feature("mslc1").set("ynumber", "5");
    model.result("pg2").run();
    model.result("pg2").feature("mslc1").set("ynumber", "10");
    model.result("pg2").run();
    model.result("pg2").feature("mslc1").set("ynumber", "1");
    model.result("pg2").run();
    model.result("pg2").feature("mslc1").set("xnumber", "10");
    model.result("pg2").run();

    model.view("view1").set("scenelight", "off");

    model.result("pg2").feature("mslc1").set("xnumber", "3");
    model.result("pg2").run();
    model.result("pg2").feature("mslc1").set("xnumber", "2");
    model.result("pg2").run();
    model.result("pg2").feature("mslc1").set("ynumber", "2");
    model.result("pg2").feature("mslc1").set("znumber", "2");
    model.result("pg2").run();

    model.view("view1").set("transparency", "off");

    model.physics("es").feature().create("term3", "Terminal", 2);
    model.physics("es").feature("term3").set("TerminalType", 1, "Voltage");
    model.physics("es").feature("term3").selection().set(new int[]{455, 456});

    model.sol("sol1").runAll();

    model.result("pg2").run();

    model.view("view1").set("scenelight", "on");

    model.result("pg2").run();
    model.result("pg2").feature("mslc1").set("colortable", "Disco");

    model.view("view1").set("transparency", "off");

    model.result("pg2").feature("mslc1").set("colortable", "ThermalLight");
    model.result("pg2").feature("mslc1").set("ynumber", "1");
    model.result("pg2").feature("mslc1").set("xnumber", "1");
    model.result("pg2").run();
    model.result("pg2").feature("mslc1").set("znumber", "1");
    model.result("pg2").run();
    model.result("pg2").set("allowtableupdate", true);
    model.result("pg2").set("renderdatacached", true);
    model.result("pg2").feature("mslc1").set("xnumber", "2");
    model.result("pg2").feature("mslc1").set("ynumber", "2");
    model.result("pg2").feature("mslc1").set("znumber", "2");

    model.physics("es").feature("term1").set("V0", 1, "4");
    model.physics("es").feature("term2").set("V0", 1, "-4");

    model.result("pg2").run();
    model.result("pg2").run();
    model.result("pg2").feature("mslc1").set("xnumber", "1");
    model.result("pg2").feature("mslc1").set("ynumber", "1");
    model.result("pg2").feature("mslc1").set("znumber", "1");
    model.result("pg2").run();

    model.sol("sol1").updateSolution();


    model.sol("sol1").runAll();

    model.result("pg2").run();

    model.physics("es").feature("term2").set("V0", 1, "-2");

    model.sol("sol1").runAll();

    model.result("pg2").run();


    model.result("pg2").run();
    model.result("pg2").feature("mslc1").set("xnumber", "5");
    model.result("pg2").feature("mslc1").set("ynumber", "5");
    model.result("pg2").feature("mslc1").set("znumber", "5");
    model.result("pg2").run();
    model.result().export().create("plot1", "pg2", "mslc1", "Plot");
    model.result("pg2").set("window", "graphics");
    model.result("pg2").run();
    model.result("pg2").set("window", "graphics");
    model.result("pg2").set("windowtitle", "");
    model.result().export("plot1")
         .set("filename", "C:\\Users\\A\\Dropbox\\DBS_Project\\Code\\AranCode\\DBS_Data_Analysis\\data_test2.csv");
    model.result().export("plot1").run();
    model.result("pg2").run();
    model.result("pg2").feature("mslc1").set("multiplanexmethod", "coord");
    model.result("pg2").feature("mslc1").set("multiplaneymethod", "coord");
    model.result("pg2").feature("mslc1").set("multiplanezmethod", "coord");
    model.result("pg2").feature("mslc1").set("ycoord", "range(-10,1,10)");
    model.result().export("plot1").set("plotexporttype", "typeSTL");
    model.result().export("plot1").set("showcompact", "off");
    model.result().export("plot1").set("plotexporttype", "typeSTL");
    model.result().export("plot1").set("showcompact", "off");
    model.result().export("plot1").set("plotexporttype", "typeSTL");
    model.result().export("plot1").set("showcompact", "off");
    model.result("pg2").feature("mslc1").set("xcoord", "range(-10,1,10)");
    model.result().export("plot1").set("plotexporttype", "typeSTL");
    model.result().export("plot1").set("showcompact", "off");
    model.result().export("plot1").set("plotexporttype", "typeSTL");
    model.result().export("plot1").set("showcompact", "off");
    model.result().export("plot1").set("plotexporttype", "typeSTL");
    model.result().export("plot1").set("showcompact", "off");
    model.result("pg2").feature("mslc1").set("zcoord", "range(-10,1,10)");
    model.result().export("plot1").set("plotexporttype", "typeSTL");
    model.result().export("plot1").set("showcompact", "off");
    model.result().export("plot1").set("plotexporttype", "typeSTL");
    model.result().export("plot1").set("showcompact", "off");
    model.result().export("plot1").set("plotexporttype", "typeSTL");
    model.result().export("plot1").set("showcompact", "off");
    model.result("pg2").run();
    model.result("pg2").set("window", "graphics");
    model.result("pg2").run();
    model.result("pg2").set("window", "graphics");
    model.result("pg2").set("windowtitle", "");
    model.result("pg2").set("window", "graphics");
    model.result("pg2").run();
    model.result("pg2").set("window", "graphics");
    model.result("pg2").set("windowtitle", "");
    model.result().export("plot1").run();


    model.result("pg2").set("window", "graphics");
    model.result("pg2").run();
    model.result("pg2").set("window", "graphics");
    model.result("pg2").set("windowtitle", "");
    model.result().export("plot1")
         .set("filename", "C:\\Users\\A\\Dropbox\\DBS_Project\\Code\\AranCode\\DBS_Data_Analysis\\data_export170314.csv");
    model.result("pg2").run();
    model.result("pg2").run();
    model.result("pg2").feature("mslc1").set("zcoord", "range(-10,0.1,10)");
    model.result("pg2").feature("mslc1").set("ycoord", "range(-10,0.1,10)");
    model.result("pg2").feature("mslc1").set("xcoord", "range(-10,0.1,10)");
    model.result("pg2").run();
    model.result("pg2").set("window", "graphics");
    model.result("pg2").run();
    model.result("pg2").set("window", "graphics");
    model.result("pg2").set("windowtitle", "");
    model.result().export("plot1").run();

    model.name("Java_Generated_Model.mph");

    model.result("pg2").set("window", "graphics");
    model.result("pg2").run();
    model.result("pg2").set("window", "graphics");
    model.result("pg2").set("windowtitle", "");

    model.result("pg2").set("window", "graphics");
    model.result("pg2").run();
    model.result("pg2").set("window", "graphics");
    model.result("pg2").set("windowtitle", "");

    return model;
  }

}
