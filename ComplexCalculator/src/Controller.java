import java.util.Scanner;

public class Controller {
    public void run() {
        String command = "";
        while (command != "0") {
            switch (command) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "0":
                    break;
            }
        }

    }

    private String promt(String msg) {

        Scanner in = new Scanner(System.in);
        System.out.print(msg);
        return in.nextLine();
    }

    private void comandList(){
        System.out.println();
    }

    public Float getNum(String msg){
         Scanner in = new Scanner(System.in);
         System.out.print(msg);
         
    }
}
