package com.neurasim.taskmanagementservice.model;

import lombok.Data;

@Data
public class Status {
    public Status(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }
    boolean isSuccess;
}
