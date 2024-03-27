package com.jerrylu.App.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("EquipmentsRental")
public class EquipmentsRental {
    @TableId
    private int equipmentsID;
    private String name;
    private int rentPrice;
    private int rentPeriod;
}