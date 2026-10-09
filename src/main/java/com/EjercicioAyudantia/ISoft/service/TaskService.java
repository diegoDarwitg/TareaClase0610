package com.EjercicioAyudantia.ISoft.service;

import com.EjercicioAyudantia.ISoft.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    private final List<Task> tasks = new ArrayList<>();
    private Long nextId = 1L;

    public List<Task> getTasks() {
        return tasks;
    }
}