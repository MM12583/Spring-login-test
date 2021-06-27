<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- 加入Spring from 標籤 有 Spring 機制 -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>註冊頁面</title>
    <link rel="stylesheet" href="<c:url value="/css/register.css"/>" type="text/css">
  </head>
  <body>
    <strong id="hello">歡迎註冊</strong>
    <div id="midBox">
      <form:form action="processRegister" modelAttribute="member">
        <table>
          <tr>
            <td>帳號 : <form:input name="account" path="account" type="text" /></td>
            <td>
              密碼 : <form:input name="password" path="password" type="password" />
            </td>
          </tr>
          <tr>
            <td>姓名 : <form:input name="name" path="name" type="text" /></td>
            <td>
              生日 : <form:input name="birthday" path="birthday" type="date" />
            </td>
          </tr>
          <tr>
            <td>電話 : <form:input name="phone" path="phone" type="tel" /></td>
          </tr>
          <tr>
            <td>信箱 : <form:input name="email" path="email" type="email" /></td>
            <td>地址 : <form:input name="address" path="address" type="text" /></td>
          </tr>
          <tr>
            <td>
              身高 :
              <form:input
                name="height"
                path="height"
                type="”number”"
                min="”100.00″"
                max="”250.00″"
                step="”0.01″"
              />
              cm
            </td>
          </tr>
          <tr>
            <td>
              體重 :
              <form:input
                name="weight"
                path="weight"
                type="”number”"
                min="”1.00″"
                max="”500.00″"
                step="”0.01″"
              />
              kg
            </td>
          </tr>
        </table>
        <button type="submit">提交</button>
      </form:form>
    </div>
  </body>
</html>
