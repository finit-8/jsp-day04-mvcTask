package com.app.myBatis.config;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisConfig {
// DB 작업할 때마다 new 해서 세션팩토리를 만들지 않고, 한 번 만들어둔 SqlSessionFactory를 가져다 쓰도록 만든 클래스.
	
	private static SqlSessionFactory sqlSessionFactory;
	
	static {
		String resource = "com/app/myBatis/config/config.xml";		// 이 경로의 config.xml파일을 변수에 담고
		try {
			Reader reader = Resources.getResourceAsReader(resource);			// 변수를 읽어서
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);	// DB와의 연결(세션)을 열고 닫는 핵심 객체 '세션팩토리' 생성 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
}
