package Classes;

import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.io.IOException;
import java.lang.System.Logger.Level;
import java.util.ArrayList;

import Interfaces.iActorBehaviuor;
import Interfaces.iLogAction;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;
import Interfaces.iReturnOrder;

public class Market implements iMarketBehaviour, iQueueBehaviour, iReturnOrder, iLogAction {

    private List<iActorBehaviuor> queue;

    public Market() {
        this.queue = new ArrayList<iActorBehaviuor>();

    }

    @Override
    public void acceptToMarket(iActorBehaviuor actor) {
        System.out.println(actor.getActor().getName() + " клиент пришел в магазин ");
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(iActorBehaviuor actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " клиент добавлен в очередь ");
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }

    }

    @Override
    public void update() {
        takeOrder();
        giveOrder();
        returnOrder();
        releaseFromQueue();
    }

    @Override
    public void giveOrder() {
        for (iActorBehaviuor actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент получил свой заказ ");
            }
        }

    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviuor actor : queue) {
            if (actor.isMakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " клиент ушел из очереди ");
            }

        }
        releaseFromMarket(releaseActors);
    }

    @Override
    public void takeOrder() {
        for (iActorBehaviuor actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент сделал заказ ");

            }
        }

    }

    @Override
    public void cancelOrder(iActorBehaviuor actor) {
        for (iActorBehaviuor client : queue) {
            if (client.equals(actor)) {
                actor.setCancelOrder(true);
            }
        }
    }

    @Override
    public void returnOrder() {
        for (iActorBehaviuor actor : queue) {
            if (actor.isCancel()) {
                System.out.println(actor.getActor().getName() + " клиент получил возврат");

            }
        }
    }

    @Override
    public java.lang.System.Logger createLogger() {
        Logger logger = Logger.getLogger(Market.class.getName());
        try {
            FileHandler fh = new FileHandler("Log.txt");
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
            logger.addHandler(fh);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return (java.lang.System.Logger) logger;

    }

    @Override
    public void LogEvent(java.lang.System.Logger logger, String message, Level level) {
        logger.log(level, message);
    }

}