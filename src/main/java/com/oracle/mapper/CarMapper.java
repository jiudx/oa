package com.oracle.mapper;

import com.oracle.pojo.Car;
import com.oracle.pojo.CarExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CarMapper {
    int countByExample(CarExample example);

    int deleteByExample(CarExample example);

    int insert(Car record);

    int insertSelective(Car record);

    List<Car> selectByExample(CarExample example);

    int updateByExampleSelective(@Param("record") Car record, @Param("example") CarExample example);

    int updateByExample(@Param("record") Car record, @Param("example") CarExample example);
}