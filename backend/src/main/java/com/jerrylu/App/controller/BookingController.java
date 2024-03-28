package com.jerrylu.App.controller;

import com.jerrylu.App.pojo.*;
import com.jerrylu.App.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/booking")
public class BookingController {
    @Autowired
    private BookingService bookingService;

    // venue

    @GetMapping("/venues")
    public ResponseEntity<List<Venue>> getAllVenues() {
        return ResponseEntity.ok(bookingService.getAllVenues());
    }

    // court category

    @GetMapping("/court-categories")
    public ResponseEntity<List<CourtCategory>> getAllCourtCategories() {
        return ResponseEntity.ok(bookingService.getAllCourtCategories());
    }

    // venue court

    @GetMapping("/venue-courts")
    public ResponseEntity<List<VenueCourt>> getAllVenueCourts() {
        return ResponseEntity.ok(bookingService.getAllVenueCourts());
    }

    @GetMapping("/venue-courts/{id}")
    public ResponseEntity<VenueCourt> getVenueCourtById(@PathVariable int id) {
        return ResponseEntity.ok(bookingService.getVenueCourtById(id));
    }

    @GetMapping("/venue-courts/venue/{venueId}")
    public ResponseEntity<List<VenueCourt>> getVenueCourtsByVenueId(@PathVariable int venueId) {
        return ResponseEntity.ok(bookingService.getVenueCourtsByVenueId(venueId));
    }

    @GetMapping("/venue-courts/court-category/{courtCategoryId}")
    public ResponseEntity<List<VenueCourt>> getVenueCourtsByCourtCategoryId(@PathVariable int courtCategoryId) {
        return ResponseEntity.ok(bookingService.getVenueCourtsByCourtCategoryId(courtCategoryId));
    }

    @PostMapping("/venue-courts/add")
    public ResponseEntity<VenueCourt> addVenueCourt(@RequestBody VenueCourt venueCourt) {
        return ResponseEntity.ok(bookingService.addVenueCourt(venueCourt));
    }

    @PutMapping("/venue-courts/update")
    public ResponseEntity<VenueCourt> updateVenueCourt(@RequestBody VenueCourt venueCourt) {
        return ResponseEntity.ok(bookingService.updateVenueCourt(venueCourt));
    }

    @DeleteMapping("/venue-courts/delete/{id}")
    public ResponseEntity<Void> deleteVenueCourt(@PathVariable int id) {
        bookingService.deleteVenueCourt(id);
        return ResponseEntity.ok().build();
    }

    // booking

    @GetMapping("/bookings")
    public ResponseEntity<List<Booking>> getAllBookings() {
        return ResponseEntity.ok(bookingService.getAllBookings());
    }

    @GetMapping("/bookings/{id}")
    public ResponseEntity<Booking> getBookingById(@PathVariable int id) {
        return ResponseEntity.ok(bookingService.getBookingById(id));
    }

    @GetMapping("/bookings/user/{userId}")
    public ResponseEntity<List<Booking>> getBookingsByUserId(@PathVariable int userId) {
        return ResponseEntity.ok(bookingService.getBookingsByUserId(userId));
    }

    public ResponseEntity<List<Booking>> getBookingsByVenueId(int venueId) {
        return ResponseEntity.ok(bookingService.getBookingsByVenueId(venueId));
    }

    public ResponseEntity<List<Booking>> getBookingsByVenueCourtId(int venueCourtId) {
        return ResponseEntity.ok(bookingService.getBookingsByVenueCourtId(venueCourtId));
    }

    @PostMapping("/bookings/add")
    public ResponseEntity<Booking> addBooking(@RequestBody Booking booking) {
        return ResponseEntity.ok(bookingService.addBooking(booking));
    }

    @PutMapping("/bookings/update")
    public ResponseEntity<Booking> updateBooking(@RequestBody Booking booking) {
        return ResponseEntity.ok(bookingService.updateBooking(booking));
    }

    @DeleteMapping("/bookings/delete/{id}")
    public ResponseEntity<Void> deleteBooking(@PathVariable int id) {
        bookingService.deleteBooking(id);
        return ResponseEntity.ok().build();
    }

}
