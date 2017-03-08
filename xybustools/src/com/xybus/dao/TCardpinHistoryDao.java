package com.xybus.dao;

import com.xybus.po.TCardpinHistory;
import com.xybus.po.TCardpinHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCardpinHistoryDao {
    long countByExample(TCardpinHistoryExample example);

    int deleteByExample(TCardpinHistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCardpinHistory record);

    int insertSelective(TCardpinHistory record);

    List<TCardpinHistory> selectByExample(TCardpinHistoryExample example);

    TCardpinHistory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCardpinHistory record, @Param("example") TCardpinHistoryExample example);

    int updateByExample(@Param("record") TCardpinHistory record, @Param("example") TCardpinHistoryExample example);

    int updateByPrimaryKeySelective(TCardpinHistory record);

    int updateByPrimaryKey(TCardpinHistory record);
}