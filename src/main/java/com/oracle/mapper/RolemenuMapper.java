package com.oracle.mapper;

import com.oracle.pojo.Rolemenu;
import com.oracle.pojo.RolemenuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RolemenuMapper {
    int countByExample(RolemenuExample example);

    int deleteByExample(RolemenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Rolemenu record);

    int insertSelective(Rolemenu record);

    List<Rolemenu> selectByExample(RolemenuExample example);

    Rolemenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Rolemenu record, @Param("example") RolemenuExample example);

    int updateByExample(@Param("record") Rolemenu record, @Param("example") RolemenuExample example);

    int updateByPrimaryKeySelective(Rolemenu record);

    int updateByPrimaryKey(Rolemenu record);
}