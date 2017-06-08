package by.luchesa.breakfast.datamodel;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

/**
 * Created by Admin on 10.02.2017.
 */
public class Order implements Entity {
    private int idOrder;
    private LocalDate dateOrder;
    private Breakfast breakfast;
    private Room room;
    private Boolean wasSpent;

    public LocalDate getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(LocalDate dateOrder) {
        this.dateOrder = dateOrder;
    }

    public Breakfast getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(Breakfast breakfast) {
        this.breakfast = breakfast;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Boolean getWasSpent() {
        return wasSpent;
    }

    public void setWasSpent(Boolean wasSpent) {
        this.wasSpent = wasSpent;
    }


    @Override
    public Integer getPrimaryKey() {
        return idOrder;
    }

    @Override
    public void setPrimaryKey(Integer primaryKey) {
        idOrder = primaryKey;
    }
}
