package by.luchesa.breakfast.dao;

import by.luchesa.breakfast.datamodel.Order;



import java.time.LocalDate;

import java.util.List;

/**
 * Created by Admin on 12.02.2017.
 */
public interface OrderMapper extends EntityMapper<Order>{

    List<Order> getOrderByDate(LocalDate dateOrder);

    List<Order> getOrderByDateAndNotWasSpend(LocalDate dateOrder);

    void completeOrder(int idOrder);

}
