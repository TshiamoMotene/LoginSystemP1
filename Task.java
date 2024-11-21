/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login_project2;

import java.util.*;

/**
 * The Task class represents a task in a project management system.
 * It contains attributes related to the task such as name, number, description,
 * developer details, duration, status, and a generated task ID.
 * It also provides methods to validate task description length, generate a task ID,
 * print task details, and retrieve task duration.
 * 
 * Author tshiamo
 */
public class Task {
    // Attributes of the Task class
    private String taskName;         // Name of the task
    private int taskNumber;          // Unique number assigned to the task
    private String taskDescription;   // Description of the task
    private String developerDetails;  // Details of the developer assigned to the task
    private int taskDuration;         // Duration to complete the task (in hours)
    private String taskStatus;        // Current status of the task (e.g., "In Progress", "Completed")
    private String taskID;            // Unique identifier for the task

    // Constructor to initialize a new Task object with provided values
    public Task(String taskName, String taskDescription, String developerDetails, int taskNumber, String taskStatus) {
        this.taskName = taskName;                 // Set the task name
        this.taskNumber = taskNumber;             // Set the task number
        this.taskDescription = taskDescription;    // Set the task description
        this.developerDetails = developerDetails;  // Set the developer details
        this.taskDuration = taskDuration;          // Set the task duration
        this.taskStatus = taskStatus;              // Set the task status
        this.taskID = createTaskID();              // Generate a unique task ID
    }

    // Method to check if the task description length is within the allowed limit (50 characters)
    public boolean checkTaskDescription() {
        return taskDescription.length() <= 50;  // Return true if description is valid, false otherwise
    }

    // Method to generate a unique task ID based on task name, task number, and developer details
    public String createTaskID() {
        String taskInitials = taskName.substring(0, 2).toUpperCase();  // Get the first two letters of the task name
        String developerEnd = developerDetails.substring(developerDetails.length() - 3).toUpperCase();  // Get the last three letters of the developer's details
        return taskInitials + ":" + taskNumber + ":" + developerEnd;  // Return the formatted task ID
    }

    // Method to return a formatted string containing all the task details
    public String printTaskDetails() {
        return "Task Status: " + taskStatus + "\n" +
               "Developer Details: " + developerDetails + "\n" +
               "Task Number: " + taskNumber + "\n" +
               "Task Name: " + taskName + "\n" +
               "Task Description: " + taskDescription + "\n" +
               "Task ID: " + taskID + "\n" +
               "Task Duration: " + taskDuration + "hrs\n";  // Include duration in hours
    }

    // Method to return the duration of the task
    public int returnTaskDuration() {
        return taskDuration;  // Return the task duration
    }
    // Getter methods
    public String getDeveloperDetails() {
        return developerDetails;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getTaskID() {
        return taskID;
    }

    public int getTaskDuration() {
        return taskDuration;
    }

    public String getTaskStatus() {
        return taskStatus;
    }
}
