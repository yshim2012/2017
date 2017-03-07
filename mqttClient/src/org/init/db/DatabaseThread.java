package org.init.db;

import org.init.po.T_Analysis;
import org.init.utils.Stringutils;

public class DatabaseThread implements Runnable {

	private boolean canceld=false;
	public DatabaseThread(){
		
	}
	public void is_canceld(){
		this.canceld=false;
	}
	@Override
	public void run() {
		
		while (canceld==false) {
			System.out.println(1234567);
			String s=null;
			synchronized("1"){
				if(Stringutils.linkedList.size()!=0){
					s=Stringutils.linkedList.removeFirst();
					System.out.println("线程上的："+s);
					T_Analysis t_analysis = new T_Analysis();
					
//					System.out.println("主机："+Stringutils.getHost(s));
//		        	  System.out.println("记录时间："+Stringutils.getRecordTime(s));
//		        	  System.out.println("功能代码 ："+Stringutils.getFunctionCode(s));
//		        	  System.out.println("数据起始地址 ："+Stringutils.getStartAddress(s));
//		        	  System.out.println("数据长度 ："+Stringutils.getDataLength(s));
//		        	  System.out.println("数据集合："+Stringutils.getData(s).get(0)+"  "+Stringutils.getData(s).get(1));
//		        	  System.out.println(); 
				}
				 canceld=true;
	        	  try {
	        		canceld=true;
	        		"1".notifyAll();
	        		"1".wait();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		}
	}

}
