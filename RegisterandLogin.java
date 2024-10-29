/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login_project2;

/**
 *
 * @author tshiamo
 */
public class RegisterandLogin {
  private String username;
    private String password;
    private String firstName;
    private String lastName;
    
    //  Initializes a new Task object with required properties
    public RegisterandLogin() {}

    // Retrieves task properties and Sets task properties
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Method to register the user
    public String registerUser() {
        // Validates user input (username, password, first name, last name)
        return "Username and Password successfully captured";
    }

    // Method to login the user
    public boolean loginUser(String username, String password) {
        // Login logic here
        // For demonstration purposes, assume login is successful
        return true;
    }

}
