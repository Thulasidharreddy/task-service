package com.neurasim.taskmanagementservice.repository;

import com.neurasim.taskmanagementservice.model.TaskDetails;

import java.util.List;
import java.util.Map;

public interface TaskRepository {
  Boolean createTaskForUser(TaskDetails taskDetails);
  TaskDetails getTaskById(Long id);
  Boolean updateTaskById(TaskDetails taskDetails);
  Boolean deleteTaskById(Long id);
  Map<String, List<TaskDetails>> getAllTasksOfAllUsers(List<Long> userIds);
  List<TaskDetails> getAllTasksForUserId(Long userId);
  Boolean deleteAllTasksForUserId(Long userId);
}
