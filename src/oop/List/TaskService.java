package oop.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TaskService implements TaskInterface{
     private List<Task> tasks = new ArrayList<>();
    @Override
    public Task addNewTask() {
        try {
            System.out.println("Enter description: ");
            String desc = new Scanner(System.in).nextLine();
            System.out.println("Enter priority");
            String priority = new Scanner(System.in).next();
            Priority priority1 = Priority.valueOf(priority);
            if (Arrays.stream(Priority.values()).anyMatch(i->i.equals(priority1))) {
                System.out.println("Enter status");
                String status = new Scanner(System.in).next();
                Status status1 = Status.valueOf(status);
                if (Arrays.stream(Status.values()).anyMatch(y -> y.equals(status1))) {
                    Task task = new Task(tasks.size() + 1, desc, priority1, status1);
                    boolean exist = tasks.stream().anyMatch(x -> x.equals(task));
                    if (exist) {
                        throw new Exception("Already exists!");
                    } else {
                        tasks.add(task);
                        return task;
                    }
                } else {
                    throw new Exception("Program does not have such a status enum!");
                }
            } else {
                throw new IllegalAccessException("Program does not have such a priority enum!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
   return null; }

    @Override
    public List<Status> getAllTaskStatus() {
        return new ArrayList<>(Arrays.asList(Status.values()));
    }

    @Override
    public String changeTaskStatus() {
          System.out.println("Enter id of a task:  ");
          int id = new Scanner(System.in).nextInt();
          for (Task t : tasks) {
              if (t.getId() == id) {
                  System.out.println("This task's status: " + t.getStatus());
                  System.out.println("Choose one of the statues: ");
                  System.out.println("""
                          1 ->  Запланирована,
                          2 -> ПринятаКИсполнению,
                          3 -> Выполнена,
                          4 -> Отменена,
                          5 -> НаКонтроле,
                          6 -> Возвращена,
                          7 -> Проконтролирована""");
                  int number = new Scanner(System.in).nextInt();
                  if (number == 1) {
                      t.setStatus(Status.Запланирована);
                      return "status is successfully changed!\n" + t;
                  } else if (number == 2) {
                      t.setStatus(Status.ПринятаКИсполнению);
                      return t + "\nstatus is successfully changed!";
                  } else if (number == 3) {
                      t.setStatus(Status.Выполнена);
                      return "status is successfully changed!\n" + t;
                  } else if (number == 4) {
                      t.setStatus(Status.Отменена);
                      return "status is successfully changed!\n" + t;
                  } else if (number == 5) {
                      t.setStatus(Status.НаКонтроле);
                      return "status is successfully changed!\n" + t;
                  } else if (number == 6) {
                      t.setStatus(Status.Возвращена);
                      return "status is successfully changed!\n" + t;
                  } else if (number == 7) {
                      t.setStatus(Status.Проконтролирована);
                      return "status is successfully changed!\n" + t;
                  }
              }
          }
      return null;}

    @Override
    public String changeTasksPriority() {
            System.out.println("Enter id of a task:  ");
            int id = new Scanner(System.in).nextInt();
            for (Task t : tasks) {
                if (t.getId() == id) {
                    System.out.println("This task's priority: " + t.getPriority());
                    System.out.println("Choose one of the priorities: ");
                    System.out.println("""
                            1 ->  Низкий,
                            2 -> Средний,
                            3 -> Высокий,
                            4 -> Критичный
                            """);
                    int number = new Scanner(System.in).nextInt();
                    if (number == 1) {
                        t.setPriority(Priority.Низкий);
                        return "status is successfully changed!\n" + t;
                    } else if (number == 2) {
                        t.setPriority(Priority.Средний);
                        return t + "\nstatus is successfully changed!";
                    } else if (number == 3) {
                        t.setPriority(Priority.Высокий);
                        return "status is successfully changed!\n" + t;
                    } else if (number == 4) {
                        t.setPriority(Priority.Критичный);
                        return "status is successfully changed!\n" + t;
                    }
                }
            }
            return null;
        }


        @Override
    public void deleteTask() {
            System.out.println("Enter an id of a task: ");
            int id = new Scanner(System.in).nextInt();
            for (int i=0; i<tasks.size(); i++) {
                if (tasks.get(i).getId()==id) {
                    tasks.remove(tasks.get(i));
                    System.out.println("Task is successfully deleted from the list!");
                }
            }
            }


    @Override
    public void deleteAllTasksByStatus() {
        try {
            System.out.println("Enter status: ");
            String s = new Scanner(System.in).next();
            Status status = Status.valueOf(s);
            if (Arrays.stream(Status.values()).anyMatch(i->i.equals(status))) {
                for (int i=0; i<tasks.size(); i++) {
                  if(tasks.get(i).getStatus().equals(status)){
                      tasks.remove(tasks.get(i));
                  }

                }
                System.out.println(tasks);
            } else {
                throw new Exception("Net takogo statusa!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Task> sortByStatus() {
        try {
            System.out.println("Enter status: ");
            String s = new Scanner(System.in).next();
            Status status = Status.valueOf(s);
            if (Arrays.stream(Status.values()).anyMatch(i->i.equals(status))) {
                List<Task> tasksListOfSimilarStatus = tasks.stream().filter(x -> x.getStatus().equals(status)).toList();
                return tasksListOfSimilarStatus;
            } else {
                throw new Exception("Net takogo statusa!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
  return null;  }

    @Override
    public List<Task> sortByPriority() {
        try {
            System.out.println("Enter priority: ");
            String s = new Scanner(System.in).next();
            Priority priority = Priority.valueOf(s);
            if (Arrays.stream(Priority.values()).anyMatch(i->i.equals(priority))) {
                List<Task> tasksListOfSimilarPriorities = tasks.stream().filter(x -> x.getPriority().equals(priority)).toList();
                return tasksListOfSimilarPriorities;
            } else {
                throw new Exception("Net takogo prioriteta!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;  }

    @Override
    public List<Task> getAll() {
        return tasks;
    }

}
