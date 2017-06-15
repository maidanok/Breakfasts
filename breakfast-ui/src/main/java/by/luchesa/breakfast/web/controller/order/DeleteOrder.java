package by.luchesa.breakfast.web.controller.order;

import by.luchesa.breakfast.datamodel.Order;
import by.luchesa.breakfast.service.api.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Pasha on 12.06.2017.
 */
@RestController
public class DeleteOrder {
    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/reception/rest/order/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Order> execute(@PathVariable("id") int id) {
        Order order = orderService.getOrderById(id);
        if (order == null) {
            System.out.println("order not found");
            return new ResponseEntity<Order>(HttpStatus.NOT_IMPLEMENTED);
        }
        orderService.deleteOrder(order);
        return new ResponseEntity<Order>(order, HttpStatus.OK);
    }
}
