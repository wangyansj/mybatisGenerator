package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.entities.CustomerServices;
import com.atguigu.mybatis.entities.CustomerServicesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerServicesMapper {
    int countByExample(CustomerServicesExample example);

    int deleteByExample(CustomerServicesExample example);

    int insert(CustomerServices record);

    int insertSelective(CustomerServices record);

    List<CustomerServices> selectByExample(CustomerServicesExample example);

    int updateByExampleSelective(@Param("record") CustomerServices record, @Param("example") CustomerServicesExample example);

    int updateByExample(@Param("record") CustomerServices record, @Param("example") CustomerServicesExample example);
}