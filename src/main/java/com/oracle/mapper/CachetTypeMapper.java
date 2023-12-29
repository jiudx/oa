package com.oracle.mapper;

import com.oracle.pojo.CachetType;
import com.oracle.pojo.CachetTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CachetTypeMapper {
    int countByExample(CachetTypeExample example);

    int deleteByExample(CachetTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CachetType record);

    int insertSelective(CachetType record);

    List<CachetType> selectByExample(CachetTypeExample example);

    CachetType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CachetType record, @Param("example") CachetTypeExample example);

    int updateByExample(@Param("record") CachetType record, @Param("example") CachetTypeExample example);

    int updateByPrimaryKeySelective(CachetType record);

    int updateByPrimaryKey(CachetType record);
}