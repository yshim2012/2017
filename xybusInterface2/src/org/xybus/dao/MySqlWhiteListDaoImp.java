package org.xybus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.xybus.entity.Employee;
import org.xybus.entity.i_whitelist;
import org.xybus.utils.JdbcUtil;
import org.xybus.utils.LogExportUtil;
import org.xybus.utils.SqlServerJdbcUtil;

public class MySqlWhiteListDaoImp implements OperateDAO{

	private  int SqlServerCount;
	public int getSqlServerCount() {
		return SqlServerCount;
	}
	private  long SqlServerVersion;
	public long getSqlServerVersion() {
		return SqlServerVersion;
	}

	@Override
	public void save(List<Employee> list) {
		String sql="INSERT INTO i_whitelist(ID, VERSION, CARD_PIN, STATUS, UPDATE_TIME, CREATED_USER, CREATED_TIME) VALUES (?, ?, ?, ?, ?, ?, ?)";
		Connection conn = JdbcUtil.getConnection();
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement=conn.prepareStatement(sql);
			for (int i = 0; i < list.size(); i++) {
				i_whitelist tem=(i_whitelist)list.get(i);
				preparedStatement.setInt(1, tem.getId());
				preparedStatement.setString(2, tem.getVersion()); 
				preparedStatement.setString(3, tem.getCard_pin()); 
				preparedStatement.setString(4, tem.getStatus());
				preparedStatement.setDate(5, tem.getUpdate_time());
				preparedStatement.setInt(6, tem.getCreated_id());
				preparedStatement.setDate(7, tem.getCreated_time());
				preparedStatement.addBatch();
			}
			preparedStatement.executeBatch();
			i_whitelist tem=(i_whitelist)list.get(0);
			String version = tem.getVersion();
			System.out.println("更新白名单成功！版本号为："+version);
			LogExportUtil.printLog("更新白名单成功！版本号为："+version);
			
		} catch (SQLException e) {
			System.out.println("更新白名单失败");
			LogExportUtil.printLog("更新白名单失败"+e.getMessage());
			
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

	@Override
	public void delete(Employee e) {
	}

	@Override
	public void selectversion() {	
		PreparedStatement  preparedStatement=null;
		ResultSet resultSet =null;
		ResultSet version=null; 
		Connection conn=JdbcUtil.getConnection();
		//System.out.println(conn2);
		System.out.print("MYSQL连接成功"+conn.toString());
		LogExportUtil.printLog("MYSQL连接成功");
		String sql = "select count(*) from i_whitelist where version=(select max(version) from i_whitelist )";
		
		try {
			 preparedStatement =conn.prepareStatement(sql);
			 resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {			
				SqlServerCount =(int)resultSet.getLong(1);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			 preparedStatement=null;
			 resultSet =null;
		}
		String getversionsql = "select max(version) from i_whitelist";
		try {
			 preparedStatement =conn.prepareStatement(getversionsql);
			 resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				SqlServerVersion =(long)resultSet.getLong(1);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		JdbcUtil.close(conn, preparedStatement, resultSet);
	}

	@Override
	public void selectMAX() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void truncateTable() {
		Connection conn=JdbcUtil.getConnection();
		PreparedStatement  preparedStatement=null;
		String sql="TRUNCATE TABLE i_whitelist";
		try {
			preparedStatement =conn.prepareStatement(sql);
			int count = preparedStatement.executeUpdate();
			System.out.println("mysql删除白名单成功--"+count);
			LogExportUtil.printLog("mysql删除白名单成功--");
		} catch (SQLException e) {	
			e.printStackTrace();
		}
		
		JdbcUtil.close(conn, preparedStatement, null);
	}

}
