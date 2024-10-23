package com.neurasim.taskmanagementservice.service.impl;

import com.neurasim.taskmanagementservice.model.TaskDetails;
import com.neurasim.taskmanagementservice.repository.TaskRepository;
import com.neurasim.taskmanagementservice.service.UserTasksService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserTasksServiceImpl implements UserTasksService {
    private final TaskRepository taskRepository;
    @Override
    public List<TaskDetails> getTasksByUserId(Long userId) {
        try {
            return taskRepository.getAllTasksForUserId(userId);
        } catch (Exception ex) {
            System.out.printf("Exception occurred while fetching all tasks of the given user. UserId: %s. Time: %s", userId, System.currentTimeMillis());
            throw new RuntimeException(ex);
        }
    }

    @Override
    public Boolean deleteTasksByUserId(Long userId) {
        try {
            return taskRepository.deleteAllTasksForUserId(userId);
        } catch (Exception ex) {
            System.out.printf("Exception occurred while deleting all tasks for the given user. UserId: %s. Time: %s", userId, System.currentTimeMillis());
            throw new RuntimeException(ex);
        }
    }
}
