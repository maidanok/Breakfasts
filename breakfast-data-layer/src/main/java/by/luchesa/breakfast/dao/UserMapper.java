package by.luchesa.breakfast.dao;

import by.luchesa.breakfast.datamodel.User;

import java.util.List;


public interface UserMapper {

    User getUserName(String userName);

    User getUserId (int userId);

    List<User> getAllUser();

    void insertNewUser(User user);

    void updatePasswordUser (User user);

    void deleteUser (int userId);


}