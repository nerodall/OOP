


import java.util.Iterator;
import java.util.List;

/**
 * Класс описывающий повдедение для группы студентов
 */
public class StudentGroup  implements Iterable<Student>, Comparable<StudentGroup>  {
    private List<Student> group;
    private Integer idGroup;
/**
 * Конструктора для класса студентов
 * @param group имя группы, принимает List
 * @param idGroup id группы
 */
    public StudentGroup(List<Student> group, Integer idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }
/**
 * Получить имя группы
 * @return
 */
    public List<Student> getGroup() {
        return group;
    }
/**
 * Установить имя группы
 * @param group
 */
    public void setGroup(List<Student> group) {
        this.group = group;
    }

    // private void getName (List<Student> group){
    //     for (Student stud : group){

    //     }
    // }
/**
 * Получить id группы
 * @return
 */
    public Integer getIdGroup() {
        return idGroup;
    }
/**
 * Установить id группы
 * @param idGroup
 */
    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }
/**
 * Переопределение метода toString
 */
    @Override
    public String toString() {
        return "Идентификатор группы - " + idGroup + "\nКоличество студентов - " + group.size() 
        +"\nСписок студентов " + group.toString();
    }
/**
 * Переопределение метода sort
 */
    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>() {

            private int counter;

            @Override
            public boolean hasNext() {

                if (counter < group.size()) {
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public Student next() {
                return group.get(counter++);
            }

        };

    }

    @Override
    public int compareTo(StudentGroup o) {
        if (group.size() == o.group.size()) {
            if (group.size() == o.group.size())
                return 0;
            if (group.size() > o.group.size())
                return 1;
            else
                return -1;
        }
        if (group.size() > o.group.size())
            return 1;
        else
            return -1;
    }

}