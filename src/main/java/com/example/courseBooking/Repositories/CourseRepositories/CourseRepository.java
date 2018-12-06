package com.example.courseBooking.Repositories.CourseRepositories;

import com.example.courseBooking.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long>,CourseRepositoryCustom {
}
