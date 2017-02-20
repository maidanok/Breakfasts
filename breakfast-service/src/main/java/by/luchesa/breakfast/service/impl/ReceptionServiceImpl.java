package by.luchesa.breakfast.service.impl;

import by.luchesa.breakfast.dao.OrderMapper;
import by.luchesa.breakfast.dao.RoomMapper;
import by.luchesa.breakfast.datamodel.Order;
import by.luchesa.breakfast.datamodel.Room;
import by.luchesa.breakfast.service.api.ReceptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by Pasha on 20.02.2017.
 */
@Service("ReceptionService")
@Transactional
public class ReceptionServiceImpl implements ReceptionService{
    @Autowired
    RoomMapper roomMapper;

    @Autowired
    OrderMapper orderMapper;

    @Override
    public List<Room> getAllRooms() {
        return roomMapper.getAllRooms();
    }

    @Override
    public List<Order> getOrderByDate(Date date) {
        return orderMapper.getOrderByDate(date);
    }

    @Override
    public void insertOrder(Order order) {
        orderMapper.insertOrder(order);

    }

    @Override
    public void deleteOrder(Order order) {
        orderMapper.deleteOrder(order.getIdOrder());

    }

    @Override
    public Order getOrderById(int idOrder) {
        return orderMapper.getOrderById(idOrder);
    }
}
