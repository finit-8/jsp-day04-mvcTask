package com.app.post;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.app.Result;
import com.app.post.controller.PostListController;
import com.app.post.controller.PostWriteController;
import com.app.post.controller.PostWriteOkController;

public class PostFrontController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Result result = null;
		
		String target = req.getRequestURI().replace(req.getContextPath() + "/", "").split("\\.")[0];
		
		if(target.equals("write")) {
			System.out.println("write도착");
			result = new PostWriteController().execute(req, resp);
		} else if(target.equals("write-ok")) {
			System.out.println("Ok컨트롤러가 리다이렉트하여");
			result = new PostWriteOkController().execute(req, resp);
		} else if(target.equals("list")) {
			System.out.println("list에 도착");
			result = new PostListController().execute(req, resp);
		} else if(target.equals("update")) {
			
		} else if(target.equals("update-ok")) {
			
		} else if(target.equals("delete-ok")) {
			
		} else {
			// 404 not found
		}
		
		if(result != null) {
			if(result.isRedirect()) {
				resp.sendRedirect(result.getPath());
			} else {
				req.getRequestDispatcher(result.getPath()).forward(req, resp);
			}
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
