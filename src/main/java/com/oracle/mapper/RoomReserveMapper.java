package com.oracle.mapper;

import com.oracle.pojo.RoomReserve;
import com.oracle.pojo.RoomReserveExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoomReserveMapper {
    int countByExample(RoomReserveExample example);

    int deleteByExample(RoomReserveExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RoomReserve record);

    int insertSelective(RoomReserve record);

    List<RoomReserve> selectByExample(RoomReserveExample example);

    RoomReserve selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RoomReserve record, @Param("example") RoomReserveExample example);

    int updateByExample(@Param("record") RoomReserve record, @Param("example") RoomReserveExample example);

    int updateByPrimaryKeySelective(RoomReserve record);

    int updateByPrimaryKey(RoomReserve record);
}