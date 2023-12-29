package com.oracle.mapper;

import com.oracle.pojo.TaskType;
import com.oracle.pojo.TaskTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TaskTypeMapper {
    int countByExample(TaskTypeExample example);

    int deleteByExample(TaskTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TaskType record);

    int insertSelective(TaskType record);

    List<TaskType> selectByExample(TaskTypeExample example);

    TaskType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TaskType record, @Param("example") TaskTypeExample example);

    int updateByExample(@Param("record") TaskType record, @Param("example") TaskTypeExample example);

    int updateByPrimaryKeySelective(TaskType record);

    int updateByPrimaryKey(TaskType record);
}