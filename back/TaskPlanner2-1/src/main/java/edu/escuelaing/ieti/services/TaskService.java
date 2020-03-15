package edu.escuelaing.ieti.services;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.escuelaing.ieti.models.Task;


@Service
public interface TaskService {
    List<Task> getAll();
    
    Task getById(String id);
    
    List<Task> getByUserId(String userId);
    
    void remove(String taskId);
    
    Task update(Task task);
}