package by.luchesa.breakfast.datamodel;

/**
 * Created by Admin on 10.02.2017.
 */
public class Breakfast implements Entity {
    // порядковый номер завтрака
    private int idBreakfast;
    //название завтрака
    private String nameBreakfast;
    //цена завтрака
    private double price;

    @Override
    public Integer getPrimaryKey() {
        return idBreakfast;
    }

    @Override
    public void setPrimaryKey(Integer primaryKey) {
        idBreakfast = primaryKey;
    }

    public String getNameBreakfast() {
        return nameBreakfast;
    }

    public void setNameBreakfast(String nameBreakfast) {
        this.nameBreakfast = nameBreakfast;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
