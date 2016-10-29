package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.entities.CustomerDrain;
import com.atguigu.mybatis.entities.CustomerDrainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerDrainMapper {
    int countByExample(CustomerDrainExample example);

    int deleteByExample(CustomerDrainExample example);

    int insert(CustomerDrain record);

    int insertSelective(CustomerDrain record);

    List<CustomerDrain> selectByExample(CustomerDrainExample example);

    int updateByExampleSelective(@Param("record") CustomerDrain record, @Param("example") CustomerDrainExample example);

    int updateByExample(@Param("record") CustomerDrain record, @Param("example") CustomerDrainExample example);
}