

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.init.dao.T_AnalysisMap;
import org.init.po.T_Analysis;
import org.junit.Before;
import org.junit.Test;



public class TestDB {
	private SqlSessionFactory sqlSessionFactory;
	
	@Before
	public void setUp() throws Exception {
		// 创建sqlSessionFactory
		String resource = "../config/SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	@Test
	private void testDb() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		T_AnalysisMap t = sqlSession.getMapper(T_AnalysisMap.class);
		System.out.println("hello");
		List l = t.findAnalysisList();
		System.out.println(l.size());
	}

}
