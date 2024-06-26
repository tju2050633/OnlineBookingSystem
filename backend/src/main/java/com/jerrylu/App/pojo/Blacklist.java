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
@TableName("Blacklist")
public class Blacklist {
    @TableId
    private Integer blacklistId;
    private Integer userId;
    private String reason;
    private Date dateAdded;
}
