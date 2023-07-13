import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.ModelFile;
import Model.ModelList;
import Model.Student;
import View.View;
import View.ViewEng;

public class App {
    public static void main(String[] args) throws Exception {

        List<Student> students = new ArrayList<Student>();
        HashMap<Long, Student> studetnsMap = new HashMap<>();
        Student s1 = new Student("Сергей", 21, 101);
        Student s2 = new Student("Андрей", 22, 111);
        Student s3 = new Student("Иван", 22, 121);
        Student s4 = new Student("Игорь", 23, 301);
        Student s5 = new Student("Даша", 25, 171);
        Student s6 = new Student("Лена", 23, 104);
        //  students.add(s1);
        //  students.add(s2);
        //  students.add(s3);
        //  students.add(s4);
        //  students.add(s5);
        //  students.add(s6);

        // studetnsMap.put((long) 1, s1);
        // studetnsMap.put((long) 2, s2);
        // studetnsMap.put((long) 3, s3);
        // studetnsMap.put((long) 4, s4);
        // studetnsMap.put((long) 5, s5);
        // studetnsMap.put((long) 6, s6);





        ModelFile fModel = new ModelFile("StudentDB.txt");
        fModel.saveAllStudentToFile(studetnsMap);

        iGetModel<HashMap<Long, Student>> modelFile = fModel;
        iGetModel<HashMap<Long, Student>> model = new ModelList(studetnsMap);

        ///
        // Русский интерфейс
        iGetView view = new View();
        // Англ. интерфейс
        // iGetView view = new ViewEng();

        Controller control = new Controller(modelFile, view);

        // Русский интерфейс
        control.run();
        // Англ. интерфейс
        // control.runEng();

    }
}