package by.luchesa.breakfast.web.controller;

import by.luchesa.breakfast.datamodel.Order;
import by.luchesa.breakfast.datamodel.Room;
import by.luchesa.breakfast.service.api.ReceptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * Created by Pasha on 20.02.2017.
 */

@RestController
@RequestMapping("/reception/rest/")
public class ReceptionRestController {

    @Autowired
    ReceptionService receptionService;

    @RequestMapping(value = "room/", method = RequestMethod.GET)
    public ResponseEntity<List<Room>> getAllRooms(){
        List <Room> allRooms= receptionService.getAllRooms();
        if (allRooms.isEmpty()){
            System.out.println("rooms not found");
            return new ResponseEntity<List<Room>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Room>>(allRooms, HttpStatus.OK);
    }

    @RequestMapping(value = "/order/{date}", method = RequestMethod.GET)
    public ResponseEntity<List<Order>> getOrderByDate(@PathVariable ("date")Date date){
        List <Order> orderByDate=receptionService.getOrderByDate(date);
        if (orderByDate.isEmpty()){
            return new ResponseEntity<List<Order>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Order>>(orderByDate,HttpStatus.OK);
    }

    @RequestMapping (value = "order/", method = RequestMethod.PUT)
    public ResponseEntity<List<Order>> insertOrder(Order newOrder){
        receptionService.insertOrder(newOrder);
        Order myOrder=receptionService.getOrderById(newOrder.getIdOrder());
        if (myOrder==null){
            return new ResponseEntity<List<Order>>(HttpStatus.NOT_IMPLEMENTED);
        }
        return new ResponseEntity<List<Order>>(receptionService.getOrderByDate(newOrder.getDateOrder()),HttpStatus.OK);
    }

    @RequestMapping (value = "order/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Order> deleteOrder(@PathVariable ("id") int id){
        Order order = receptionService.getOrderById(id);
        if (order==null){
            System.out.println("order not found");
            return new ResponseEntity<Order>(HttpStatus.NOT_IMPLEMENTED);
        }
        receptionService.deleteOrder(order);
        return new ResponseEntity<Order>(order,HttpStatus.OK);
    }
}
