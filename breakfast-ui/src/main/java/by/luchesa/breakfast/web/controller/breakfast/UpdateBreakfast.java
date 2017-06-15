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
public class UpdateBreakfast {
    @Autowired
    BreakfastService breakfastService;

    @RequestMapping(value = "/admin/rest/breakfast/{id}", method = RequestMethod.POST)
    public ResponseEntity<List<Breakfast>> execute(@PathVariable("id") int id, Breakfast breakfast) {
        breakfast.setPrimaryKey(id);
        breakfastService.updateBreakfast(breakfast);
        return new ResponseEntity<List<Breakfast>>(breakfastService.getAllBreakfast(), HttpStatus.OK);
    }
}
