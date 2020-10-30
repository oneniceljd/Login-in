package com.example.login.service;

import com.example.login.entry.User;

public interface UserService {

    public void add(User user) ;

    public User selectByUsername(String username) ;

    public User selectByPhone(String phone) ;

    public User selectByEmail(String email) ;

    public User selectByPassword(String password) ;

    public User selectByUuid(String uuid) ;

    public User selectByUser(String username, String email, String phone) ;

}
