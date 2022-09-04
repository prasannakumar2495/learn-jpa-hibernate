package com.pk.springboot.learnspahibernate.course.springdatajpa;

import com.pk.springboot.learnspahibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataJpaRepo extends JpaRepository<Course, Long> {

    List<Course> findByAuthor(String author);
    List<Course> findByName(String author);
}
