package org.xybus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.xybus.entity.Employee;
import org.xybus.entity.i_blacklist;
import org.xybus.entity.i_whitelist;
import org.xybus.utils.LogExportUtil;
import org.xybus.utils.SqlServerJdbcUtil;

public class SqlServerBlackListDaoImp implements OperateDAO{

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
		
		
	}

	@Override
	public void delete(Employee e) {
		
		
	}

	@Override
	public void selectversion() {	
		PreparedStatement  preparedStatement=null;
		ResultSet resultSet =null;
		ResultSet version=null; 
		Connection conn2=SqlServerJdbcUtil.getConnection();
		//System.out.println(conn2);
		System.out.print("SQLSERVER连接成功"+conn2.toString());
		LogExportUtil.printLog("SQLSERVER连接成功");
		String sql = "select count(*) from i_blacklist where version=(select max(version) from i_blacklist )";
		
		try {
			 preparedStatement =conn2.prepareStatement(sql);
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
		String getversionsql = "select max(version) from i_blacklist";
		try {
			 preparedStatement =conn2.prepareStatement(getversionsql);
			 resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				SqlServerVersion =(long)resultSet.getLong(1);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		SqlServerJdbcUtil.close(conn2, preparedStatement, resultSet);
	}

	@Override
	public List selectMAX() {
		List<Employee> list= new ArrayList<Employee>();
		PreparedStatement  preparedStatement=null;
		ResultSet resultSet =null;
		ResultSet version=null; 
		Connection conn2=SqlServerJdbcUtil.getConnection();
		String sql="select  * from i_blacklist where version=(select max(version) from i_blacklist)";
		 try {
			preparedStatement =conn2.prepareStatement(sql);
			 resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {	
				i_blacklist employee = new i_blacklist();
				employee.setId(resultSet.getInt("id"));
				employee.setVersion(resultSet.getString("Version"));
				employee.setStatus(resultSet.getString("Status"));
				employee.setCard_pin(resultSet.getString("card_pin"));
				employee.setUpdate_time(resultSet.getTimestamp("Update_time"));
				employee.setCreated_time(resultSet.getTimestamp("Created_time"));
				employee.setCreated_id(resultSet.getInt("Created_user"));
		//		System.out.println(employee.getCard_pin()+employee.getId());
				list.add(employee);
				
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void truncateTable() {
		
	}

}
