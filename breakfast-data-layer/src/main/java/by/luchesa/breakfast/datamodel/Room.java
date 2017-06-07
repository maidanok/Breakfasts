package by.luchesa.breakfast.datamodel;

/**
 * Created by Admin on 08.02.2017.
 */
public class Room implements Entity {
    //номер комнаты
    private int room;
    //номер этажа
    private int floor;

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public Integer getPrimaryKey() {
        return room;
    }

    @Override
    public void setPrimaryKey(Integer primaryKey) {
        room = primaryKey;
    }
}
