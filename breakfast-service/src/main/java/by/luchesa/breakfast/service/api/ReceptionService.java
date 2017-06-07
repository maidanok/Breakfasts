package by.luchesa.breakfast.service.api;

import by.luchesa.breakfast.datamodel.Breakfast;
import by.luchesa.breakfast.datamodel.Order;
import by.luchesa.breakfast.datamodel.Room;


import java.time.LocalDate;
import java.util.List;

/**
 * Created by Pasha on 20.02.2017.
 */
public interface ReceptionService {
    List <Room> getAllRooms();

    List<Order> getOrderByDate(LocalDate date);

    List<Breakfast> getAllBreakfast();

    void insertOrder(Order order);

    void deleteOrder(Order order);

    Order getOrderById(int idOrder);

    Order generateOrder();

    List<Integer> getAllFlor();
}
