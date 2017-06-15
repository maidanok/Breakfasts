package by.luchesa.breakfast.web.controller.room;

import by.luchesa.breakfast.datamodel.Room;
import by.luchesa.breakfast.service.api.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Pasha on 12.06.2017.
 */
@RestController
public class GetRoomOnFloor {
    @Autowired
    RoomService roomService;

    @RequestMapping(value = "restaurant/rest/floor/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Room>> execute(@PathVariable("id") int id) {
        System.out.println("Fetching Floor with id " + id);
        List<Room> roomOnFloor = roomService.getRoomsOnTheFloor(id);
        if (roomOnFloor == null) {
            System.out.println("Floor with id " + id + " not found");
            return new ResponseEntity<List<Room>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Room>>(roomOnFloor, HttpStatus.OK);
    }
}
