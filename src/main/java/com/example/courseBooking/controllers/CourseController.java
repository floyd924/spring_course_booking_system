package com.example.courseBooking.controllers;

import com.example.courseBooking.Repositories.CourseRepositories.CourseRepository;
import com.example.courseBooking.models.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/courses")
public class CourseController {
    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value="/rating/{rating}")
    public List<Course> findAllCoursesByRating(@PathVariable int rating){
        return courseRepository.getCourseWithRating(rating);
    }

    @GetMapping(value="customer/{id}")
    public List<Course> findAllCoursesByCustomer(@PathVariable Long id){
        return courseRepository.getCourseByCustomer(id);
    }
}
