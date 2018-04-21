/*
 *		test.java
 
		Use to understand the execution path of COMSOL API
 
 */

import com.comsol.model.*;
import com.comsol.model.util.*;

/** Model exported on Oct 8 2013, 11:51 by COMSOL 4.3.2.152. */
public class test {

  public static void main(String[] args) {
    run();
  }

  public static Model run() {
    Model model = ModelUtil.create("Model");

    model.modelPath("C:\\Users\\A\\Desktop");

    model.modelNode().create("mod1");

    model.geom().create("geom1", 3);

    model.mesh().create("mesh1", "geom1");

    model.physics().create("es", "Electrostatics", "geom1");

    model.study().create("std1");
    model.study("std1").feature().create("stat", "Stationary");
    model.study("std1").feature("stat").activate("es", true);

    model.geom("geom1").lengthUnit("mm");
    model.geom("geom1").runAll();
    model.geom("geom1").feature("fin").set("action", "assembly");
    model.geom("geom1").runAll();
    model.geom("geom1").run("fin");
    model.geom("geom1").run("");
    model.geom("geom1").feature().create("sph1", "Sphere");
    model.geom("geom1").run("sph1");
    model.geom("geom1").runAll();
    model.geom("geom1").feature("sph1").set("createselection", "on");
    model.geom("geom1").runAll();
    model.geom("geom1").run("sph1");
    model.geom("geom1").feature("sph1").setIndex("pos", "1", 0);
    model.geom("geom1").feature("sph1").setIndex("pos", "1", 1);
    model.geom("geom1").feature("sph1").setIndex("pos", "1", 2);
    model.geom("geom1").feature("sph1").set("r", "10");
    model.geom("geom1").feature("sph1").set("axistype", "cartesian");
    model.geom("geom1").feature("sph1").setIndex("ax3", "1", 0);
    model.geom("geom1").feature("sph1").setIndex("ax3", "1", 1);
    model.geom("geom1").runAll();
    model.geom("geom1").runPre("fin");
    model.geom("geom1").run("sph1");
    model.geom("geom1").feature("fin").set("action", "union");
    model.geom("geom1").runAll();
    model.geom("geom1").run("fin");
    model.geom("geom1").runAll();

    model.physics("es").feature("ccn1").set("materialType", 1, "solid");

    model.geom("geom1").run("sph1");
    model.geom("geom1").feature().create("cyl1", "Cylinder");
    model.geom("geom1").feature("cyl1").set("createselection", "on");
    model.geom("geom1").run("cyl1");
    model.geom("geom1").feature("cyl1").setIndex("pos", "1", 0);
    model.geom("geom1").feature("cyl1").setIndex("pos", "1", 1);
    model.geom("geom1").feature("cyl1").setIndex("pos", "1", 2);
    model.geom("geom1").feature("cyl1").set("axistype", "cartesian");
    model.geom("geom1").feature("cyl1").setIndex("ax3", "1", 0);
    model.geom("geom1").feature("cyl1").setIndex("ax3", "1", 1);
    model.geom("geom1").run("cyl1");
    model.geom("geom1").runAll();
    model.geom("geom1").runAll();
    model.geom("geom1").runAll();
    model.geom("geom1").runAll();
    model.geom("geom1").runAll();
    model.geom("geom1").runAll();
    model.geom("geom1").runAll();
    model.geom("geom1").runAll();
    model.geom("geom1").runAll();
    model.geom("geom1").runAll();
    model.geom("geom1").runAll();
    model.geom("geom1").runAll();
    model.geom("geom1").runAll();
    model.geom("geom1").runAll();
    model.geom("geom1").runAll();
    model.geom("geom1").runAll();
    model.geom("geom1").runAll();
    model.geom("geom1").runAll();
    model.geom("geom1").feature("sph1").active(false);
    model.geom("geom1").runAll();
    model.geom("geom1").feature("sph1").active(true);
    model.geom("geom1").runAll();
    model.geom("geom1").run();

    model.physics("es").feature("init1").set("V", 1, "5");

    model.geom("geom1").feature("cyl1").setIndex("ax3", "10", 1);
    model.geom("geom1").runAll();
    model.geom("geom1").feature("cyl1").setIndex("ax3", "20", 1);
    model.geom("geom1").run("cyl1");
    model.geom("geom1").runAll();
    model.geom("geom1").feature("cyl1").setIndex("pos", "20", 1);
    model.geom("geom1").runAll();
    model.geom("geom1").run();

    model.physics("es").feature("init1").set("V", 1, "0");

    model.geom("geom1").feature("fin").set("action", "assembly");
    model.geom("geom1").feature("fin").set("pairtype", "contact");
    model.geom("geom1").runAll();
    model.geom("geom1").run();

    model.physics("es").feature("init1").set("V", 1, "5");

    model.selection().create("sel1");
    model.selection("sel1").geom(3);
    model.selection("sel1").name("Explicit 1");
    model.selection("sel1").set(new int[]{1, 2});
    model.selection().create("sel2");
    model.selection("sel2").geom(2);
    model.selection("sel2").name("Explicit 2");
    model.selection("sel2")
         .set(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14});

    return model;
  }

}
