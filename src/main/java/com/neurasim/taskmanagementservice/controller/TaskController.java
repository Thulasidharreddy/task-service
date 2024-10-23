package com.neurasim.taskmanagementservice.controller;

import com.neurasim.taskmanagementservice.model.Status;
import com.neurasim.taskmanagementservice.model.TaskDetails;
import com.neurasim.taskmanagementservice.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/tasks")
@RequiredArgsConstructor
public class TaskController {
    private final TaskService taskService;

    @PostMapping("/{user_id}")
    ResponseEntity<Status> createTaskForUser(@PathVariable("user_id") Long userId, @RequestBody TaskDetails taskDetails) {
        try {
            Boolean isSuccess = taskService.createTask(userId, taskDetails);
            return new ResponseEntity<>(new Status(isSuccess), HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(new Status(false), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping
    ResponseEntity<Map<String, List<TaskDetails>>> getAllTasksOfAllUsers() {
        try {
            Map<String, List<TaskDetails>> allTasksOfAllUsers = taskService.getAllTasksOfAllUsers();
            return new ResponseEntity<>(allTasksOfAllUsers, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    ResponseEntity<TaskDetails> getTaskById(@PathVariable("id") Long taskId) {
        try {
            TaskDetails taskDetails = taskService.getTaskById(taskId);
            return new ResponseEntity<>(taskDetails, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    ResponseEntity<Status> updateTaskById(@PathVariable("id") Long taskId, @RequestBody TaskDetails taskDetails){
        try {
            Boolean isSuccess = taskService.updateTaskById(taskId, taskDetails);
            return new ResponseEntity<>(new Status(isSuccess), HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(new Status(false), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Status> deleteTaskById(@PathVariable("id") Long taskId){
        try {
            Boolean isSuccess = taskService.deleteTaskById(taskId);
            return new ResponseEntity<>(new Status(isSuccess), HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(new Status(false), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
