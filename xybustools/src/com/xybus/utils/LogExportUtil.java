package com.xybus.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogExportUtil {
	public static void printLog(String s) {
		FileWriter fw = null;
		try {
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			String ss=df.format(new Date());
			
			File directory = new File("");//参数为空 
			String courseFile = directory.getCanonicalPath();
			File file =new File(courseFile+"\\Log");
			if  (!file .exists() ||!file.isDirectory())      
			{       
			   // System.out.println("//不存在");  
			    file .mkdir();    
			}
			courseFile=courseFile+"\\Log\\"+ss+".txt";
			
			File f=new File(courseFile);
			fw = new FileWriter(f, true);
			} catch (IOException e) {
				e.printStackTrace();
			}
		PrintWriter pw = new PrintWriter(fw);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String ss=df.format(new Date());
		pw.println(ss+": "+s);
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
