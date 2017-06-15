package by.luchesa.breakfast.web.controller.room;

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
public class GetAllFloor {
    @Autowired
    RoomService roomService;

    @RequestMapping(value = "/reception/rest/floor/", method = RequestMethod.GET)
    public ResponseEntity<List<Integer>> execute() {
        List<Integer> floor = roomService.getAllFlor();
        if (floor.isEmpty()) {
            return new ResponseEntity<List<Integer>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Integer>>(floor, HttpStatus.OK);
    }
}
