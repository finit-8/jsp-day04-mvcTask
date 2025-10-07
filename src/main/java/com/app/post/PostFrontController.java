package com.app.post;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.app.Result;
import com.app.dao.PostDAO;
import com.app.post.controller.PostDeleteOkController;
import com.app.post.controller.PostListController;
import com.app.post.controller.PostReadController;
import com.app.post.controller.PostUpdateController;
import com.app.post.controller.PostUpdateOkController;
import com.app.post.controller.PostWriteController;
import com.app.post.controller.PostWriteOkController;

public class PostFrontController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		
		Result result = null;
		
		String target = req.getRequestURI().replace(req.getContextPath() + "/", "").split("\\.")[0];
		
		if(target.equals("write")) {
			System.out.println("write에 도착");
			result = new PostWriteController().execute(req, resp);
		} else if(target.equals("write-ok")) {
			System.out.println("write-ok컨트롤러가 리다이렉트하여");
			result = new PostWriteOkController().execute(req, resp);
		} else if(target.equals("list")) {
			System.out.println("list에 도착");
			result = new PostListController().execute(req, resp);
		} else if(target.equals("read")) {
			System.out.println("read에 도착");
			result = new PostReadController().execute(req, resp);
		} else if(target.equals("update")) {
			System.out.println("update에 도착");
			result = new PostUpdateController().execute(req, resp);
		} else if(target.equals("update-ok")) {
			System.out.println("update-ok컨트롤러가 리다이렉트하여");
			result = new PostUpdateOkController().execute(req, resp);
		} else if(target.equals("delete-ok")) {
			System.out.println("delete-ok컨트롤러가 리다이렉트하여");
			result = new PostDeleteOkController().execute(req, resp);
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
