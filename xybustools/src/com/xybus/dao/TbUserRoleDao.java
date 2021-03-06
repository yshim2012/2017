package com.xybus.dao;

import com.xybus.po.TbUserRole;
import com.xybus.po.TbUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUserRoleDao {
    long countByExample(TbUserRoleExample example);

    int deleteByExample(TbUserRoleExample example);

    int insert(TbUserRole record);

    int insertSelective(TbUserRole record);

    List<TbUserRole> selectByExample(TbUserRoleExample example);

    int updateByExampleSelective(@Param("record") TbUserRole record, @Param("example") TbUserRoleExample example);

    int updateByExample(@Param("record") TbUserRole record, @Param("example") TbUserRoleExample example);
}