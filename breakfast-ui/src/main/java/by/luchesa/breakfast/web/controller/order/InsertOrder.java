package by.luchesa.breakfast.web.controller.order;

import by.luchesa.breakfast.datamodel.Order;
import by.luchesa.breakfast.service.api.OrderService;
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
public class InsertOrder {
    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/reception/rest/order/", method = RequestMethod.PUT)
    public ResponseEntity<List<Order>> execute(Order newOrder) {
        orderService.insertOrder(newOrder);
        Order myOrder = orderService.getOrderById(newOrder.getPrimaryKey());
        if (myOrder == null) {
            return new ResponseEntity<List<Order>>(HttpStatus.NOT_IMPLEMENTED);
        }
        return new ResponseEntity<List<Order>>(orderService.getOrderByDate(newOrder.getDateOrder()), HttpStatus.OK);
    }
}
