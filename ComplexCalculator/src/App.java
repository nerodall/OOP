public class App {
    public static void main(String[] args) throws Exception {
        //Создание класса для логирования событий
        Logs log = new Logs();
        //создание класса для отображения меню программы
        View view = new View();
        //создание экземпляров класса комплексных чисел
        Complex com1 = new Complex(log);
        Complex com2 = new Complex(log);
        //Создание контроллера. В нем заложено взаимодествие с меню программы
        Controller app = new Controller(com1, com2, view);

        //Установка значений комплесных чисел пользователем
        com1.setNum1(app.getNum("Введите действительную часть первого числа "));
        com1.setNum2(app.getNum("Введите мнимую часть первого числа "));

        com2.setNum1(app.getNum("Введите действительную часть первого числа "));
        com2.setNum2(app.getNum("Введите мнимую часть первого числа "));

        //Запуск меню программы
        app.run();
    }
}
