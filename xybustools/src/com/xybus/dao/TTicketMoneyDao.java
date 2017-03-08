package com.xybus.dao;

import com.xybus.po.TTicketMoney;
import com.xybus.po.TTicketMoneyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTicketMoneyDao {
    long countByExample(TTicketMoneyExample example);

    int deleteByExample(TTicketMoneyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TTicketMoney record);

    int insertSelective(TTicketMoney record);

    List<TTicketMoney> selectByExample(TTicketMoneyExample example);

    TTicketMoney selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TTicketMoney record, @Param("example") TTicketMoneyExample example);

    int updateByExample(@Param("record") TTicketMoney record, @Param("example") TTicketMoneyExample example);

    int updateByPrimaryKeySelective(TTicketMoney record);

    int updateByPrimaryKey(TTicketMoney record);
}