package Domen;

public class Student<T extends Person> extends Person implements Comparable<Student<T>> {

    private int id;

    public Student(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "\nИмя - " + super.getName() + "\nВозраст - " + super.getAge() + "\nid - " + id + "\n";
    }

    @Override
    public int compareTo(Student<T> o) {

        System.out.println(super.getName() + " - " + o.getName());
        if (super.getAge() == o.getAge()) {
            if (id == o.id)
                return 0;
            if (id > o.id)
                return 1;
            else
                return -1;
            // return 0;
        }

        if (super.getAge() > o.getAge())
            return 1;
        else
            return -1;
    }

}
