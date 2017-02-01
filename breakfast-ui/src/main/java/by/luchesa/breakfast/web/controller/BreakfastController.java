package by.luchesa.breakfast.web.controller;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 9656cae0261cf4536414f983f613c58e52262f78
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
<<<<<<< HEAD
=======
=======
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
>>>>>>> 2c17667e0b5b20b048fda1f89ff32b6a009afec2
>>>>>>> 9656cae0261cf4536414f983f613c58e52262f78
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BreakfastController {

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 9656cae0261cf4536414f983f613c58e52262f78
    @RequestMapping(value = { "/", "/index**" }, method = RequestMethod.GET)
    public ModelAndView defaultPage() {

        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security Login Form - Database Authentication");
        model.addObject("message", "This is default page!");
<<<<<<< HEAD
=======
=======
    @RequestMapping(value = { "/", "/welcome**" }, method = RequestMethod.GET)
    public ModelAndView welcomePage() {

        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security Hello World");
        model.addObject("message", "This is welcome page!");
>>>>>>> 2c17667e0b5b20b048fda1f89ff32b6a009afec2
>>>>>>> 9656cae0261cf4536414f983f613c58e52262f78
        model.setViewName("index");
        return model;

    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 9656cae0261cf4536414f983f613c58e52262f78
    @RequestMapping(value = "/admin**", method = RequestMethod.GET)
    public ModelAndView adminPage() {

        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security Login Form - Database Authentication");
        model.addObject("message", "This page is for ROLE_ADMIN only!");
        model.setViewName("admin");
        return model;

    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(@RequestParam(value = "error", required = false) String error,
                              @RequestParam(value = "logout", required = false) String logout) {

        ModelAndView model = new ModelAndView();
        if (error != null) {
            model.addObject("error", "Invalid username and password!");
        }

        if (logout != null) {
            model.addObject("msg", "You've been logged out successfully.");
        }
<<<<<<< HEAD
=======
=======
    @RequestMapping(value = "/login**", method = RequestMethod.GET)
    public ModelAndView adminPage() {

        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security Hello World");
        model.addObject("message", "This is protected page!");
>>>>>>> 2c17667e0b5b20b048fda1f89ff32b6a009afec2
>>>>>>> 9656cae0261cf4536414f983f613c58e52262f78
        model.setViewName("login");

        return model;

    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 9656cae0261cf4536414f983f613c58e52262f78
    //for 403 access denied page
    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public ModelAndView accesssDenied() {

        ModelAndView model = new ModelAndView();

        //check if user is login
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (!(auth instanceof AnonymousAuthenticationToken)) {
            UserDetails userDetail = (UserDetails) auth.getPrincipal();
            model.addObject("username", userDetail.getUsername());
        }

        model.setViewName("403");
        return model;

    }

<<<<<<< HEAD
=======
=======
>>>>>>> 2c17667e0b5b20b048fda1f89ff32b6a009afec2
>>>>>>> 9656cae0261cf4536414f983f613c58e52262f78
}