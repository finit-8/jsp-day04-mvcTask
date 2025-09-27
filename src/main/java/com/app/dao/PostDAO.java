package com.app.dao;

import java.util.List; 
import java.util.Optional;

import org.apache.ibatis.session.SqlSession;

import com.app.myBatis.config.MyBatisConfig;
//import com.app.vo.PostVO;
import com.app.vo.PostVO;

public class PostDAO {
	public SqlSession sqlSession;
	
	public PostDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);					// DAO가 메모리에 할당될 때 생성자는 자동실행 되기 때문에, 생성자에 작성함.
	}																							// 즉 sql세션객체는 dao할당될 때 생성됨. 

	public void insert(PostVO postVO) {
		sqlSession.insert("post.insert", postVO);
	}
}
