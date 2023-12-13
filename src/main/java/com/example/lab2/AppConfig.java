package com.example.lab2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.example.lab2")
@PropertySource("classpath:application.properties")
public class AppConfig {

}