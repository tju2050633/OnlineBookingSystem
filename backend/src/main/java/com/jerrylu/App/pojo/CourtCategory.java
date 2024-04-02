package com.jerrylu.App.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("CourtCategory")
public class CourtCategory {
    @TableId
    private Integer categoryID;
    private String categoryName;
    private double weekDayPrice;
    private double weekendPrice;
    private Integer bookPeriod;
}
