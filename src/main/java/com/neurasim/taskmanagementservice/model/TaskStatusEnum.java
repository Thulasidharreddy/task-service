package com.neurasim.taskmanagementservice.model;

import lombok.Getter;

@Getter
public enum TaskStatusEnum{
    PENDING("PENDING"),
    IN_PROGRESS("IN_PROGRESS"),
    COMPLETED("CREATED");

    private final String name;

    TaskStatusEnum(String name) {
        this.name = name;
    }
}
