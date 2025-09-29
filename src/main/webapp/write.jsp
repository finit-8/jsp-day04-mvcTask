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
			<span>게시글 제목</span><input name="postTitle" placeholder='제목입력' />
		</div>		
		<div>
			<span>게시글 내용</span><input name="postContent" placeholder='내용입력'/>
		</div>		
		<button >게시글 등록</button>
	</form>
</body>
<!-- <script type='text/javascript'/>
	const form = document.querySelector("form");
	const inputs = document.querySelectorAll("input");
	const button = document.querySelector("button");
</script> -->
</html>