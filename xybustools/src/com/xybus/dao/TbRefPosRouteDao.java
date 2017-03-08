package com.xybus.dao;

import com.xybus.po.TbRefPosRoute;
import com.xybus.po.TbRefPosRouteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbRefPosRouteDao {
    long countByExample(TbRefPosRouteExample example);

    int deleteByExample(TbRefPosRouteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbRefPosRoute record);

    int insertSelective(TbRefPosRoute record);

    List<TbRefPosRoute> selectByExample(TbRefPosRouteExample example);

    TbRefPosRoute selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbRefPosRoute record, @Param("example") TbRefPosRouteExample example);

    int updateByExample(@Param("record") TbRefPosRoute record, @Param("example") TbRefPosRouteExample example);

    int updateByPrimaryKeySelective(TbRefPosRoute record);

    int updateByPrimaryKey(TbRefPosRoute record);
}