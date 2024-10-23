package com.neurasim.taskmanagementservice.service;

import com.neurasim.taskmanagementservice.model.UserDetails;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(
        name = "UserManagementClient",
        url = "${user.management.service.url}"
)
public interface UserManagementFeignClient {
    @GetMapping("/users")
    ResponseEntity<List<UserDetails>> fetchAllUsers();
    @GetMapping("/users/{id}")
    ResponseEntity<UserDetails> fetchUserById(@PathVariable("id") Long userId);
}
