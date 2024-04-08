package com.jerrylu.App.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jerrylu.App.pojo.*;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BookingMapper extends BaseMapper<Booking> {
    @Select("SELECT * FROM Booking")
    List<Booking> getAllBookings();

    @Select("SELECT * FROM Booking WHERE user_id = #{userId}")
    List<Booking> selectByUserId(int userId);

    @Select("SELECT * FROM Booking WHERE venue_id = #{venueId}")
    List<Booking> selectByVenueId(int venueId);

    @Select("SELECT * FROM Booking WHERE venue_court_id = #{venueCourtId}")
    List<Booking> selectByVenueCourtId(int venueCourtId);
}
