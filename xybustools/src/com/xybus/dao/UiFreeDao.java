package com.xybus.dao;

import com.xybus.po.UiFree;
import com.xybus.po.UiFreeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UiFreeDao {
    long countByExample(UiFreeExample example);

    int deleteByExample(UiFreeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UiFree record);

    int insertSelective(UiFree record);

    List<UiFree> selectByExample(UiFreeExample example);

    UiFree selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UiFree record, @Param("example") UiFreeExample example);

    int updateByExample(@Param("record") UiFree record, @Param("example") UiFreeExample example);

    int updateByPrimaryKeySelective(UiFree record);

    int updateByPrimaryKey(UiFree record);
}