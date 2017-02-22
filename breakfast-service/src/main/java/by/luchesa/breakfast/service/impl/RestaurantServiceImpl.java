package by.luchesa.breakfast.service.impl;
import by.luchesa.breakfast.dao.OrderMapper;
import by.luchesa.breakfast.dao.RoomMapper;
import by.luchesa.breakfast.datamodel.Order;
import by.luchesa.breakfast.datamodel.Room;
import by.luchesa.breakfast.service.api.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.time.LocalDate;
import java.util.List;

@Service("RestaurantService")
@Transactional
public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
    private RoomMapper roomMapper;

    @Autowired
    private OrderMapper orderMapper;

    private List<Integer> floor;


    @Override
    public List<Integer> getAllFlor() {
      floor=roomMapper.getAllFlor();
        return floor;
    }
    @Override
    public List<Room> getRoomsOnTheFloor(int floor){
        return roomMapper.getRoomsOnTheFloor(floor);
    }

    @Override
    public List<Order> getOrderByDateAndNotWasSpend(LocalDate date) {
        return orderMapper.getOrderByDateAndNotWasSpend(date);
    }

    @Override
    public void completeOrder(int idOrder) {
        orderMapper.completeOrder(idOrder);
    }

    public Order getOrderById(int idOrder){
     return orderMapper.getOrderById(idOrder);
    }

}
