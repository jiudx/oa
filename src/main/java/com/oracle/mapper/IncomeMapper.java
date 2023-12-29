package com.oracle.mapper;

import com.oracle.pojo.Income;
import com.oracle.pojo.IncomeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IncomeMapper {
    int countByExample(IncomeExample example);

    int deleteByExample(IncomeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Income record);

    int insertSelective(Income record);

    List<Income> selectByExample(IncomeExample example);

    Income selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Income record, @Param("example") IncomeExample example);

    int updateByExample(@Param("record") Income record, @Param("example") IncomeExample example);

    int updateByPrimaryKeySelective(Income record);

    int updateByPrimaryKey(Income record);
}