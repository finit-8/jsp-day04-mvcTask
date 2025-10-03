<%@page import="com.app.vo.PostVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글</title>
</head>
<body>
	<h1>됨?</h1>
	<%
		PostVO post = (PostVO)request.getAttribute("post");
		System.out.println("read.jsp qa");
		System.out.println(post);
	%>
	
	<div>
		<p>게시글명 : <%=post.getPostTitle() %></p>
		<p>게시글내용 : <%=post.getPostContent() %></p>
	</div>
	
	<div>
		<a href="/mvcTask/list.post">게시판 돌아가기</a>
		<a href="/mvcTask/update.post">게시글 수정</a>
		<a href="/mvcTask/delete-ok.post">게시글 삭제</a>
	</div>
	
	
</body>
</html>