package com.neurasim.taskmanagementservice.service.impl;

import com.neurasim.taskmanagementservice.model.TaskDetails;
import com.neurasim.taskmanagementservice.model.UserDetails;
import com.neurasim.taskmanagementservice.repository.TaskRepository;
import com.neurasim.taskmanagementservice.service.TaskService;
import com.neurasim.taskmanagementservice.service.UserManagementFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;
    private final UserManagementFeignClient httpClient;

    @Override
    public Boolean createTask(Long userId, TaskDetails taskDetails) {
        try {
            UserDetails userDetails = httpClient.fetchUserById(userId).getBody();
            if (userDetails != null) {
                return taskRepository.createTaskForUser(taskDetails);
            } else {
                return false;
            }
        } catch (Exception ex) {
            System.out.printf("Exception occurred while creating a task for given userId. UserId: %s", userId);
            throw new RuntimeException(String.format("Exception message: %s", ex.getMessage()), ex);
        }
    }

    @Override
    public Map<String, List<TaskDetails>> getAllTasksOfAllUsers() {
        try {
            List<UserDetails> allUsers = httpClient.fetchAllUsers().getBody();
            if (allUsers == null) {
                return new HashMap<>();
            }
            List<Long> userIds = new ArrayList<>();
            for (UserDetails userDetails: allUsers) {
                userIds.add(userDetails.getId());
            }
            return taskRepository.getAllTasksOfAllUsers(userIds);
        } catch (Exception ex) {
            System.out.printf("Exception occurred while fetching all tasks of all the users present in the system. : %s", System.currentTimeMillis());
            throw new RuntimeException(ex);
        }
    }

    @Override
    public TaskDetails getTaskById(Long taskId) {
        try {
            return taskRepository.getTaskById(taskId);
        } catch (Exception ex) {
            System.out.printf("Exception occurred while fetching task by taskId. Task Id: %s. Current time epoch: %s", taskId, System.currentTimeMillis());
            throw new RuntimeException(ex);
        }
    }

    @Override
    public Boolean updateTaskById(Long id, TaskDetails taskDetails) {
        try {
            UserDetails userDetails = httpClient.fetchUserById(taskDetails.getUserId()).getBody();
            if (userDetails != null) {
                return taskRepository.updateTaskById(taskDetails);
            } else {
                throw new Exception(String.format("User not present. UserId: %s", taskDetails.getUserId()));
            }
        } catch (Exception ex) {
            System.out.printf("Exception occurred while updated task by taskId. Task Id: %s, Current time epoch: %s", id, System.currentTimeMillis());
            throw new RuntimeException(ex);
        }
    }

    @Override
    public Boolean deleteTaskById(Long id) {
        try {
            return taskRepository.deleteTaskById(id);
        } catch (Exception ex) {
            System.out.printf("Exception occurred while deleting task by given task Id. Task Id: %s, Current time epoch: %s", id, System.currentTimeMillis());
            throw new RuntimeException(ex);
        }
    }
}
