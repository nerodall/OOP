package Services;

import java.util.List;

import Domen.Person;
import Domen.PersonComparator;
import Domen.Teacher;

public class TeacherService implements iPersonService<Teacher<Person>> {
    private int count;
    private List<Teacher<Person>> teachers;
    private String acadDegree;

    @Override
    public List<Teacher<Person>> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, int age) {
        Teacher<Person> per = new Teacher<>(firstName, age, acadDegree);
        teachers.add(per);

    }

    public void sortByFIOStdLst() {
        teachers.sort(new PersonComparator<Teacher<Person>>());
    }

}
