<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 작성</title>
</head>
<body>
	<form action="/mvcTask/write-ok.post" method="get">
		<div>
			<span>게시글명</span><input name="postTitle" />
		</div>		
		<div>
			<span>게시글 내용</span><input name="postContent" />
		</div>		
		<button>게시글 등록</button>
	</form>
</body>
</html>