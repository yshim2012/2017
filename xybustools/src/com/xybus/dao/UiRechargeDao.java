package com.xybus.dao;

import com.xybus.po.UiRecharge;
import com.xybus.po.UiRechargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UiRechargeDao {
    long countByExample(UiRechargeExample example);

    int deleteByExample(UiRechargeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UiRecharge record);

    int insertSelective(UiRecharge record);

    List<UiRecharge> selectByExample(UiRechargeExample example);

    UiRecharge selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UiRecharge record, @Param("example") UiRechargeExample example);

    int updateByExample(@Param("record") UiRecharge record, @Param("example") UiRechargeExample example);

    int updateByPrimaryKeySelective(UiRecharge record);

    int updateByPrimaryKey(UiRecharge record);
}