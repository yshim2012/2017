package com.xybus.dao;

import com.xybus.po.TbCarrier;
import com.xybus.po.TbCarrierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCarrierDao {
    long countByExample(TbCarrierExample example);

    int deleteByExample(TbCarrierExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbCarrier record);

    int insertSelective(TbCarrier record);

    List<TbCarrier> selectByExample(TbCarrierExample example);

    TbCarrier selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbCarrier record, @Param("example") TbCarrierExample example);

    int updateByExample(@Param("record") TbCarrier record, @Param("example") TbCarrierExample example);

    int updateByPrimaryKeySelective(TbCarrier record);

    int updateByPrimaryKey(TbCarrier record);
}