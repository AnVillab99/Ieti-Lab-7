package edu.escuelaing.ieti.models;

import java.util.ArrayList;
import java.util.List;

public class User {

    List<Task> tasks = new ArrayList<Task>();
    private String name;
    private String email;
    private String password;
    private String ID;

    public User(){}
    public User(String i,String n, String e, String p){
        name =n;
        email=e;
        password =p;
        ID = i;
    }

    public User(String n, String e, String p, String i,ArrayList<Task> t){
        name =n;
        email=e;
        password =p;
        ID = i;
        tasks=t;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public void addTask(Task t){
        tasks.add(t);
    }

    public List<Task> getTasks(){
        return tasks;
    }

}