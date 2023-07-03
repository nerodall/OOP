package Interfaces;
/**
 * Интерфейс описывающий поведение при возврате заказа
 */
public interface iReturnOrder {
    /**
     * Возваращает true, если клиент отказывает от заказа и хочет его вернуть
     * @param actor клиент
     */
    public void cancelOrder(iActorBehaviuor actor);
/**
 * Метод возврата заказа
 */
    public void returnOrder();

}
