package com.oracle.mapper;

import com.oracle.pojo.LeaveType;
import com.oracle.pojo.LeaveTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LeaveTypeMapper {
    int countByExample(LeaveTypeExample example);

    int deleteByExample(LeaveTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LeaveType record);

    int insertSelective(LeaveType record);

    List<LeaveType> selectByExample(LeaveTypeExample example);

    LeaveType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LeaveType record, @Param("example") LeaveTypeExample example);

    int updateByExample(@Param("record") LeaveType record, @Param("example") LeaveTypeExample example);

    int updateByPrimaryKeySelective(LeaveType record);

    int updateByPrimaryKey(LeaveType record);
}