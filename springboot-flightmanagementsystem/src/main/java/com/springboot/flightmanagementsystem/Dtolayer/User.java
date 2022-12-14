package com.springboot.flightmanagementsystem.Dtolayer;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	
	//Data members
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private BigInteger userId;
    
    @Column(name="userType")
    private String userType;
    
    @Column(name="userName")
    private String userName;
    
    @Column(name="userPassword")
    private String userPassword;
    
    @Column(name="userPhone")
    private BigInteger userPhone;
    
    @Column(name="userEmail")
    private String userEmail;

   //Parameterized Constructor
    public User(BigInteger userId, String userType, String userName, String userPassword, BigInteger userPhone,
            String userEmail) {
        super();
        this.userId = userId;
        this.userType = userType;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userPhone = userPhone;
        this.userEmail = userEmail;
    }

   //Default constructor
    public User() {
        super();
    }

    //Getters and setters
    public BigInteger getUserId() {
        return userId;
    }
   public void setUserId(BigInteger userId) {
        this.userId = userId;
    }
   public String getUserType() {
        return userType;
    }
   public void setUserType(String userType) {
        this.userType = userType;
    }
   public String getUserName() {
        return userName;
    }
   public void setUserName(String userName) {
        this.userName = userName;
    }
   public String getUserPassword() {
        return userPassword;
    }
   public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
   public BigInteger getUserPhone() {
        return userPhone;
    }
   public void setUserPhone(BigInteger userPhone) {
        this.userPhone = userPhone;
    }
   public String getUserEmail() {
        return userEmail;
    }
   public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

}

