package Controllers;

import Domen.Person;
import Domen.Student;
import Services.StudentService;

public class StudentController implements iPersonController<Student<Person>> {
    private final StudentService dataService = new StudentService();

    //Метод регистрации студената в базе данных
    @Override
    public void create(String firstName, int age) {
        dataService.create(firstName,age);
        dataService.sortByFIOStdLst();
    }

}