package com.xybus.server;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.xybus.dao.TPassengerDao;
import com.xybus.po.TCard;
import com.xybus.po.TMonthSummary;
import com.xybus.po.TPassengerSub;
import com.xybus.utils.AicUtil;
import com.xybus.utils.DbUtil;

@WebServlet("/QueryPassenger")
public class QueryPassengerSerlvet  extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		 doPost(req, resp);
	}

	 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		String jobnumber = req.getParameter("job_number");
		String mobile = req.getParameter("mobile");
			Map map = null;
			PrintWriter p = resp.getWriter();
			if(jobnumber!=null){
				map = AicUtil.getAicData(jobnumber);
				if (map!=null){
					System.out.println(map.get("cardpin"));
					p.write("AIC姓名："+map.get("employeename").toString()+";AIC卡号："+map.get("cardpin").toString()) ;
				}else{
					p.write("AIC系统无此工号") ;
				}
				 
			}
	        SqlSessionFactory sessionFactory = DbUtil.getConnecion();
	        SqlSession session = sessionFactory.openSession();
	        TPassengerDao iBlacklistDao = session.getMapper(TPassengerDao.class);
	        if(jobnumber!=null || mobile!=null){
	        	 Map<String, String> map1 =new HashMap<String, String>();
	        	if(jobnumber!=null && mobile!=null){
	        		map1.put("jobnumber", jobnumber);
	        		map1.put("mobile", mobile);
	        	}else if(jobnumber==null){
	        		map1.put("mobile", mobile);
	        	}else if(mobile==null){
	        		map1.put("jobnumber", jobnumber);
	        	}
			        List<TPassengerSub> PassengerSub = iBlacklistDao.queryForListByNumber(map1);
			    //    DateFormat dateFormat= new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
			        for (TPassengerSub tPassengerSub : PassengerSub) {
					        List<TCard> l = tPassengerSub.getTcards();
					        for (TCard t : l) {
								//System.out.println(t.getCardNo()+"  "+t.getCardPin()+"  "+dateFormat.format(t.getUpdatedTime()));
					        	System.out.println(tPassengerSub.getJobNumber()+"  "+t.getCardPin()+"  "+t.getCardNo());
					        	p.append(" 通勤车系统工号："+tPassengerSub.getJobNumber()+" 通勤车系统卡号："+t.getCardPin()+" 通勤车系统卡流水号："+t.getCardNo()
					        	+" 通勤车系统卡余额："+t.getAmount()+" 通勤车系统卡起始月份："+t.getStartMonth()
					        			);
					        }
					        System.out.println("SUCCESS");
					        List<TMonthSummary> lm =tPassengerSub.gettMonthSummarys();
					        for (TMonthSummary t : lm) {
								//System.out.println(t.getCardNo()+"  "+t.getCardPin()+"  "+dateFormat.format(t.getUpdatedTime()));
					        	System.out.println("  "+t.getValidMonth()+"  "+t.getUiFreeTimes()+t.getUiSpecialTimes());
					        	p.append("结算表有效月份："+t.getValidMonth()+" 充值申请次数："+t.getUiRechargeTimes()+" 充值乘坐次数："+t.getUiRechargeAfterTimes()+" 固定申请次数："+t.getUiFreeTimes()
					        	+" 错时申请次数："+t.getUiOthersTimes()+" 错时乘坐次数："+t.getUiOvertimeAfterTimes()
					        	+" 特种申请次数："+t.getUiSpecialTimes()+" 其他申请次数："+t.getUiOthersTimes());
					        }
					}
			        DbUtil.close(session);
	        }else{
	        	p.write("请输入工号或者手机号") ;
	        }
	}
}
