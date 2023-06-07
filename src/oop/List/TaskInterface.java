package oop.List;

import java.util.List;

public interface TaskInterface {

    Task addNewTask();

    List<Status> getAllTaskStatus();
    String changeTaskStatus();

    String changeTasksPriority();
    void deleteTask();
    void deleteAllTasksByStatus();
    List<Task> sortByStatus();
    List<Task> sortByPriority();
    List<Task> getAll();

}
