package by.luchesa.breakfast.web.controller;

import by.luchesa.breakfast.datamodel.Breakfast;
import by.luchesa.breakfast.datamodel.User;
import by.luchesa.breakfast.datamodel.UserRoles;
import by.luchesa.breakfast.service.api.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Pasha on 22.02.2017.
 */
@RestController
@RequestMapping("/admin/rest/")
public class AdminRestController {
    @Autowired
    AdminService adminService;

    @RequestMapping(value = "breakfast/", method = RequestMethod.GET)
    public ResponseEntity <List<Breakfast>> getAllBreakfast(){
        List<Breakfast> allBreakfast = adminService.getAllBreakfast();
        if (allBreakfast.isEmpty()){
            return new ResponseEntity<List<Breakfast>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Breakfast>>(allBreakfast,HttpStatus.OK);
    }

    @RequestMapping(value = "breakfast/", method = RequestMethod.PUT)
    public ResponseEntity <List<Breakfast>> insertNewBreakfast (Breakfast newBreakfast){

        //пока тоже заглушка
        adminService.insertNewBreakfast(adminService.generateBreakfast());


        Breakfast checkBreakfast = adminService.getBreakfast(newBreakfast.getIdBreakfast());
        if (checkBreakfast==null){
            return new ResponseEntity<List<Breakfast>>(HttpStatus.NOT_IMPLEMENTED);
        }
        return new ResponseEntity<List<Breakfast>>(adminService.getAllBreakfast(), HttpStatus.OK);
    }

    @RequestMapping (value = "breakfast/{id}", method = RequestMethod.POST)
    public ResponseEntity <List<Breakfast>> updateBreakfast(@PathVariable ("id") int id){
        // заглушка на завтрак
        Breakfast newBreakfast=adminService.getBreakfast(id);
        newBreakfast.setNameBreakfast("123123");
        newBreakfast.setPrice(17);
        //конец заглушки

        adminService.updateBreakfast(newBreakfast);
        return new ResponseEntity<List<Breakfast>>(adminService.getAllBreakfast(), HttpStatus.OK);
    }

    @RequestMapping (value = "breakfast/{id}", method = RequestMethod.DELETE)
    public ResponseEntity <List<Breakfast>> deleteBreakfast(@PathVariable ("id") int id){
        adminService.deleteBreakfast(id);
        Breakfast checkBreakfast=adminService.getBreakfast(id);
        if (checkBreakfast==null){
            return new ResponseEntity<List<Breakfast>>(adminService.getAllBreakfast(),HttpStatus.OK);
        }
        return new ResponseEntity<List<Breakfast>>(adminService.getAllBreakfast(),HttpStatus.NOT_IMPLEMENTED);
    }

    @RequestMapping (value = "user/", method = RequestMethod.GET)
    public ResponseEntity <List<User>> getAllUser(){
        List<User>allUser=adminService.getAllUser();
        if (allUser.isEmpty()){
            return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<User>>(allUser,HttpStatus.OK);
    }

    @RequestMapping (value = "user/", method = RequestMethod.PUT)
    public ResponseEntity <List<User>> insertNewUser(User newUser){
        adminService.insertNewUser(newUser);
        User checkUser = adminService.getUserId(newUser.getUserId());
        if (checkUser==null){
            return new ResponseEntity<List<User>>(adminService.getAllUser(),HttpStatus.NOT_IMPLEMENTED);
        }
        return new ResponseEntity<List<User>>(adminService.getAllUser(),HttpStatus.OK);
    }

    @RequestMapping (value = "user/{id}", method = RequestMethod.POST)
    public ResponseEntity <User> updatePasswordUser (@PathVariable("id") int id){
        // поставим пока заглушку пароль будет менятся на 5555555
        String password = "55555";
        User chngeUser=adminService.getUserId(id);
        chngeUser.setPassword(password);
        //конец заглушки


        adminService.updatePasswordUser(chngeUser);
        return new ResponseEntity<User>(adminService.getUserId(id),HttpStatus.OK);
    }

    @RequestMapping (value = "user/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<List<User>> deleteUser (@PathVariable("id") int id){
        adminService.deleteUser(id);
        if(adminService.getUserId(id).getEnabled()==false){
            return new ResponseEntity<List<User>>(adminService.getAllUser(),HttpStatus.OK);
        }
        return new ResponseEntity<List<User>>(adminService.getAllUser(),HttpStatus.NOT_IMPLEMENTED);
    }

    @RequestMapping(value = "userroles/", method = RequestMethod.GET)
    public ResponseEntity<List<UserRoles>> getAllUserRoles(){
        List<UserRoles> allUserRoles=adminService.getAllUserRoles();
        if(allUserRoles.isEmpty()){
            return new ResponseEntity<List<UserRoles>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<UserRoles>>(allUserRoles,HttpStatus.OK);
    }
}
