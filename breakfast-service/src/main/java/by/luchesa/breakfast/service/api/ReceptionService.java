package by.luchesa.breakfast.service.api;

import by.luchesa.breakfast.datamodel.Order;
import by.luchesa.breakfast.datamodel.Room;

import java.util.Date;
import java.util.List;

/**
 * Created by Pasha on 20.02.2017.
 */
public interface ReceptionService {
    List <Room> getAllRooms();

    List<Order> getOrderByDate(Date date);

    void insertOrder(Order order);

    void deleteOrder(Order order);

    Order getOrderById(int idOrder);
}
