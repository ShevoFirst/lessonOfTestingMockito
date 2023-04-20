package com.example.lessonoftestingmockito.service;

import com.example.lessonoftestingmockito.dao.UserDaoImpl;
import com.example.lessonoftestingmockito.model.User;

public class UserService {
    private UserDaoImpl userDao;

    public UserService(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    public boolean checkUserExist(User user){
        if (userDao.getUserByName(user.getName()) == null)
            return false;
        return true;
    }
}
