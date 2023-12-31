import java.util.ArrayList;
import java.util.List;

import Domen.Bottle;
import Domen.HotDrink;
import Domen.Product;
import Services.CoinDispenser;
import Services.Display;
import Services.Holder;
import Services.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {

        List<Product> assort = new ArrayList<>();
        Product item1 = new Product(100, 1, "Lays");
        Product item2 = new Product(50, 2, "Cola");
        Product item3 = new Bottle(0, 3, "Water", 101, (float) 1.5);
        //Добавляем объкеты горячищ напитков
        Product item4 = new HotDrink(25, 12, "Coffee", 251, 60);
        HotDrink item5 = new HotDrink(15, 13, "Tea", 251, 60);

        assort.add(item1);
        assort.add(item2);
        assort.add(item3);
        //Добавляем пару горячищ напитков в аппарат
        assort.add(item4);
        assort.add(item5);

        Holder hold1 = new Holder(4, 4);
        CoinDispenser coinDesp = new CoinDispenser(200);
        Display disp = new Display();

        VendingMachine venMachine = new VendingMachine(hold1, coinDesp, assort, disp);
        //вывод содержимого
        for (Product prod : venMachine.getProducts()) {
            System.out.println(prod);
        }

    }
}
