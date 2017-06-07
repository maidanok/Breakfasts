package by.luchesa.breakfast.service.impl;

import by.luchesa.breakfast.dao.BreakfastMapper;
import by.luchesa.breakfast.dao.OrderMapper;
import by.luchesa.breakfast.dao.RoomMapper;
import by.luchesa.breakfast.datamodel.Breakfast;
import by.luchesa.breakfast.datamodel.Order;
import by.luchesa.breakfast.datamodel.Room;
import by.luchesa.breakfast.service.api.ReceptionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by Pasha on 20.02.2017.
 */
@Service("ReceptionService")
@Transactional
public class ReceptionServiceImpl implements ReceptionService{
    private List<Integer> floor;
    @Autowired
    RoomMapper roomMapper;

    @Autowired
    OrderMapper orderMapper;

    @Autowired
    BreakfastMapper breakfastMapper;

    @Override
    public List<Room> getAllRooms() {
        return roomMapper.getAllRooms();
    }

    @Override
    public List<Order> getOrderByDate(LocalDate date) {
        return orderMapper.getOrderByDate(date);
    }

    @Override
    public List<Breakfast> getAllBreakfast() {
        return breakfastMapper.getAll();
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


   public Order generateOrder(){
      Order newOrder=orderMapper.getOrderById(2);
        newOrder.setRoom(roomMapper.getRoom(400));
        newOrder.setDateOrder(LocalDate.now());
        newOrder.setBreakfast(breakfastMapper.getByPrimaryKey(1));
        System.out.println("brekf"+newOrder.getBreakfast().getNameBreakfast());
        return newOrder;
    }

    @Override
    public List<Integer> getAllFlor() {
        floor=roomMapper.getAllFlor();
        return floor;
    }
}