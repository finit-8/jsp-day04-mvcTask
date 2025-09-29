<%@page import="com.app.vo.PostVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
</head>
<body>
	<h1>졸려</h1>
	<% 
	 	List<PostVO> posts = (List<PostVO>)request.getAttribute("posts"); 	// 이제 다운캐스팅해서 +@ 쓸 수 있음 
	 %>
	 <table>
		<tr>
		 	<th>게시글번호</th>
		 	<th>게시글명</th>
		 	<th>게시글내용</th>
		</tr>
		
		<%
			for(PostVO post: posts) {
		%>
			<tr>
				<td><%=post.getId() %></td>
				<td>
					<a href='/mvcTask/read.post?id=<%=post.getId() %>'><%=post.getPostTitle() %></a> 
				</td>
				<td><%=post.getPostContent() %></td>
			</tr>
		<%
			}
		%>
	 </table>
	
</body>
</html>