package com.gmail.liliyayalovchenko.Dao;

import com.gmail.liliyayalovchenko.Domain.Task;

import java.util.List;

public interface Dao {

    boolean addTask(Task task);

    boolean markAsCompleted(Task task);

    boolean removeTask(Task task);

    List<Task> getToDoList();

    List<Task> getAllTAsks();
}
