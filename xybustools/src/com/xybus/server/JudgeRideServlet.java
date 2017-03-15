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

import com.xybus.dao.IBlacklistDao;
import com.xybus.dao.TPassengerDao;
import com.xybus.po.IRideList;
import com.xybus.po.TCard;
import com.xybus.po.TPassengerSub;
import com.xybus.utils.DbUtil;


@WebServlet("/JudgeRide")
public class JudgeRideServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		String job_number = request.getParameter("job_number");
		String card_pin = request.getParameter("card_pin");
		PrintWriter p = response.getWriter();
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
					p.write("名单类型："+i.getBwType()+" 工号："+i.getJobNumber()+" 卡号："
	 	        +i.getCardPin()+" 卡类型："+i.getCardType()+"卡余额：" +i.getAmount()+" 卡起始月份"+i.getStartMonth());
				}
 	       }else{
 	    	  p.write("您输入的工号或者卡号不能坐车,如若是T卡，则可以坐车");
 	       }
 	       DbUtil.close(session);
        }else{
        	p.write("请输入工号或者卡物理号");
        }
	}
}
