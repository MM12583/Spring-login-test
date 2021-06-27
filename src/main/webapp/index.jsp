<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix='c'%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登入頁面</title>
<link rel="stylesheet" href="<c:url value="/css/home.css"/>" type="text/css">
</head>
<body>
	<strong id="hello">親愛的訪客您好</strong>
	<div id="midBox">
		<button onclick="location.href='<c:url value ="/register"/>'">註冊</button>
		<button onclick="location.href='<c:url value ="/"/>'">登入</button>
	</div>

</body>