<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LifePath Navigator - 人生経路ナビ</title>
</head>
<body>
	<h1>LifePath Navigator - 人生経路ナビ</h1>
	<p>ようこそ<c:out value="${userId}" />さん</p>
	<a href="DateOfBirthServlet">生年月日入力へ</a>
	<a href="#">登録一覧へ</a>
	<a href="index.jsp">トップへ</a>
</body>
</html>