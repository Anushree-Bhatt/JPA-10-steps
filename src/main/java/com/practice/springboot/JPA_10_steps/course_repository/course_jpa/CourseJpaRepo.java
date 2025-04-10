package com.practice.springboot.JPA_10_steps.course_repository.course_jpa;

import com.practice.springboot.JPA_10_steps.CoursePojo.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepo {

//    @Autowired
    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Course course) {
        entityManager.merge(course);
    }

    public Course findById(long l) {
        return entityManager.find(Course.class, l);
    }

    public void deleteById(long l) {
        Course c = findById(l);
        entityManager.remove(c);
    }


}
