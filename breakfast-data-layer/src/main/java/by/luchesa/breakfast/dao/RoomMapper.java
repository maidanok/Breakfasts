package by.luchesa.breakfast.dao;

import by.luchesa.breakfast.datamodel.Room;

import java.util.List;

/**
 * Created by Admin on 10.02.2017.
 */
public interface RoomMapper extends EntityMapper<Room> {

    //метод вернет список комнат на этаже
    List<Room> getRoomsOnTheFloor(int floor);

    List<Integer> getAllFlor();
}
