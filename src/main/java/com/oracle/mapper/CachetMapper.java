package com.oracle.mapper;

import com.oracle.pojo.Cachet;
import com.oracle.pojo.CachetExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CachetMapper {
    int countByExample(CachetExample example);

    int deleteByExample(CachetExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Cachet record);

    int insertSelective(Cachet record);

    List<Cachet> selectByExample(CachetExample example);

    Cachet selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Cachet record, @Param("example") CachetExample example);

    int updateByExample(@Param("record") Cachet record, @Param("example") CachetExample example);

    int updateByPrimaryKeySelective(Cachet record);

    int updateByPrimaryKey(Cachet record);
}