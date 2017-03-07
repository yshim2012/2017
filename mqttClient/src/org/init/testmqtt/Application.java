package org.init.testmqtt;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.init.dao.T_AnalysisMap;
import org.init.utils.Stringutils;
import org.junit.Before;
import org.junit.Test;



public class Application {

    public static void main(String[] args)  {
  
    	//new SubscribeThread().start();
    //	new PublicThread().start();
    	System.out.println(Application.class.getClassLoader().getResource(""));
    	try {
			testDb();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

    	
    }
    private static void testDb() throws IOException {

    	 
    	
    		// 创建sqlSessionFactory
  //  	System.out.println("1".getClass().getClassLoader().getResource("/").getPath()); 
 		 String resource = "SqlMapConfig.xml";
    //	File file =new File("./config/SqlMapConfig.xml") ;
    		InputStream inputStream;
  			inputStream = Resources.getResourceAsStream(resource);
    		//inputStream = new FileInputStream(file);
//		
    		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    		SqlSession sqlSession = sqlSessionFactory.openSession();
    		T_AnalysisMap t = sqlSession.getMapper(T_AnalysisMap.class);
    		System.out.println("hello");
//    		List l = t.findAnalysisList();
//    		System.out.println(l.size());
    	 

	}

  
 }
            