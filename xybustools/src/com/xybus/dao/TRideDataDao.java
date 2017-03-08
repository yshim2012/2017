package com.xybus.dao;

import com.xybus.po.TRideData;
import com.xybus.po.TRideDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TRideDataDao {
    long countByExample(TRideDataExample example);

    int deleteByExample(TRideDataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TRideData record);

    int insertSelective(TRideData record);

    List<TRideData> selectByExample(TRideDataExample example);

    TRideData selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TRideData record, @Param("example") TRideDataExample example);

    int updateByExample(@Param("record") TRideData record, @Param("example") TRideDataExample example);

    int updateByPrimaryKeySelective(TRideData record);

    int updateByPrimaryKey(TRideData record);
}