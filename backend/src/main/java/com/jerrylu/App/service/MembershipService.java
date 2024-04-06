package com.jerrylu.App.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jerrylu.App.mapper.*;
import com.jerrylu.App.pojo.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembershipService {
    @Autowired
    private MembershipMapper membershipMapper;
    @Autowired
    private MembershipSaleMapper membershipSaleMapper;

    // membership

    public List<Membership> getAllMemberships() {
        System.out.println("Service Getting all memberships");
        return membershipMapper.getAllMemberships();
    }

    // membership sale

    public List<MembershipSale> getAllMembershipSales() {
        System.out.println("Service Getting all membership sales");
        return membershipSaleMapper.getAllMembershipSales();
    }

    public MembershipSale getMembershipSaleById(int id) {
        System.out.println("Service Getting membership sale by id: " + id);
        return membershipSaleMapper.selectById(id);
    }

    public MembershipSale getMembershipSaleByMembershipId(int id) {
        System.out.println("Service Getting membership sale by membership id: " + id);
        QueryWrapper<MembershipSale> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("membership_id", id);
        return membershipSaleMapper.selectOne(queryWrapper);
    }

    public MembershipSale getMembershipSaleByUserId(int id) {
        System.out.println("Service Getting membership sale by user id: " + id);
        QueryWrapper<MembershipSale> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("UserID", id);
        return membershipSaleMapper.selectOne(queryWrapper);
    }

    public MembershipSale addMembershipSale(MembershipSale membershipSale) {
        System.out.println("Service Adding membership sale: " + membershipSale.toString());
        membershipSaleMapper.insert(membershipSale);
        return membershipSale;
    }

    public MembershipSale updateMembershipSale(MembershipSale membershipSale) {
        System.out.println("Service Updating membership sale: " + membershipSale.toString());
        membershipSaleMapper.updateById(membershipSale);
        return membershipSale;
    }

    public void deleteMembershipSale(int id) {
        System.out.println("Service Deleting membership sale: " + id);
        membershipSaleMapper.deleteById(id);
    }
}