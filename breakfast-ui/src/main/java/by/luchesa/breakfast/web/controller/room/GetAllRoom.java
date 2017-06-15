package by.luchesa.breakfast.web.controller.room;

import by.luchesa.breakfast.datamodel.Room;
import by.luchesa.breakfast.service.api.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Pasha on 12.06.2017.
 */
@RestController
public class GetAllRoom {
    @Autowired
    RoomService roomService;

    @RequestMapping(value = "/reception/rest/room/", method = RequestMethod.GET)
    public ResponseEntity<List<Room>> execute() {
        List<Room> allRooms = roomService.getAllRooms();
        if (allRooms.isEmpty()) {
            System.out.println("rooms not found");
            return new ResponseEntity<List<Room>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Room>>(allRooms, HttpStatus.OK);
    }
}
