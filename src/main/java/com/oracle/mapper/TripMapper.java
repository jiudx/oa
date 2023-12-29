package com.oracle.mapper;

import com.oracle.pojo.Trip;
import com.oracle.pojo.TripExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TripMapper {
    int countByExample(TripExample example);

    int deleteByExample(TripExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Trip record);

    int insertSelective(Trip record);

    List<Trip> selectByExample(TripExample example);

    Trip selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Trip record, @Param("example") TripExample example);

    int updateByExample(@Param("record") Trip record, @Param("example") TripExample example);

    int updateByPrimaryKeySelective(Trip record);

    int updateByPrimaryKey(Trip record);
}