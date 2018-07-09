import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import static spark.Spark.get;

public class Controller {

    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();

        ArrayList<Student> students = new ArrayList<Student>();

        Student angelina = new Student ("Angelina");
        Student derek = new Student ("Derek");
        Student adri = new Student ("Adri");
        Student jack = new Student ("Jack");
        Student roddy = new Student ("Roddy");
        Student cleyra = new Student ("Cleyra");
        Student pete = new Student ("Pete");
        Student stephan = new Student ("Stephan");
        Student greg = new Student ("Greg");
        Student richard = new Student ("Richard");
        Student tara = new Student ("Tara");
        Student campbell = new Student ("Campbell");
        Student steven = new Student ("Steven");
        Student matt = new Student ("Matt");
        Student craig = new Student ("Craig");
        Student harjit = new Student ("Harjit");
        Student farheen = new Student ("Farheen");
        Student debi = new Student ("Debi");
        Student joe = new Student ("Joe");

        students.add(angelina);
        students.add(derek);
        students.add(adri);
        students.add(jack);
        students.add(richard);
        students.add(roddy);
        students.add(cleyra);
        students.add(pete);
        students.add(stephan);
        students.add(greg);
        students.add(tara);
        students.add(campbell);
        students.add(steven);
        students.add(matt);
        students.add(craig);
        students.add(harjit);
        students.add(farheen);
        students.add(debi);
        students.add(joe);

        get("/one", (req, res) -> {
            Collections.shuffle(students);
            Student student = students.get(0);
            HashMap<String, Object> model = new HashMap<>();
            model.put("student", student);
            return new ModelAndView(model, "randomName.vtl");
        }, velocityTemplateEngine);
    }
}
