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
 * @author tshiamo
 */
public class TaskManagerTest {
    
    public TaskManagerTest() {
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
     * Test of addTask method, of class TaskManager.
     */
    @Test
    public void testAddTask() {
        System.out.println("addTask");
        Task task = null;
        TaskManager instance = new TaskManager();
        instance.addTask(task);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayDoneTasks method, of class TaskManager.
     */
    @Test
    public void testDisplayDoneTasks() {
        System.out.println("displayDoneTasks");
        TaskManager instance = new TaskManager();
        instance.displayDoneTasks();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayLongestTask method, of class TaskManager.
     */
    @Test
    public void testDisplayLongestTask() {
        System.out.println("displayLongestTask");
        TaskManager instance = new TaskManager();
        instance.displayLongestTask();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchTaskByName method, of class TaskManager.
     */
    @Test
    public void testSearchTaskByName() {
        System.out.println("searchTaskByName");
        String taskName = "";
        TaskManager instance = new TaskManager();
        instance.searchTaskByName(taskName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchTasksByDeveloper method, of class TaskManager.
     */
    @Test
    public void testSearchTasksByDeveloper() {
        System.out.println("searchTasksByDeveloper");
        String developer = "";
        TaskManager instance = new TaskManager();
        instance.searchTasksByDeveloper(developer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteTask method, of class TaskManager.
     */
    @Test
    public void testDeleteTask() {
        System.out.println("deleteTask");
        String taskName = "";
        TaskManager instance = new TaskManager();
        instance.deleteTask(taskName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayReport method, of class TaskManager.
     */
    @Test
    public void testDisplayReport() {
        System.out.println("displayReport");
        TaskManager instance = new TaskManager();
        instance.displayReport();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskByName method, of class TaskManager.
     */
    @Test
    public void testGetTaskByName() {
        System.out.println("getTaskByName");
        String taskName = "";
        TaskManager instance = new TaskManager();
        Task expResult = null;
        Task result = instance.getTaskByName(taskName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteTaskByName method, of class TaskManager.
     */
    @Test
    public void testDeleteTaskByName() {
        System.out.println("deleteTaskByName");
        String taskName = "";
        TaskManager instance = new TaskManager();
        instance.deleteTaskByName(taskName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
