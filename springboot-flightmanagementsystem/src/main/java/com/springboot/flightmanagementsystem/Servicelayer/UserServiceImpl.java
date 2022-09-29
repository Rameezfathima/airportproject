package com.springboot.flightmanagementsystem.Servicelayer;
import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.flightmanagementsystem.Daolayer.UserRepository;
import com.springboot.flightmanagementsystem.Dtolayer.User;
import com.springboot.flightmanagementsystem.Exception.ResourceNotFoundException;

@Service
public class UserServiceImpl implements UserService {
	
	//Dependency Injection
    @Autowired
    private UserRepository userRepository;
    
    //Constructor injection.
    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    //addUser method
    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    //Find a single user
    @Override
    public User viewUser(BigInteger id) {
        return userRepository.findById(id).orElseThrow( ()->
        new ResourceNotFoundException("User", "Id", id));
    }

    //Find all users
    @Override
    public List<User> viewAllUser() {
        return userRepository.findAll();
    }

    //Update user
    @Override
    public User updateUser(User user, BigInteger id) {
        User userObj = userRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("User","Id",id));
        userObj.setUserType(user.getUserType());
        userObj.setUserName(user.getUserName());
        userObj.setUserPassword(user.getUserPassword());
        userObj.setUserPhone(user.getUserPhone());
        userObj.setUserEmail(user.getUserEmail());
        userRepository.save(userObj);
        return userObj;
    }

    //Delete user
    @Override
    public void deleteUser(BigInteger id) {
        userRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("User","Id",id));
        userRepository.deleteById(id);
        
    }

}

