package com.neurasim.taskmanagementservice.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserDetails {
    private Long id;
    private String name;
    private String email;
    private LocalDateTime createdAt;
}