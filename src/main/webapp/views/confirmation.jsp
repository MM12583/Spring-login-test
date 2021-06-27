<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- add JSTL tag     -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>會員註冊資訊</title>
    <link rel="stylesheet" href="<c:url value="/css/confirmation.css"/>" />
  </head>
  <body>
    <strong id="hello">註冊成功</strong>
    <div id="midBox">
      <table>
        <tr>
          <td>帳號 : ${member.account}</td>
          <td>密碼 : ${member.password}</td>
        </tr>
        <tr>
          <td>姓名 : ${member.name}</td>
          <td>生日 : ${member.birthday}</td>
        </tr>
        <tr>
          <td>電話 : ${member.phone}</td>
          <td>信箱 : ${member.email}</td>
        </tr>
        <tr>
          <td>地址 : ${member.address}</td>
        </tr>
        <tr>
          <td>身高 : ${member.height}</td>
          <td>體重 : ${member.weight}</td>
        </tr>
        <tr>
          <td>BMI : ${member.bmi}</td>
          <td>註冊時間 : ${member.registerDate}</td>
        </tr>
      </table>
    </div>
  </body>
</html>