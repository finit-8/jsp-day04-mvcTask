<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 작성</title>
</head>
<body>
	<h1>작성</h1>
	<form action="/mvcTask/write-ok.post" method="post">
		<div>
			<span>제목</span><p><input name="postTitle" placeholder="제목을 입력하세요"></p>
			<span>내용</span><p><input name="postContent" placeholder="내용을 입력하세요"></p>
			<button>등록하기</button>
		</div>
	</form>
</body>
</html>