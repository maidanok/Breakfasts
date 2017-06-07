package by.luchesa.breakfast.service.api;


import by.luchesa.breakfast.datamodel.Order;
import by.luchesa.breakfast.datamodel.Room;


import java.time.LocalDate;
import java.util.List;


public interface RestaurantService {

    List<Integer> getAllFlor();
    List<Room> getRoomsOnTheFloor(int floor);

    List <Order> getOrderByDateAndNotWasSpend(LocalDate date);

    void completeOrder(int idOrder);

    Order getOrderById(int idOrder);

}