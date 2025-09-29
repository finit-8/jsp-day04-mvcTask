<%@page import="org.apache.ibatis.reflection.SystemMetaObject"%>
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
	<h1>연결됨</h1>
	
	<%
		PostVO post = (PostVO)request.getAttribute("post");
	%>
	
	<form action="/mvcTask/update-ok.post" method="get">
		<input name="id" type="hidden" value="<%=post.getId() %>"/>
		<div>
			<span>게시글 제목</span><input name='postTitle' value='<%=post.getPostTitle() %>'/>
		</div>
		<div>
			<span>게시글 내용</span><input name='postContent' value='<%=post.getPostContent() %>'/>
		</div>
		<button>수정 완료</button>
	</form>
	
	
</body>
</html>