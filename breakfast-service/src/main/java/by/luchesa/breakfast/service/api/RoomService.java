package by.luchesa.breakfast.service.api;

import by.luchesa.breakfast.datamodel.Order;
import by.luchesa.breakfast.datamodel.Room;

import java.util.List;

/**
 * Created by Pasha on 09.06.2017.
 */
public interface RoomService {

    List<Room> getAllRooms();

    List<Integer> getAllFlor();

    List<Room> getRoomsOnTheFloor(int floor);
}
