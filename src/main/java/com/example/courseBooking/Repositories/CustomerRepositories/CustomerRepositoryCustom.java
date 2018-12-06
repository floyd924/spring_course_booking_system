package com.example.courseBooking.Repositories.CustomerRepositories;

import com.example.courseBooking.models.Course;
import com.example.courseBooking.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    public List<Customer> getCustomersForCourse(Long id);
    public List<Customer> getCustomerByTownAndCourse(String town,Long courseId);
    public List<Customer> getCustomerByTownAndCourseOverAge(String town,Long courseId,int age);
}
