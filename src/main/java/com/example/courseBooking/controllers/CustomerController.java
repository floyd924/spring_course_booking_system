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
}
