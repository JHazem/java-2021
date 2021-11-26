    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><c:out value="${language.name}"/></title>
</head>
<body>

	<div>
	<div>
		<a href="/languages"><h2>Dashboard</h2></a>
	</div>
		<h2><c:out value="${language.name}"/></h2>
		<h2><c:out value="${language.creator}"/></h2>
		<h2><c:out value="${language.currentVersion}"/></h2>
		<p>
			<a href="/languages/edit/<c:out value="${lang.id}"/>"><h2>edit</h2></a></p>
		<p>	
			<a href="/languages/delete/<c:out value="${lang.id}"/>"><h2>delete</h2></a>
		</p>
	</div>

</body>
</html>
    