package com.example.cs221backend.service.impl;
import com.example.cs221backend.model.User;
import com.example.cs221backend.service.LoginService;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {


    @Override
    public User login(String username, String password) {
        if (username.equals("aarapi") && password.equals("12345")) {
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            user.setFullName("Albi Arapi");
            return user;
        }

        return null;
    }

    @Override
    public String logout(User user) {
        return "User "+user.getFullName() + " signed out successfully";
    }


}
