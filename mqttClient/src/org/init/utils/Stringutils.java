package org.init.utils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.init.db.DatabaseThread;

public class Stringutils {
//	public static DatabaseThread databaseThread= new DatabaseThread();
	static String s1 = "1ab12bcH\\x030P0\\r8888899999";
	public static Map<String, Integer> hostMap = null;
	
	public static boolean is_process=false;
	public static LinkedList<String> linkedList=null;
	static{
		hostMap = new HashMap<String,Integer>();
		hostMap.put("192sgsw", new Integer(1));
		synchronized("1"){
			linkedList =  new LinkedList<String>();
		}
	}	
	public static String getHost(String s) {
		return Long.toHexString(commonChangeFormat(s.substring(0, 3)));
	}
	public static String getRecordTime(String s) {
		return stampToDate(commonChangeFormat(s.substring(3, 8)));
	}
	public static String getFunctionCode(String s) {
		return  s.substring(8, 12);
	}
	public static String getStartAddress(String s) {
		return  Long.toHexString(commonChangeFormat(s.substring(12, 14)));
	}
	public static String getDataLength(String s) {
		return stampToDate(commonChangeFormat(s.substring(15,17)));
	}
	public static List<String> getData(String s) {
		//s=s.substring(17);
		s=s.substring(17);
		ArrayList<String> list= new ArrayList<String>();
		for (int i = 0; i < s.length(); i=i+5) {
			String tmp=s.substring(i, i+5);
			System.out.println("data"+i+":数据为"+tmp);
			tmp=Long.toHexString(commonChangeFormat(tmp));
			list.add(tmp);
		}
		return list;
	}
	private static String stampToDate(long l) {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date (l));
	}
	private static long commonChangeFormat(String s){
		 
		long result = 0;
	//	long l;
		for (int i = 0; i < s.length(); i++) {
			int value=Integer.valueOf(s.charAt(i));
			
			long ii =value*(long)Math.pow(128,s.length()-i);
			result = result+ii;
		}
		return result;
	}
}
