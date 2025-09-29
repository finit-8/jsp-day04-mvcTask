package com.app.post.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;
import com.app.dao.PostDAO;
import com.app.exception.PostNotFoundException;
import com.app.vo.PostVO;

public class PostUpdateController implements Action {
	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) {
		Result result = new Result();	
		PostDAO postDAO = new PostDAO();
		Long id = Long.parseLong(req.getParameter("id"));
		
		try {
			PostVO foundPost = postDAO.select(id).orElseThrow(PostNotFoundException::new);
			req.setAttribute("post", foundPost);
		} catch (PostNotFoundException e) {
			req.setAttribute("message", "게시글을 찾을 수 없음");
			System.out.println("PostUpdateController Not Fount 에러 발생");
			result.setPath("/error.jsp");
			return result;
		}

		result.setPath("/update.jsp");
		return result;
	}
}
