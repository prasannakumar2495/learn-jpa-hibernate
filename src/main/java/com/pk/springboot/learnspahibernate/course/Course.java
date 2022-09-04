package com.pk.springboot.learnspahibernate.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class  Course {
    public Course() {
    }

    public Course(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    @Id
    private long id;
    @Column
    private String name;
    @Column
    private String author;
}
