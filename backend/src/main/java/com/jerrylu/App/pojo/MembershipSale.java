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
@TableName("MembershipSale")
public class MembershipSale {
    @TableId
    private Integer saleId;
    private Integer membershipId;
    private Integer userId;
    private Date saleDate;
}