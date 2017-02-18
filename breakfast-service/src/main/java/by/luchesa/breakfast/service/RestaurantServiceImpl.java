package by.luchesa.breakfast.service;
import by.luchesa.breakfast.dao.RoomMapper;
import by.luchesa.breakfast.datamodel.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("RestaurantService")
@Transactional
public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
    private RoomMapper roomMapper;

    private List<Integer> floor;


    @Override
    public List<Integer> getAllFlor() {
        /**List <Room>roomList=roomMapper.getAllFlor();
        for (int i=0; i<roomList.size(); i++){
            floor.add(roomList.get(i).getFloor());
        }*/
        floor=roomMapper.getAllFlor();
        return floor;
    }

    public List<Room> getRoomsOnTheFloor(int floor){
        return roomMapper.getRoomsOnTheFloor(floor);
    }
}
