import models.Student;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import static spark.Spark.get;
import static spark.SparkBase.staticFileLocation;

public class Controller {

    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
        staticFileLocation("/public");

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

        get("/random", (req, res) -> {
            HashMap<String, Object> model = new HashMap<>();
            model.put("template", "random.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

        get("/random/one", (req, res) -> {
            Collections.shuffle(students);
            Student student = students.get(0);
            HashMap<String, Object> model = new HashMap<>();
            model.put("student", student);
            model.put("template", "randomName.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

        get("/random/two", (req, res) ->{
            Collections.shuffle(students);
            Student student1 = students.get(0);
            Student student2 = students.get(1);
            ArrayList<Student> twoStudents = new ArrayList<>();
            twoStudents.add(student1);
            twoStudents.add(student2);
            HashMap<String, Object> model = new HashMap<>();
            model.put("twoStudents", twoStudents);
            model.put("template", "twoRandomNames.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

        get("/random/three", (req,res)->{
            Collections.shuffle(students);
            Student student1 = students.get(0);
            Student student2 = students.get(1);
            Student student3 = students.get(2);
            ArrayList<Student> threeStudents = new ArrayList<>();
            threeStudents.add(student1);
            threeStudents.add(student2);
            threeStudents.add(student3);
            HashMap<String, Object> model = new HashMap<>();
            model.put("threeStudents", threeStudents);
            model.put("template", "threeRandomNames.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

        get("/random/four", (req,res)->{
            Collections.shuffle(students);
            Student student1 = students.get(0);
            Student student2 = students.get(1);
            Student student3 = students.get(2);
            Student student4 = students.get(3);
            ArrayList<Student> fourStudents = new ArrayList<>();
            fourStudents.add(student1);
            fourStudents.add(student2);
            fourStudents.add(student3);
            fourStudents.add(student4);
            HashMap<String, Object> model = new HashMap<>();
            model.put("fourStudents", fourStudents);
            model.put("template", "fourRandomNames.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);
    }


}
