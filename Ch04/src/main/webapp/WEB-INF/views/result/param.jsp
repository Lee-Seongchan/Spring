<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
	<body>
		<h3>@RequestParam 어노테이션 실습</h3>
		<a href="/Ch04/index">index</a>
		
		<h4>param1</h4>
		<p>
			uid : ${uid}
		</p>
		
		<h4>param2</h4>
		<p>
			uid : ${uid}
			name : ${name}
		</p>
		
		<h4>param3</h4>
		<p>
			uid  : ${uid}
			name : ${name}
			hp   : ${hp}
			age  : ${age}
		</p>
		
	</body>
</html>