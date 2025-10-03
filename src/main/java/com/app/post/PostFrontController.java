package com.app.post;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Result;
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
		Result result = null;
		String target = req.getRequestURI().replace(req.getContextPath() + "/", "").split("\\.")[0];
		
		if(target.equals("write")) {
			result = new PostWriteController().execute(req, resp);
			System.out.println("write페이지로 이동됨");
		} else if(target.equals("write-ok")) {
			result = new PostWriteOkController().execute(req, resp);
			System.out.println("write-ok로 리다이렉트하여");
		} else if(target.equals("list")) {
			result = new PostListController().execute(req, resp);
			System.out.println("list페이지로 이동됨");
		} else if(target.equals("read")) {
			result = new PostReadController().execute(req, resp);
			System.out.println("read페이지로 이동됨");
		} else if(target.equals("update")) {
			result = new PostUpdateController().execute(req, resp);
			System.out.println("update페이지로 이동됨");
		} else if(target.equals("update-ok")) {
			result = new PostUpdateOkController().execute(req,resp);
		} else if(target.equals("delete-ok")) {
			result = new PostDeleteOkController().execute(req,resp);
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
