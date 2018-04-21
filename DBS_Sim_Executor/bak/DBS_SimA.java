/*
 * DBS_SimA.java
 */

import com.comsol.model.*;
import com.comsol.model.util.*;

/** Model exported on Feb 2 2014, 17:56 by COMSOL 4.3.2.152. */
public class DBS_SimA {

  public static void main(String[] args) {
    run();
  }

  public static Model run() {
    Model model = ModelUtil.create("Model");

    model
         .modelPath("C:\\Users\\A\\Dropbox\\DBS_Project\\Code\\AranCode\\DBS_Comsol");

    model.name("32ElectrodeModelRefined_mk2.mph");

    model.modelNode().create("mod1");

    model.geom().create("geom1", 3);
    model.geom("geom1").lengthUnit("mm");
    model.geom("geom1").feature().create("cyl1", "Cylinder");
    model.geom("geom1").feature().create("cyl2", "Cylinder");
    model.geom("geom1").feature().create("cyl3", "Cylinder");
    model.geom("geom1").feature().create("cyl4", "Cylinder");
    model.geom("geom1").feature().create("cyl5", "Cylinder");
    model.geom("geom1").feature().create("cyl6", "Cylinder");
    model.geom("geom1").feature().create("cyl7", "Cylinder");
    model.geom("geom1").feature().create("cyl8", "Cylinder");
    model.geom("geom1").feature().create("cyl9", "Cylinder");
    model.geom("geom1").feature().create("cyl10", "Cylinder");
    model.geom("geom1").feature().create("cyl11", "Cylinder");
    model.geom("geom1").feature().create("cyl12", "Cylinder");
    model.geom("geom1").feature().create("cyl13", "Cylinder");
    model.geom("geom1").feature().create("cyl14", "Cylinder");
    model.geom("geom1").feature().create("cyl15", "Cylinder");
    model.geom("geom1").feature().create("cyl16", "Cylinder");
    model.geom("geom1").feature().create("cyl17", "Cylinder");
    model.geom("geom1").feature().create("cyl18", "Cylinder");
    model.geom("geom1").feature().create("cyl19", "Cylinder");
    model.geom("geom1").feature().create("cyl20", "Cylinder");
    model.geom("geom1").feature().create("cyl21", "Cylinder");
    model.geom("geom1").feature().create("cyl22", "Cylinder");
    model.geom("geom1").feature().create("cyl23", "Cylinder");
    model.geom("geom1").feature().create("cyl24", "Cylinder");
    model.geom("geom1").feature().create("cyl25", "Cylinder");
    model.geom("geom1").feature().create("cyl26", "Cylinder");
    model.geom("geom1").feature().create("cyl27", "Cylinder");
    model.geom("geom1").feature().create("cyl28", "Cylinder");
    model.geom("geom1").feature().create("cyl29", "Cylinder");
    model.geom("geom1").feature().create("cyl30", "Cylinder");
    model.geom("geom1").feature().create("cyl31", "Cylinder");
    model.geom("geom1").feature().create("cyl32", "Cylinder");
    model.geom("geom1").feature().create("cyl33", "Cylinder");
    model.geom("geom1").feature().create("sph1", "Sphere");
    model.geom("geom1").feature("cyl1").set("h", "15");
    model.geom("geom1").feature("cyl1").set("r", "0.635");
    model.geom("geom1").feature("cyl2").set("rot", "90");
    model.geom("geom1").feature("cyl2")
         .set("axis", new String[]{"1", "0", "0"});
    model.geom("geom1").feature("cyl2")
         .set("pos", new String[]{"0.625", "0", "0.4"});
    model.geom("geom1").feature("cyl2").set("h", "0.04");
    model.geom("geom1").feature("cyl2").set("r", "0.25");
    model.geom("geom1").feature("cyl3").set("rot", "90");
    model.geom("geom1").feature("cyl3")
         .set("axis", new String[]{"1", "0", "0"});
    model.geom("geom1").feature("cyl3")
         .set("pos", new String[]{"0.625", "0", "1"});
    model.geom("geom1").feature("cyl3").set("h", "0.04");
    model.geom("geom1").feature("cyl3").set("r", "0.25");
    model.geom("geom1").feature("cyl4").set("rot", "90");
    model.geom("geom1").feature("cyl4")
         .set("axis", new String[]{"1", "0", "0"});
    model.geom("geom1").feature("cyl4")
         .set("pos", new String[]{"0.625", "0", "1.6"});
    model.geom("geom1").feature("cyl4").set("h", "0.04");
    model.geom("geom1").feature("cyl4").set("r", "0.25");
    model.geom("geom1").feature("cyl5").set("rot", "90");
    model.geom("geom1").feature("cyl5")
         .set("axis", new String[]{"1", "0", "0"});
    model.geom("geom1").feature("cyl5")
         .set("pos", new String[]{"0.625", "0", "2.2"});
    model.geom("geom1").feature("cyl5").set("h", "0.04");
    model.geom("geom1").feature("cyl5").set("r", "0.25");
    model.geom("geom1").feature("cyl6").set("rot", "90");
    model.geom("geom1").feature("cyl6")
         .set("axis", new String[]{"1", "0", "0"});
    model.geom("geom1").feature("cyl6")
         .set("pos", new String[]{"0.625", "0", "2.8"});
    model.geom("geom1").feature("cyl6").set("h", "0.04");
    model.geom("geom1").feature("cyl6").set("r", "0.25");
    model.geom("geom1").feature("cyl7").set("rot", "90");
    model.geom("geom1").feature("cyl7")
         .set("axis", new String[]{"1", "0", "0"});
    model.geom("geom1").feature("cyl7")
         .set("pos", new String[]{"0.625", "0", "3.4"});
    model.geom("geom1").feature("cyl7").set("h", "0.04");
    model.geom("geom1").feature("cyl7").set("r", "0.25");
    model.geom("geom1").feature("cyl8").set("rot", "90");
    model.geom("geom1").feature("cyl8")
         .set("axis", new String[]{"1", "0", "0"});
    model.geom("geom1").feature("cyl8")
         .set("pos", new String[]{"0.625", "0", "4"});
    model.geom("geom1").feature("cyl8").set("h", "0.04");
    model.geom("geom1").feature("cyl8").set("r", "0.25");
    model.geom("geom1").feature("cyl9").set("rot", "90");
    model.geom("geom1").feature("cyl9")
         .set("axis", new String[]{"1", "0", "0"});
    model.geom("geom1").feature("cyl9")
         .set("pos", new String[]{"0.625", "0", "4.6"});
    model.geom("geom1").feature("cyl9").set("h", "0.04");
    model.geom("geom1").feature("cyl9").set("r", "0.25");
    model.geom("geom1").feature("cyl10").set("rot", "90");
    model.geom("geom1").feature("cyl10")
         .set("axis", new String[]{"0", "1", "0"});
    model.geom("geom1").feature("cyl10")
         .set("pos", new String[]{"0", "-0.665", "0.4"});
    model.geom("geom1").feature("cyl10").set("h", "0.04");
    model.geom("geom1").feature("cyl10").set("r", "0.25");
    model.geom("geom1").feature("cyl11").set("rot", "90");
    model.geom("geom1").feature("cyl11")
         .set("axis", new String[]{"0", "1", "0"});
    model.geom("geom1").feature("cyl11")
         .set("pos", new String[]{"0", "-0.665", "1"});
    model.geom("geom1").feature("cyl11").set("h", "0.04");
    model.geom("geom1").feature("cyl11").set("r", "0.25");
    model.geom("geom1").feature("cyl12").set("rot", "90");
    model.geom("geom1").feature("cyl12")
         .set("axis", new String[]{"0", "1", "0"});
    model.geom("geom1").feature("cyl12")
         .set("pos", new String[]{"0", "-0.665", "1.6"});
    model.geom("geom1").feature("cyl12").set("h", "0.04");
    model.geom("geom1").feature("cyl12").set("r", "0.25");
    model.geom("geom1").feature("cyl13").set("rot", "90");
    model.geom("geom1").feature("cyl13")
         .set("axis", new String[]{"0", "1", "0"});
    model.geom("geom1").feature("cyl13")
         .set("pos", new String[]{"0", "-0.665", "2.2"});
    model.geom("geom1").feature("cyl13").set("h", "0.04");
    model.geom("geom1").feature("cyl13").set("r", "0.25");
    model.geom("geom1").feature("cyl14").set("rot", "90");
    model.geom("geom1").feature("cyl14")
         .set("axis", new String[]{"0", "1", "0"});
    model.geom("geom1").feature("cyl14")
         .set("pos", new String[]{"0", "-0.665", "2.8"});
    model.geom("geom1").feature("cyl14").set("h", "0.04");
    model.geom("geom1").feature("cyl14").set("r", "0.25");
    model.geom("geom1").feature("cyl15").set("rot", "90");
    model.geom("geom1").feature("cyl15")
         .set("axis", new String[]{"0", "1", "0"});
    model.geom("geom1").feature("cyl15")
         .set("pos", new String[]{"0", "-0.665", "3.4"});
    model.geom("geom1").feature("cyl15").set("h", "0.04");
    model.geom("geom1").feature("cyl15").set("r", "0.25");
    model.geom("geom1").feature("cyl16").set("rot", "90");
    model.geom("geom1").feature("cyl16")
         .set("axis", new String[]{"0", "1", "0"});
    model.geom("geom1").feature("cyl16")
         .set("pos", new String[]{"0", "-0.665", "4"});
    model.geom("geom1").feature("cyl16").set("h", "0.04");
    model.geom("geom1").feature("cyl16").set("r", "0.25");
    model.geom("geom1").feature("cyl17").set("rot", "90");
    model.geom("geom1").feature("cyl17")
         .set("axis", new String[]{"0", "1", "0"});
    model.geom("geom1").feature("cyl17")
         .set("pos", new String[]{"0", "-0.665", "4.6"});
    model.geom("geom1").feature("cyl17").set("h", "0.04");
    model.geom("geom1").feature("cyl17").set("r", "0.25");
    model.geom("geom1").feature("cyl18").set("rot", "90");
    model.geom("geom1").feature("cyl18")
         .set("axis", new String[]{"0", "1", "0"});
    model.geom("geom1").feature("cyl18")
         .set("pos", new String[]{"0", "0.625", "0.4"});
    model.geom("geom1").feature("cyl18").set("h", "0.04");
    model.geom("geom1").feature("cyl18").set("r", "0.25");
    model.geom("geom1").feature("cyl19").set("rot", "90");
    model.geom("geom1").feature("cyl19")
         .set("axis", new String[]{"0", "1", "0"});
    model.geom("geom1").feature("cyl19")
         .set("pos", new String[]{"0", "0.625", "1"});
    model.geom("geom1").feature("cyl19").set("h", "0.04");
    model.geom("geom1").feature("cyl19").set("r", "0.25");
    model.geom("geom1").feature("cyl20").set("rot", "90");
    model.geom("geom1").feature("cyl20")
         .set("axis", new String[]{"0", "1", "0"});
    model.geom("geom1").feature("cyl20")
         .set("pos", new String[]{"0", "0.625", "1.6"});
    model.geom("geom1").feature("cyl20").set("h", "0.04");
    model.geom("geom1").feature("cyl20").set("r", "0.25");
    model.geom("geom1").feature("cyl21").set("rot", "90");
    model.geom("geom1").feature("cyl21")
         .set("axis", new String[]{"0", "1", "0"});
    model.geom("geom1").feature("cyl21")
         .set("pos", new String[]{"0", "0.625", "2.2"});
    model.geom("geom1").feature("cyl21").set("h", "0.04");
    model.geom("geom1").feature("cyl21").set("r", "0.25");
    model.geom("geom1").feature("cyl22").set("rot", "90");
    model.geom("geom1").feature("cyl22")
         .set("axis", new String[]{"0", "1", "0"});
    model.geom("geom1").feature("cyl22")
         .set("pos", new String[]{"0", "0.625", "2.8"});
    model.geom("geom1").feature("cyl22").set("h", "0.04");
    model.geom("geom1").feature("cyl22").set("r", "0.25");
    model.geom("geom1").feature("cyl23").set("rot", "90");
    model.geom("geom1").feature("cyl23")
         .set("axis", new String[]{"0", "1", "0"});
    model.geom("geom1").feature("cyl23")
         .set("pos", new String[]{"0", "0.625", "3.4"});
    model.geom("geom1").feature("cyl23").set("h", "0.04");
    model.geom("geom1").feature("cyl23").set("r", "0.25");
    model.geom("geom1").feature("cyl24").set("rot", "90");
    model.geom("geom1").feature("cyl24")
         .set("axis", new String[]{"0", "1", "0"});
    model.geom("geom1").feature("cyl24")
         .set("pos", new String[]{"0", "0.625", "4"});
    model.geom("geom1").feature("cyl24").set("h", "0.04");
    model.geom("geom1").feature("cyl24").set("r", "0.25");
    model.geom("geom1").feature("cyl25").set("rot", "90");
    model.geom("geom1").feature("cyl25")
         .set("axis", new String[]{"0", "1", "0"});
    model.geom("geom1").feature("cyl25")
         .set("pos", new String[]{"0", "0.625", "4.6"});
    model.geom("geom1").feature("cyl25").set("h", "0.04");
    model.geom("geom1").feature("cyl25").set("r", "0.25");
    model.geom("geom1").feature("cyl26").set("rot", "90");
    model.geom("geom1").feature("cyl26")
         .set("axis", new String[]{"1", "0", "0"});
    model.geom("geom1").feature("cyl26")
         .set("pos", new String[]{"-0.665", "0", "0.4"});
    model.geom("geom1").feature("cyl26").set("h", "0.04");
    model.geom("geom1").feature("cyl26").set("r", "0.25");
    model.geom("geom1").feature("cyl27").set("rot", "90");
    model.geom("geom1").feature("cyl27")
         .set("axis", new String[]{"1", "0", "0"});
    model.geom("geom1").feature("cyl27")
         .set("pos", new String[]{"-0.665", "0", "1"});
    model.geom("geom1").feature("cyl27").set("h", "0.04");
    model.geom("geom1").feature("cyl27").set("r", "0.25");
    model.geom("geom1").feature("cyl28").set("rot", "90");
    model.geom("geom1").feature("cyl28")
         .set("axis", new String[]{"1", "0", "0"});
    model.geom("geom1").feature("cyl28")
         .set("pos", new String[]{"-0.665", "0", "1.6"});
    model.geom("geom1").feature("cyl28").set("h", "0.04");
    model.geom("geom1").feature("cyl28").set("r", "0.25");
    model.geom("geom1").feature("cyl29").set("rot", "90");
    model.geom("geom1").feature("cyl29")
         .set("axis", new String[]{"1", "0", "0"});
    model.geom("geom1").feature("cyl29")
         .set("pos", new String[]{"-0.665", "0", "2.2"});
    model.geom("geom1").feature("cyl29").set("h", "0.04");
    model.geom("geom1").feature("cyl29").set("r", "0.25");
    model.geom("geom1").feature("cyl30").set("rot", "90");
    model.geom("geom1").feature("cyl30")
         .set("axis", new String[]{"1", "0", "0"});
    model.geom("geom1").feature("cyl30")
         .set("pos", new String[]{"-0.665", "0", "2.8"});
    model.geom("geom1").feature("cyl30").set("h", "0.04");
    model.geom("geom1").feature("cyl30").set("r", "0.25");
    model.geom("geom1").feature("cyl31").set("rot", "90");
    model.geom("geom1").feature("cyl31")
         .set("axis", new String[]{"1", "0", "0"});
    model.geom("geom1").feature("cyl31")
         .set("pos", new String[]{"-0.665", "0", "3.4"});
    model.geom("geom1").feature("cyl31").set("h", "0.04");
    model.geom("geom1").feature("cyl31").set("r", "0.25");
    model.geom("geom1").feature("cyl32").set("rot", "90");
    model.geom("geom1").feature("cyl32")
         .set("axis", new String[]{"1", "0", "0"});
    model.geom("geom1").feature("cyl32")
         .set("pos", new String[]{"-0.665", "0", "4"});
    model.geom("geom1").feature("cyl32").set("h", "0.04");
    model.geom("geom1").feature("cyl32").set("r", "0.25");
    model.geom("geom1").feature("cyl33").set("rot", "90");
    model.geom("geom1").feature("cyl33")
         .set("axis", new String[]{"1", "0", "0"});
    model.geom("geom1").feature("cyl33")
         .set("pos", new String[]{"-0.665", "0", "4.6"});
    model.geom("geom1").feature("cyl33").set("h", "0.04");
    model.geom("geom1").feature("cyl33").set("r", "0.25");
    model.geom("geom1").feature("sph1").set("r", "20");
    model.geom("geom1").run();

    model.view("view1").hideObjects().create("hide1");
    model.view("view1").hideEntities().create("hide1");
    model.view("view1").hideEntities("hide1").set(new int[]{1});

    model.material().create("mat1");
    model.material("mat1").propertyGroup()
         .create("Enu", "Young's modulus and Poisson's ratio");
    model.material().create("mat2");
    model.material("mat2").propertyGroup("def").func()
         .create("dL", "Piecewise");
    model.material("mat2").propertyGroup("def").func()
         .create("k", "Piecewise");
    model.material("mat2").propertyGroup("def").func()
         .create("res_solid_alpha_1", "Piecewise");
    model.material("mat2").propertyGroup("def").func()
         .create("alpha", "Piecewise");
    model.material("mat2").propertyGroup("def").func()
         .create("C_solid_1", "Piecewise");
    model.material("mat2").propertyGroup("def").func()
         .create("HC_solid_1", "Piecewise");
    model.material("mat2").propertyGroup("def").func()
         .create("mu", "Piecewise");
    model.material("mat2").propertyGroup("def").func()
         .create("sigma_solid_alpha_1", "Piecewise");
    model.material("mat2").propertyGroup("def").func()
         .create("rho", "Piecewise");
    model.material("mat2").propertyGroup("def").func()
         .create("TD", "Piecewise");
    model.material("mat2").propertyGroup("def").func()
         .create("VP_solid_1", "Piecewise");
    model.material("mat2").propertyGroup("def").func()
         .create("kappa", "Piecewise");
    model.material("mat2").propertyGroup()
         .create("Enu", "Young's modulus and Poisson's ratio");
    model.material("mat2").propertyGroup("Enu").func()
         .create("E", "Piecewise");
    model.material("mat2").propertyGroup("Enu").func()
         .create("nu", "Piecewise");
    model.material("mat2").selection()
         .set(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66});
    model.material().create("mat3");
    model.material("mat3").propertyGroup("def").func()
         .create("eta", "Piecewise");
    model.material("mat3").propertyGroup("def").func()
         .create("Cp", "Piecewise");
    model.material("mat3").propertyGroup("def").func()
         .create("rho", "Piecewise");
    model.material("mat3").propertyGroup("def").func()
         .create("k", "Piecewise");
    model.material("mat3").propertyGroup("def").func()
         .create("cs", "Interpolation");
    model.material("mat3").selection().set(new int[]{1});

