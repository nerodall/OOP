package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.Person;
import Domen.PersonComparator;
import Domen.Student;

public class StudentService implements iPersonService<Student<Person>> {
    private int count;
    private List<Student<Person>> students;

    public StudentService() {
        this.students = new ArrayList<Student<Person>>();
    }

    @Override
    public List<Student<Person>> getAll() {
        return students;
    }

    @Override
    public void create(String firstName, int age) {
        Student<Person> per = new Student<>(firstName,age,count);
        count++;
        students.add(per);
    }    

    public void sortByFIOStdLst()
    {
       // List<Student> newStudentList = new ArrayList<Student>(students);
        students.sort( new PersonComparator<Student<Person>>());
        //return newStudentList;
    }


}