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

import com.xybus.dao.TAccountRecordDao;
import com.xybus.dao.TPassengerDao;
import com.xybus.utils.DbUtil;


@WebServlet("/ChangePayWay")
public class ChangePayWaySerlvet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doPost(request, response);
		 
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		String job_number = request.getParameter("job_number");
		String pay_way;
		try {
			pay_way = request.getParameter("pay_way").toUpperCase();
		} catch (Exception e) {
			pay_way=null;
		}
		PrintWriter pw = response.getWriter();
        SqlSessionFactory sessionFactory = DbUtil.getConnecion();
        SqlSession session = sessionFactory.openSession();
        TAccountRecordDao tAccountRecordDao = session.getMapper(TAccountRecordDao.class);
        Map<String, String> map = new HashMap<String, String>();
		if(job_number!=null && pay_way!=null){
			TPassengerDao tPassengerDao = session.getMapper(TPassengerDao.class);
			map.put("jobnumber", job_number);
			
				if(tPassengerDao.selectByJobNumber(map)==null||tPassengerDao.selectByJobNumber(map).isEmpty()){
					pw.write("输入的工号不存在");
					System.err.println("jobnumber :"+job_number);
					DbUtil.close(session);
					return;
				};
				if(pay_way.equals("U")){
			        map.put("payway", pay_way);
			      System.out.println(tAccountRecordDao.updateByJobNumber(map));
			      pw.write(job_number+"已更新成银联");
				}else if(pay_way.equals("W")){
			        map.put("payway", pay_way);
			      System.out.println(tAccountRecordDao.updateByJobNumber(map));
			      pw.write(job_number+"已更新成微信");
				}else if(pay_way.equals("C")){
			        map.put("payway", pay_way);
			      System.out.println(tAccountRecordDao.updateByJobNumber(map));
			      pw.write(job_number+"已更新成现金");
				}else{
					pw.write("输入的充值类型不正确");
				}
			}else{
				pw.write("请完整输入工号和充值方式");
			}
			DbUtil.close(session);
	}
	//public void  
}