    model.physics().create("es", "Electrostatics", "geom1");
    model.physics("es").feature().create("gnd1", "Ground", 2);
    model.physics("es").feature("gnd1").selection()
         .set(new int[]{5, 8, 11, 14, 17, 20, 23, 26, 123, 126, 129, 132, 135, 138, 141, 144, 177, 178, 179, 180, 181, 182, 455, 456, 457, 458, 459, 460, 461, 462});
    model.physics("es").feature().create("term1", "Terminal", 2);
    model.physics("es").feature("term1").selection().set(new int[]{183, 184});
    model.physics("es").feature().create("fp1", "FloatingPotential", 2);
    model.physics("es").feature("fp1").selection()
         .set(new int[]{1, 2, 3, 4, 249, 250, 292, 293});
    model.physics("es").feature().create("term2", "Terminal", 2);
    model.physics("es").feature("term2").selection().set(new int[]{177, 178});
    model.physics("es").feature().create("term3", "Terminal", 2);
    model.physics("es").feature("term3").selection().set(new int[]{455, 456});

    model.mesh().create("mesh1", "geom1");
    model.mesh("mesh1").feature().create("ftet1", "FreeTet");

    model.result().table().create("evl3", "Table");

    model.view("view1").hideObjects("hide1").set(new String[]{"sph1(1)"});

