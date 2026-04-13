/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.part1;

/**
 *
 * @author Student
 */
import java.util.Scanner;

public class Part1 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
     
     System.out.print("Enter username: ");
     String username = input.nextLine();
     
     //Username condition
     if (username.contains("_") && username.length() <= 5) {
System.out.println("Username successfully captured");
} else {
System.out.println("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length");
}
     
    System.out.print("Enter password: ");
    String pass = input.nextLine();
    
    //Password condition
     boolean hasUp = !
       pass.equals(pass.toLowerCase());
     boolean hasNo = pass.matches(".*\\d.*");
      boolean hasSpec = pass.matches(".*[!@#$%^&*()].*");
     
      if(pass.length() <=8 &&hasUp && hasNo && hasSpec){
          System.out.println("Password successfully captured");
      }else{
          System.out.println("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
      return; 
      } 
      
      System.out.print("Enter phone number: ");
    String phone = input.nextLine();
      
      //Cellphone number
      String cellRegex = "\\+27\\d{9}$";
      
      // Cell Number conditions

//------ Reference for cellphone code -------
//This regular expression was researched to validate
//SA international phone format (+27)
//Source: Oracle Java Documentation - Pattern Class
//Link: https://docs.oracle.com/javase/8/docs/api/java/util/regex/pattern.html


      if(phone.matches(cellRegex)){
          System.out.println("Cell phone number successfully added");
          
      }else {
          System.out.println("Cell phone number incorrectly formatted or does not contain international code");
          
      }
      
      System.out.println("\n---LOGIN---");
      
      System.out.println("enter firstName");
      String firstName = input.nextLine();
      
      System.out.println("enter lastName");
      String lastName = input.nextLine();
      
      System.out.println("enter username");
      String loginUser = input.nextLine();
      
      System.out.println("enter password");
      String loginPass = input.nextLine();
      
      if (loginUser.equals(username) && loginPass.equals(pass)) {
System.out.println("Welcome" + firstName + "," + lastName + "it is great to see you again.");
} else {
System.out.println("Username or password incorrect, please try again.");
      }
      
      }
    
    

    }
    
