package com.oracle.mapper;

import com.oracle.pojo.Transport;
import com.oracle.pojo.TransportExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TransportMapper {
    int countByExample(TransportExample example);

    int deleteByExample(TransportExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Transport record);

    int insertSelective(Transport record);

    List<Transport> selectByExample(TransportExample example);

    Transport selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Transport record, @Param("example") TransportExample example);

    int updateByExample(@Param("record") Transport record, @Param("example") TransportExample example);

    int updateByPrimaryKeySelective(Transport record);

    int updateByPrimaryKey(Transport record);
}