    model.material("mat1").name("Acrylic plastic");
    model.material("mat1").propertyGroup("def")
         .set("thermalexpansioncoefficient", new String[]{"7.0e-5[1/K]", "0", "0", "0", "7.0e-5[1/K]", "0", "0", "0", "7.0e-5[1/K]"});
    model.material("mat1").propertyGroup("def")
         .set("heatcapacity", "1470[J/(kg*K)]");
    model.material("mat1").propertyGroup("def")
         .set("density", "1190[kg/m^3]");
    model.material("mat1").propertyGroup("def")
         .set("thermalconductivity", new String[]{"0.18[W/(m*K)]", "0", "0", "0", "0.18[W/(m*K)]", "0", "0", "0", "0.18[W/(m*K)]"});
    model.material("mat1").propertyGroup("def")
         .set("relpermittivity", new String[]{"2.7", "0", "0", "0", "2.7", "0", "0", "0", "2.7"});
    model.material("mat1").propertyGroup("Enu")
         .set("youngsmodulus", "3.2e9[Pa]");
    model.material("mat1").propertyGroup("Enu").set("poissonsratio", "0.35");
    model.material("mat2").name("Titanium [solid,alpha]");
    model.material("mat2").propertyGroup("def").func("dL").set("arg", "T");
    model.material("mat2").propertyGroup("def").func("dL")
         .set("pieces", new String[][]{{"0.0", "40.0", "-0.001489666-2.5E-7*T^1+1.25E-8*T^2"}, {"40.0", "200.0", "-0.001535+4.39824E-6*T^1-1.3978E-7*T^2+1.930653E-9*T^3-9.582605E-12*T^4+1.682692E-14*T^5"}, {"200.0", "1144.0", "-0.002006083+4.790918E-6*T^1+9.116775E-9*T^2-8.086306E-12*T^3+3.131446E-15*T^4"}});
    model.material("mat2").propertyGroup("def").func("k").set("arg", "T");
    model.material("mat2").propertyGroup("def").func("k")
         .set("pieces", new String[][]{{"0.0", "50.0", "1.46129*T^1-0.006261944*T^2+6.355161E-4*T^3-2.974167E-5*T^4+2.851803E-7*T^5"}, {"50.0", "326.0", "58.17412-0.4851624*T^1+0.00288092*T^2-8.255595E-6*T^3+8.903946E-9*T^4"}, {"326.0", "977.0", "41.95804-0.1227486*T^1+2.33331E-4*T^2-1.937431E-7*T^3+6.191111E-11*T^4"}, {"977.0", "1950.0", "15.13513+0.004158454*T^1+1.376649E-6*T^2"}});
    model.material("mat2").propertyGroup("def").func("res_solid_alpha_1")
         .set("arg", "T");
    model.material("mat2").propertyGroup("def").func("res_solid_alpha_1")
         .set("pieces", new String[][]{{"77.0", "1100.0", "2.470175E-9+1.446126E-9*T^1+8.367811E-13*T^2-7.327418E-16*T^3"}});
    model.material("mat2").propertyGroup("def").func("alpha").set("arg", "T");
    model.material("mat2").propertyGroup("def").func("alpha")
         .set("pieces", new String[][]{{"0.0", "1144.0", "5.034683E-6+2.527512E-8*T^1-7.155452E-11*T^2+1.068357E-13*T^3-7.796841E-17*T^4+2.218768E-20*T^5"}});
    model.material("mat2").propertyGroup("def").func("C_solid_1")
         .set("arg", "T");
    model.material("mat2").propertyGroup("def").func("C_solid_1")
         .set("pieces", new String[][]{{"100.0", "300.0", "-167.7468+7.086583*T^1-0.02978493*T^2+6.044771E-5*T^3-4.762589E-8*T^4"}, {"300.0", "900.0", "464.052+0.1524656*T^1+2.12593E-4*T^2-1.720171E-7*T^3"}, {"900.0", "1156.0", "-33066.63+136.7738*T^1-0.2048109*T^2+1.335042E-4*T^3-3.171822E-8*T^4"}, {"1156.0", "1944.0", "352.8258+0.1230479*T^1+6.657229E-5*T^2"}});
    model.material("mat2").propertyGroup("def").func("HC_solid_1")
         .set("arg", "T");
    model.material("mat2").propertyGroup("def").func("HC_solid_1")
         .set("pieces", new String[][]{{"100.0", "300.0", "-8.035071+0.3394473*T^1-0.001426698*T^2+2.895446E-6*T^3-2.28128E-9*T^4"}, {"300.0", "900.0", "22.2281+0.007303101*T^1+1.01832E-5*T^2-8.239618E-9*T^3"}, {"900.0", "1156.0", "-1583.892+6.551466*T^1-0.009810442*T^2+6.394851E-6*T^3-1.519302E-9*T^4"}, {"1156.0", "1944.0", "16.90036+0.005893992*T^1+3.188813E-6*T^2"}});
    model.material("mat2").propertyGroup("def").func("mu").set("arg", "T");
    model.material("mat2").propertyGroup("def").func("mu")
         .set("pieces", new String[][]{{"293.0", "1073.0", "4.783492E10-2.376622E7*T^1"}});
    model.material("mat2").propertyGroup("def").func("sigma_solid_alpha_1")
         .set("arg", "T");
    model.material("mat2").propertyGroup("def").func("sigma_solid_alpha_1")
         .set("pieces", new String[][]{{"77.0", "1100.0", "1/(-7.327418E-16*T^3+8.367811E-13*T^2+1.446126E-09*T+2.470175E-09)"}});
    model.material("mat2").propertyGroup("def").func("rho").set("arg", "T");
    model.material("mat2").propertyGroup("def").func("rho")
         .set("pieces", new String[][]{{"0.0", "20.0", "4520.168"}, {"20.0", "160.0", "4520.925-0.07042247*T^1+0.002149145*T^2-2.875466E-5*T^3+1.417353E-7*T^4-2.481938E-10*T^5"}, {"160.0", "1144.0", "4525.567-0.05296616*T^1-1.538843E-4*T^2+1.427212E-7*T^3-5.386443E-11*T^4"}});
    model.material("mat2").propertyGroup("def").func("TD").set("arg", "T");
    model.material("mat2").propertyGroup("def").func("TD")
         .set("pieces", new String[][]{{"247.0", "863.0", "2.220338E-5-8.696256E-8*T^1+1.863542E-10*T^2-1.807157E-13*T^3+6.620199E-17*T^4"}});
    model.material("mat2").propertyGroup("def").func("VP_solid_1")
         .set("arg", "T");
    model.material("mat2").propertyGroup("def").func("VP_solid_1")
         .set("pieces", new String[][]{{"293.0", "1941.0", "(exp((-2.499100e+004/T-1.337600e+000*log10(T)+1.480581e+001)*log(10.0)))*1.333200e+002"}});
    model.material("mat2").propertyGroup("def").func("kappa").set("arg", "T");
    model.material("mat2").propertyGroup("def").func("kappa")
         .set("pieces", new String[][]{{"293.0", "1073.0", "1.056124E11+4.642769E7*T^1-82798.6*T^2"}});
    model.material("mat2").propertyGroup("def")
         .set("dL", "(dL(T[1/K])-dL(Tempref[1/K]))/(1+dL(Tempref[1/K]))");
    model.material("mat2").propertyGroup("def")
         .set("thermalconductivity", new String[]{"k(T[1/K])[W/(m*K)]", "0", "0", "0", "k(T[1/K])[W/(m*K)]", "0", "0", "0", "k(T[1/K])[W/(m*K)]"});
    model.material("mat2").propertyGroup("def")
         .set("resistivity", new String[]{"res_solid_alpha_1(T[1/K])[ohm*m]", "0", "0", "0", "res_solid_alpha_1(T[1/K])[ohm*m]", "0", "0", "0", "res_solid_alpha_1(T[1/K])[ohm*m]"});
    model.material("mat2").propertyGroup("def")
         .set("thermalexpansioncoefficient", new String[]{"(alpha(T[1/K])[1/K]+(Tempref-293[K])*if(abs(T-Tempref)>1e-3,(alpha(T[1/K])[1/K]-alpha(Tempref[1/K])[1/K])/(T-Tempref),d(alpha(T[1/K]),T)[1/K]))/(1+alpha(Tempref[1/K])[1/K]*(Tempref-293[K]))", "0", "0", "0", "(alpha(T[1/K])[1/K]+(Tempref-293[K])*if(abs(T-Tempref)>1e-3,(alpha(T[1/K])[1/K]-alpha(Tempref[1/K])[1/K])/(T-Tempref),d(alpha(T[1/K]),T)[1/K]))/(1+alpha(Tempref[1/K])[1/K]*(Tempref-293[K]))", "0", "0", "0", "(alpha(T[1/K])[1/K]+(Tempref-293[K])*if(abs(T-Tempref)>1e-3,(alpha(T[1/K])[1/K]-alpha(Tempref[1/K])[1/K])/(T-Tempref),d(alpha(T[1/K]),T)[1/K]))/(1+alpha(Tempref[1/K])[1/K]*(Tempref-293[K]))"});
    model.material("mat2").propertyGroup("def")
         .set("heatcapacity", "C_solid_1(T[1/K])[J/(kg*K)]");
    model.material("mat2").propertyGroup("def")
         .set("HC", "HC_solid_1(T[1/K])[J/(mol*K)]");
    model.material("mat2").propertyGroup("def").set("mu", "mu(T[1/K])[Pa]");
    model.material("mat2").propertyGroup("def")
         .set("electricconductivity", new String[]{"sigma_solid_alpha_1(T[1/K])[S/m]", "0", "0", "0", "sigma_solid_alpha_1(T[1/K])[S/m]", "0", "0", "0", "sigma_solid_alpha_1(T[1/K])[S/m]"});
    model.material("mat2").propertyGroup("def")
         .set("density", "rho(T[1/K])[kg/m^3]");
    model.material("mat2").propertyGroup("def")
         .set("TD", "TD(T[1/K])[m^2/s]");
    model.material("mat2").propertyGroup("def")
         .set("VP", "VP_solid_1(T[1/K])[Pa]");
    model.material("mat2").propertyGroup("def")
         .set("kappa", "kappa(T[1/K])[Pa]");
    model.material("mat2").propertyGroup("def")
         .set("relpermittivity", new String[]{"1", "0", "0", "0", "1", "0", "0", "0", "1"});
    model.material("mat2").propertyGroup("def").addInput("temperature");
    model.material("mat2").propertyGroup("def")
         .addInput("strainreferencetemperature");
    model.material("mat2").propertyGroup("Enu").func("E").set("arg", "T");
    model.material("mat2").propertyGroup("Enu").func("E")
         .set("pieces", new String[][]{{"93.0", "293.0", "1.263539E11-4.823066E7*T^1-32810.22*T^2"}, {"293.0", "1073.0", "1.267923E11-5.931971E7*T^1"}});
    model.material("mat2").propertyGroup("Enu").func("nu").set("arg", "T");
    model.material("mat2").propertyGroup("Enu").func("nu")
         .set("pieces", new String[][]{{"293.0", "1073.0", "0.3207911+6.715403E-5*T^1-4.131016E-8*T^2+5.510325E-11*T^3"}});
    model.material("mat2").propertyGroup("Enu")
         .set("youngsmodulus", "E(T[1/K])[Pa]");
    model.material("mat2").propertyGroup("Enu")
         .set("poissonsratio", "nu(T[1/K])");
    model.material("mat2").propertyGroup("Enu").addInput("temperature");
    model.material("mat3").name("Water, liquid mod STN");
    model.material("mat3").propertyGroup("def").func("eta").set("arg", "T");
    model.material("mat3").propertyGroup("def").func("eta")
         .set("pieces", new String[][]{{"273.15", "413.15", "1.3799566804-0.021224019151*T^1+1.3604562827E-4*T^2-4.6454090319E-7*T^3+8.9042735735E-10*T^4-9.0790692686E-13*T^5+3.8457331488E-16*T^6"}, {"413.15", "553.75", "0.00401235783-2.10746715E-5*T^1+3.85772275E-8*T^2-2.39730284E-11*T^3"}});
    model.material("mat3").propertyGroup("def").func("Cp").set("arg", "T");
    model.material("mat3").propertyGroup("def").func("Cp")
         .set("pieces", new String[][]{{"273.15", "553.75", "12010.1471-80.4072879*T^1+0.309866854*T^2-5.38186884E-4*T^3+3.62536437E-7*T^4"}});
    model.material("mat3").propertyGroup("def").func("rho").set("arg", "T");
    model.material("mat3").propertyGroup("def").func("rho")
         .set("pieces", new String[][]{{"273.15", "553.75", "838.466135+1.40050603*T^1-0.0030112376*T^2+3.71822313E-7*T^3"}});
    model.material("mat3").propertyGroup("def").func("k").set("arg", "T");
    model.material("mat3").propertyGroup("def").func("k")
         .set("pieces", new String[][]{{"273.15", "553.75", "-0.869083936+0.00894880345*T^1-1.58366345E-5*T^2+7.97543259E-9*T^3"}});
    model.material("mat3").propertyGroup("def").func("cs")
         .set("table", new String[][]{{"273", "1403"}, {"278", "1427"}, {"283", "1447"}, {"293", "1481"}, {"303", "1507"}, {"313", "1526"}, {"323", "1541"}, {"333", "1552"}, {"343", "1555"}, {"353", "1555"}, 
         {"363", "1550"}, {"373", "1543"}});
    model.material("mat3").propertyGroup("def").func("cs")
         .set("interp", "piecewisecubic");
    model.material("mat3").propertyGroup("def")
         .set("dynamicviscosity", "eta(T[1/K])[Pa*s]");
    model.material("mat3").propertyGroup("def")
         .set("ratioofspecificheat", "1.0");
    model.material("mat3").propertyGroup("def")
         .set("electricconductivity", new String[]{"0.11[S/m]", "0", "0", "0", "0.11[S/m]", "0", "0", "0", "0.11[S/m]"});
    model.material("mat3").propertyGroup("def")
         .set("heatcapacity", "Cp(T[1/K])[J/(kg*K)]");
    model.material("mat3").propertyGroup("def")
         .set("density", "rho(T[1/K])[kg/m^3]");
    model.material("mat3").propertyGroup("def")
         .set("thermalconductivity", new String[]{"k(T[1/K])[W/(m*K)]", "0", "0", "0", "k(T[1/K])[W/(m*K)]", "0", "0", "0", "k(T[1/K])[W/(m*K)]"});
    model.material("mat3").propertyGroup("def")
         .set("soundspeed", "cs(T[1/K])[m/s]");
    model.material("mat3").propertyGroup("def")
         .set("relpermittivity", new String[]{"3.9*10^6", "0", "0", "0", "3.9*10^6", "0", "0", "0", "3.9*10^6"});
    model.material("mat3").propertyGroup("def").addInput("temperature");

