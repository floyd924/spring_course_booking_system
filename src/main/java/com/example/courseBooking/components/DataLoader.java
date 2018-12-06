package com.example.courseBooking.components;

import com.example.courseBooking.Repositories.BookingRepositories.BookingRepository;
import com.example.courseBooking.Repositories.CourseRepositories.CourseRepository;
import com.example.courseBooking.Repositories.CustomerRepositories.CustomerRepository;
import com.example.courseBooking.models.Booking;
import com.example.courseBooking.models.Course;
import com.example.courseBooking.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    CourseRepository courseRepository;
    @Autowired
    BookingRepository bookingRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){
        Customer customer1 = new Customer("Jerry Balls","Huddersfield",192);
        Customer customer2 = new Customer("Peter Mince","Huddersfield",34);
        Customer customer3 = new Customer("Julia Rot","Little Minging",5);
        Customer customer4 = new Customer("Mike Branch","Liverpool",62);
        Customer customer5 = new Customer("Garry Hinge","Huddersfield",23);
        Customer customer6 = new Customer("ABCDE Ferguson","Crewe",2);
        Customer customer7 = new Customer("Trump","Crewe",192);
        customerRepository.save(customer1);
        customerRepository.save(customer2);
        customerRepository.save(customer3);
        customerRepository.save(customer4);
        customerRepository.save(customer5);
        customerRepository.save(customer6);
        customerRepository.save(customer7);

        Course course1 = new Course("Face Weaving","Huddersfield",4);
        Course course2 = new Course("Being diplomatic","Crewe",10);
        Course course3 = new Course("Pet disposal 101","Bristol",7);
        Course course4 = new Course("IT for creepy clowns","Huddersfield",666);
        courseRepository.save(course1);
        courseRepository.save(course2);
        courseRepository.save(course3);
        courseRepository.save(course4);

        Booking booking1 = new Booking("1-12-13",course2,customer4);
        Booking booking7 = new Booking("1-12-13",course2,customer7);
        Booking booking2 = new Booking("1-12-13",course1,customer1);
        Booking booking3 = new Booking("41-14-99",course3,customer2);
        Booking booking4 = new Booking("13-13-13",course4,customer3);
        Booking booking5 = new Booking("11-04-13",course1,customer4);
        Booking booking6 = new Booking("14-09-13",course2,customer5);

        bookingRepository.save(booking1);
        bookingRepository.save(booking2);
        bookingRepository.save(booking3);
        bookingRepository.save(booking4);
        bookingRepository.save(booking5);
        bookingRepository.save(booking6);
        bookingRepository.save(booking7);
    }
}
