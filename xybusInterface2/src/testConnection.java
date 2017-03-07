import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.xybus.dao.MySqlWhiteListDaoImp;
import org.xybus.dao.SqlServerWhiteListDaoImp;
import org.xybus.utils.JdbcUtil;
import org.xybus.utils.SqlServerJdbcUtil;

public class testConnection {
	@Test
	public  void testMysqlConnection(){
		Connection conn=JdbcUtil.getConnection();
		System.out.println(conn);
		JdbcUtil.close(conn, null);
	}
	@Test
	public  void testSqlServerConnection(){  
		Connection conn2=SqlServerJdbcUtil.getConnection();
		//System.out.println(conn2);
		System.out.print("连接成功"+conn2.toString());
		SqlServerJdbcUtil.close(conn2, null);
	}
	
	@Test
	public  void testSqlServerSelect(){
		SqlServerWhiteListDaoImp s= new SqlServerWhiteListDaoImp();
		s.selectversion();
		System.out.println(s.getSqlServerCount()+"");
		System.out.println(s.getSqlServerVersion()+"");
		s.selectMAX();
		
	}
	@Test
	public  void testMySqlSelect(){
		MySqlWhiteListDaoImp s= new MySqlWhiteListDaoImp();
		s.selectversion();
		
		System.out.println(s.getSqlServerCount()+"");
		System.out.println(s.getSqlServerVersion()+"");
	}
	@Test
	public void teste() {
		String s= "1234";
		FileWriter fw = null;
		try {
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			String ss=df.format(new Date());
			
			File directory = new File("");//参数为空 
			String courseFile = directory.getCanonicalPath();
			File file =new File(courseFile+"\\Log");
			if  (!file .exists() ||!file.isDirectory())      
			{       
			    System.out.println("//不存在");  
			    file .mkdir();    
			}
			courseFile=courseFile+"\\Log\\"+ss+".txt";
			
			File f=new File(courseFile);
			fw = new FileWriter(f, true);
			} catch (IOException e) {
				e.printStackTrace();
			}
		PrintWriter pw = new PrintWriter(fw);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String ss=df.format(new Date());
		pw.println(ss+" : "+s);
		pw.flush();
		try {
			fw.flush();
			pw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	@Test
	public void testFileExist()  {
		try {
			File directory = new File("");//参数为空 
			String courseFile = directory.getCanonicalPath();
			//courseFile=courseFile+"\\Log\\"+"2017-01-22"+".txt";
			File file =new File(courseFile+"\\Log");
			if  (!file .exists() ||!file.isDirectory())      
			{       
			    System.out.println("//不存在");  
			    file.mkdir();   
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
