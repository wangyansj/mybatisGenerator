package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.entities.CustomerActivity;
import com.atguigu.mybatis.entities.CustomerActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerActivityMapper {
    int countByExample(CustomerActivityExample example);

    int deleteByExample(CustomerActivityExample example);

    int insert(CustomerActivity record);

    int insertSelective(CustomerActivity record);

    List<CustomerActivity> selectByExample(CustomerActivityExample example);

    int updateByExampleSelective(@Param("record") CustomerActivity record, @Param("example") CustomerActivityExample example);

    int updateByExample(@Param("record") CustomerActivity record, @Param("example") CustomerActivityExample example);
}