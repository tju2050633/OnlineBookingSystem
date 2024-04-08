package com.jerrylu.App.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jerrylu.App.pojo.*;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MembershipSaleMapper extends BaseMapper<MembershipSale> {
    @Select("SELECT * FROM MembershipSale")
    List<MembershipSale> getAllMembershipSales();

    @Select("SELECT * FROM MembershipSale WHERE membership_id = #{id}")
    List<MembershipSale> selectByMembershipId(int id);

    @Select("SELECT * FROM MembershipSale WHERE user_id = #{id}")
    List<MembershipSale> selectByUserId(int id);
}
