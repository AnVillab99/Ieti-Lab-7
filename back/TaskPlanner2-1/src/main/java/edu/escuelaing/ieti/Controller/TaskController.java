package edu.escuelaing.ieti.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.escuelaing.ieti.models.Task;
import edu.escuelaing.ieti.services.TaskService;



@RestController 
@RequestMapping(value = "/task") 
public class TaskController {
    
    @Autowired
    private TaskService taskService;


    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Task>> getTasks() {
        List<Task> tasks = taskService.getAll();
        return new ResponseEntity<>(tasks, HttpStatus.ACCEPTED);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{taskId}")
    public ResponseEntity<Task> getTaskById(@PathVariable String taskId) {
        Task task = taskService.getById(taskId);
        return new ResponseEntity<>(task, HttpStatus.ACCEPTED);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{userId}")
    public ResponseEntity<List<Task>> getTasksUser(@PathVariable String userId) {
        List<Task> tasks = taskService.getByUserId(userId);
        return new ResponseEntity<>(tasks, HttpStatus.ACCEPTED);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{userId}")
    public ResponseEntity<Task> postUserTask(@RequestBody Task newTask, @PathVariable String userId) {
        List<Task> tasks = taskService.getByUserId(userId);
        tasks.add(newTask);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{taskId}")
    public ResponseEntity<?> deleteTask(@PathVariable String taskId) {
        taskService.remove(taskId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> updateTask(@RequestBody Task taskUpdate) {
        taskService.update(taskUpdate);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }    
}