package by.luchesa.breakfast.web.controller.order;

import by.luchesa.breakfast.datamodel.Order;
import by.luchesa.breakfast.service.api.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by Pasha on 12.06.2017.
 */
@RestController
public class GetOrderByDateAndNotWasSpend {
    @Autowired
    OrderService orderService;

    @RequestMapping(value = "restaurant/rest/order/{date}", method = RequestMethod.GET)
    public ResponseEntity<List<Order>> execute
            (@PathVariable("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        List<Order> ordersNotSpend = orderService.getOrderByDateAndNotWasSpend(date);
        if (ordersNotSpend == null) {
            System.out.println("Orders not Found");
            return new ResponseEntity<List<Order>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Order>>(ordersNotSpend, HttpStatus.OK);
    }
}
