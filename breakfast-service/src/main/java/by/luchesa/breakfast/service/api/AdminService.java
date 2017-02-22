package by.luchesa.breakfast.service.api;

import by.luchesa.breakfast.datamodel.Breakfast;
import by.luchesa.breakfast.datamodel.User;
import by.luchesa.breakfast.datamodel.UserRoles;

import java.util.List;

/**
 * Created by Pasha on 22.02.2017.
 */
public interface AdminService {


    List<Breakfast> getAllBreakfast();

    Breakfast getBreakfast(int idBreakfast);

    void insertNewBreakfast(Breakfast breakfast);

    void updateBreakfast(Breakfast breakfast);

    void deleteBreakfast(int idBreakfast);

    List <UserRoles> getAllUserRoles();

    List<User> getAllUser();

    User getUserId (int userId);

    void insertNewUser(User user);

    void updatePasswordUser (User user);

    void deleteUser (int userId);

    // заглушка на новый завтрак
    Breakfast generateBreakfast();

}
