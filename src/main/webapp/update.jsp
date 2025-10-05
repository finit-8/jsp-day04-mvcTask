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
	
	<%-- <%
		PostVO post = (PostVO)request.getAttribute("post");
	%> --%>
	
	<form action="/mvcTask/update-ok.post" method="get">
		<input type="hidden" name="id" value="${post.id}">
		<div>
			<span>제목: </span><input name="postTitle" value="${post.postTitle}" placeholder="변경할 제목을 입력하세요"></input>		
		</div>
		
		<div>
			<span>내용: </span><input name="postContent" value="${post.postContent}" placeholder="변경할 내용을 입력하세요"></input>
		</div>
		<button>수정완료</button>
	</form>
	
</body>
</html>