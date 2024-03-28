package com.jerrylu.App.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jerrylu.App.mapper.*;
import com.jerrylu.App.pojo.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentService {
    @Autowired
    private EquipmentRentalMapper equipmentRentalMapper;
    private EquipmentRentalRecordMapper equipmentRentalRecordMapper;
    private EquipmentPurchaseMapper equipmentPurchaseMapper;
    private EquipmentPurchaseRecordMapper equipmentPurchaseRecordMapper;

    // rental

    public List<EquipmentRental> getAllEquipmentRentals() {
        return equipmentRentalMapper.selectList(null);
    }

    // purchase

    public List<EquipmentPurchase> getAllEquipmentPurchases() {
        return equipmentPurchaseMapper.selectList(null);
    }

    // rental record

    public List<EquipmentRentalRecord> getAllEquipmentRentalRecords() {
        return equipmentRentalRecordMapper.selectList(null);
    }

    public List<EquipmentRentalRecord> getEquipmentRentalRecordsByUserId(int userId) {
        QueryWrapper<EquipmentRentalRecord> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("UserID", userId);
        return equipmentRentalRecordMapper.selectList(queryWrapper);
    }

    public List<EquipmentRentalRecord> getEquipmentRentalRecordsByEquipmentId(int equipmentId) {
        QueryWrapper<EquipmentRentalRecord> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("EquipmentID", equipmentId);
        return equipmentRentalRecordMapper.selectList(queryWrapper);
    }

    public void addEquipmentRentalRecord(EquipmentRentalRecord equipmentRentalRecord) {
        equipmentRentalRecordMapper.insert(equipmentRentalRecord);
    }

    public void updateEquipmentRentalRecord(EquipmentRentalRecord equipmentRentalRecord) {
        equipmentRentalRecordMapper.updateById(equipmentRentalRecord);
    }

    public void deleteEquipmentRentalRecord(int id) {
        equipmentRentalRecordMapper.deleteById(id);
    }

    // purchase record

    public List<EquipmentPurchaseRecord> getAllEquipmentPurchaseRecords() {
        return equipmentPurchaseRecordMapper.selectList(null);
    }

    public List<EquipmentPurchaseRecord> getEquipmentPurchaseRecordsByUserId(int userId) {
        QueryWrapper<EquipmentPurchaseRecord> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("UserID", userId);
        return equipmentPurchaseRecordMapper.selectList(queryWrapper);
    }

    public List<EquipmentPurchaseRecord> getEquipmentPurchaseRecordsByEquipmentId(int equipmentId) {
        QueryWrapper<EquipmentPurchaseRecord> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("EquipmentID", equipmentId);
        return equipmentPurchaseRecordMapper.selectList(queryWrapper);
    }

    public void addEquipmentPurchaseRecord(EquipmentPurchaseRecord equipmentPurchaseRecord) {
        equipmentPurchaseRecordMapper.insert(equipmentPurchaseRecord);
    }

    public void updateEquipmentPurchaseRecord(EquipmentPurchaseRecord equipmentPurchaseRecord) {
        equipmentPurchaseRecordMapper.updateById(equipmentPurchaseRecord);
    }

    public void deleteEquipmentPurchaseRecord(int id) {
        equipmentPurchaseRecordMapper.deleteById(id);
    }

}
