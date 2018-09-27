package com.mycompany.myapp.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course")
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false, columnDefinition = "bigint")
    private long id;

    @Column(name = "course_name", nullable = false, length = 100, columnDefinition = "nvarchar(100)")
    private String courseName;

    @Column(name = "course_location", nullable = false, length = 30, columnDefinition = "nvarchar(30)")
    private String courseLocation;

    @Column(name = "course_content", nullable = false, length = 200, columnDefinition = "nvarchar(200)")
    private String courseContent;

    @Column(name = "teacher_id", nullable = false, columnDefinition = "bigint")
    private long teacherId;
}
