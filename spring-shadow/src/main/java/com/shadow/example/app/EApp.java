package com.shadow.example.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:spring.xml")
@ComponentScan("com.shadow.example.dependsOn")
public class EApp {
}
