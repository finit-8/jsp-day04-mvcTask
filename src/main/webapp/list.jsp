<%@page import="java.util.List"%>
<%@page import="com.app.vo.PostVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
</head>
<body>
	<h1>게시판</h1>
	
	<%
		List<PostVO> list = (List<PostVO>)request.getAttribute("list");
	%>	
	
	<table>
		<tr>
			<th>게시글 번호</th>
			<th>게시글 제목</th>
			<th>게시글 내용</th>
		</tr>
		
		<%
			for(PostVO post : list) {
		%>
		
		<tr>
			<td><%=post.getId() %></td>
			<td><a href="/mvcTask/read.post?id=<%=post.getId()%>"><%=post.getPostTitle() %></a></td>
			<td><%=post.getPostContent() %></td>
		</tr>
		
		<%
			}
		%>
	</table>
		<div>
			<a href="/mvcTask/write.post">게시글 작성</a>
		</div>
</body>
</html>