package com.example.courseBooking.controllers;

import com.example.courseBooking.Repositories.BookingRepositories.BookingRepository;
import com.example.courseBooking.models.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/bookings")
public class BookingController {
    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value="/date/{date}")
    public List<Booking> findAllBookingsByDate(@PathVariable String date){
        return bookingRepository.getBookingsForDate(date);
    }
}
