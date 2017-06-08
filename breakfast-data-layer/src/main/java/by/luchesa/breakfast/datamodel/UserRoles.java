package by.luchesa.breakfast.datamodel;

/**
 * Created by Admin on 11.02.2017.
 */
public class UserRoles implements Entity {

    private int userRoleId;

    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public Integer getPrimaryKey() {
        return userRoleId;
    }

    @Override
    public void setPrimaryKey(Integer primaryKey) {
        userRoleId = primaryKey;
    }
}
