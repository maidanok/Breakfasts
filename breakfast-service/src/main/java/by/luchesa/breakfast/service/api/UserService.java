package by.luchesa.breakfast.service.api;

import by.luchesa.breakfast.datamodel.User;
import by.luchesa.breakfast.datamodel.UserRoles;

import java.util.List;

/**
 * Created by Pasha on 08.06.2017.
 */
public interface UserService {
    List<UserRoles> getAllUserRoles();

    List<User> getAllUser();

    User getUserId (int userId);

    User getByName (String name);

    void insertNewUser(User user);

    void updateUser (User user);

    void deleteUser (int userId);
}
