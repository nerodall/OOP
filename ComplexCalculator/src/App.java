public class App {
    public static void main(String[] args) throws Exception {
        Logs log = new Logs();
        Complex com1 = new Complex(2, 3, log);
        Complex com2 = new Complex(-1, 1, log);
        Complex result = com1.multiply(com2);
        System.out.println(result);

        com1.getNum1();
    }
}