    model.physics("es").feature("ccn1").set("materialType", "from_mat");
    model.physics("es").feature("term1").set("TerminalType", "Voltage");
    model.physics("es").feature("term1").set("V0", "4");
    model.physics("es").feature("term2").set("TerminalType", "Voltage");
    model.physics("es").feature("term2").set("V0", "-2");
    model.physics("es").feature("term3").set("TerminalType", "Voltage");

    model.mesh("mesh1").feature("size").set("hauto", 4);
    model.mesh("mesh1").run();

    model.result().table("evl3").name("Evaluation 3D");
    model.result().table("evl3").comments("Interactive 3D values");

    model.coordSystem("sys1").set("frametype", "geometry");

    model.study().create("std1");
    model.study("std1").feature().create("stat", "Stationary");

    model.sol().create("sol1");
    model.sol("sol1").study("std1");
    model.sol("sol1").attach("std1");
    model.sol("sol1").feature().create("st1", "StudyStep");
    model.sol("sol1").feature().create("v1", "Variables");
    model.sol("sol1").feature().create("s1", "Stationary");
    model.sol("sol1").feature("s1").feature().create("fc1", "FullyCoupled");
    model.sol("sol1").feature("s1").feature().create("i1", "Iterative");
    model.sol("sol1").feature("s1").feature("i1").feature()
         .create("mg1", "Multigrid");
    model.sol("sol1").feature("s1").feature().remove("fcDef");

