package Interfaces;

import java.util.List;

import Classes.Actor;

/**
 * Интерфейс описывающий поведения магазина
 */
public interface iMarketBehaviour {
    /**
     * Методо входа в магазин
     * 
     * @param Actor Клиент
     */
    void acceptToMarket(iActorBehaviuor Actor);

    /**
     * Метод для выхода из магазина
     * 
     * @param actor клиент
     */
    void releaseFromMarket(List<Actor> actor);

    void update();

}
