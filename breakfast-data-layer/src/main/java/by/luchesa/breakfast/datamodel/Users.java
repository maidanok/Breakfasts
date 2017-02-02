package by.luchesa.breakfast.datamodel;

import java.util.Date;
import java.util.List;

public class Users {

    /** Логин пользователя */
    private String username;
    /** Зашифрованный пароль пользователя */
    private String password;
    /** Флаг блокировки пользователя */
    private Boolean enabled;

    public String getName() {
        return username;
    }

    public void setName(String name) {
        this.username = name;
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
        return "[ NAME = " + this.username + " ]";
    }
}