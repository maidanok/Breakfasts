package by.luchesa.breakfast.web.controller.breakfast;

import by.luchesa.breakfast.datamodel.Breakfast;
import by.luchesa.breakfast.service.api.BreakfastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Pasha on 09.06.2017.
 */
@RestController
public class GetBreakfast {
    @Autowired
    BreakfastService breakfastService;

    @RequestMapping(value = "/admin/rest/breakfast/{id}", method = RequestMethod.GET)
    public ResponseEntity<Breakfast> execute (@PathVariable("id") int id) {
        Breakfast breakfast = breakfastService.getBreakfast(id);
        return new ResponseEntity<Breakfast>(breakfast, HttpStatus.OK);
    }
}
