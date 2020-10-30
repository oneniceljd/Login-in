package com.example.login.service.serviceImpl;

import com.example.login.Dao.UserDao;
import com.example.login.entry.User;
import com.example.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao ;

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public User selectByUsername(String username) {
        return userDao.selectByUsername(username);
    }

    @Override
    public User selectByPhone(String phone) {
        return userDao.selectByPhone(phone);
    }

    @Override
    public User selectByEmail(String email) {
        return userDao.selectByEmail(email);
    }

    @Override
    public User selectByPassword(String password) {
        return userDao.selectByPassword(password);
    }

    @Override
    public User selectByUuid(String uuid) {
        return userDao.selectByUuid(uuid);
    }

    @Override
    public User selectByUser(String username, String email, String phone) {
        return userDao.selectByUser(username, email, phone);
    }
}
