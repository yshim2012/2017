package com.xybus.utils;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DbUtil {
	public  static SqlSessionFactory getConnecion(){
		 String resource = "SqlMapConfig.xml";
	     InputStream is = DbUtil.class.getClassLoader().getResourceAsStream(resource);
 		 return new SqlSessionFactoryBuilder().build(is);
	}
	public static void close(SqlSession sqlSession){
		sqlSession.commit();
		sqlSession.close();
	}
}
