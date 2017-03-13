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
import com.xybus.po.TPassengerSub;
import com.xybus.utils.DbUtil;


@WebServlet("/JudgeRide")
public class JudgeRideServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String job_number = request.getParameter("job_number");
		String card_pin = request.getParameter("card_pin");
		PrintWriter p = response.getWriter();
        if(job_number!=null || card_pin!=null){
        	 SqlSessionFactory sessionFactory = DbUtil.getConnecion();
            SqlSession session = sessionFactory.openSession();
            TPassengerDao iBlacklistDao = session.getMapper(TPassengerDao.class);
            Map<String, String> map =new HashMap<String, String>();
        	if(job_number!=null)
        	 map.put("jobnumber",job_number);
        	if(card_pin!=null)
        	map.put("cardpin",card_pin);
            List<TPassengerSub> PassengerSub = iBlacklistDao.queryForListByNumber(map);
            DateFormat dateFormat= new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
            for (TPassengerSub tPassengerSub : PassengerSub) {
            	
    		        List<TCard> l = tPassengerSub.getTcards();
    		        for (TCard t : l) {
    					//System.out.println(t.getCardNo()+"  "+t.getCardPin()+"  "+dateFormat.format(t.getUpdatedTime()));
    		        	System.out.println(tPassengerSub.getJobNumber()+"  "+t.getCardPin());
    		        	p.write(tPassengerSub.getJobNumber()+"  "+t.getCardPin());
    		        }
    		        System.out.println("SUCCESS");
    		}
            p.append("ssss");
            DbUtil.close(session);
            p.close();
        }
	}
}
