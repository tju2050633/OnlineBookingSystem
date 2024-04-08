package com.jerrylu.App.service;

import com.jerrylu.App.mapper.*;
import com.jerrylu.App.pojo.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentService {
    @Autowired
    private EquipmentRentalMapper equipmentRentalMapper;
    @Autowired
    private EquipmentRentalRecordMapper equipmentRentalRecordMapper;
    @Autowired
    private EquipmentPurchaseMapper equipmentPurchaseMapper;
    @Autowired
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
        return equipmentRentalRecordMapper.selectByUserId(userId);
    }

    public List<EquipmentRentalRecord> getEquipmentRentalRecordsByEquipmentId(int equipmentId) {
        System.out.println("Service Getting equipment rental records by equipment id: " + equipmentId);
        return equipmentRentalRecordMapper.selectByEquipmentId(equipmentId);
    }

    public EquipmentRentalRecord addEquipmentRentalRecord(EquipmentRentalRecord equipmentRentalRecord) {
        System.out.println("Service Adding equipment rental record: " + equipmentRentalRecord.toString());
        equipmentRentalRecordMapper.insert(equipmentRentalRecord);
        return equipmentRentalRecord;
    }

    public EquipmentRentalRecord updateEquipmentRentalRecord(EquipmentRentalRecord equipmentRentalRecord) {
        System.out.println("Service Updating equipment rental record: " + equipmentRentalRecord.toString());
        equipmentRentalRecordMapper.updateById(equipmentRentalRecord);
        return equipmentRentalRecord;
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
        return equipmentPurchaseRecordMapper.selectByUserId(userId);
    }

    public List<EquipmentPurchaseRecord> getEquipmentPurchaseRecordsByEquipmentId(int equipmentId) {
        System.out.println("Service Getting equipment purchase records by equipment id: " + equipmentId);
        return equipmentPurchaseRecordMapper.selectByEquipmentId(equipmentId);
    }

    public EquipmentPurchaseRecord addEquipmentPurchaseRecord(EquipmentPurchaseRecord equipmentPurchaseRecord) {
        System.out.println("Service Adding equipment purchase record: " + equipmentPurchaseRecord.toString());
        equipmentPurchaseRecordMapper.insert(equipmentPurchaseRecord);
        return equipmentPurchaseRecord;
    }

    public EquipmentPurchaseRecord updateEquipmentPurchaseRecord(EquipmentPurchaseRecord equipmentPurchaseRecord) {
        System.out.println("Service Updating equipment purchase record: " + equipmentPurchaseRecord.toString());
        equipmentPurchaseRecordMapper.updateById(equipmentPurchaseRecord);
        return equipmentPurchaseRecord;
    }

    public void deleteEquipmentPurchaseRecord(int id) {
        System.out.println("Service Deleting equipment purchase record: " + id);
        equipmentPurchaseRecordMapper.deleteById(id);
    }

}