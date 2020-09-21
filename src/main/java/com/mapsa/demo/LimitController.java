package com.mapsa.demo;


import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.mapsa.demo.config.ConfigProperties;
import com.mapsa.demo.model.ConfigLimit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("limit")
public class LimitController {


    @Autowired
    ConfigProperties properties;

    @GetMapping()
    public ConfigLimit getConfig(){
        return ConfigLimit.builder().max(properties.getMax()).min(properties.getMin()).build();
    }
}
