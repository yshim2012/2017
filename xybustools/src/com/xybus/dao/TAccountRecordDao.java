package com.xybus.dao;

import com.xybus.po.TAccountRecord;
import com.xybus.po.TAccountRecordExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TAccountRecordDao {
    long countByExample(TAccountRecordExample example);

    int deleteByExample(TAccountRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TAccountRecord record);

    int insertSelective(TAccountRecord record);

    List<TAccountRecord> selectByExample(TAccountRecordExample example);

    TAccountRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TAccountRecord record, @Param("example") TAccountRecordExample example);

    int updateByExample(@Param("record") TAccountRecord record, @Param("example") TAccountRecordExample example);

    int updateByPrimaryKeySelective(TAccountRecord record);

    int updateByPrimaryKey(TAccountRecord record);
    int updateByJobNumber(Map map);
}