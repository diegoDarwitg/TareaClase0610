package com.EjercicioAyudantia.ISoft.controller;

import com.EjercicioAyudantia.ISoft.dto.TaskRequest;
import com.EjercicioAyudantia.ISoft.model.Task;
import com.EjercicioAyudantia.ISoft.service.TaskService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Task createTask(@RequestBody TaskRequest request) {
        return taskService.createTask(request);
    }
}