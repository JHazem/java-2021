<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>Dojo Survey Index</title>
</head>
<body>
<h1> Submitted Info</h1>
<p>Name: <c:out value="${firstName}"/></p>
<p>Location: <c:out value="${location}"/></p>
<p>Program: <c:out value="${program}"/></p>
</body>
</head>