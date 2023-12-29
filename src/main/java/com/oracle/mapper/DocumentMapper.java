package com.oracle.mapper;

import com.oracle.pojo.Document;
import com.oracle.pojo.DocumentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DocumentMapper {
    int countByExample(DocumentExample example);

    int deleteByExample(DocumentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Document record);

    int insertSelective(Document record);

    List<Document> selectByExample(DocumentExample example);

    Document selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Document record, @Param("example") DocumentExample example);

    int updateByExample(@Param("record") Document record, @Param("example") DocumentExample example);

    int updateByPrimaryKeySelective(Document record);

    int updateByPrimaryKey(Document record);
}