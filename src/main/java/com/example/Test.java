/**
 *    Copyright 2009-2020 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.example;

import org.apache.ibatis.example.BlogMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public class Test {

//  public static void main(String[] args) throws IOException {
//
//    String resource = "mybatis-config.xml";
//    InputStream inputStream = Resources.getResourceAsStream(resource);
//    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//
//    SqlSession sqlSession = sqlSessionFactory.openSession();
//    BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
//    Map<String, Object> map = mapper.selectBlog("1");
//    System.out.println(map);
//
//  }



}
