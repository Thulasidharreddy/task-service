package com.neurasim.taskmanagementservice.configuration;

import feign.Logger;
import feign.Request;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignGlobalConfiguration extends FeignClientsConfiguration {

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL; // Log all requests and responses
    }

    // Set connection and read timeouts
    @Bean
    public Request.Options requestOptions() {
        return new Request.Options(5000, 30000); // connection timeout, read timeout
    }
}
