package com.oracle.mapper;

import com.oracle.pojo.Organization;
import com.oracle.pojo.OrganizationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrganizationMapper {
    int countByExample(OrganizationExample example);

    int deleteByExample(OrganizationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Organization record);

    int insertSelective(Organization record);

    List<Organization> selectByExample(OrganizationExample example);

    Organization selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Organization record, @Param("example") OrganizationExample example);

    int updateByExample(@Param("record") Organization record, @Param("example") OrganizationExample example);

    int updateByPrimaryKeySelective(Organization record);

    int updateByPrimaryKey(Organization record);
}