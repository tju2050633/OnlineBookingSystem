package com.jerrylu.App.controller;

import com.jerrylu.App.pojo.*;
import com.jerrylu.App.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/membership")

public class MembershipController {
    
        @Autowired
        private MembershipService membershipService;
    
        // membership sale
    
        @GetMapping("/sale/all")
        public ResponseEntity<List<MembershipSale>> getAllMembershipSales() {
            return ResponseEntity.ok(membershipService.getAllMembershipSales());
        }
    
        @GetMapping("/sale/{id}")
        public ResponseEntity<MembershipSale> getMembershipSaleById(@PathVariable int id) {
            return ResponseEntity.ok(membershipService.getMembershipSaleById(id));
        }

        @GetMapping("/sale/membership/{id}")
        public ResponseEntity<List<MembershipSale>> getMembershipSaleByMembershipId(@PathVariable int id) {
            return ResponseEntity.ok(membershipService.getMembershipSaleByMembershipId(id));
        }

        @GetMapping("/sale/user/{id}")
        public ResponseEntity<List<MembershipSale>> getMembershipSaleByUserId(@PathVariable int id) {
            return ResponseEntity.ok(membershipService.getMembershipSaleByUserId(id));
        }
    
        @PostMapping("/sale/add")
        public ResponseEntity<MembershipSale> addMembershipSale(@RequestBody MembershipSale membershipSale) {
            return ResponseEntity.ok(membershipService.addMembershipSale(membershipSale));
        }
    
        @PutMapping("/sale/update")
        public ResponseEntity<MembershipSale> updateMembershipSale(@RequestBody MembershipSale membershipSale) {
            return ResponseEntity.ok(membershipService.updateMembershipSale(membershipSale));
        }
    
        @DeleteMapping("/sale/delete/{id}")
        public ResponseEntity<Void> deleteMembershipSale(@PathVariable int id) {
            membershipService.deleteMembershipSale(id);
            return ResponseEntity.ok().build();
        }
    
        // membership type
    
        @GetMapping("/types")
        public ResponseEntity<List<Membership>> getAllMemberships() {
            return ResponseEntity.ok(membershipService.getAllMemberships());
        }
}
