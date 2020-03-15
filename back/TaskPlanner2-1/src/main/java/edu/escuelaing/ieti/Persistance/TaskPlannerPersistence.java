package edu.escuelaing.ieti.Persistance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.escuelaing.ieti.models.Task;
import edu.escuelaing.ieti.models.User;



public class TaskPlannerPersistence {

    private Map<String, User> users = new HashMap<String, User>();
    
    private Map<String, Task> tasks = new HashMap<String, Task>();

    public TaskPlannerPersistence() {
        User user0 = new User("00001", "Andres Villamil", "andresv9716@gmail.com", "admin");
        User user1 = new User("00002", "Luis", "luis@gmail.com", "admin");
        User user2 = new User("00003", "Ana", "ana@gmail.com", "admin");
        User user3 = new User("00004", "Vale", "vale@gmail.com", "admin");
        users.put(user0.getID(), user0);
        users.put(user1.getID(), user1);
        users.put(user2.getID(), user2);
        users.put(user3.getID(), user3);

        String dueDate1 = "2020-5-10";
        String dueDate2 = "2019-5-10";
        Task task0 = new Task("0","In progress","Comprar kraken", dueDate1,user0.getEmail());
        Task task1 = new Task("1", "Ready","Terminar semstre",  dueDate1, user3.getEmail());
        Task task2 = new Task("2", "Done","Terminar proyecto arsw",  dueDate2, user2.getEmail());
        
        tasks.put(task0.getId(),task0);
        tasks.put(task1.getId(), task1);
        tasks.put(task2.getId(), task2);
        user0.addTask(task0);
        user3.addTask(task1);
        user2.addTask(task2);
    }   

    public ArrayList<User> getAllUsers() {
        ArrayList<User> Users = new ArrayList<User>();
        for (String key : users.keySet()) {
            Users.add(users.get(key));
        }
        return Users;
    }

    public User getUserById(String userId) {
        User user = users.get(userId);
        return user;
    }

    public User addUser(User newUser) {
        users.put(newUser.getID(), newUser);
        return newUser;
    }

    public User updateUser(User updateUser) {
        users.replace(updateUser.getID(), updateUser);
        return updateUser;
    }

    public void deleteUser(String userId) {
        users.remove(userId);
    }

    public List<Task> getAllTasks() {
        List<Task> listTasks = new ArrayList<Task>();
        for (String key : tasks.keySet()) {
            listTasks.add(tasks.get(key));
        }
        return listTasks;
    }

    public Task getTaskById(String taskId) {
        Task task = tasks.get(taskId);
        return task;
    }

    public List<Task> getTaskByUserId(String userId) {
        User user = users.get(userId);
        List<Task> listTasks = user.getTasks();
        return listTasks;
    }

    public Task assignTask(String taskId, String userId) {
        User user = users.get(userId);
        Task task = tasks.get(taskId);
        user.addTask(task);
        return task;
    }


    public void addTask(Task task) {
        tasks.put(task.getId(), task);
    }

    public Task updateTask(Task task) {
        return tasks.replace(task.getId(), task);
        
    }

    public void deleteTask(String taskId) {
        tasks.remove(taskId);
    }
    

}