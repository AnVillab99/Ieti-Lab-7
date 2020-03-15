package edu.escuelaing.ieti.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.escuelaing.ieti.Persistance.TaskPlannerPersistence;
import edu.escuelaing.ieti.models.User;
import edu.escuelaing.ieti.services.UserService;

@Service
public class UserServiceImpl implements UserService {

    private TaskPlannerPersistence tpp = new TaskPlannerPersistence();

    @Override
    public List<User> getAll() {
        return tpp.getAllUsers();
    }

    @Override
    public User getById(String userId) {
        return tpp.getUserById(userId);
    }

    @Override
    public User create(User newUser) {
        return tpp.addUser(newUser);
    }

    @Override
    public User update(User user) {
        return tpp.updateUser(user);
    }

    @Override
    public void remove(String userId) {
        tpp.deleteUser(userId);

    }



}