package com.jerrylu.App.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("Payment")
public class Payment {
    @TableId
    private Integer paymentId;
    private Integer userId;
    private Integer methodId;
    private double amount;
    private Date paymentDate;
}