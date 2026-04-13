/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.part1;

/**
 *
 * @author Student
 */
public class Login {
    
private String username;
private String password;
private String phone;
private String firstName;
private String lastName;


public boolean checkUserName(String username){
  return username.contains("_") && username.length() <=5;
}

public boolean checkPasswordComplexity(String password){
    boolean hasUp = !
       password.equals(password.toLowerCase());
     boolean hasNo = password.matches(".*\\d.*");
      boolean hasSpec = password.matches(".*[!@#$%^&*()].*");
      
    return password.length()>=8 && hasUp && hasNo && hasSpec;
} 
    // Phone check
public boolean checkCellPhoneNumber(String phone) {
return phone.matches("\\+27\\d{9}");
}

// Register user
public String registerUser(String username, String password, String phone) {

if (!checkUserName(username)) {
return "Username is incorrectly formatted.";
}

if (!checkPasswordComplexity(password)) {
return "Password does not meet complexity requirements.";
}

if (!checkCellPhoneNumber(phone)) {
return "Cell phone number is incorrect.";
}

// save
this.username = username;
this.password = password;
this.phone = phone;

return "User registered successfully.";
}

// Login
public boolean loginUser(String username, String password) {
return username.equals(this.username) && password.equals(this.password);
}

// Login message
public String returnLoginStatus(boolean success) {
if (success) {
return "Welcome " + firstName + " " + lastName + "!";
} else {
return "Login failed";
}
}
}



