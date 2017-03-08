package com.xybus.dao;

import com.xybus.po.TMobileMessage;
import com.xybus.po.TMobileMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMobileMessageDao {
    long countByExample(TMobileMessageExample example);

    int deleteByExample(TMobileMessageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TMobileMessage record);

    int insertSelective(TMobileMessage record);

    List<TMobileMessage> selectByExample(TMobileMessageExample example);

    TMobileMessage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TMobileMessage record, @Param("example") TMobileMessageExample example);

    int updateByExample(@Param("record") TMobileMessage record, @Param("example") TMobileMessageExample example);

    int updateByPrimaryKeySelective(TMobileMessage record);

    int updateByPrimaryKey(TMobileMessage record);
}