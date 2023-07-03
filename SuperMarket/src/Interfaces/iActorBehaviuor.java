package Interfaces;

import Classes.Actor;
/**
 * Интерфейс описания поведения клиента в магазине
 */
public interface iActorBehaviuor {
/**
 *  
 * @return возвращает true, если клиент получил заказ
 */
    public boolean isTakeOrder();
/**
 * 
 * @return возвращает true, если клиент сделал заказ
 */
    public boolean isMakeOrder();
/**
 * 
 * @return вовзарашет true, если клиент отменил заказ
 */
    public boolean isCancel();
/**
 * определяет получит ли клиент заказ
 * @param takeOrder 
 */
    public void setTakeOrder(boolean takeOrder);
/**
 *  определяет сделал ли заказ клиент
 * @param makeOrder
 */
    public void setMakeOrder(boolean makeOrder);
/**
 * определяет отказался ли клиент от заказа
 * @param cancel
 */
    public void setCancelOrder(boolean cancel);
/**
 * методо для получения имени клиента
 * @return имя клиента
 */
    Actor getActor();

}