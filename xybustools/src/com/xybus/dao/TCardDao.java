package com.xybus.dao;

import com.xybus.po.TCard;
import com.xybus.po.TCardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCardDao {
    long countByExample(TCardExample example);

    int deleteByExample(TCardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCard record);

    int insertSelective(TCard record);

    List<TCard> selectByExample(TCardExample example);

    TCard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCard record, @Param("example") TCardExample example);

    int updateByExample(@Param("record") TCard record, @Param("example") TCardExample example);

    int updateByPrimaryKeySelective(TCard record);

    int updateByPrimaryKey(TCard record);
}