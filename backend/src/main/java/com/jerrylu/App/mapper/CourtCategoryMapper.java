package com.jerrylu.App.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jerrylu.App.pojo.*;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CourtCategoryMapper extends BaseMapper<CourtCategory> {
    @Select("SELECT * FROM CourtCategory")
    List<CourtCategory> getAllCourtCategories();
}
