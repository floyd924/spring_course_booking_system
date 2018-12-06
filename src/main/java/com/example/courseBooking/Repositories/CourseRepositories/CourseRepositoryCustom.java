package com.example.courseBooking.Repositories.CourseRepositories;

import com.example.courseBooking.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {
    public List<Course> getCourseWithRating(int rating);
    public List<Course> getCourseByCustomer(Long id);
}
