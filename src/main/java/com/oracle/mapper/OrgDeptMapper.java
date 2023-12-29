package com.oracle.mapper;

import com.oracle.pojo.OrgDept;
import com.oracle.pojo.OrgDeptExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrgDeptMapper {
    int countByExample(OrgDeptExample example);

    int deleteByExample(OrgDeptExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrgDept record);

    int insertSelective(OrgDept record);

    List<OrgDept> selectByExample(OrgDeptExample example);

    OrgDept selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrgDept record, @Param("example") OrgDeptExample example);

    int updateByExample(@Param("record") OrgDept record, @Param("example") OrgDeptExample example);

    int updateByPrimaryKeySelective(OrgDept record);

    int updateByPrimaryKey(OrgDept record);
}