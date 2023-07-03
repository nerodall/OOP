package Classes;

import Interfaces.iActorBehaviuor;
import Interfaces.iReturnOrder;

/**
 * абстрактый класс клиента
 */
public abstract class Actor implements iActorBehaviuor, iReturnOrder {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    protected boolean isCancelOrder;

    public Actor(String name) {
        this.name = name;
    }
/**
 * Абстрактный методот возвращающий имя клиента
 * @return
 */
    abstract public String getName();

}
