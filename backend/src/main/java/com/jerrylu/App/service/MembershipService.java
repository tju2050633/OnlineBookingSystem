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
    private MembershipSaleMapper membershipSaleMapper;

    // membership

    public List<Membership> getAllMemberships() {
        return membershipMapper.selectList(new QueryWrapper<>());
    }

    // membership sale

    public List<MembershipSale> getAllMembershipSales() {
        return membershipSaleMapper.selectList(new QueryWrapper<>());
    }

    public MembershipSale getMembershipSaleById(int id) {
        return membershipSaleMapper.selectById(id);
    }

    public MembershipSale getMembershipSaleByMembershipId(int id) {
        QueryWrapper<MembershipSale> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("MembershipID", id);
        return membershipSaleMapper.selectOne(queryWrapper);
    }

    public MembershipSale getMembershipSaleByUserId(int id) {
        QueryWrapper<MembershipSale> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("UserID", id);
        return membershipSaleMapper.selectOne(queryWrapper);
    }

    public MembershipSale addMembershipSale(MembershipSale membershipSale) {
        membershipSaleMapper.insert(membershipSale);
        return membershipSale;
    }

    public MembershipSale updateMembershipSale(MembershipSale membershipSale) {
        membershipSaleMapper.updateById(membershipSale);
        return membershipSale;
    }

    public void deleteMembershipSale(int id) {
        membershipSaleMapper.deleteById(id);
    }
}
