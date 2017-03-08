package com.xybus.dao;

import com.xybus.po.TMonthSummary;
import com.xybus.po.TMonthSummaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMonthSummaryDao {
    long countByExample(TMonthSummaryExample example);

    int deleteByExample(TMonthSummaryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TMonthSummary record);

    int insertSelective(TMonthSummary record);

    List<TMonthSummary> selectByExample(TMonthSummaryExample example);

    TMonthSummary selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TMonthSummary record, @Param("example") TMonthSummaryExample example);

    int updateByExample(@Param("record") TMonthSummary record, @Param("example") TMonthSummaryExample example);

    int updateByPrimaryKeySelective(TMonthSummary record);

    int updateByPrimaryKey(TMonthSummary record);
}