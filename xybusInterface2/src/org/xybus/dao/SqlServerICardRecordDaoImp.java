package org.xybus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.xybus.entity.ICardRecord;
import org.xybus.entity.i_whitelist;
import org.xybus.utils.LogExportUtil;
import org.xybus.utils.SqlServerJdbcUtil;

public class SqlServerICardRecordDaoImp {
	
	
	
	public List<ICardRecord> getCardRecord(){
		List<ICardRecord> list= new ArrayList<ICardRecord>();
		PreparedStatement  preparedStatement=null;
		ResultSet resultSet =null;
		ResultSet version=null; 
		Connection conn2=SqlServerJdbcUtil.getConnection();
		System.out.print("SQLSERVER连接成功"+conn2.toString());
		LogExportUtil.printLog("SQLSERVER连接成功");
		String sql = "select * from I_CARDRECORD  where "
				+" record_time>=(Select CONVERT(varchar(100),dateadd(d,-day(getdate())+1,getdate()), 23) + ' 12:00:00.000')" 
				+"and record_time<(Select CONVERT(varchar(100),DATEADD(m, 1, GETDATE()) - (DATEPART(day, DATEADD(m, 1, GETDATE())) - 1), 23) + ' 12:00:00.000')";
		 try {
			preparedStatement =conn2.prepareStatement(sql);
			 resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {	
				ICardRecord iCardRecord = new ICardRecord();
				iCardRecord.setId(resultSet.getInt("id"));
				iCardRecord.setPosNo(resultSet.getInt("pos_no"));
				iCardRecord.setCardPin(resultSet.getString("card_pin"));		
				iCardRecord.setLongitude(resultSet.getDouble("longitude"));
				iCardRecord.setLatitude(resultSet.getDouble("latitude"));
				iCardRecord.setLocId(resultSet.getInt("loc_id"));
				iCardRecord.setRouteId(resultSet.getInt("route_id"));
				iCardRecord.setTicketType(resultSet.getString("ticket_type"));
				iCardRecord.setRecordTime(resultSet.getTimestamp("record_time"));
				iCardRecord.setCreateTime(resultSet.getTimestamp("created_time"));
				iCardRecord.setStatus(resultSet.getString("Status"));
				list.add(iCardRecord);
//				System.out.println("iCardRecord:"+iCardRecord.getCreateTime());
				String testTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(resultSet.getDate("record_time"));
//				System.out.println(testTime);
			}
		} catch (SQLException e){
			e.printStackTrace();
		}
		return list ;
	}
}
