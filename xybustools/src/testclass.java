import static org.junit.Assert.*;

import java.io.InputStream;
import java.io.PrintWriter;
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
import com.xybus.po.IRideList;
import com.xybus.po.TCard;
import com.xybus.po.TMonthSummary;
import com.xybus.po.TPassengerSub;
import com.xybus.utils.AicUtil;
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
	        map.put("jobnumber", "T00001");
	    //    map.put("cardpin", "C57810A8");
	        List<TPassengerSub> PassengerSub = iBlacklistDao.queryForListByNumber(map);
	        DateFormat dateFormat= new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
	        for (TPassengerSub tPassengerSub : PassengerSub) {
	        	
			        List<TCard> l = tPassengerSub.getTcards();
			        for (TCard t : l) {
						//System.out.println(t.getCardNo()+"  "+t.getCardPin()+"  "+dateFormat.format(t.getUpdatedTime()));
			        	System.out.println(tPassengerSub.getJobNumber()+"  "+t.getCardPin()+"  "+t.getCardNo());
			        }
			        System.out.println("SUCCESS");
			        List<TMonthSummary> lm =tPassengerSub.gettMonthSummarys();
			        for (TMonthSummary t : lm) {
						//System.out.println(t.getCardNo()+"  "+t.getCardPin()+"  "+dateFormat.format(t.getUpdatedTime()));
			        	System.out.println("  "+t.getValidMonth()+"  "+t.getUiFreeTimes()+t.getUiSpecialTimes());
			        }
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
	@Test
	public void test6() {
		Map map = AicUtil.getAicData("64514"); 
		if(map!=null)
		System.out.println(map.get("cardpin"));
	}
	
	@Test
	public void test7() {
		String job_number ="54827";
		String card_pin = null;
		PrintWriter p = null;
		Map map = new HashMap();
        if(job_number!=null || card_pin!=null){
        	if(job_number!=null && card_pin!=null){
        		map.put("jobnumber", job_number);
        		map.put("cardpin", card_pin);
        	}else if(job_number==null){
        		map.put("cardpin", card_pin);
        	}else if(card_pin==null){
        		map.put("jobnumber", job_number);
        	}
        	 SqlSessionFactory sessionFactory = DbUtil.getConnecion();
 	        SqlSession session = sessionFactory.openSession();
 	        IBlacklistDao iBlacklistDao = session.getMapper(IBlacklistDao.class);
 	       List<IRideList> iRideList = iBlacklistDao.selectbwList(map);
 	       if(iRideList!=null && iRideList.size()>0){
	 	        for (IRideList i : iRideList) {
					System.out.println("名单类型："+i.getBwType()+" 工号："+i.getJobNumber()+" 卡号："
	 	        +i.getCardPin()+" 卡类型："+i.getCardType()+"卡余额：" +i.getAmount()+" 卡起始月份"+i.getStartMonth());
				}
 	       }else{
 	 //   	  p.write("您输入的工号或者卡号不能坐车,如若是T卡，则可以坐车");
 	       }
 	       DbUtil.close(session);
        }
	}
}
