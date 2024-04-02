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
        System.out.println("Service Getting all equipment rentals");
        return equipmentRentalMapper.getAllEquipmentRentals();
    }

    // purchase

    public List<EquipmentPurchase> getAllEquipmentPurchases() {
        System.out.println("Service Getting all equipment purchases");
        return equipmentPurchaseMapper.getAllEquipmentPurchases();
    }

    // rental record

    public List<EquipmentRentalRecord> getAllEquipmentRentalRecords() {
        System.out.println("Service Getting all equipment rental records");
        return equipmentRentalRecordMapper.getAllEquipmentRentalRecords();
    }

    public List<EquipmentRentalRecord> getEquipmentRentalRecordsByUserId(int userId) {
        System.out.println("Service Getting equipment rental records by user id: " + userId);
        QueryWrapper<EquipmentRentalRecord> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("UserID", userId);
        return equipmentRentalRecordMapper.selectList(queryWrapper);
    }

    public List<EquipmentRentalRecord> getEquipmentRentalRecordsByEquipmentId(int equipmentId) {
        System.out.println("Service Getting equipment rental records by equipment id: " + equipmentId);
        QueryWrapper<EquipmentRentalRecord> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("EquipmentID", equipmentId);
        return equipmentRentalRecordMapper.selectList(queryWrapper);
    }

    public void addEquipmentRentalRecord(EquipmentRentalRecord equipmentRentalRecord) {
        System.out.println("Service Adding equipment rental record: " + equipmentRentalRecord.toString());
        equipmentRentalRecordMapper.insert(equipmentRentalRecord);
    }

    public void updateEquipmentRentalRecord(EquipmentRentalRecord equipmentRentalRecord) {
        System.out.println("Service Updating equipment rental record: " + equipmentRentalRecord.toString());
        equipmentRentalRecordMapper.updateById(equipmentRentalRecord);
    }

    public void deleteEquipmentRentalRecord(int id) {
        System.out.println("Service Deleting equipment rental record: " + id);
        equipmentRentalRecordMapper.deleteById(id);
    }

    // purchase record

    public List<EquipmentPurchaseRecord> getAllEquipmentPurchaseRecords() {
        System.out.println("Service Getting all equipment purchase records");
        return equipmentPurchaseRecordMapper.getAllEquipmentPurchaseRecords();
    }

    public List<EquipmentPurchaseRecord> getEquipmentPurchaseRecordsByUserId(int userId) {
        System.out.println("Service Getting equipment purchase records by user id: " + userId);
        QueryWrapper<EquipmentPurchaseRecord> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("UserID", userId);
        return equipmentPurchaseRecordMapper.selectList(queryWrapper);
    }

    public List<EquipmentPurchaseRecord> getEquipmentPurchaseRecordsByEquipmentId(int equipmentId) {
        System.out.println("Service Getting equipment purchase records by equipment id: " + equipmentId);
        QueryWrapper<EquipmentPurchaseRecord> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("EquipmentID", equipmentId);
        return equipmentPurchaseRecordMapper.selectList(queryWrapper);
    }

    public void addEquipmentPurchaseRecord(EquipmentPurchaseRecord equipmentPurchaseRecord) {
        System.out.println("Service Adding equipment purchase record: " + equipmentPurchaseRecord.toString());
        equipmentPurchaseRecordMapper.insert(equipmentPurchaseRecord);
    }

    public void updateEquipmentPurchaseRecord(EquipmentPurchaseRecord equipmentPurchaseRecord) {
        System.out.println("Service Updating equipment purchase record: " + equipmentPurchaseRecord.toString());
        equipmentPurchaseRecordMapper.updateById(equipmentPurchaseRecord);
    }

    public void deleteEquipmentPurchaseRecord(int id) {
        System.out.println("Service Deleting equipment purchase record: " + id);
        equipmentPurchaseRecordMapper.deleteById(id);
    }

}