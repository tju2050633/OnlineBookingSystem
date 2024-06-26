package com.jerrylu.App.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("EquipmentRental")
public class EquipmentRental {
    @TableId
    private Integer equipmentId;
    private String name;
    private Integer rentPrice;
    private Integer rentPeriod;
}