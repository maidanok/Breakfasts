package by.luchesa.breakfast.web.controller.breakfast;

import by.luchesa.breakfast.datamodel.Breakfast;
import by.luchesa.breakfast.service.api.BreakfastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Pasha on 09.06.2017.
 */
@RestController
public class GetAllBreakfast {
    @Autowired
    BreakfastService breakfastService;

    @RequestMapping(value = "/admin/rest/breakfast/", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Breakfast>> execute(){
        List<Breakfast> allBreakfast = breakfastService.getAllBreakfast();
        if (allBreakfast.isEmpty()){
            return new ResponseEntity<List<Breakfast>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Breakfast>>(allBreakfast,HttpStatus.OK);
    }
}
