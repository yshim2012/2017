package com.xybus.dao;

import com.xybus.po.IBlacklist;
import com.xybus.po.IBlacklistExample;
import com.xybus.po.IRideList;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface IBlacklistDao {
    long countByExample(IBlacklistExample example);

    int deleteByExample(IBlacklistExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IBlacklist record);

    int insertSelective(IBlacklist record);

    List<IBlacklist> selectByExample(IBlacklistExample example);

    IBlacklist selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IBlacklist record, @Param("example") IBlacklistExample example);

    int updateByExample(@Param("record") IBlacklist record, @Param("example") IBlacklistExample example);

    int updateByPrimaryKeySelective(IBlacklist record);
    
    int updateByPrimaryKey(IBlacklist record);
    
    List<IRideList> selectbwList(Map map);
}