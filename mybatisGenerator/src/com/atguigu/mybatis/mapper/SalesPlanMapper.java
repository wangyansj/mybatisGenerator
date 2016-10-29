package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.entities.SalesPlan;
import com.atguigu.mybatis.entities.SalesPlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesPlanMapper {
    int countByExample(SalesPlanExample example);

    int deleteByExample(SalesPlanExample example);

    int insert(SalesPlan record);

    int insertSelective(SalesPlan record);

    List<SalesPlan> selectByExample(SalesPlanExample example);

    int updateByExampleSelective(@Param("record") SalesPlan record, @Param("example") SalesPlanExample example);

    int updateByExample(@Param("record") SalesPlan record, @Param("example") SalesPlanExample example);
}