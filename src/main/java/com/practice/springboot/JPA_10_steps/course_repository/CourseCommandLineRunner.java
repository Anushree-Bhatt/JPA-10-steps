package com.practice.springboot.JPA_10_steps.course_repository;

import com.practice.springboot.JPA_10_steps.CoursePojo.Course;
import com.practice.springboot.JPA_10_steps.course_repository.course_jdbc.CourseJdbcRepo;
import com.practice.springboot.JPA_10_steps.course_repository.course_jpa.CourseJpaRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
//    @Autowired
//    private CourseJdbcRepo courseJdbcRepo;

    @Autowired
    private CourseJpaRepo courseJpaRepo;

    private static Logger logger = LoggerFactory.getLogger(CourseCommandLineRunner.class);

    @Override
    public void run(String... args) throws Exception {
        //insert
        courseJpaRepo.insert(new Course(1000L, "Learn AWS", "in28Minutes"));
        courseJpaRepo.insert(new Course(1001L, "Learn Devops", "in28Minutes"));
        courseJpaRepo.insert(new Course(1002L, "Learn SpringBoot", "in28Minutes"));
        courseJpaRepo.insert(new Course(1003L, "Learn Microservices", "in28Minutes"));

        //delete
        courseJpaRepo.deleteById(1002L);

        //select
        Course c = courseJpaRepo.findById(1000L);
        logger.info("Course-1000L details are: {}", c);


    }
}
