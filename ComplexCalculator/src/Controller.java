import java.util.Scanner;
/**
 * Класс контрллера. Прописана основная логика меню программы
 */
public class Controller {
    private Complex c1;
    private Complex c2;
    private View view;
/**
 * Конструктор контроллера
 * @param c1 первое комплескное число
 * @param c2 второе комплескное число
 * @param view меню программы
 */
    public Controller(Complex c1, Complex c2, View view) {
        this.c1 = c1;
        this.c2 = c2;
        this.view = view;
    }
/**
 * Упрощенный конструктор  контроллера
 * @param view Меню программы
 */
    public Controller(View view) {
        this.view = view;
    }
/**
 * Метод, в котором реализована работа меню
 */
    public void run() {
        String command = "";
        while (!command.equals("0")) {
            view.getView();
            command = promt("Введите команду -> ");
            switch (command) {
                case "1":
                    System.out.println(c1.summ(c2));
                    break;
                case "2":
                    System.out.println(c1.multiply(c2));
                    break;
                case "3":
                    System.out.println(c1.devide(c2));
                    break;
                default:
                    break;
            }
        }
        System.out.println("Программа закрыта!");
    }
/**
 * Метод ввода команд меню
 * @param msg сообщение для пользователя
 * @return номер команды от пользователя
 */
    private String promt(String msg) {

        Scanner in = new Scanner(System.in);
        System.out.print(msg);
        return in.nextLine();
    }
/**
 * Метод позволяющий ввести параметры комплексного числа
 * @param msg сообщения для пользователя
 * @return число
 */
    public Float getNum(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.print(msg);
        Float result = Float.parseFloat(in.nextLine());
        return result;

    }
}
