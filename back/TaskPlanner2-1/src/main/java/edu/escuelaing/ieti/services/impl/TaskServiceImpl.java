package edu.escuelaing.ieti.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.escuelaing.ieti.Persistance.TaskPlannerPersistence;
import edu.escuelaing.ieti.models.Task;
import edu.escuelaing.ieti.services.TaskService;


@Service
public class TaskServiceImpl implements TaskService {

    private TaskPlannerPersistence tpp = new TaskPlannerPersistence();




    @Override
    public List<Task> getAll() {
        
        return tpp.getAllTasks();
    }

    @Override
    public Task getById(String id) {
        return tpp.getTaskById(id);
    }

    @Override
    public List<Task> getByUserId(String userId) {
        return tpp.getTaskByUserId(userId);
    }

    

    @Override
    public void remove(String taskId) {
        tpp.deleteTask(taskId);

    }

    @Override
    public Task update(Task task) {
        return tpp.updateTask(task);
    }

}