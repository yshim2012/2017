package com.xybus.dao;

import com.xybus.po.TbPos;
import com.xybus.po.TbPosExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPosDao {
    long countByExample(TbPosExample example);

    int deleteByExample(TbPosExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbPos record);

    int insertSelective(TbPos record);

    List<TbPos> selectByExample(TbPosExample example);

    TbPos selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbPos record, @Param("example") TbPosExample example);

    int updateByExample(@Param("record") TbPos record, @Param("example") TbPosExample example);

    int updateByPrimaryKeySelective(TbPos record);

    int updateByPrimaryKey(TbPos record);
}