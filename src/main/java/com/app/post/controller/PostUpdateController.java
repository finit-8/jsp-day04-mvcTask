package com.app.post.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;
import com.app.dao.PostDAO;
import com.app.exception.PostNotFoundException;
import com.app.vo.PostVO;

public class PostUpdateController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		
		PostDAO postDAO = new PostDAO();
		
		try {
			Long id = Long.parseLong(req.getParameter("id"));
			PostVO postVO = postDAO.select(id).orElseThrow(PostNotFoundException::new);		
			
			req.setAttribute("post", postVO);
			result.setPath("/update.jsp");
			
		} catch (PostNotFoundException e) {
			System.out.println("PostUpdateController 오류발생");
			req.setAttribute("message", "게시글을 찾을 수 없습니다");
			result.setPath("/error.jsp");
		}
		
		
		return result;
	}

}
