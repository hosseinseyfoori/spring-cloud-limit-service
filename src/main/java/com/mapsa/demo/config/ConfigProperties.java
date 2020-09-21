package com.mapsa.demo.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ConfigurationProperties("limit-service")
@Configuration
@Data
public class ConfigProperties {
    int max;
    int min;
}
