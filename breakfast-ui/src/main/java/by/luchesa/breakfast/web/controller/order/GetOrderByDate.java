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
public class GetOrderByDate {
    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/reception/rest/order/{date}", method = RequestMethod.GET)
    public ResponseEntity<List<Order>> execute(
            @PathVariable("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        List<Order> orderByDate = orderService.getOrderByDate(date);
        if (orderByDate.isEmpty()) {
            return new ResponseEntity<List<Order>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Order>>(orderByDate, HttpStatus.OK);
    }
}
