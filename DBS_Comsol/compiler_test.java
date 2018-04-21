/*
 * compiler_test.java
 */

import com.comsol.model.*;
import com.comsol.model.util.*;

/** Model exported on Jan 19 2014, 22:52 by COMSOL 4.3.2.152. */
public class compiler_test {

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

    model.geom("geom1").feature().create("sph1", "Sphere");
    model.geom("geom1").run("sph1");

    return model;
  }

}
