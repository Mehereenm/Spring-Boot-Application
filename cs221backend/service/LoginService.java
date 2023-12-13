package com.example.cs221backend.service;

import com.example.cs221backend.model.User;

public interface LoginService {

     User login(String username, String password);

     String logout(User user);
}
