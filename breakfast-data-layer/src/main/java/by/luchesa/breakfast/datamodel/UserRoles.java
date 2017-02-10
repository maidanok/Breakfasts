package by.luchesa.breakfast.datamodel;

/**
 * Created by Admin on 10.02.2017.
 */
public class UserRoles {
    private int userRoleId;
    private String role;
    private User user;

    public void setUserRoleId(int userRoleId) {
        this.userRoleId = userRoleId;
    }

    public int getUserRoleId() {
        return userRoleId;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
