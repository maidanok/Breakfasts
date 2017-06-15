package by.luchesa.breakfast.service.impl;

import by.luchesa.breakfast.dao.RoomMapper;
import by.luchesa.breakfast.datamodel.Order;
import by.luchesa.breakfast.datamodel.Room;
import by.luchesa.breakfast.service.api.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by Pasha on 09.06.2017.
 */
@Service("RoomService")
@Transactional
public class RoomServiceImpl implements RoomService {
    @Autowired
    RoomMapper roomMapper;

    @Override
    public List<Room> getAllRooms() {
        return roomMapper.getAll();
    }


    @Override
    public List<Integer> getAllFlor() {
        List<Integer> floor;
        floor = roomMapper.getAllFlor();
        return floor;
    }

    @Override
    public List<Room> getRoomsOnTheFloor(int floor) {
        return roomMapper.getRoomsOnTheFloor(floor);
    }
}
