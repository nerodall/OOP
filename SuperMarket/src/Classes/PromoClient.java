package Classes;

import Interfaces.iActorBehaviuor;

public class PromoClient extends Actor {
    private String promoName;
    private int promoClientId;
    static int countOfPromo;
/**
 * Описывает поведение акционного клиента
 * @param name Имя клиента
 * @param promoName Название акции
 * @param promoClientId id клиента в акции
 */
    public PromoClient(String name,String promoName,int promoClientId ) {
        super(name);
        this.promoClientId=promoClientId;
        this.promoName = promoName;
        countOfPromo++;
        
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
      super.isTakeOrder = pikUpOrder;
    }

    public Actor getActor() {
      return this;
    }

    public void getCountOfPromo(){
        System.out.println(countOfPromo);
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
