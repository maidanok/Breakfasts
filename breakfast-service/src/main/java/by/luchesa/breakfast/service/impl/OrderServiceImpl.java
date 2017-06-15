package by.luchesa.breakfast.service.impl;

import by.luchesa.breakfast.dao.OrderMapper;
import by.luchesa.breakfast.datamodel.Breakfast;
import by.luchesa.breakfast.datamodel.Order;
import by.luchesa.breakfast.service.api.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by Pasha on 09.06.2017.
 */
@Service("OrderService")
@Transactional
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMapper orderMapper;

    @Override
    public List<Order> getOrderByDate(LocalDate date) {
        return orderMapper.getOrderByDate(date);
    }

    @Override
    public void insertOrder(Order order) {
        orderMapper.create(order);
    }

    @Override
    public void deleteOrder(Order order) {
        orderMapper.delete(order.getPrimaryKey());

    }

    @Override
    public Order getOrderById(int idOrder) {
        return orderMapper.getByPrimaryKey(idOrder);
    }

    @Override
    public List<Order> getOrderByDateAndNotWasSpend(LocalDate date) {
        return orderMapper.getOrderByDateAndNotWasSpend(date);
    }

    @Override
    public void completeOrder(int idOrder) {
        orderMapper.completeOrder(idOrder);
    }
}
