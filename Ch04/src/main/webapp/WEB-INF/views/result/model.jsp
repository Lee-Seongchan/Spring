<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h3>@ModelAttribute 어노테이션 실습</h3>
		<a href="/Ch04/index">index</a>
		
		<h4>model1</h4>
		<p>
			uid : ${modelDTO.uid}
		</p>
		
		<h4>model2</h4>
		<p>
			uid : ${user.uid}
			name : ${modelDTO.name}
		</p>
		
		<h4>model3</h4>
		<p>
			uid : ${modelDTO.uid}
			name : ${modelDTO.name}
			hp : ${modelDTO.hp}
			age : ${modelDTO.age}
		</p>
</body>
</html>