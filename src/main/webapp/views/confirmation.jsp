<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- add JSTL tag     -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>註冊資料確認</title>
</head>
<body>
	帳號 : ${member.account} <br>
	密碼 : ${member.password}  <br>
	姓名 : ${member.name}  <br>
	信箱 : ${member.email}  <br>
	地址 : ${member.address}  <br>
	電話 : ${member.phone}  <br>
	生日 : ${member.birthday}  <br>
	身高 : ${member.height}  <br>
	體重 : ${member.weight}  <br>
</body>
</html>