import org.apache.ibatis.example.BlogMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public class TestMybatis {

	@Test
	public void test01() throws IOException {

		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		SqlSession sqlSession = sqlSessionFactory.openSession();
		BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
		BlogMapper mapper2 = sqlSession.getMapper(BlogMapper.class);
		System.out.println(sqlSession.getMapper(BlogMapper.class));
		System.out.println(mapper);
		System.out.println(mapper2);
		Map<String, Object> map = mapper.selectBlog("1");
		System.out.println(map);

	}
}
