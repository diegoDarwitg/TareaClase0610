package com.EjercicioAyudantia.ISoft.service;

import com.EjercicioAyudantia.ISoft.dto.TaskRequest;
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

    public Task createTask(TaskRequest request) {
        Task task = new Task();

        task.setId(nextId++);
        task.setTitulo(request.getTitulo());
        task.setPrioridad(request.getPrioridad());
        task.setFechaLimite(request.getFechaLimite());
        task.setCompletada(false);

        tasks.add(task);

        return task;
    }
}