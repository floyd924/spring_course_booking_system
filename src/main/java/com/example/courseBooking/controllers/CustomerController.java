package com.example.courseBooking.controllers;

import com.example.courseBooking.Repositories.CustomerRepositories.CustomerRepository;
import com.example.courseBooking.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/customers")
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value="/course/{id}")
    public List<Customer> findCustomersOnCourse(@PathVariable Long id){
        return customerRepository.getCustomersForCourse(id);
    }

    @GetMapping(value="/town/{town}/course/{courseId}")
    public List<Customer> findCustomerByTownAndCourse(@PathVariable String town,@PathVariable Long courseId){
        String newTown = town.substring(0, 1).toUpperCase() + town.substring(1);
        return customerRepository.getCustomerByTownAndCourse(newTown,courseId);
    }

    @GetMapping(value="/town/{town}/course/{courseId}/age/{age}")
    public List<Customer> findCustomerByTownAndCourse(@PathVariable String town,@PathVariable Long courseId,
                                                      @PathVariable int age){
        String newTown = town.substring(0, 1).toUpperCase() + town.substring(1);
        return customerRepository.getCustomerByTownAndCourseOverAge(newTown,courseId,age);
    }
}
