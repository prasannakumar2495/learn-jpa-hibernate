package com.pk.springboot.learnspahibernate.course.repository;

import com.pk.springboot.learnspahibernate.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepo {
    @Autowired
    private EntityManager entityManager;

    public void insert(Course course) {
        /*
         * to insert a row, we use "merge" function.
         */
        entityManager.merge(course);
    }

    public Course findById(long id) {
        return entityManager.find(Course.class, id);
    }

    public void deleteById(long id) {
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);
    }
}
