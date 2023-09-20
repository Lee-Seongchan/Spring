<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>annotation::model</title>
	</head>
	<body>
		
		<h3>#Model 어노테이션 실습</h3>
		
		<a href="/Ch04/index">index</a>
		
		<h4>model1 실습</h4>
		<form action="/Ch04/annotation/model1" method="post">
			<input type="text" name="uid">			
			<input type="submit" value="전송">
		</form>
	
		<h4>model2 실습</h4>
		<form action="/Ch04/annotation/model2" method="post">
			<input type="text" name="uid">
			<input type="text" name="name">			
			<input type="submit" value="전송">
		</form>
		
		<h4>model3 실습</h4>
		<form action="/Ch04/annotation/model3" method="post">
			<input type="text" name="uid">
			<input type="text" name="name">			
			<input type="text" name="hp">			
			<input type="number" name="age">			
			<input type="submit" value="전송">
		</form>
		
	</body>
</html>