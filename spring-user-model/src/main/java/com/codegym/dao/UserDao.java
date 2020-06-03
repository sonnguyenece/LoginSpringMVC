package com.codegym.dao;

import com.codegym.model.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;

    static {
        users = new ArrayList<>();
        users.add(new User("john", "123456", "John", "john@codegym.vn", 10));
        users.add(new User("bill", "123456", "Bill", "bill@codegym.vn", 15));
        users.add(new User("mike", "123456", "Mike", "mike@codegym.vn", 25));
    }
    public static User checkLogin(Login login){
        for (User user: users) {
            if (user.getAccount().equals(login.getAccount())&& user.getPassword().equals(login.getPassword())){
                return user;
            }
        }
        return null;
    }
}
