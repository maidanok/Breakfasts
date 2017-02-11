package by.luchesa.breakfast.datamodel;



//@org.springframework.stereotype.Component
public class User {

    private int userId;
    /** Логин пользователя */
    private String userName;
    /** Зашифрованный пароль пользователя */
    private String password;
    /** Флаг блокировки пользователя */
    private Boolean enabled;
    //права пользователя
    private UserRoles userRoles;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public UserRoles getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(UserRoles userRoles) {
        this.userRoles = userRoles;
    }

    /**
     * Метод генерирует строку с информацией о пользователе
     *
     * @return строка с информацией о пользователе
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "[ NAME = " + this.userName + " ]";
    }
}