/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.login_project2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTest {

    // Test Case 1: Validate Task Description Length
    @Test
    public void testTaskDescriptionLength_Success() {
        // Arrange
        String taskName = "Test Task";
        int taskNumber = 1;
        String taskDescription = "Test description within 50 characters";
        String developerDetails = "John Byrne";
        int taskDuration = 5;
        String taskStatus = "To Do";

        // Perform the main action or operation
        Task task = new Task(taskName, taskNumber, taskDescription, developerDetails, taskDuration, taskStatus);
        String result = task.validateTaskDescription();

        // Checks if the action produced the desired effect
        assertEquals("Task successfully captured", result);
    }

    @Test
    public void testTaskDescriptionLength_Failure() {
        //  Initializes variables and objects
        String taskName = "Test Task";
        int taskNumber = 1;
        String taskDescription = "Test description exceeding 50 characters length requirement for validation purposes";
        String developerDetails = "John Byrne";
        int taskDuration = 5;
        String taskStatus = "To Do";

        // Act
        Task task = new Task(taskName, taskNumber, taskDescription, developerDetails, taskDuration, taskStatus);
        String result = task.validateTaskDescription();

        // Checks if the action produced the desired effect
        assertEquals("Please enter a task description of less than 50 characters", result);
    }

    // Test 2: TaskID generation
    @Test
    public void testTaskIDGeneration() {
        // Arrange
        String taskName = "Test";
        int taskNumber = 1;
        String taskDescription = "Test description";
        String developerDetails = "John Byrne";
        int taskDuration = 5;
        String taskStatus = "To Do";

        // Act
        Task task = new Task(taskName, taskNumber, taskDescription, developerDetails, taskDuration, taskStatus);

        // Checks if the action produced the desired effect
        assertEquals("AD:1:BYN", task.getTaskID());
    }

    @Test
    public void testTaskIDGeneration_Multiple() {
        // Test data
        String[] taskNames = {"Create", "Review", "Review", "Review"};
        int[] taskNumbers = {0, 1, 2, 3};
        String[] developerDetails = {"Ikechukwu", "Ardhendu", "Thatcher", "Ndu"};
        String[] expectedTaskIDs = {"CR:0:IKE", "CR:1:ARD", "CR:2:THA", "CR:3:ND"};

        // Perform action and verify outcome
        for (int i = 0; i < taskNames.length; i++) {
            Task task = new Task(taskNames[i], taskNumbers[i], "Test description", developerDetails[i], 5, "To Do");
            assertEquals(expectedTaskIDs[i], task.getTaskID());
        }
    }

    // Test 3: Total Hours accumulation
    @Test
    public void testTotalHoursAccumulation() {
        // Test data
        int numTasks = 2;
        int[] durations = {8, 10};
        int expectedTotalHours = 18;

        // Perform action and verify outcome
        int totalHours = 0;
        for (int i = 0; i < numTasks; i++) {
            Task task = new Task("Task " + (i + 1), i, "Test description", "John Doe", durations[i], "To Do");
            totalHours += task.getTaskDuration();
        }
        assertEquals(expectedTotalHours, totalHours);
    }

    @Test
    public void testTotalHoursAccumulation_Multiple() {
        // Test data
        int numTasks = 5;
        int[] durations = {10, 12, 15, 11, 1};
        int expectedTotalHours = 49;

        // Perform action and verify outcome
        int totalHours = 0;
        for (int i = 0; i < numTasks; i++) {
            Task task = new Task("Task " + (i + 1), i, "Test description", "John Doe", durations[i], "To Do");
            totalHours += task.getTaskDuration();
        }
        assertEquals(expectedTotalHours, totalHours);
    }
}
