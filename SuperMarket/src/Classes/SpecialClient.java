package Classes;

import Interfaces.iActorBehaviuor;

public class SpecialClient extends Actor {
  private int idVip;

/**
 * Класс описывающий поведение vip клиента
 * @param name Имя
 * @param id id vip клиента
 */
  public SpecialClient(String name, Integer id) {
    
    super(name);
    idVip = id;
  }

  @Override
  public String getName() {
    return super.name;
  }

  public boolean isTakeOrder() {
    return super.isTakeOrder;
  }

  public boolean isMakeOrder() {
    return super.isMakeOrder;
  }

  public void setTakeOrder(boolean makeOder) {
    super.isMakeOrder = makeOder;
  }

  public void setMakeOrder(boolean pikUpOrder) {
    super.isMakeOrder = pikUpOrder;
  }

  public Actor getActor() {
    return this;
  }

  @Override
  public void cancelOrder(iActorBehaviuor actor) {
    super.isMakeOrder = isMakeOrder;
  }

  @Override
  public void returnOrder() {
    super.isMakeOrder = isMakeOrder;
  }

  @Override
  public void setCancelOrder(boolean cancel) {
    super.isCancelOrder = cancel;
  }

  @Override
  public boolean isCancel() {
    return super.isCancelOrder;
  }

}