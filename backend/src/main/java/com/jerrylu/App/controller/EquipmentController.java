package com.jerrylu.App.controller;

import com.jerrylu.App.pojo.*;
import com.jerrylu.App.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/equipment")
public class EquipmentController {
    @Autowired
    private EquipmentService equipmentService;

    // rental

    @GetMapping("/rental")
    public ResponseEntity<List<EquipmentRental>> getAllEquipmentRentals() {
        return ResponseEntity.ok(equipmentService.getAllEquipmentRentals());
    }

    // purchase

    @GetMapping("/purchase")
    public ResponseEntity<List<EquipmentPurchase>> getAllEquipmentPurchases() {
        return ResponseEntity.ok(equipmentService.getAllEquipmentPurchases());
    }

    // rental record

    @GetMapping("/rental/record")
    public ResponseEntity<List<EquipmentRentalRecord>> getAllEquipmentRentalRecords() {
        return ResponseEntity.ok(equipmentService.getAllEquipmentRentalRecords());
    }

    @GetMapping("/rental/record/user/{userId}")
    public ResponseEntity<List<EquipmentRentalRecord>> getEquipmentRentalRecordsByUserId(@PathVariable int userId) {
        return ResponseEntity.ok(equipmentService.getEquipmentRentalRecordsByUserId(userId));
    }

    @GetMapping("/rental/record/equipment/{equipmentId}")
    public ResponseEntity<List<EquipmentRentalRecord>> getEquipmentRentalRecordsByEquipmentId(
            @PathVariable int equipmentId) {
        return ResponseEntity.ok(equipmentService.getEquipmentRentalRecordsByEquipmentId(equipmentId));
    }
    
    @PostMapping("/rental/record/add")
    public ResponseEntity<Void> addEquipmentRentalRecord(@RequestBody EquipmentRentalRecord equipmentRentalRecord) {
        equipmentService.addEquipmentRentalRecord(equipmentRentalRecord);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/rental/record/update")
    public ResponseEntity<Void> updateEquipmentRentalRecord(@RequestBody EquipmentRentalRecord equipmentRentalRecord) {
        equipmentService.updateEquipmentRentalRecord(equipmentRentalRecord);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/rental/record/delete/{id}")
    public ResponseEntity<Void> deleteEquipmentRentalRecord(@PathVariable int id) {
        equipmentService.deleteEquipmentRentalRecord(id);
        return ResponseEntity.ok().build();
    }

    // purchase record

    @GetMapping("/purchase/record")
    public ResponseEntity<List<EquipmentPurchaseRecord>> getAllEquipmentPurchaseRecords() {
        return ResponseEntity.ok(equipmentService.getAllEquipmentPurchaseRecords());
    }

    @GetMapping("/purchase/record/user/{userId}")
    public ResponseEntity<List<EquipmentPurchaseRecord>> getEquipmentPurchaseRecordsByUserId(@PathVariable int userId) {
        return ResponseEntity.ok(equipmentService.getEquipmentPurchaseRecordsByUserId(userId));
    }

    @GetMapping("/purchase/record/equipment/{equipmentId}")
    public ResponseEntity<List<EquipmentPurchaseRecord>> getEquipmentPurchaseRecordsByEquipmentId(
            @PathVariable int equipmentId) {
        return ResponseEntity.ok(equipmentService.getEquipmentPurchaseRecordsByEquipmentId(equipmentId));
    }

    @PostMapping("/purchase/record/add")
    public ResponseEntity<Void> addEquipmentPurchaseRecord(
            @RequestBody EquipmentPurchaseRecord equipmentPurchaseRecord) {
        equipmentService.addEquipmentPurchaseRecord(equipmentPurchaseRecord);
        return ResponseEntity.ok().build();
    }
    
    @PutMapping("/purchase/record/update")
    public ResponseEntity<Void> updateEquipmentPurchaseRecord(
            @RequestBody EquipmentPurchaseRecord equipmentPurchaseRecord) {
        equipmentService.updateEquipmentPurchaseRecord(equipmentPurchaseRecord);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/purchase/record/delete/{id}")
    public ResponseEntity<Void> deleteEquipmentPurchaseRecord(@PathVariable int id) {
        equipmentService.deleteEquipmentPurchaseRecord(id);
        return ResponseEntity.ok().build();
    }

}
