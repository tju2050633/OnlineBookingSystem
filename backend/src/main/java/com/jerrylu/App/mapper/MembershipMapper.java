package com.jerrylu.App.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jerrylu.App.pojo.*;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MembershipMapper extends BaseMapper<Membership> {
    @Select("SELECT * FROM Membership")
    List<Membership> getAllMemberships();
}
