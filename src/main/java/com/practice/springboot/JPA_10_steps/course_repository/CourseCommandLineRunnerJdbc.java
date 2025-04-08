package com.practice.springboot.JPA_10_steps.course_repository;

import com.practice.springboot.JPA_10_steps.CoursePojo.Course;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunnerJdbc implements CommandLineRunner {
    @Autowired
    private CourseJdbcRepo courseJdbcRepo;

    private static Logger logger = LoggerFactory.getLogger(CourseCommandLineRunnerJdbc.class);

    @Override
    public void run(String... args) throws Exception {
        //insert
        courseJdbcRepo.insert(new Course(1000L, "Learn AWS", "in28Minutes"));
        courseJdbcRepo.insert(new Course(1001L, "Learn Devops", "in28Minutes"));
        courseJdbcRepo.insert(new Course(1002L, "Learn SpringBoot", "in28Minutes"));

        //delete
        courseJdbcRepo.deleteById(1002L);

        //select
        Course c = courseJdbcRepo.findById(1000L);
        logger.info("Course-1000L details are: {}", c);


    }
}
