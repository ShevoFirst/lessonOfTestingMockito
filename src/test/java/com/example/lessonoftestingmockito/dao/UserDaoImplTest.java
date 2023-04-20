package com.example.lessonoftestingmockito.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoImplTest {
    UserDaoImpl userDao = new UserDaoImpl();

    @Test
    void getUserByName() {
        Assertions.assertNotNull(userDao.getUserByName("Дмитрий"));
    }

    @Test
    void getNullByName() {
        Assertions.assertNull(userDao.getUserByName("Дмиtтрий"));
    }
}