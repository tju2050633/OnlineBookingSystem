package com.jerrylu.App.service;

import com.jerrylu.App.mapper.*;
import com.jerrylu.App.pojo.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {
    @Autowired
    private VenueMapper venueMapper;
    @Autowired
    private CourtCategoryMapper courtCategoryMapper;
    @Autowired
    private VenueCourtMapper venueCourtMapper;
    @Autowired
    private BookingMapper bookingMapper;

    // venue

    public List<Venue> getAllVenues() {
        System.out.println("Service Getting all venues");
        return venueMapper.getAllVenues();
    }

    // court category

    public List<CourtCategory> getAllCourtCategories() {
        System.out.println("Service Getting all court categories");
        return courtCategoryMapper.getAllCourtCategories();
    }

    // venue court

    public List<VenueCourt> getAllVenueCourts() {
        System.out.println("Service Getting all venue courts");
        return venueCourtMapper.getAllVenueCourts();
    }

    public VenueCourt getVenueCourtById(int id) {
        System.out.println("Service Getting venue court by id: " + id);
        return venueCourtMapper.selectById(id);
    }

    public List<VenueCourt> getVenueCourtsByVenueId(int venueId) {
        System.out.println("Service Getting venue courts by venue id: " + venueId);
        return venueCourtMapper.selectByVenueId(venueId);
    }

    public List<VenueCourt> getVenueCourtsByCourtCategoryId(int courtCategoryId) {
        System.out.println("Service Getting venue courts by court category id: " + courtCategoryId);
        return venueCourtMapper.selectByCourtCategoryId(courtCategoryId);
    }

    public VenueCourt addVenueCourt(VenueCourt venueCourt) {
        System.out.println("Service Adding venue court: " + venueCourt.toString());
        venueCourtMapper.insert(venueCourt);
        return venueCourt;
    }

    public VenueCourt updateVenueCourt(VenueCourt venueCourt) {
        System.out.println("Service Updating venue court: " + venueCourt.toString());
        venueCourtMapper.updateById(venueCourt);
        return venueCourt;
    }

    public void deleteVenueCourt(int id) {
        System.out.println("Service Deleting venue court: " + id);
        venueCourtMapper.deleteById(id);
    }

    // booking

    public List<Booking> getAllBookings() {
        System.out.println("Service Getting all bookings");
        return bookingMapper.getAllBookings();
    }

    public Booking getBookingById(int id) {
        System.out.println("Service Getting booking by id: " + id);
        return bookingMapper.selectById(id);
    }

    public List<Booking> getBookingsByUserId(int userId) {
        System.out.println("Service Getting bookings by user id: " + userId);
        return bookingMapper.selectByUserId(userId);
    }

    public List<Booking> getBookingsByVenueId(int venueId) {
        System.out.println("Service Getting bookings by venue id: " + venueId);
        return bookingMapper.selectByVenueId(venueId);
    }

    public List<Booking> getBookingsByVenueCourtId(int venueCourtId) {
        System.out.println("Service Getting bookings by venue court id: " + venueCourtId);
        return bookingMapper.selectByVenueCourtId(venueCourtId);
    }

    public Booking addBooking(Booking booking) {
        System.out.println("Service Adding booking: " + booking.toString());
        bookingMapper.insert(booking);
        return booking;
    }

    public Booking updateBooking(Booking booking) {
        System.out.println("Service Updating booking: " + booking.toString());
        bookingMapper.updateById(booking);
        return booking;
    }

    public void deleteBooking(int id) {
        System.out.println("Service Deleting booking: " + id);
        bookingMapper.deleteById(id);
    }
}