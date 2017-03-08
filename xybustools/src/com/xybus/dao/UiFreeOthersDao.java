package com.xybus.dao;

import com.xybus.po.UiFreeOthers;
import com.xybus.po.UiFreeOthersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UiFreeOthersDao {
    long countByExample(UiFreeOthersExample example);

    int deleteByExample(UiFreeOthersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UiFreeOthers record);

    int insertSelective(UiFreeOthers record);

    List<UiFreeOthers> selectByExample(UiFreeOthersExample example);

    UiFreeOthers selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UiFreeOthers record, @Param("example") UiFreeOthersExample example);

    int updateByExample(@Param("record") UiFreeOthers record, @Param("example") UiFreeOthersExample example);

    int updateByPrimaryKeySelective(UiFreeOthers record);

    int updateByPrimaryKey(UiFreeOthers record);
}