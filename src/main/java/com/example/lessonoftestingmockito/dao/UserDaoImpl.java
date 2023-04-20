package com.example.lessonoftestingmockito.dao;

import com.example.lessonoftestingmockito.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl {
    ArrayList<User> userList;

    public UserDaoImpl() {
        this.userList = new ArrayList<>();
        userList.add(new User("Алексей"));
        userList.add(new User("Дмитрий"));
        userList.add(new User("Константин"));
        userList.add(new User("Сергей"));
        userList.add(new User("Екатирина"));
    }
    public User getUserByName(String name){
        for (User user : userList) {
            if (user.getName().equals(name))
                return user;
        }
        return null;
    }
    public ArrayList<User> findAllUser(){
        return userList;
    }
}
