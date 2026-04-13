/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TestLogins;


import com.mycompany.part1.Login;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Student
 */
public class TestLogin {
    
    Login login = new Login();


// USERNAME TESTS


@Test
public void testUsernameCorrect() {
assertTrue(login.checkUserName("kyl_1"));
}

@Test
public void testUsernameIncorrect() {
assertFalse(login.checkUserName("kyle!!!!!"));
}


//  PASSWORD TESTS


@Test
public void testPasswordCorrect() {
assertTrue(login.checkPasswordComplexity("Ch&sec@ke99!"));
}

@Test
public void testPasswordIncorrect() {
assertFalse(login.checkPasswordComplexity("password"));
}


//  CELL NUMBER TESTS


@Test
public void testCellNumberCorrect() {
assertTrue(login.checkCellPhoneNumber("+27838968976"));
}

@Test
public void testCellNumberIncorrect() {
assertFalse(login.checkCellPhoneNumber("08966553"));
}


//  REGISTER USER TESTS 


@Test
public void testRegisterUsernameFail() {
String result = login.registerUser("kyle!!!!!", "Ch&sec@ke99!", "+27838968976");

assertEquals("Username is incorrectly formatted.", result);
}

@Test
public void testRegisterPasswordFail() {
String result = login.registerUser("kyl_1", "password", "+27838968976");

assertEquals("Password does not meet complexity requirements.", result);
}

@Test
public void testRegisterCellFail() {
String result = login.registerUser("kyl_1", "Ch&sec@ke99!", "08966553");

assertEquals("Cell phone number is incorrect.", result);
}

@Test
public void testRegisterSuccess() {
String result = login.registerUser("kyl_1", "Ch&sec@ke99!", "+27838968976");

assertEquals("User registered successfully.", result);
}


// LOGIN TESTS


@Test
public void testLoginSuccess() {
login.registerUser("kyl_1", "Ch&sec@ke99!", "+27838968976");
assertTrue(login.loginUser("kyl_1", "Ch&sec@ke99!"));
}

@Test
public void testLoginFail() {
login.registerUser("kyl_1", "Ch&sec@ke99!", "+27838968976");
assertFalse(login.loginUser("wrong", "wrong"));
}


// LOGIN MESSAGE TEST


@Test
public void testReturnLoginStatusSuccess() {
String message = login.returnLoginStatus(true);
assertEquals("Welcome null null!", message); 
}

@Test
public void testReturnLoginStatusFail() {
String message = login.returnLoginStatus(false);
assertEquals("Login failed", message);
}
}
    

