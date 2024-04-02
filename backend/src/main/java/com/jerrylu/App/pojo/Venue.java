package com.jerrylu.App.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.sql.Time;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("Venue")
public class Venue {
    @TableId
    private Integer venueID;
    private String name;
    private String address;
    private String phoneNumber;
    private Time openTime;
    private Time closeTime;
}
