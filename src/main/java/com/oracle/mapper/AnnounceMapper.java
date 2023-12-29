package com.oracle.mapper;

import com.oracle.pojo.Announce;
import com.oracle.pojo.AnnounceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AnnounceMapper {
    int countByExample(AnnounceExample example);

    int deleteByExample(AnnounceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Announce record);

    int insertSelective(Announce record);

    List<Announce> selectByExampleWithBLOBs(AnnounceExample example);

    List<Announce> selectByExample(AnnounceExample example);

    Announce selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Announce record, @Param("example") AnnounceExample example);

    int updateByExampleWithBLOBs(@Param("record") Announce record, @Param("example") AnnounceExample example);

    int updateByExample(@Param("record") Announce record, @Param("example") AnnounceExample example);

    int updateByPrimaryKeySelective(Announce record);

    int updateByPrimaryKeyWithBLOBs(Announce record);

    int updateByPrimaryKey(Announce record);
}