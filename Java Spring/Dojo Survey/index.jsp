<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>Dojo Survey Index</title>
</head>
<body>
<h1>Dojo Survey</h1>
<form action="/result" method="POST">
<p> Your Name: <input type="text" name="firstName"></p>
<p> Dojo Location: 
	<select name="Location">
		<option value="chicago">Chicago </option>
		<option value="indiana"> Indiana</option>
		<option value="oklahoma"> Oklahoma </option>
	</select>
</p>
<p>Program:
	<select name="program">
		<option value="java"> Java </option>
		<option value="python"> Python</option>
		<option value="C++"> C++ </option>
		</select>
</p>
<p> <button>Submit</button>
</form>

</body>
</head>