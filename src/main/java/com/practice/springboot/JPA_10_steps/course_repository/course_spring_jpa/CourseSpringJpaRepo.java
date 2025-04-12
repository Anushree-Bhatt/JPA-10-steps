package com.practice.springboot.JPA_10_steps.course_repository.course_spring_jpa;

import com.practice.springboot.JPA_10_steps.CoursePojo.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringJpaRepo extends JpaRepository<Course, Long> {
}
