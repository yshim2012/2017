package com.xybus.dao;

import com.xybus.po.TbLoc;
import com.xybus.po.TbLocExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbLocDao {
    long countByExample(TbLocExample example);

    int deleteByExample(TbLocExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbLoc record);

    int insertSelective(TbLoc record);

    List<TbLoc> selectByExample(TbLocExample example);

    TbLoc selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbLoc record, @Param("example") TbLocExample example);

    int updateByExample(@Param("record") TbLoc record, @Param("example") TbLocExample example);

    int updateByPrimaryKeySelective(TbLoc record);

    int updateByPrimaryKey(TbLoc record);
}