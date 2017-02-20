package by.luchesa.breakfast.datamodel;

import java.util.Comparator;
import java.util.Date;
import java.util.Objects;

/**
 * Created by Admin on 10.02.2017.
 */
public class Order {
    private int idOrder;
    private Date dateOrder;
    private Breakfast breakfast;
    private Room room;
    private Boolean wasSpent;

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public Date getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(Date dateOrder) {
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




}
