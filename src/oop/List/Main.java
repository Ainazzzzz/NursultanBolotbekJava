package oop.List;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   TaskService taskService = new TaskService();
        while (true) {
        try {
            System.out.println("""
                        1 -> Add new task
                        2 -> change tasks status
                        3 -> change tasks priority
                        4 -> get all available status
                        5 -> delete task
                        6 -> delete all tasks by status
                        7 -> sort by priority
                        8 -> sort by status
                        9 -> get All tasks""");

            int command = new Scanner(System.in).nextInt();
            switch (command) {
                case 1 -> System.out.println(taskService.addNewTask());
                case 2 -> System.out.println(taskService.changeTaskStatus());
                case 3 -> System.out.println(taskService.changeTasksPriority());
                case 4 -> System.out.println(taskService.getAllTaskStatus());
                case 5 -> taskService.deleteTask();
                case 6 -> taskService.deleteAllTasksByStatus();
                case 7 -> System.out.println(taskService.sortByPriority());
                case 8 -> System.out.println(taskService.sortByStatus());
                case 9 -> System.out.println(taskService.getAll());
            }
        } catch (InputMismatchException e) {
            System.out.println("Write only numbers");
        }
    }
}
}
