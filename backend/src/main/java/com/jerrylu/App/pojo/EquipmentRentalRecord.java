package com.jerrylu.App.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("EquipmentRentalRecord")
public class EquipmentRentalRecord {
    @TableId
    private Integer rentalId;
    private Integer equipmentId;
    private Integer userId;
    private Date date;
}
