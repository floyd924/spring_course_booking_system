package com.example.courseBooking;

import com.example.courseBooking.Repositories.BookingRepositories.BookingRepository;
import com.example.courseBooking.Repositories.CourseRepositories.CourseRepository;
import com.example.courseBooking.Repositories.CustomerRepositories.CustomerRepository;
import com.example.courseBooking.models.Booking;
import com.example.courseBooking.models.Course;
import com.example.courseBooking.models.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseBookingApplicationTests {
	@Autowired
	CourseRepository courseRepository;
	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	BookingRepository bookingRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canGetCoursesWithRating(){
		List<Course> result = courseRepository.getCourseWithRating(666);
		assertEquals(1,result.size());
	}

	@Test
	public void getAllCoursesByCustomer(){
		List<Course> result = courseRepository.getCourseByCustomer(4L);
		assertEquals(2,result.size());
	}

	@Test
	public void getAllCustomersOnCourse(){
		List<Customer> result = customerRepository.getCustomersForCourse(2L);
		assertEquals(3,result.size());
	}

	@Test
	public void getBookingsForDate(){
		List<Booking> result = bookingRepository.getBookingsForDate("1-12-13");
		assertEquals(3,result.size());
	}

	@Test
	public void getCustomerByTownAndCourse(){
		List<Customer> result = customerRepository.getCustomerByTownAndCourse("Huddersfield",2L);
		assertEquals(1,result.size());
	}

	@Test
	public void getCustomerByTownAndCourseOver30(){
		List<Customer> result = customerRepository.getCustomerByTownAndCourseOverAge("Huddersfield",3L, 30);
		assertEquals(1,result.size());
	}

	@Test
	public void getCustomerByTownAndCourseOver40(){
		List<Customer> result = customerRepository.getCustomerByTownAndCourseOverAge("Huddersfield",3L,40);
		assertEquals(0,result.size());
	}

}
