package com.oracle.mapper;

import com.oracle.pojo.BookReserve;
import com.oracle.pojo.BookReserveExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookReserveMapper {
    int countByExample(BookReserveExample example);

    int deleteByExample(BookReserveExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BookReserve record);

    int insertSelective(BookReserve record);

    List<BookReserve> selectByExample(BookReserveExample example);

    BookReserve selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BookReserve record, @Param("example") BookReserveExample example);

    int updateByExample(@Param("record") BookReserve record, @Param("example") BookReserveExample example);

    int updateByPrimaryKeySelective(BookReserve record);

    int updateByPrimaryKey(BookReserve record);
}