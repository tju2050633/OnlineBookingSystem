package com.jerrylu.App.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jerrylu.App.pojo.*;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface VenueCourtMapper extends BaseMapper<VenueCourt> {
    @Select("SELECT * FROM VenueCourt")
    List<VenueCourt> getAllVenueCourts();

    @Select("SELECT * FROM VenueCourt WHERE venue_id = #{venueId}")
    List<VenueCourt> selectByVenueId(int venueId);

    @Select("SELECT * FROM VenueCourt WHERE category_id = #{courtCategoryId}")
    List<VenueCourt> selectByCourtCategoryId(int courtCategoryId);
}
