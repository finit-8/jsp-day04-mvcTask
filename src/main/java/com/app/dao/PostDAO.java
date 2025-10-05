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
		sqlSession.insert("post.write", postVO);
	}
	
	public List<PostVO> selectAll() {
		List<PostVO> list = sqlSession.selectList("post.selectAll");
		return list;
	}
	
	public Optional<PostVO> select(Long id) {
		return Optional.ofNullable(sqlSession.selectOne("post.select", id));
	}
	
	public void update(PostVO postVO) {
		sqlSession.update("post.update", postVO);
	}
	
	public void delete(Long id) {
		sqlSession.delete("post.delete", id);
	}
}
