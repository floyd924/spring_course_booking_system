package com.example.courseBooking.Repositories.CustomerRepositories;

import com.example.courseBooking.models.Course;
import com.example.courseBooking.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    public List<Customer> getCustomersForCourse(Long id);
}
