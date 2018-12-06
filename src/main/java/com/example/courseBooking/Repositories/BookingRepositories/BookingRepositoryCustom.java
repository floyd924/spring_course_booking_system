package com.example.courseBooking.Repositories.BookingRepositories;

import com.example.courseBooking.models.Booking;

import java.util.List;

public interface BookingRepositoryCustom {
    public List<Booking> getBookingsForDate(String date);
}
