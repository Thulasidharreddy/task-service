package com.neurasim.taskmanagementservice.controller;

import com.neurasim.taskmanagementservice.model.Status;
import com.neurasim.taskmanagementservice.model.TaskDetails;
import com.neurasim.taskmanagementservice.service.UserTasksService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user_tasks")
@RequiredArgsConstructor
public class UserTasksController {
    private final UserTasksService userTaskService;

    @GetMapping("/{user_id}")
    ResponseEntity<List<TaskDetails>> getTasksByUserId(@PathVariable("user_id") Long userId) {
        try {
            List<TaskDetails> listOfTasks = userTaskService.getTasksByUserId(userId);
            return new ResponseEntity<>(listOfTasks, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{user_id}")
    ResponseEntity<Status> deleteTasksByUserId(@PathVariable("user_id") Long userId) {
        try {
            Boolean isSuccess = userTaskService.deleteTasksByUserId(userId);
            return new ResponseEntity<>(new Status(isSuccess), HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(new Status(false), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
