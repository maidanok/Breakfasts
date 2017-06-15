package by.luchesa.breakfast.service.impl;

import by.luchesa.breakfast.datamodel.User;
import by.luchesa.breakfast.datamodel.UserRoles;
import by.luchesa.breakfast.service.api.UserService;
import by.luchesa.breakfast.dao.UserMapper;
import by.luchesa.breakfast.dao.UserRolesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Pasha on 08.06.2017.
 */
@Service("UserService")
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Autowired
    UserRolesMapper userRolesMapper;

    @Override
    public List<UserRoles> getAllUserRoles() {
        return userRolesMapper.getAll();
    }

    @Override
    public List<User> getAllUser() {
        return userMapper.getAll();
    }

    @Override
    public User getUserId(int userId) {
        return userMapper.getByPrimaryKey(userId);
    }

    @Override
    public User getByName(String name) {
        return userMapper.getByUserName(name);
    }

    @Override
    public void insertNewUser(User user) {
        userMapper.create(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.update(user);
    }

    @Override
    public void deleteUser(int userId) {
        userMapper.delete(userId);
    }
}
