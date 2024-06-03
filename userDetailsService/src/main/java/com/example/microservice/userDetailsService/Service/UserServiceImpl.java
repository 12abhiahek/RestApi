package com.example.microservice.userDetailsService.Service;

import com.example.microservice.userDetailsService.Entity.User;
import com.example.microservice.userDetailsService.Exception.resourceNotFoundException;
import com.example.microservice.userDetailsService.Repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
   @Autowired
   private userRepository userRepository;
    @Override

    public User saveUser(User user) {
        String randomUserId=UUID.randomUUID().toString();
        user.setUserId(randomUserId);
        return userRepository.save(user);

    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        return userRepository.findById(userId).orElseThrow(()->new resourceNotFoundException("User given Id are not found on the server"+userId));
    }
    //Abhishekek Singh

}
