package com.pk.springboot.learnspahibernate.course;

import com.pk.springboot.learnspahibernate.course.repository.CourseJpaRepo;
import com.pk.springboot.learnspahibernate.course.springdatajpa.CourseSpringDataJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private Course_JdbcRepo course_jdbcRepo;

//    @Autowired
//    private CourseJpaRepo courseJpaRepo;

    @Autowired
    private CourseSpringDataJpaRepo courseSpringDataJpaRepo;

    @Override
    public void run(String... args) throws Exception {
        courseSpringDataJpaRepo.save(new Course(1, "Learn SQL JPA", "PK"));
        courseSpringDataJpaRepo.save(new Course(2, "Learn JAVA JPA", "Prasanna Kumar"));
        courseSpringDataJpaRepo.save(new Course(3, "Learn KOTLIN JPA", "PK"));
        courseSpringDataJpaRepo.deleteById(1L);
        System.out.println(courseSpringDataJpaRepo.findById(2L));
        System.out.println(courseSpringDataJpaRepo.findById(3L));

        System.out.println(courseSpringDataJpaRepo.findAll());

        System.out.println(courseSpringDataJpaRepo.findByAuthor("Prasanna Kumar"));
        System.out.println(courseSpringDataJpaRepo.findByName("Learn KOTLIN JPA"));
    }
}
