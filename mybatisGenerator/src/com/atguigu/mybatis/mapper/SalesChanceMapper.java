package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.entities.SalesChance;
import com.atguigu.mybatis.entities.SalesChanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
//zxzxcz
public interface SalesChanceMapper {
	
    int countByExample(SalesChanceExample example);

    int deleteByExample(SalesChanceExample example);

    int insert(SalesChance record);

    int insertSelective(SalesChance record);

    List<SalesChance> selectByExample(SalesChanceExample example);

    int updateByExampleSelective(@Param("record") SalesChance record, @Param("example") SalesChanceExample example);

    int updateByExample(@Param("record") SalesChance record, @Param("example") SalesChanceExample example);
}