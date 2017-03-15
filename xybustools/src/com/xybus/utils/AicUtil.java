package com.xybus.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ucca.common.ArrayOfEmployee;
import com.ucca.common.Employee;
import com.ucca.webservice.UccaService;
import com.ucca.webservice.UccaServicePortType;

public class AicUtil {
	public static String getCardPin(String s){
    	String ss=Long.toHexString(Long.valueOf(s));
    	 if(ss.length()==8){
    		 String tmp="";
    		 char[] c=ss.toCharArray();
    		  tmp=tmp+c[6];
    		  tmp=tmp+c[7];
    		  tmp=((((((tmp+c[4])+c[5])+c[2])+c[3])+c[0])+c[1]);
    		  ss=tmp.toUpperCase();
    	 }else if(ss.length()==7){
    		 String tmp="";
    		 char[] c=ss.toCharArray();
    		  tmp=tmp+c[6];
    		 
    		  tmp=((((((tmp+c[4])+c[5])+c[2])+c[3])+c[0])+c[1]);
    		  ss=tmp.toUpperCase();
    	 }
    	 return ss;
	} 
	public static Map getAicData(String s) {
		UccaService uccaService = new UccaService();
		UccaServicePortType uccaServicePortType= uccaService.getPort(UccaServicePortType.class);			
		ArrayOfEmployee a  = (ArrayOfEmployee)uccaServicePortType.queryCardIDAndVaildCode(s,"svw@2014aic");
		Map map = new HashMap();
		if(a!=null){
			List<Employee> list= a.getEmployee();
			
			if(list!=null){
				
				try {
					Employee e =list.get(0);
					System.out.println(getCardPin(e.getCardId().getValue())+";"+e.getCardStatus().getValue()+";"
					+e.getCareDate().getValue()+";"+e.getEmployeeId().getValue()+";"+e.getEmployeeName().getValue());
					s = getCardPin(e.getCardId().getValue())+"  "+e.getEmployeeId().getValue();
					map.put("cardpin", getCardPin(e.getCardId().getValue()));
					map.put("cardstatus", e.getCardStatus().getValue());
					map.put("caredate", e.getCareDate().getValue());
					map.put("employeeid", e.getEmployeeId().getValue());
					map.put("employeename", e.getEmployeeName().getValue());
					return map;
				} catch (Exception e) {
					return null;
				}
			}
		}
		return null;
	}
	
}
