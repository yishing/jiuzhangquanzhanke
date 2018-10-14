package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    @Query("SELECT Course FROM course c  WHERE c.name = :courseName")
    Course findCourseByCourseName(@Param("courseName") String courseName);

    @Query("SELECT Course FROM course c")
    List<Course> findAllCourses();

}
