package by.luchesa.breakfast.dao;

import by.luchesa.breakfast.datamodel.Order;

import java.util.Date;
import java.util.List;

/**
 * Created by Admin on 12.02.2017.
 */
public interface OrderMapper {
    List<Order> getOrderByDate(Date dateOrder);

    List<Order> getOrderByDateAndFloor(Date dateOrder, int floor);

    Order getOrderById(int idOrder);

    void insertOrder(Order order);

    void completeTheOrder(int idOrder);


}
