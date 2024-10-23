package com.neurasim.taskmanagementservice.service;


import com.neurasim.taskmanagementservice.model.TaskDetails;

import java.util.List;

public interface UserTasksService {
    List<TaskDetails> getTasksByUserId(Long userId);
    Boolean deleteTasksByUserId(Long userId);
}
