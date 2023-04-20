package com.example.lessonoftestingmockito.service;
import com.example.lessonoftestingmockito.dao.UserDaoImpl;
import com.example.lessonoftestingmockito.model.User;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
class UserServiceTest {
    @InjectMocks
    UserService userService;
    @Mock
    private UserDaoImpl userDao;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void checkUserExistNull() {
        Mockito.when(userDao.getUserByName("Михаил")).thenReturn(null);
        Assertions.assertFalse(userService.checkUserExist(new User("Михаил")));
    }
    @Test
    void checkUserExistNotNull() {
        Mockito.when(userDao.getUserByName("Михаил")).thenReturn(new User("Михаил"));
        Assertions.assertFalse(userService.checkUserExist(new User("Михаил")));
    }
}