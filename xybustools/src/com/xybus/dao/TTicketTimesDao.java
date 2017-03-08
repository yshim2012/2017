package com.xybus.dao;

import com.xybus.po.TTicketTimes;
import com.xybus.po.TTicketTimesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTicketTimesDao {
    long countByExample(TTicketTimesExample example);

    int deleteByExample(TTicketTimesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TTicketTimes record);

    int insertSelective(TTicketTimes record);

    List<TTicketTimes> selectByExample(TTicketTimesExample example);

    TTicketTimes selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TTicketTimes record, @Param("example") TTicketTimesExample example);

    int updateByExample(@Param("record") TTicketTimes record, @Param("example") TTicketTimesExample example);

    int updateByPrimaryKeySelective(TTicketTimes record);

    int updateByPrimaryKey(TTicketTimes record);
}