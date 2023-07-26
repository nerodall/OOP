/**
 * Класс комплексного числа. Содержит конструкторы и методы арифмитических операций с комплексными числами
 */
public class Complex implements iCalculateAction {
    /**
     * Базовый конструктор комплексного числа. Число a называется действительной частью, а число b — мнимой частью комплексного числа z = a + bi.
     * @param num1  a
     * @param num2 b
     * @param log класс логирования
     */
    public Complex(float num1, float num2, Logs log) {
        this.num1 = num1;
        this.num2 = num2;
        this.log = log;
    }
/**
 * Упрощенный коструктор для комплесного числа. Используется, если будем получать элементы из вне, а не при создании экземпляра объекта класса
 * @param log
 */
    public Complex(Logs log) {
        this.log = log;
    }

    public Complex() {

    }

    private float num1;
    private float num2;
    private Logs log;
/**
 * Метод для получения a комплексного числа
 * @return
 */
    public float getNum1() {
        log.logEvent("Пользователь запросил число 1");
        return num1;
    }
/**
 * Метода для установки a комплексног числа
 * @param num1
 */
    public void setNum1(float num1) {
        log.logEvent("Пользователь установил число 1");
        this.num1 = num1;
    }
/**
 * Метод для получения b комплескного числа
 * @return
 */
    public float getNum2() {
        log.logEvent("Пользователь запросил число 2");
        return num2;
    }
/**
 * Метод для установки b комплексного числа
 * @param num2
 */
    public void setNum2(float num2) {
        log.logEvent("Пользователь установил число 1");
        this.num2 = num2;
    }

    @Override
    public Complex summ(Complex c) {
        log.logEvent("Выполнено суммирование. Результат выведен на экран");
        return new Complex(num1 + c.num1, num2 + c.num2, log);
    }

    @Override
    public Complex multiply(Complex c) {
        log.logEvent("Выполнено умножение. Результат выведен на экран");
        float result1 = (num1 * c.num1) - (num2 * c.num2);
        float result2 = (num1 * c.num2) - (num2 * c.num1);
        return new Complex(result1, result2, log);
    }

    @Override
    public Complex devide(Complex c) {
        log.logEvent("Выполнено Деление. Результат выведен на экран");
        float denominator = (c.num1 * c.num1) + (c.num2 * c.num2);
        float result1 = ((num1 * c.num1) + (num2 * c.num2)) / denominator;
        float result2 = ((num2 * c.num1) - (num1 * c.num2)) / denominator;
        return new Complex(result1, result2, log);
    }

    @Override
    public String toString() {
        log.logEvent("Вызван метод toString");
        if (num2 >= 0) {
            return num1 + " + " + num2 + "i";
        } else {
            return num1 + " - " + num2 + "i";
        }
    }

}
