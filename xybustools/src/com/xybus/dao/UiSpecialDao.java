package com.xybus.dao;

import com.xybus.po.UiSpecial;
import com.xybus.po.UiSpecialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UiSpecialDao {
    long countByExample(UiSpecialExample example);

    int deleteByExample(UiSpecialExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UiSpecial record);

    int insertSelective(UiSpecial record);

    List<UiSpecial> selectByExample(UiSpecialExample example);

    UiSpecial selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UiSpecial record, @Param("example") UiSpecialExample example);

    int updateByExample(@Param("record") UiSpecial record, @Param("example") UiSpecialExample example);

    int updateByPrimaryKeySelective(UiSpecial record);

    int updateByPrimaryKey(UiSpecial record);
}