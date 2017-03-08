package com.xybus.dao;

import com.xybus.po.TbRouteLoc;
import com.xybus.po.TbRouteLocExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbRouteLocDao {
    long countByExample(TbRouteLocExample example);

    int deleteByExample(TbRouteLocExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbRouteLoc record);

    int insertSelective(TbRouteLoc record);

    List<TbRouteLoc> selectByExample(TbRouteLocExample example);

    TbRouteLoc selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbRouteLoc record, @Param("example") TbRouteLocExample example);

    int updateByExample(@Param("record") TbRouteLoc record, @Param("example") TbRouteLocExample example);

    int updateByPrimaryKeySelective(TbRouteLoc record);

    int updateByPrimaryKey(TbRouteLoc record);
}