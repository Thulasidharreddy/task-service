package com.neurasim.taskmanagementservice.service;

import com.neurasim.taskmanagementservice.model.TaskDetails;

import java.util.List;
import java.util.Map;

public interface TaskService {
    Boolean createTask(Long userId, TaskDetails taskDetails);
    Map<String, List<TaskDetails>> getAllTasksOfAllUsers();
    TaskDetails getTaskById(Long taskId);
    Boolean updateTaskById(Long id, TaskDetails taskDetails);
    Boolean deleteTaskById(Long id);
}
