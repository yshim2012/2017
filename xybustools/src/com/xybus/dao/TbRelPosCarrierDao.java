package com.xybus.dao;

import com.xybus.po.TbRelPosCarrier;
import com.xybus.po.TbRelPosCarrierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbRelPosCarrierDao {
    long countByExample(TbRelPosCarrierExample example);

    int deleteByExample(TbRelPosCarrierExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbRelPosCarrier record);

    int insertSelective(TbRelPosCarrier record);

    List<TbRelPosCarrier> selectByExample(TbRelPosCarrierExample example);

    TbRelPosCarrier selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbRelPosCarrier record, @Param("example") TbRelPosCarrierExample example);

    int updateByExample(@Param("record") TbRelPosCarrier record, @Param("example") TbRelPosCarrierExample example);

    int updateByPrimaryKeySelective(TbRelPosCarrier record);

    int updateByPrimaryKey(TbRelPosCarrier record);
}