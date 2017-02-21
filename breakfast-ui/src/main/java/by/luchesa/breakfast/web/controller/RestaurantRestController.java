package by.luchesa.breakfast.web.controller;


import by.luchesa.breakfast.datamodel.Order;
import by.luchesa.breakfast.datamodel.Room;
import by.luchesa.breakfast.service.api.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.util.Date;
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
        System.out.println("Fetching Floor with id " + id);
        List<Room> roomOnFloor = restaurantService.getRoomsOnTheFloor(id);
        if (roomOnFloor == null) {
            System.out.println("Floor with id " + id + " not found");
            return new ResponseEntity<List<Room>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Room>>(roomOnFloor, HttpStatus.OK);
    }

    @RequestMapping(value = "order/{date}", method = RequestMethod.GET )
    public ResponseEntity<List<Order>> getOrderByDateAndNotWasSpend
            (@PathVariable("date") @DateTimeFormat (iso = DateTimeFormat.ISO.DATE) LocalDate date){
        List<Order> ordersNotSpend=restaurantService.getOrderByDateAndNotWasSpend(date);
        if (ordersNotSpend==null){
            System.out.println("Orders not Found");
            return  new ResponseEntity<List<Order>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Order>>(ordersNotSpend, HttpStatus.OK);
    }

    @RequestMapping (value = "order/{id}", method = RequestMethod.PUT)
    public ResponseEntity <Order>completeOrder(@PathVariable("id") int idOrder){
        restaurantService.completeOrder(idOrder);
        return new ResponseEntity<Order>(restaurantService.getOrderById(idOrder),HttpStatus.OK);
    }
}
