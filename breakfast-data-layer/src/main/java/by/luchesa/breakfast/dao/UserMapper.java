package by.luchesa.breakfast.dao;

import by.luchesa.breakfast.datamodel.User;


public interface UserMapper {

    User getUserName(String userName);

    User getUserId (int userId);


}