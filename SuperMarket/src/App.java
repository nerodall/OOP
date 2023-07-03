

import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PensionerClient;
import Classes.PromoClient;
import Classes.SpecialClient;
import Interfaces.iActorBehaviuor;

public class App {
    public static void main(String[] args) throws Exception {
        Market magnit = new Market();
        iActorBehaviuor client1 = new OrdinaryClient("Борис");
        iActorBehaviuor client2 = new SpecialClient("Алексей", 1001);
        PromoClient client3 = new PromoClient("promoClient1", "1+1", 01);
        PensionerClient client4 = new PensionerClient("Василий Иванович", 5);
        magnit.acceptToMarket(client1);//добавляем первого клиента
        magnit.acceptToMarket(client2);//добавляем второго клиента
        magnit.acceptToMarket(client3);//добавляем третьего клиента
        magnit.acceptToMarket(client4);//Добавляем четвертого клиента
        client3.getCountOfPromo();//получаем id клиента по акции
        magnit.cancelOrder(client1);//отменяем заказ первого клиента
        magnit.update();
    }
}
