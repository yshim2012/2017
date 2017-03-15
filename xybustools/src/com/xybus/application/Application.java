package com.xybus.application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.List;

import com.ucca.common.ArrayOfEmployee;
import com.ucca.common.Employee;
import com.ucca.webservice.UccaService;
import com.ucca.webservice.UccaServicePortType;

public class Application {

/*	public static void main(String[] args) {
		
		   try {  
	            InputStream is = new FileInputStream("C:\\Users\\Administrator\\Desktop\\123.txt");  
	            BufferedReader reader = new BufferedReader(  
	                    new InputStreamReader(is));  
	            String str = null;
	            while (true) {
	                str = reader.readLine();  
	                if(str!=null){
	                   System.out.println(str);
	                   str=str.replaceAll(" ","");
	                   getData(str);
	                  }
	                else 
	                    break;  
	            }      
	            is.close();  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }  
	}
*/
	private static void getData(String s) {
		UccaService uccaService = new UccaService();
		UccaServicePortType uccaServicePortType= uccaService.getPort(UccaServicePortType.class);			
		ArrayOfEmployee a  = (ArrayOfEmployee)uccaServicePortType.queryCardIDAndVaildCode(s,"svw@2014aic");
		if(a!=null){
			List<Employee> list= a.getEmployee();
			
			if(list!=null){
				
				try {
					Employee e =list.get(0);
					System.out.println(getCardPin(e.getCardId().getValue())+";"+e.getCardStatus().getValue()+";"+e.getCareDate().getValue()+";"+e.getEmployeeId().getValue()+";"+e.getEmployeeName().getValue());
					s = getCardPin(e.getCardId().getValue())+"  "+e.getEmployeeId().getValue();
					method1(s);
				} catch (Exception e) {
					method1(s+"  is null");
				}
			}
		}
	}
	
	public static String getCardPin(String s){
	    	String ss=Long.toHexString(Long.valueOf(s));
	    	 System.out.println(Long.toHexString(Long.valueOf(s)));
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
	    	 System.out.println(ss);
	    	 return ss;
	} 
	public static void method1(String s) {
		FileWriter fw = null;
		try {
		File f=new File("C:\\Users\\Administrator\\Desktop\\result123.txt");
		fw = new FileWriter(f, true);
		} catch (IOException e) {
		e.printStackTrace();
		}
		PrintWriter pw = new PrintWriter(fw);
		pw.println(s);
		pw.flush();
		try {
		fw.flush();
		pw.close();
		fw.close();
		} catch (IOException e) {
		e.printStackTrace();
		}
		}

}
