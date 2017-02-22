package by.luchesa.breakfast.service.impl;

import by.luchesa.breakfast.dao.BreakfastMapper;
import by.luchesa.breakfast.dao.UserMapper;
import by.luchesa.breakfast.datamodel.Breakfast;
import by.luchesa.breakfast.datamodel.User;
import by.luchesa.breakfast.service.api.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Pasha on 22.02.2017.
 */
@Service("AdminService")
@Transactional
public class AdminServiceImpl implements AdminService{
    @Autowired
    UserMapper userMapper;

    @Autowired
    BreakfastMapper breakfastMapper;

    @Override
    public List<Breakfast> getAllBreakfast() {
        return breakfastMapper.getAllBreakfast();
    }

    @Override
    public Breakfast getBreakfast(int idBreakfast) {
        return breakfastMapper.getBreakfastId(idBreakfast);
    }

    @Override
    public void insertNewBreakfast(Breakfast breakfast) {
        breakfastMapper.insertNewBreakfast(breakfast);
    }

    @Override
    public void updateBreakfast(Breakfast breakfast) {
        breakfastMapper.updateBreakfast(breakfast);
    }

    @Override
    public void deleteBreakfast(int idBreakfast) {
        breakfastMapper.deleteBreakfast(idBreakfast);
    }

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public User getUserId(int userId) {
        return userMapper.getUserId(userId);
    }

    @Override
    public void insertNewUser(User user) {
        userMapper.insertNewUser(user);
    }

    @Override
    public void updatePasswordUser(User user) {
        userMapper.updatePasswordUser(user);
    }

    @Override
    public void deleteUser(int userId) {
        userMapper.deleteUser(userId);
    }

    @Override
    public Breakfast generateBreakfast() {
        Breakfast newbreakfast=new Breakfast();
        newbreakfast.setNameBreakfast("newName");
        newbreakfast.setPrice(15);
        return newbreakfast;
    }
}
