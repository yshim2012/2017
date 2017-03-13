import static org.junit.Assert.*;

import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.xybus.dao.IBlacklistDao;
import com.xybus.dao.TAccountRecordDao;
import com.xybus.dao.TPassengerDao;
import com.xybus.po.IBlacklist;
import com.xybus.po.TCard;
import com.xybus.po.TPassengerSub;
import com.xybus.utils.DbUtil;



 

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
	@Test
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
	@Test
	public void test3() {
/*	        SqlSessionFactory sessionFactory = DbUtil.getConnecion();
	        SqlSession session = sessionFactory.openSession();
	        TPassengerDao iBlacklistDao = session.getMapper(TPassengerDao.class);
	        List<TPassengerSub> PassengerSub = iBlacklistDao.queryForListByNumber();
	        DateFormat dateFormat= new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
	        for (TPassengerSub tPassengerSub : PassengerSub) {
	        	 System.out.println(tPassengerSub.getJobNumber());
			        List<TCard> l = tPassengerSub.getTcards();
			        for (TCard t : l) {
						System.out.println(t.getCardNo()+"  "+t.getCardPin()+"  "+dateFormat.format(t.getUpdatedTime()));
					}
			        System.out.println("SUCCESS");
			}
	        DbUtil.close(session);*/
	}
	@Test
	public void test4() {
	        SqlSessionFactory sessionFactory = DbUtil.getConnecion();
	        SqlSession session = sessionFactory.openSession();
	        TPassengerDao iBlacklistDao = session.getMapper(TPassengerDao.class);
	        Map map =new HashMap();
	      //  map.put("jobnumber", "T00001");
	    //    map.put("cardpin", "C57810A8");
	        List<TPassengerSub> PassengerSub = iBlacklistDao.queryForListByNumber(map);
	        DateFormat dateFormat= new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
	        for (TPassengerSub tPassengerSub : PassengerSub) {
	        	
			        List<TCard> l = tPassengerSub.getTcards();
			        for (TCard t : l) {
						//System.out.println(t.getCardNo()+"  "+t.getCardPin()+"  "+dateFormat.format(t.getUpdatedTime()));
			        	System.out.println(tPassengerSub.getJobNumber()+"  "+t.getCardPin());
			        }
			        System.out.println("SUCCESS");
			}
	        DbUtil.close(session);
	}
	
	@Test
	public void test5() {
         SqlSessionFactory sessionFactory = DbUtil.getConnecion();
	        SqlSession session = sessionFactory.openSession();
	        TAccountRecordDao tAccountRecordDao = session.getMapper(TAccountRecordDao.class);
	        Map map = new HashMap();
	        String number = "66481";
	        String payway = "U";
	        map.put("number", number);
	        map.put("payway", payway);
	      System.out.println(tAccountRecordDao.updateByJobNumber(map));  
	        DateFormat dateFormat= new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
	        DbUtil.close(session);
	}
}
