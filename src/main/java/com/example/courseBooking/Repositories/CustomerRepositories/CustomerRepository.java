package com.example.courseBooking.Repositories.CustomerRepositories;

import com.example.courseBooking.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long>,CustomerRepositoryCustom {
}
