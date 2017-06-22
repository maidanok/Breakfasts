package by.luchesa.breakfast.web.controller.breakfast;

import by.luchesa.breakfast.datamodel.Breakfast;
import by.luchesa.breakfast.service.api.BreakfastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Pasha on 09.06.2017.
 */
@RestController
public class InsertNewBreakfast {
    @Autowired
    BreakfastService breakfastService;
    @RequestMapping(value = "/admin/rest/newbreakfast/", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<List<Breakfast>> execute (String nameBreakfast, String price){
        Breakfast newBreakfast = new Breakfast();
        newBreakfast.setNameBreakfast(nameBreakfast);
        newBreakfast.setPrice(Double.valueOf(price));
        breakfastService.insertNewBreakfast(newBreakfast);
        return new ResponseEntity<List<Breakfast>>(breakfastService.getAllBreakfast(), HttpStatus.OK);
    }
}
