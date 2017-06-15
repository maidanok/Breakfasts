package by.luchesa.breakfast.web.controller.user;

import by.luchesa.breakfast.datamodel.User;
import by.luchesa.breakfast.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Pasha on 09.06.2017.
 */
@RestController
public class GetAllUser {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/admin/rest/user/", method = RequestMethod.GET)
    public ResponseEntity<List<User>> execute() {
        List<User> allUser = userService.getAllUser();
        if (allUser.isEmpty()) {
            return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<User>>(allUser, HttpStatus.OK);
    }
}
