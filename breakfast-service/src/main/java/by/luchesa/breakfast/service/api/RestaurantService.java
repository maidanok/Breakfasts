package by.luchesa.breakfast.service.api;


import by.luchesa.breakfast.datamodel.Room;

import java.util.List;


public interface RestaurantService {

    List<Integer> getAllFlor();
    public List<Room> getRoomsOnTheFloor(int floor);
    //TODO


}