    model.study("std1").feature("stat").set("initstudyhide", "on");
    model.study("std1").feature("stat").set("initsolhide", "on");
    model.study("std1").feature("stat").set("notstudyhide", "on");
    model.study("std1").feature("stat").set("notsolhide", "on");

    model.result().create("pg2", "PlotGroup3D");
    model.result("pg2").feature().create("mslc1", "Multislice");
    model.result().export().create("plot1", "Plot");

    model.sol("sol1").attach("std1");
    model.sol("sol1").feature("st1").name("Compile Equations: Stationary");
    model.sol("sol1").feature("st1").set("studystep", "stat");
    model.sol("sol1").feature("v1").set("control", "stat");
    model.sol("sol1").feature("v1").set("solnum", "auto");
    model.sol("sol1").feature("v1").set("initsol", "sol1");
    model.sol("sol1").feature("v1").feature("mod1_V")
         .set("scalemethod", "init");
    model.sol("sol1").feature("s1").set("control", "stat");
    model.sol("sol1").feature("s1").feature("i1").set("linsolver", "cg");
    model.sol("sol1").feature("s1").feature("i1").feature("mg1")
         .set("prefun", "amg");
    model.sol("sol1").runAll();

    model.result("pg2").name("Electric Potential (es)");
    model.result("pg2").set("showhiddenobjects", true);
    model.result("pg2").set("frametype", "spatial");
    model.result("pg2").feature("mslc1").name("Multislice");
    model.result("pg2").feature("mslc1").set("multiplanezmethod", "coord");
    model.result("pg2").feature("mslc1").set("multiplaneymethod", "coord");
    model.result("pg2").feature("mslc1").set("ycoord", "range(-10,0.1,10)");
    model.result("pg2").feature("mslc1").set("multiplanexmethod", "coord");
    model.result("pg2").feature("mslc1").set("colortable", "ThermalLight");
    model.result("pg2").feature("mslc1").set("zcoord", "range(-10,0.1,10)");
    model.result("pg2").feature("mslc1").set("xcoord", "range(-10,0.1,10)");
    model.result().export("plot1")
         .set("filename", "C:\\Users\\A\\Dropbox\\DBS_Project\\Code\\AranCode\\DBS_Data_Analysis\\data_export280114.csv");

    model.sol("sol1").runAll();

    model.result("pg2").run();

    return model;
  }

}
