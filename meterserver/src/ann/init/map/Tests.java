package ann.init.map;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import ann.init.po.T_Analysis;

public class Tests {
	 @Test
	    public void test(){
	        String resource = "SqlMapConfig.xml";
	        InputStream is = Tests.class.getClassLoader().getResourceAsStream(resource);
	        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
	        SqlSession session = sessionFactory.openSession();
	        String statement = "ann.init.dao.T_AnalysisMap.findMeterList";	        
	        T_Analysis s = session.selectOne(statement, "1123");
	          System.out.println(s);
	 }
	 @Test
	    public void testinsert(){
	        String resource = "SqlMapConfig.xml";
	        InputStream is = Tests.class.getClassLoader().getResourceAsStream(resource);
	        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
	        SqlSession session = sessionFactory.openSession();
	        String statement = "ann.init.dao.T_AnalysisMap.insertt_analysis";
	        T_Analysis t = new T_Analysis();
	        t.setAnalysis_data1("1234");
	        t.setFunction_code("123");
	        t.setStart_address("1234");
	        t.setData_length("123");
	        System.out.println(session.insert(statement,t));
	        session.commit();
	        session.close();
	 }
}
