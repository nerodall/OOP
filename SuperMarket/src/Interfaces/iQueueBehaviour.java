package Interfaces;
/**
 * Интерфейс для описания поведения клиентов в очереди
 */
public interface iQueueBehaviour {
    /**
     * Добавление клиента в очередь
     * @param Actor клиент
     */
    void takeInQueue(iActorBehaviuor Actor);
/**
 * Метода удаление клиента из очереди
 */
    void releaseFromQueue();
/**
 * Метод создания заказа клиентом
 */
    void takeOrder();
/**
 * Метод получения заказа
 */
    void giveOrder();

}
