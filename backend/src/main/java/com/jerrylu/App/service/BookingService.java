package com.jerrylu.App.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jerrylu.App.mapper.*;
import com.jerrylu.App.pojo.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {
    @Autowired
    private VenueMapper venueMapper;
    private CourtCategoryMapper courtCategoryMapper;
    private VenueCourtMapper venueCourtMapper;
    private BookingMapper bookingMapper;

    // venue

    public List<Venue> getAllVenues() {
        return venueMapper.selectList(new QueryWrapper<>());
    }

    // court category

    public List<CourtCategory> getAllCourtCategories() {
        return courtCategoryMapper.selectList(new QueryWrapper<>());
    }

    // venue court

    public List<VenueCourt> getAllVenueCourts() {
        return venueCourtMapper.selectList(new QueryWrapper<>());
    }

    public VenueCourt getVenueCourtById(int id) {
        return venueCourtMapper.selectById(id);
    }

    public List<VenueCourt> getVenueCourtsByVenueId(int venueId) {
        QueryWrapper<VenueCourt> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("VenueID", venueId);
        return venueCourtMapper.selectList(queryWrapper);
    }

    public List<VenueCourt> getVenueCourtsByCourtCategoryId(int courtCategoryId) {
        QueryWrapper<VenueCourt> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("CourtCategoryID", courtCategoryId);
        return venueCourtMapper.selectList(queryWrapper);
    }

    public VenueCourt addVenueCourt(VenueCourt venueCourt) {
        venueCourtMapper.insert(venueCourt);
        return venueCourt;
    }

    public VenueCourt updateVenueCourt(VenueCourt venueCourt) {
        venueCourtMapper.updateById(venueCourt);
        return venueCourt;
    }

    public void deleteVenueCourt(int id) {
        venueCourtMapper.deleteById(id);
    }

    // booking

    public List<Booking> getAllBookings() {
        return bookingMapper.selectList(new QueryWrapper<>());
    }

    public Booking getBookingById(int id) {
        return bookingMapper.selectById(id);
    }

    public List<Booking> getBookingsByUserId(int userId) {
        QueryWrapper<Booking> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("UserID", userId);
        return bookingMapper.selectList(queryWrapper);
    }

    public List<Booking> getBookingsByVenueId(int venueId) {
        QueryWrapper<Booking> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("VenueID", venueId);
        return bookingMapper.selectList(queryWrapper);
    }

    public List<Booking> getBookingsByVenueCourtId(int venueCourtId) {
        QueryWrapper<Booking> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("VenueCourtID", venueCourtId);
        return bookingMapper.selectList(queryWrapper);
    }

    public Booking addBooking(Booking booking) {
        bookingMapper.insert(booking);
        return booking;
    }

    public Booking updateBooking(Booking booking) {
        bookingMapper.updateById(booking);
        return booking;
    }

    public void deleteBooking(int id) {
        bookingMapper.deleteById(id);
    }
}
