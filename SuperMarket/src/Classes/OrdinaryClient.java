package Classes;

import Interfaces.iActorBehaviuor;

public class OrdinaryClient extends Actor {
/**
 * Класс описания поведения обычного клиента
 * @param name Имя
 */
    public OrdinaryClient(String name) {
        super(name);
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cancelOrder'");
    }

    @Override
    public void returnOrder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'returnOrder'");
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