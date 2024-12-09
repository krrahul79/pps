package com.example.pps.service;

import com.example.pps.entity.User;
import com.example.pps.repository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRespository userRespository;

    public User saveUser(User user){
        return userRespository.save(user);
    }

    public List<User> getAllUsers(){
        return userRespository.findAll();
    }

    public User getUserById(Long id){
        return userRespository.findById(id).orElseThrow(()->new RuntimeException("User not found"));
    }

    public void deleteUser(Long id){
        userRespository.deleteById(id);
    }
}
