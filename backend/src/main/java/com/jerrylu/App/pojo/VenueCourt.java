package com.jerrylu.App.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("VenueCourt")
public class VenueCourt {
    @TableId
    private int venueCourtID;
    private int venueID;
    private int categoryID;
    private boolean available;
}
