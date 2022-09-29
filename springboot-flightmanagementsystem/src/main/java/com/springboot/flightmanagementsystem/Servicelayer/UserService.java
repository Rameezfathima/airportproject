package com.springboot.flightmanagementsystem.Servicelayer;
import java.math.BigInteger;
import java.util.List;

import com.springboot.flightmanagementsystem.Dtolayer.User;



public interface UserService {
	
	//Add user method
	User addUser(User user);
	
	//Find a single user
	User viewUser(BigInteger id);
	
	//Find All User
	List<User>viewAllUser();
	
	//Update user
	User updateUser(User user, BigInteger id);
	
	//Delete user
	void deleteUser(BigInteger id);
	
	

}
