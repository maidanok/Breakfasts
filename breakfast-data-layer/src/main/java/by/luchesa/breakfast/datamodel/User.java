package by.luchesa.breakfast.datamodel;

//@org.springframework.stereotype.Component
public class User {

    /** Логин пользователя */
    private String userName;
    /** Зашифрованный пароль пользователя */
    private String password;
    /** Флаг блокировки пользователя */
    private Boolean enabled;

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