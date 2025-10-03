package com.app.post.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;
import com.app.dao.PostDAO;

public class PostReadController implements Action{
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		PostDAO postDAO = new PostDAO();
		
		Long id = Long.parseLong(req.getParameter("id"));
		
		try {
			req.setAttribute("post", postDAO.select(id).orElseThrow());
		} catch (Exception e) {
			req.setAttribute("message", "게시글을 찾을 수 없습니다.");
			result.setPath("/error.jsp");
		}
		
		result.setPath("/read.jsp");
		return result;
	}
}
