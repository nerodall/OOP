package Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Model.Student;

public class Controller {

    private iGetModel<HashMap<Long, Student>> model;
    private iGetView view;
    private HashMap<Long, Student> students = new HashMap<Long, Student>();

    public Controller(iGetModel<HashMap<Long, Student>> model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    private boolean testData(HashMap<Long, Student> students) {
        if (students.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void update() {
        // MVP
        students = model.getAllStudents();
        if (testData(students)) {
            view.printAllStudents(students);
        } else {
            System.out.println("Список студентов пуст!");
        }

        // MVC
        // view.printAllStudents(model.getAllStudents());
    }

    public void run() {
        Command com = Command.NONE;
        boolean getNewIteration = true;
        while (getNewIteration) {
            String command = view.prompt("Введите команду:");
            com = Command.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    getNewIteration = false;
                    System.out.println("Выход из программы!");
                    break;
                case LIST:
                    view.printAllStudents(model.getAllStudents());
                    break;
                case DELETE:
                System.out.println("Удалить");
            }

        }
    }

    public void runEng() {
        Command com = Command.NONE;
        boolean getNewIteration = true;
        while (getNewIteration) {
            String command = view.prompt("Enter command:");
            com = Command.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    getNewIteration = false;
                    System.out.println("Exit programm!");
                    break;
                case LIST:
                    view.printAllStudents(model.getAllStudents());
                    break;
                case DELETE:
                    

            }

        }
    }

}