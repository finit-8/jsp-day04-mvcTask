<%@page import="com.app.vo.PostVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 조회</title>
</head>
<body>
	<h1>게시글 조회</h1>
	
	<%
		PostVO post = (PostVO)request.getAttribute("post");
	%>
	
	<div>
		<h1>제목:<%=post.getPostTitle() %></h1>
		<p>내용:<%=post.getPostContent() %></p>
	</div>
	
	<div>
		<a href="/mvcTask/list.post">게시판 돌아가기</a>
		<a href="/mvcTask/update.post?id=<%=post.getId()%>">게시글 수정</a>
		<a href="/mvcTask/delete-ok.post?id=<%=post.getId()%>">게시글 삭제</a>
	</div>
	
</body>
</html>