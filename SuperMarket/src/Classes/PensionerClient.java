package Classes;

import Interfaces.iActorBehaviuor;
/**
 * Класс описывающий поведение пенсионера
 */
public class PensionerClient extends Actor {

    private int pensId;
/**
 * Класс пенсионера
 * @param name Имя
 * @param pensId id 
 */
    public PensionerClient(String name, int pensId) {
        super(name + " пенсионер");
        this.pensId = pensId;
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setCancelOrder'");
    }

  @Override
    public boolean isCancel() {
      return super.isCancelOrder;
    }
}
