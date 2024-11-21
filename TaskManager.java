/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login_project2;
import java.util.*;

/**
 *
 * @author tshiamo
 */

public class TaskManager {
    private Task[] tasks;
    private String[] developers;
    private String[] taskNames;
    private String[] taskIDs;
    private int[] taskDurations;
    private String[] taskStatuses;

    public TaskManager() {
        tasks = new Task[0];
    }

    public void addTask(Task task) {
        Task[] newTasks = new Task[tasks.length + 1];
        System.arraycopy(tasks, 0, newTasks, 0, tasks.length);
        newTasks[tasks.length] = task;
        tasks = newTasks;

        updateArrays();
    }

    private void updateArrays() {
        developers = new String[tasks.length];
        taskNames = new String[tasks.length];
        taskIDs = new String[tasks.length];
        taskDurations = new int[tasks.length];
        taskStatuses = new String[tasks.length];

        for (int i = 0; i < tasks.length; i++) {
            developers[i] = tasks[i].getDeveloperDetails();
            taskNames[i] = tasks[i].getTaskName();
            taskIDs[i] = tasks[i].getTaskID();
            taskDurations[i] = tasks[i].getTaskDuration();
            taskStatuses[i] = tasks[i].getTaskStatus();
        }
    }

    public void displayDoneTasks() {
        for (int i = 0; i < tasks.length; i++) {
            if (taskStatuses[i].equals("Done")) {
                System.out.println("Developer: " + developers[i]);
                System.out.println("Task Name: " + taskNames[i]);
                System.out.println("Task Duration: " + taskDurations[i]);
            }
        }
    }

    public void displayLongestTask() {
        int maxDurationIndex = 0;
        for (int i = 1; i < tasks.length; i++) {
            if (taskDurations[i] > taskDurations[maxDurationIndex]) {
                maxDurationIndex = i;
            }
        }
        System.out.println("Developer: " + developers[maxDurationIndex]);
        System.out.println("Task Duration: " + taskDurations[maxDurationIndex]);
    }

    public void searchTaskByName(String taskName) {
        for (int i = 0; i < tasks.length; i++) {
            if (taskNames[i].equals(taskName)) {
                System.out.println("Task Name: " + taskNames[i]);
                System.out.println("Developer: " + developers[i]);
                System.out.println("Task Status: " + taskStatuses[i]);
            }
        }
    }

    public void searchTasksByDeveloper(String developer) {
        for (int i = 0; i < tasks.length; i++) {
            if (developers[i].equals(developer)) {
                System.out.println("Task Name: " + taskNames[i]);
                System.out.println("Task Status: " + taskStatuses[i]);
            }
        }
    }

    public void deleteTask(String taskName) {
        int indexToDelete = -1;
        for (int i = 0; i < tasks.length; i++) {
            if (taskNames[i].equals(taskName)) {
                indexToDelete = i;
                break;
            }
        }
        if (indexToDelete != -1) {
            Task[] newTasks = new Task[tasks.length - 1];
            System.arraycopy(tasks, 0, newTasks, 0, indexToDelete);
            System.arraycopy(tasks, indexToDelete + 1, newTasks, indexToDelete, tasks.length - indexToDelete - 1);
            tasks = newTasks;
            updateArrays();
            System.out.println("Entry successfully deleted");
        }
    }

    public void displayReport() {
        for (int i = 0; i < tasks.length; i++) {
            System.out.println("Task Name: " + taskNames[i]);
            System.out.println("Developer: " + developers[i]);
            System.out.println("Task ID: " + taskIDs[i]);
            System.out.println("Task Duration: " + taskDurations[i]);
            System.out.println("Task Status: " + taskStatuses[i]);
        }
    }
    // Get task by name
    public Task getTaskByName(String taskName) {
        for (Task task : tasks) {
            if (task.getTaskName().equalsIgnoreCase(taskName)) {
                return task;
            }
        }
        return null;
    }

    void deleteTaskByName(String taskName) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
