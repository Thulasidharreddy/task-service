package com.neurasim.taskmanagementservice.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TaskDetails {
    private Long id;
    private String title;
    private String description;
    private String status;
    private Long userId;
    private LocalDateTime createdAt;
}
