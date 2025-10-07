<%@page import="com.app.vo.PostVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 상세조회</title>
</head>
<body>
	<h1>게시글 상세조회</h1>
	
	<%
		PostVO post = (PostVO)request.getAttribute("post");
	%>
	
	<div>
		<h1>게시글 제목: <%=post.getPostTitle() %></h1>
		<p>게시글 내용: <%=post.getPostContent() %></p>
	</div>
	
	<div>
		<a href="/mvcTask/list.post">목록</a>
		<a href="/mvcTask/update.post?id=<%=post.getId()%>">수정</a>
		<a href="/mvcTask/delete-ok.post?id=<%=post.getId()%>">삭제</a>
	</div>
</body>
</html>