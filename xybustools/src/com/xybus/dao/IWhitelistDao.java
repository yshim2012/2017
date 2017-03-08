package com.xybus.dao;

import com.xybus.po.IWhitelist;
import com.xybus.po.IWhitelistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IWhitelistDao {
    long countByExample(IWhitelistExample example);

    int deleteByExample(IWhitelistExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IWhitelist record);

    int insertSelective(IWhitelist record);

    List<IWhitelist> selectByExample(IWhitelistExample example);

    IWhitelist selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IWhitelist record, @Param("example") IWhitelistExample example);

    int updateByExample(@Param("record") IWhitelist record, @Param("example") IWhitelistExample example);

    int updateByPrimaryKeySelective(IWhitelist record);

    int updateByPrimaryKey(IWhitelist record);
}