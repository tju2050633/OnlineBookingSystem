package com.jerrylu.App.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jerrylu.App.pojo.*;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EquipmentPurchaseRecordMapper extends BaseMapper<EquipmentPurchaseRecord> {
    @Select("SELECT * FROM EquipmentPurchaseRecord")
    List<EquipmentPurchaseRecord> getAllEquipmentPurchaseRecords();

    @Select("SELECT * FROM EquipmentPurchaseRecord WHERE user_id = #{userId}")
    List<EquipmentPurchaseRecord> selectByUserId(int userId);

    @Select("SELECT * FROM EquipmentPurchaseRecord WHERE equipment_id = #{equipmentId}")
    List<EquipmentPurchaseRecord> selectByEquipmentId(int equipmentId);
}
