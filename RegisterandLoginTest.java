/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.login_project2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class RegisterandLoginTest {
    
    public RegisterandLoginTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getUsername method, of class RegisterandLogin.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        RegisterandLogin instance = new RegisterandLogin();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class RegisterandLogin.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        RegisterandLogin instance = new RegisterandLogin();
        instance.setUsername(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class RegisterandLogin.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        RegisterandLogin instance = new RegisterandLogin();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class RegisterandLogin.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        RegisterandLogin instance = new RegisterandLogin();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstName method, of class RegisterandLogin.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        RegisterandLogin instance = new RegisterandLogin();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstName method, of class RegisterandLogin.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        RegisterandLogin instance = new RegisterandLogin();
        instance.setFirstName(firstName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class RegisterandLogin.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        RegisterandLogin instance = new RegisterandLogin();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class RegisterandLogin.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        RegisterandLogin instance = new RegisterandLogin();
        instance.setLastName(lastName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class RegisterandLogin.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String firstName1 = "";
        String lastName1 = "";
        String username1 = "";
        String password1 = "";
        RegisterandLogin instance = new RegisterandLogin();
        String expResult = "";
        String result = instance.registerUser(firstName1, lastName1, username1, password1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class RegisterandLogin.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String username = "";
        String password = "";
        RegisterandLogin instance = new RegisterandLogin();
        boolean expResult = false;
        boolean result = instance.loginUser(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
