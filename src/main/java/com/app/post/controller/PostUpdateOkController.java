package com.app.post.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;
import com.app.dao.PostDAO;
import com.app.exception.PostNotFoundException;
import com.app.vo.PostVO;

public class PostUpdateOkController implements Action {
	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) {
		Result result = new Result();
		PostDAO postDAO = new PostDAO();
		PostVO postVO = new PostVO();
		
		postVO.setId(Long.parseLong(req.getParameter("id")));
		postVO.setPostTitle(req.getParameter("postTitle"));;
		postVO.setPostContent(req.getParameter("postContent"));
		
		postDAO.update(postVO);
		
		result.setRedirect(true);
		result.setPath("/mvcTask/list.post");
		return result;
	}
}
