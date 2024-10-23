package com.neurasim.taskmanagementservice.repository.impl;

import com.neurasim.jooq.user_task_management.Tables;
import com.neurasim.jooq.user_task_management.enums.TaskStatus;
import com.neurasim.taskmanagementservice.model.TaskDetails;
import com.neurasim.taskmanagementservice.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import static com.neurasim.jooq.user_task_management.tables.Task.TASK;

@Repository
@RequiredArgsConstructor
public class TaskRepositoryImpl implements TaskRepository {
    private final DSLContext dslContext;

    @Override
    public Boolean createTaskForUser(TaskDetails taskDetails) {
        try {
            dslContext.insertInto(Tables.TASK)
                    .set(Tables.TASK.TITLE, taskDetails.getTitle())
                    .set(Tables.TASK.DESCRIPTION, taskDetails.getDescription())
                    .set(Tables.TASK.STATUS, TaskStatus.lookupLiteral(taskDetails.getStatus()))
                    .set(Tables.TASK.USER_ID, taskDetails.getUserId())
                    .set(Tables.TASK.CREATED_AT, fetchLocalDateTime())
                    .execute();
            return Boolean.TRUE;
        } catch (Exception ex) {
            System.out.printf("Exception occurred while creating task entry in DB. TaskDetails: %s. Time: %s", taskDetails, fetchLocalDateTime());
            throw new RuntimeException(ex);
        }
    }

    @Override
    public TaskDetails getTaskById(Long id) {
        try {
            TaskStatus taskStatus = dslContext.select()
                    .from(Tables.TASK)
                    .where(Tables.TASK.ID.eq(id))
                    .fetchOne(Tables.TASK.STATUS);
            return (Objects.requireNonNull(dslContext.selectFrom(Tables.TASK)
                    .where(Tables.TASK.ID.eq(id))
                    .fetchOne()))
                    .map(record -> {
                        TaskDetails taskDetails = new TaskDetails();
                        taskDetails.setId(record.get(TASK.ID));
                        taskDetails.setTitle(record.get(TASK.TITLE));
                        taskDetails.setDescription(record.get(TASK.DESCRIPTION));
                        taskDetails.setStatus(taskStatus.getLiteral());
                        taskDetails.setUserId(record.get(TASK.USER_ID));
                        taskDetails.setCreatedAt(record.get(TASK.CREATED_AT));
                        return taskDetails;
                    });
        } catch (Exception ex) {
            System.out.printf("Exception occurred while fetch task by Id. Exception message: %s", ex.getMessage());
            throw new RuntimeException(ex);
        }
    }

    @Override
    public Boolean updateTaskById(TaskDetails taskDetails) {
        try {
            dslContext.update(Tables.TASK)
                    .set(Tables.TASK.TITLE, taskDetails.getTitle())
                    .set(Tables.TASK.DESCRIPTION, taskDetails.getDescription())
                    .set(Tables.TASK.STATUS, TaskStatus.lookupLiteral(taskDetails.getStatus()))
                    .set(Tables.TASK.USER_ID, taskDetails.getUserId())
                    .where(Tables.TASK.ID.eq(taskDetails.getId()))
                    .execute();
            return Boolean.TRUE;
        } catch (Exception ex) {
            System.out.printf("Exception occurred while updating task by Id. TaskDetails: %s, Time: %s", taskDetails, fetchLocalDateTime());
            throw new RuntimeException(ex);
        }
    }

    @Override
    public Boolean deleteTaskById(Long id) {
        try {
            dslContext.deleteFrom(Tables.TASK)
                    .where(Tables.TASK.ID.eq(id))
                    .execute();
            return Boolean.TRUE;
        } catch (Exception ex) {
            System.out.printf("Exception occurred while deleting task by Id. Id: %s, Time: %s", id, fetchLocalDateTime());
            throw new RuntimeException(ex);
        }
    }

    @Override
    public Map<String, List<TaskDetails>> getAllTasksOfAllUsers(List<Long> userIds) {
        Map<String, List<TaskDetails>> tasksOfAllUsers = new HashMap<>();
        try {
            for (Long userId : userIds) {
                List<TaskDetails> taskDetailsList = getAllTasksForUserId(userId);
                tasksOfAllUsers.put(String.valueOf(userId), taskDetailsList);
            }
            return tasksOfAllUsers;
        } catch (Exception ex) {
            System.out.printf("Exception occurred while fetching tasks for all users. Time: %s", fetchLocalDateTime());
            throw new RuntimeException(ex);
        }
    }

    @Override
    public List<TaskDetails> getAllTasksForUserId(Long userId) {
        try {
            return Objects.requireNonNull(dslContext.selectFrom(Tables.TASK)
                            .where(Tables.TASK.USER_ID.eq(userId))
                            .fetch())
                    .map(taskRecord ->
                    {
                        TaskStatus taskStatus = dslContext.select()
                                .from(Tables.TASK)
                                .where(Tables.TASK.ID.eq(taskRecord.get(TASK.ID)))
                                .fetchOne(Tables.TASK.STATUS);
                        TaskDetails taskDetails = new TaskDetails();
                        taskDetails.setId(taskRecord.get(TASK.ID));
                        taskDetails.setTitle(taskRecord.get(TASK.TITLE));
                        taskDetails.setDescription(taskRecord.get(TASK.DESCRIPTION));
                        taskDetails.setStatus((taskStatus.getLiteral()));
                        taskDetails.setUserId(taskRecord.get(TASK.USER_ID));
                        taskDetails.setCreatedAt(taskRecord.get(TASK.CREATED_AT));
                        return taskDetails;
                    });
        } catch (Exception ex) {
            System.out.printf("Exception occurred while fetching all tasks by userId. UserId: %s, Time: %s", userId, fetchLocalDateTime());
            throw new RuntimeException(ex);
        }
    }

    @Override
    public Boolean deleteAllTasksForUserId(Long userId) {
        try {
            dslContext.deleteFrom(Tables.TASK)
                    .where(Tables.TASK.USER_ID.eq(userId))
                    .execute();
            return Boolean.TRUE;
        } catch (Exception ex) {
            System.out.printf("Exception occurred while performing deleteAllTasksForUserId. UserId: %s, Time: %s", userId, fetchLocalDateTime());
            throw new RuntimeException(ex);
        }
    }

    private LocalDateTime fetchLocalDateTime() {
        long currentTimeMillis = System.currentTimeMillis();
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(currentTimeMillis), ZoneId.systemDefault());
    }
}
