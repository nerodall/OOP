import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.EmploeeController;
import Domen.Emploee;
import Domen.Person;
import Domen.PersonComparator;
import Domen.Student;
import Domen.StudentGroup;
import Domen.StudentStream;
import Domen.Teacher;
import Services.AverageAge;

public class App {
    public static void main(String[] args) throws Exception {

        // hwSeminar3();
        // seminar4();
        hwSeminar4();

    }

    private static void hwSeminar4() {
        // Создаем экземпляры объектов для каждого из классов наследников Person
        Student<Person> s1 = new Student<>("Иван", 25, 121);
        Student<Person> s2 = new Student<>("Игорь", 23, 301);

        Teacher<Person> t1 = new Teacher<>("Иван", 78, "Docent");
        Teacher<Person> t2 = new Teacher<>("Игорь", 45, "Professor");

        Emploee<Person> e1 = new Emploee<>("Федорович", 60, "разнорабочий");
        Emploee<Person> e2 = new Emploee<>("Семён", 45, "кочегар");

        //Для каждого из классов создаем лист и в него добавляем объекты
        //Далее создаем экземпляр класса AverageAge для типа
        //вызываем метод getAvgAge для вычисления средного возрастав в каждом листе
        // и выводим по порядку на экран средний возрат студентов, преподователе и рабочих
        ArrayList<Student<Person>> studentArray = new ArrayList<>();
        studentArray.add(s1);
        studentArray.add(s2);
        AverageAge<Student<Person>> studentsAvg = new AverageAge<>();
        double avgAgeOfStidents = studentsAvg.getAvgAge(studentArray);
        System.out.println("Средний возраст студентов " + avgAgeOfStidents);

        ArrayList<Teacher<Person>> teacherArray = new ArrayList<>();
        teacherArray.add(t1);
        teacherArray.add(t2);
        AverageAge<Teacher<Person>> teacherAvg = new AverageAge<>();
        double avgAgeOfTeachers = teacherAvg.getAvgAge(teacherArray);
        System.out.println("Средний возраст преподователей " + avgAgeOfTeachers);

        ArrayList<Emploee<Person>> emploeeArray = new ArrayList<>();
        emploeeArray.add(e1);
        emploeeArray.add(e2);
        AverageAge<Emploee<Person>> emploeeAvg = new AverageAge<>();
        double aveAgeOfEmploee = emploeeAvg.getAvgAge(emploeeArray);
        System.out.println("Средний возвраст рабочих " + aveAgeOfEmploee);

    }

    private static void seminar4() {
        Student s1 = new Student("Иван", 25, 121);
        Student s2 = new Student("Игорь", 23, 301);

        PersonComparator<Student> comS = new PersonComparator<Student>();
        comS.compare(s1, s2);

        Teacher t1 = new Teacher("Иван", 25, "Docent");
        Teacher t2 = new Teacher("Игорь", 23, "Professor");

        PersonComparator<Teacher> comT = new PersonComparator<Teacher>();
        comT.compare(t1, t2);

        // comS.compare(s1, t2);
        PersonComparator<Person> comP = new PersonComparator<Person>();
        comP.compare(s1, t2);

        Emploee e1 = new Emploee("Федорович", 60, "разнорабочий");
        // EmploeeController empControll = new EmploeeController();
        EmploeeController.paySalary(e1);
        // EmploeeController.paySalary(s1);
        // empControll.paySalary(e1);
        // empControll.paySalary(s1);

    }

    private static void hwSeminar3() {

        // Создаем сущности студентов
        Student s1 = new Student("Иван", 25, 121);
        Student s2 = new Student("Игорь", 23, 301);
        Student s3 = new Student("Иван", 22, 121);
        Student s4 = new Student("Игорь", 23, 444);
        Student s5 = new Student("Даша", 23, 171);
        Student s6 = new Student("Лена", 23, 104);
        Student s7 = new Student("Алексей", 22, 84);
        Student s8 = new Student("Владимр", 20, 857);
        Student s9 = new Student("Екатерина", 20, 845);
        List<Student> listStud = new ArrayList<Student>();
        List<Student> listStud2 = new ArrayList<Student>();

        // добавляем студентов в List первую группу
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);
        // Добавляем студетов в List второй группы
        listStud2.add(s7);
        listStud2.add(s8);
        listStud2.add(s9);
        // Создаем экземпляры объектов класса StudentGroup и добавляем листы групп,
        // присваивая id
        StudentGroup group4580 = new StudentGroup(listStud, 4580);
        StudentGroup group25 = new StudentGroup(listStud2, 25);

        // Создаем List для потока группы
        List<StudentGroup> streamGroups = new ArrayList<>();
        // Создаем экземпляр объекта класса потока группы и добавляем лист с группами и
        // присваем id
        StudentStream stream1 = new StudentStream(streamGroups, 298);

        // Добавляем группы в лист групп
        streamGroups.add(group25);
        streamGroups.add(group4580);

        // Вывод всего потока студентов до сортировки
        System.out.println(
                "\u0412\u044B\u0432\u043E\u0434 \u0432\u0441\u0435\u0433\u043E \u043F\u043E\u0442\u043E\u043A\u0430 \u0441\u0442\u0443\u0434\u0435\u043D\u0442\u043E\u0432 \u0434\u043E \u0441\u043E\u0440\u0442\u0438\u0440\u043E\u0432\u043A\u0438");
        for (StudentGroup group : stream1) {
            System.out.println(group);
        }
        // Сортировка групп по количеству студентов в потоке. От меньшего к большему
        Collections.sort(streamGroups);
        // Вывод потока студентов после сортировки
        System.out.println(
                "\u0412\u044B\u0432\u043E\u0434 \u043F\u043E\u0442\u043E\u043A\u0430 \u0441\u0442\u0443\u0434\u0435\u043D\u0442\u043E\u0432 \u043F\u043E\u0441\u043B\u0435 \u0441\u043E\u0440\u0442\u0438\u0440\u043E\u0432\u043A\u0438");
        for (StudentGroup group : stream1) {
            System.out.println(group.getGroup().size());
            System.out.println(group);
        }

        // Переопределенный toString для StudentStream
        System.out.println(
                "\u041F\u0435\u0440\u0435\u043E\u043F\u0440\u0435\u0434\u0435\u043B\u0435\u043D\u043D\u044B\u0439 toString \u0434\u043B\u044F StudentStream");
        System.out.println(stream1.toString());

        // for(Student std : group4580)
        // {
        // System.out.println(std);
        // }

        // for(Student std : group25){
        // System.out.println(std);
        // }

        // System.out.println("=========================================================");

        // Collections.sort(group4580.getGroup());

        // for (Student std : group4580.getGroup()) {
        // System.out.println(std);
        // }

    }

}