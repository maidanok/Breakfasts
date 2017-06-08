package by.luchesa.breakfast.dao;

import by.luchesa.breakfast.datamodel.Entity;
import by.luchesa.breakfast.datamodel.User;

import java.util.List;


public interface UserMapper extends EntityMapper<User>{

    User getByUserName(String userName);

}