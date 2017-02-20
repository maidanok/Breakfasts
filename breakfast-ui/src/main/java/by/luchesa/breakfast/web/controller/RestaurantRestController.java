package by.luchesa.breakfast.web.controller;


import by.luchesa.breakfast.datamodel.Room;
import by.luchesa.breakfast.service.api.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("restaurant/rest/")
public class RestaurantRestController {

    @Autowired
    private RestaurantService restaurantService;

    //-------------------Retrieve All Floor--------------------------------------------------------

    @RequestMapping(value = "floor/", method = RequestMethod.GET)
    public ResponseEntity<List<Integer>> listAllFloor() {
        List<Integer> floor = restaurantService.getAllFlor();
        if(floor.isEmpty()){
            return new ResponseEntity<List<Integer>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Integer>>(floor, HttpStatus.OK);
    }

    //-------------------Retrieve Single Floor--------------------------------------------------------
    @RequestMapping(value = "floor/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Room>> getRoomOnFloor(@PathVariable("id") int id) {
        System.out.println("Fetching User with id " + id);
        List<Room> roomOnFloor = restaurantService.getRoomsOnTheFloor(id);
        if (roomOnFloor == null) {
            System.out.println("User with id " + id + " not found");
            return new ResponseEntity<List<Room>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Room>>(roomOnFloor, HttpStatus.OK);
    }
}
