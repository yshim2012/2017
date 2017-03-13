package com.xybus.dao;

import com.xybus.po.TPassenger;
import com.xybus.po.TPassengerExample;
import com.xybus.po.TPassengerSub;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TPassengerDao {
    long countByExample(TPassengerExample example);

    int deleteByExample(TPassengerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TPassenger record);

    int insertSelective(TPassenger record);

    List<TPassenger> selectByExample(TPassengerExample example);

    TPassenger selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TPassenger record, @Param("example") TPassengerExample example);

    int updateByExample(@Param("record") TPassenger record, @Param("example") TPassengerExample example);

    int updateByPrimaryKeySelective(TPassenger record);

    int updateByPrimaryKey(TPassenger record);
    List<TPassengerSub> queryForListByNumber (Map map);
    List<TPassenger>  selectByJobNumber (Map map);
}