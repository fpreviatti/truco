//package com.truco.config;
//
//import com.fasterxml.jackson.databind.Module;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.datatype.guava.GuavaModule;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//// More-obvious imports missing
//
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
//public class Application extends SpringBootServletInitializer {
//
//    public static void main(final String[] args) {
//        SpringApplication.run(Application.class, args);
//    }
//
//    @Override
//    protected final SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
//        return application.sources(Application.class);
//    }
//
//    @Bean
//    public Module guavaModule() {
//        return new GuavaModule();
//    }
//}