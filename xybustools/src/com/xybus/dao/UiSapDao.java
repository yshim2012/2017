package com.xybus.dao;

import com.xybus.po.UiSap;
import com.xybus.po.UiSapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UiSapDao {
    long countByExample(UiSapExample example);

    int deleteByExample(UiSapExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UiSap record);

    int insertSelective(UiSap record);

    List<UiSap> selectByExample(UiSapExample example);

    UiSap selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UiSap record, @Param("example") UiSapExample example);

    int updateByExample(@Param("record") UiSap record, @Param("example") UiSapExample example);

    int updateByPrimaryKeySelective(UiSap record);

    int updateByPrimaryKey(UiSap record);
}