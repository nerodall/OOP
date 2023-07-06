package Domen;
/**
 * Абстрактный класс описывающий Человека
 */
public abstract class Person {
    private String name;
    private int age;
    /**
     * Конструктор для класса Человек
     * @param name Имя
     * @param age Возраст
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
/**
 * Получить имя
 * @return
 */
    public String getName() {
        return name;
    }
/**
 * Установить значние имени человека
 * @param name
 */
    public void setName(String name) {
        this.name = name;
    }
/**
 * Получить возраст человека
 * @return
 */
    public int getAge() {
        return age;
    }
/**
 * Установить возраст человеку
 * @param age
 */
    public void setAge(int age) {
        this.age = age;
    }
/**
 * Переопределение метода toString для класса человек
 */
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
    
}