package Domen;
/**Класс для горячищ напитков */
public class HotDrink extends Product {

    private int temperature;
/**
 * 
 * @param price цена продукта
 * @param place место в автомате
 * @param name имя продукта
 * @param id уникальный идентификатор
 * @param temperature температура
 */
    public HotDrink(int price, int place, String name, long id, int temperature) {
        super(price, place, name, id);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() + "temperature = " + temperature + "\n";
    }
}
