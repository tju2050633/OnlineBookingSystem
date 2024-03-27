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
@TableName("EquipmentPurchaseRecord")
public class EquipmentPurchaseRecord {
    @TableId
    private int purchaseID;
    private int equipmentsID;
    private int userID;
    private Date date;
}