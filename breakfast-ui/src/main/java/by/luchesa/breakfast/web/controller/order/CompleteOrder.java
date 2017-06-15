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
public class CompleteOrder {
    @Autowired
    OrderService orderService;

    @RequestMapping(value = "restaurant/rest/order/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Order> execute(@PathVariable("id") int idOrder) {
        orderService.completeOrder(idOrder);
        return new ResponseEntity<Order>(orderService.getOrderById(idOrder), HttpStatus.OK);
    }
}
