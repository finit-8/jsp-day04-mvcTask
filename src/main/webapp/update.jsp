<%@page import="com.app.vo.PostVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 수정</title>
</head>
<body>
	<h1>게시글 수정</h1>
	
	<%
		PostVO post = (PostVO)request.getAttribute("post");
	%>
	<form action="/mvcTask/update-ok.post" method="post">
		<div>
			<input name="id" type="hidden" value="<%=post.getId() %>"></input>
			<input name="postTitle" value="<%=post.getPostTitle() %>" placeholder="수정할 제목을 입력하세요."></input>
			<input name="postContent" value="<%=post.getPostContent() %>" placeholder="수정할 내용을 입력하세요."></input>
			<button>수정완료</button>
		</div>
	</form>
</body>
</html>