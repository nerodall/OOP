
/**
 * Абстрактный класс описывающий Человека
 */
public abstract class Person<T,V> {
    private T name;
    private V age;
    /**
     * Конструктор для класса Человек
     * @param name Имя
     * @param age Возраст
     */
    public Person(T name, V age) {
        this.name = name;
        this.age = age;
    }
/**
 * Получить имя
 * @return
 */
    public T getName() {
        return name;
    }
/**
 * Установить значние имени человека
 * @param name
 */
    public void setName(T name) {
        this.name = name;
    }
/**
 * Получить возраст человека
 * @return
 */
    public V getAge() {
        return age;
    }
/**
 * Установить возраст человеку
 * @param age
 */
    public void setAge(V age) {
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