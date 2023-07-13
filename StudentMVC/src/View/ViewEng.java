package View;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Map.Entry;

import Controller.iGetView;
import Model.Student;

public class ViewEng implements iGetView {

    @java.lang.Override
    public void printAllStudents(HashMap<Long, Student> students) {
        System.out.println("------- students list --------");
        for (Entry<Long, Student> stud : students.entrySet()) {
            System.out.println(stud);
        }
        System.out.println("===============================");

    }

    @java.lang.Override
    public void printAllStudent(List<Student> students) {

    }

    @java.lang.Override
    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.print(msg);
        return in.nextLine();
    }

    @java.lang.Override
    public Long getStudentIdToDelete() {
        return null;
    }

    @java.lang.Override
    public void displayStudents(List<Student> students) {

    }

    @java.lang.Override
    public Student readStudent() {
        return null;
    }

    @java.lang.Override
    public Long getStudentIdToUpdate() {
        return null;
    }
}
