package by.luchesa.breakfast.dao;

import by.luchesa.breakfast.datamodel.UserRoles;

import java.util.List;

/**
 * Created by Admin on 10.02.2017.
 */
public interface UserRolesMapper {
 List<UserRoles> getAllUserRole();
 UserRoles getUserRoleId(int userRoleId);
}
