package by.luchesa.breakfast.service.api;

import by.luchesa.breakfast.datamodel.Order;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by Pasha on 09.06.2017.
 */
public interface OrderService {

    List<Order> getOrderByDate(LocalDate date);

    void insertOrder(Order order);

    void deleteOrder(Order order);

    Order getOrderById(int idOrder);

    List <Order> getOrderByDateAndNotWasSpend(LocalDate date);

    void completeOrder(int idOrder);

}
