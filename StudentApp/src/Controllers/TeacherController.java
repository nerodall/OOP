package Controllers;

import Domen.Person;
import Domen.Teacher;
import Services.TeacherService;

public class TeacherController implements iPersonController<Teacher<Person>> {
    private final TeacherService dataService = new TeacherService();

    @Override
    public void create(String firstName, int age) {
        dataService.create(firstName, age);
        dataService.sortByFIOStdLst();
    }

}
