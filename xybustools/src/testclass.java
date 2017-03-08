import static org.junit.Assert.*;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.xybus.dao.IBlacklistDao;
import com.xybus.po.IBlacklist;



 

public class testclass {

	@Test
	public void test() {
		 String resource = "SqlMapConfig.xml";
	        InputStream is = testclass.class.getClassLoader().getResourceAsStream(resource);
	        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
	        SqlSession session = sessionFactory.openSession();
	        IBlacklistDao iBlacklistDao = session.getMapper(IBlacklistDao.class);
	        IBlacklist t = new IBlacklist();
	        iBlacklistDao.insert(t);
	        System.out.println("SUCCESS");
	        session.commit();
	        session.close(); 
	}
	@Test
	public void test1() {
		 String resource = "SqlMapConfig.xml";
	        InputStream is = testclass.class.getClassLoader().getResourceAsStream(resource);
	        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
	        SqlSession session = sessionFactory.openSession();
	        IBlacklistDao iBlacklistDao = session.getMapper(IBlacklistDao.class);
	      //  IBlacklist t = new IBlacklist();
	        IBlacklist iblack = iBlacklistDao.selectByPrimaryKey(293549);
	        System.out.println(iblack.getCardPin());
	        System.out.println(iblack.getCreatedTime());
	        System.out.println("SUCCESS");
	      //  session.commit();
	        session.close();
	}
	public void test2() {
		 String resource = "SqlMapConfig.xml";
	        InputStream is = testclass.class.getClassLoader().getResourceAsStream(resource);
	        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
	        SqlSession session = sessionFactory.openSession();
	        IBlacklistDao iBlacklistDao = session.getMapper(IBlacklistDao.class);
	      //  IBlacklist t = new IBlacklist();
	        IBlacklist iblack = iBlacklistDao.selectByPrimaryKey(293549);
	        System.out.println(iblack.getCardPin());
	        System.out.println(iblack.getCreatedTime());
	        System.out.println("SUCCESS");
	      //  session.commit();
	        session.close();
	}


}
