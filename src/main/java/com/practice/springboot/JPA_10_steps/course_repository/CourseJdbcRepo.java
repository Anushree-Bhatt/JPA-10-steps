package com.practice.springboot.JPA_10_steps.course_repository;

import com.practice.springboot.JPA_10_steps.CoursePojo.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepo {

    @Autowired
    JdbcTemplate jdbcTemplate;

    private String insert_sql =
            """
            insert into course(id, name, author)
            values (?, ?, ?);
            """;

    public void insert(Course course){
        jdbcTemplate.update(insert_sql, course.getId(), course.getName(), course.getAuthor());
    }


}
