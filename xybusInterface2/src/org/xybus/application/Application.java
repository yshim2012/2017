package org.xybus.application;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.xybus.dao.MySqlBlackListDaoImp;
import org.xybus.dao.MySqlICardRecordDaoImp;
import org.xybus.dao.MySqlWhiteListDaoImp;
import org.xybus.dao.SqlServerBlackListDaoImp;
import org.xybus.dao.SqlServerICardRecordDaoImp;
import org.xybus.dao.SqlServerWhiteListDaoImp;
import org.xybus.utils.JdbcUtil;
import org.xybus.utils.LogExportUtil;


public class Application {

	public static void main(String[] args) {
		Properties props = new Properties();
		int thread_time=60000;
		try {
			props.load(JdbcUtil.class.getResourceAsStream("/mysql.properties"));
			thread_time=  Integer.parseInt(props.getProperty("threadtime"));
		} catch (IOException e1) {
		
			e1.printStackTrace();
		}
		operateICardRecord();
		while(true){
			
		operateIwhiteList();

		operateIblackList();
		int TIMES =30;
			for (int i = 0; i <30; i++) {
				try {
					
					Thread.sleep(thread_time);
					System.out.println("倒计时更新"+(TIMES-(i+1))+"分");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static void operateICardRecord(){
		SqlServerICardRecordDaoImp sqlServerICardRecordDaoImp = new SqlServerICardRecordDaoImp();
		List list = sqlServerICardRecordDaoImp.getCardRecord();
		MySqlICardRecordDaoImp mySqlICardRecordDaoImp = new MySqlICardRecordDaoImp();
		mySqlICardRecordDaoImp.truncateTable();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		mySqlICardRecordDaoImp.InsertCardRecord(list);
	}
	
	private static void operateIwhiteList() {
		SqlServerWhiteListDaoImp sqlServerDao= new SqlServerWhiteListDaoImp();
		sqlServerDao.selectversion();
		System.out.println("sqlserver白名单数量为："+sqlServerDao.getSqlServerCount()+"");
		System.out.println("sqlserver白名单版本号为："+sqlServerDao.getSqlServerVersion()+"");
		LogExportUtil.printLog("sqlserver白名单数量为："+sqlServerDao.getSqlServerCount()+"");
		LogExportUtil.printLog("sqlserver白名单版本号为："+sqlServerDao.getSqlServerVersion()+"");
		MySqlWhiteListDaoImp mysqldao= new MySqlWhiteListDaoImp();
		mysqldao.selectversion();
		System.out.println(mysqldao.getSqlServerCount()+"");
		System.out.println(mysqldao.getSqlServerVersion()+"");
		LogExportUtil.printLog("mysql白名单数量为："+mysqldao.getSqlServerCount()+"");
		LogExportUtil.printLog("mysql白名单版本号为："+mysqldao.getSqlServerVersion()+"");
		if ((mysqldao.getSqlServerCount()!=sqlServerDao.getSqlServerCount())||(mysqldao.getSqlServerVersion()!=sqlServerDao.getSqlServerVersion())) {
//			;
			mysqldao.truncateTable();
			mysqldao.save(sqlServerDao.selectMAX());
		} else {
			System.out.println("当前版本白名单为最新，无需更新");
			LogExportUtil.printLog("当前版本白名单为最新，无需更新");
		}
	}
	private static void operateIblackList() {
		SqlServerBlackListDaoImp sqlServerDao= new SqlServerBlackListDaoImp();
		sqlServerDao.selectversion();
		System.out.println("sqlserver黑名单数量为："+sqlServerDao.getSqlServerCount()+"");
		System.out.println("sqlserver黑名单版本号为："+sqlServerDao.getSqlServerVersion()+"");
		LogExportUtil.printLog("sqlserver黑名单数量为："+sqlServerDao.getSqlServerCount()+"");
		LogExportUtil.printLog("sqlserver黑名单版本号为："+sqlServerDao.getSqlServerVersion()+"");
		MySqlBlackListDaoImp mysqldao= new MySqlBlackListDaoImp();
		mysqldao.selectversion();
		System.out.println(mysqldao.getSqlServerCount()+"");
		System.out.println(mysqldao.getSqlServerVersion()+"");
		LogExportUtil.printLog("mysql黑名单数量为："+mysqldao.getSqlServerCount()+"");
		LogExportUtil.printLog("mysql黑名单版本号为："+mysqldao.getSqlServerVersion()+"");
		if ((mysqldao.getSqlServerCount()!=sqlServerDao.getSqlServerCount())||(mysqldao.getSqlServerVersion()!=sqlServerDao.getSqlServerVersion())) {
			mysqldao.truncateTable();
			mysqldao.save(sqlServerDao.selectMAX());
		} else {
			System.out.println("当前版本黑名单为最新，无需更新");
			LogExportUtil.printLog("当前版本黑名单为最新，无需更新");
		}
	}


}
