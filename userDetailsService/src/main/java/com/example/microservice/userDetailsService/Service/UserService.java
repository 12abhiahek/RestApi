package com.example.microservice.userDetailsService.Service;

import com.example.microservice.userDetailsService.Entity.User;

import java.util.List;

public interface UserService {


//create
    User saveUser(User user);
    //get all user
    List<User>  getAllUser();
    User  getUser(String userId);
}
