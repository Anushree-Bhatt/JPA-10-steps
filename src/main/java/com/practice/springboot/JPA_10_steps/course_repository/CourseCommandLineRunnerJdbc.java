package com.practice.springboot.JPA_10_steps.course_repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunnerJdbc implements CommandLineRunner {
    @Autowired
    private CourseJdbcRepo courseJdbcRepo;

    @Override
    public void run(String... args) throws Exception {
        courseJdbcRepo.insert();
    }
}
