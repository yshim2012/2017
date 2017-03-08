package com.xybus.dao;

import com.xybus.po.UiOvertime;
import com.xybus.po.UiOvertimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UiOvertimeDao {
    long countByExample(UiOvertimeExample example);

    int deleteByExample(UiOvertimeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UiOvertime record);

    int insertSelective(UiOvertime record);

    List<UiOvertime> selectByExample(UiOvertimeExample example);

    UiOvertime selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UiOvertime record, @Param("example") UiOvertimeExample example);

    int updateByExample(@Param("record") UiOvertime record, @Param("example") UiOvertimeExample example);

    int updateByPrimaryKeySelective(UiOvertime record);

    int updateByPrimaryKey(UiOvertime record);
}