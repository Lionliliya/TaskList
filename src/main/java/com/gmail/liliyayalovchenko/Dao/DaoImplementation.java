package com.gmail.liliyayalovchenko.Dao;

import com.gmail.liliyayalovchenko.Domain.Task;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DaoImplementation implements Dao, Serializable {

    private List<Task> toDoList = new ArrayList<>();

    @Override
    public boolean addTask(Task task) {
        if (!toDoList.contains(task)) {
            return toDoList.add(task);
        } else {
           return false;
        }
    }

    @Override
    public boolean markAsCompleted(Task task) {
        if (toDoList.contains(task)) {
            toDoList.stream().filter(task1 -> task1.equals(task)).forEach(task1 -> task1.setDone(true));
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean removeTask(Task task) {
        if (toDoList.contains(task)) {
            return toDoList.remove(task);
        } else {
            return false;
        }
    }
    @Override
    public List<Task> getToDoList() {
        return toDoList;
    }

    @Override
    public List<Task> getAllTAsks() {
        return toDoList;
    }
}
