package org.xybus.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.xybus.entity.ICardRecord;
import org.xybus.entity.i_whitelist;
import org.xybus.utils.JdbcUtil;
import org.xybus.utils.LogExportUtil;
import org.xybus.utils.SqlServerJdbcUtil;

public class MySqlICardRecordDaoImp {
	
	public void InsertCardRecord(List list){
		String sql="INSERT INTO i_cardrecord (id, POS_NO, CARD_PIN, LONGITUDE, LATITUDE, LOC_ID, ROUTE_ID, TICKET_TYPE, RECORD_TIME,CREATED_TIME, STATUS) VALUES (?, ?, ?, ?, ?, ?, ?,?, ?, ?, ?)";
		Connection conn = JdbcUtil.getConnection();
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement=conn.prepareStatement(sql);
			for (int i = 0; i < list.size(); i++) {
				ICardRecord tem=(ICardRecord)list.get(i);
				preparedStatement.setInt(1, tem.getId());
				preparedStatement.setInt(2, tem.getPosNo()); 
				preparedStatement.setString(3, tem.getCardPin()); 
				preparedStatement.setDouble(4, tem.getLongitude());
				preparedStatement.setDouble(5, tem.getLatitude());
				preparedStatement.setInt(6, tem.getLocId());
				preparedStatement.setInt(7, tem.getRouteId());
				preparedStatement.setString(8, tem.getTicketType());
				preparedStatement.setTimestamp(9,  tem.getRecordTime());
				preparedStatement.setTimestamp(10, tem.getCreateTime());
				preparedStatement.setString(11, tem.getStatus());
				preparedStatement.addBatch();
				if(i%100==0){
					preparedStatement.executeBatch();
					preparedStatement.clearBatch();
				}
			}
			preparedStatement.executeBatch();
			System.out.println("mysql更新乘车记录成功！版本号为：");
//			LogExportUtil.printLog("更新乘车记录成功！版本号为："+version);
			
		} catch (SQLException e) {
			System.out.println("更新乘车记录失败");
//			LogExportUtil.printLog("更新白名单失败"+e.getMessage());
			
			e.printStackTrace();
		}finally{
			try {
				preparedStatement.clearBatch();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			JdbcUtil.close(conn, preparedStatement);
		}
	}
	public void truncateTable() {
		Connection conn=JdbcUtil.getConnection();
		PreparedStatement  preparedStatement=null;
		String sql="TRUNCATE TABLE i_cardrecord";
		try {
			preparedStatement =conn.prepareStatement(sql);
			int count = preparedStatement.executeUpdate();
			System.out.println("mysql删除乘车记录成功--"+count);
 	    	LogExportUtil.printLog("mysql删除乘车记录成功--");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		JdbcUtil.close(conn, preparedStatement, null);
	}
}
