public class Complex implements iCalculateAction {
public Complex(float num1, float num2, Logs log) {
        this.num1 = num1;
        this.num2 = num2;
        this.log = log;
    }

private float num1;
private float num2;
private Logs log;


    public float getNum1() {
        log.logEvent("Пользователь запросил число 1");
        return num1;
    }

    public void setNum1(float num1) {
        log.logEvent("Пользователь установил число 1");
        this.num1 = num1;
    }

    public float getNum2() {
        log.logEvent("Пользователь запросил число 2");
        return num2;
    }

    public void setNum2(float num2) {
        log.logEvent("Пользователь установил число 1");
        this.num2 = num2;
    }

    @Override
    public Complex summ(Complex c) {
        log.logEvent("Выполнено суммирование. Результат выведен на экран");
        return new Complex(num1 + c.num1, num2+ c.num2,log);
    }

    @Override
    public Complex multiply(Complex c) {
        log.logEvent("Выполнено умножение. Результат выведен на экран");
        float result1 = (num1 * c.num1) -(num2 * c.num2);
        float result2 = (num1 * c.num2) - (num2 * c.num1);
        return new Complex(result1, result2,log);
    }

    @Override
    public Complex devide(Complex c) {
         log.logEvent("Выполнено Деление. Результат выведен на экран");
      float denominator = (c.num1 * c.num1) + (c.num2 * c.num2);
      float result1 = ((num1*c.num1)+(num2*c.num2))/denominator;
      float result2 =((num2 *c.num1)-(num1*c.num2))/denominator;
      return new Complex(result1, result2,log);
    }

    @Override
    public String toString() {
         log.logEvent("Вызван метод toString");
      if(num2 >=0){
        return num1 +" + "+num2+"i";
      }
      else{
         return num1 +" - "+num2+"i";
      }
    }
    
}
