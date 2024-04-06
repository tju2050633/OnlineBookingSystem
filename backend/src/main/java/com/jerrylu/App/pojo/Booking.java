package com.jerrylu.App.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.sql.Date;
import java.sql.Time;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("Booking")
public class Booking {
    @TableId
    private Integer bookingId;
    private Integer userId;
    private Integer venueId;
    private Integer venueCourtId;
    private Date bookingDate;
    private Time startTime;
    private Time endTime;
}