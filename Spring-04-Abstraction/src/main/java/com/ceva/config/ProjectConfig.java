package com.ceva.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.ceva")
@ComponentScan(basePackages = {"com.ceva.proxy","com.ceva.service", "com.ceva.repository"})
public class ProjectConfig {



}
