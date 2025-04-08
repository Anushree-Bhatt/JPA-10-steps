package com.practice.springboot.JPA_10_steps.course_repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepo {

    @Autowired
    JdbcTemplate jdbcTemplate;

    private String sql =
            """
            insert into course(id, name, author)
            values (1000L, 'Learn Spring-boot', 'Anushree');
            """;

    public void insert(){
        jdbcTemplate.update(sql);
    }
}
