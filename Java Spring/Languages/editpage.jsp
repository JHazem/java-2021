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

<a href="/languages"><h1 class="shift">Dashboard</h1></a>
		<a href="/languages/delete/<c:out value="${lang.id}"/>"><h1 class="shift">Delete</h1></a>
	</div>
		<form:form action="/languages/${language.id}" method="post" modelAttribute="language">
		    <input type="hidden" name="_method" value="put">
			    <p>
			        <form:label  path="name">Name</form:label>
			        <form:input  path="name"/>
			        <form:errors  path="name"/>

			    </p>
			    <p>
			        <form:label path="creator">Creator</form:label>
			        <form:input path="creator"/>
    				<form:errors path="creator"/>
			    </p>
			    <p>
			        <form:label path="currentVersion">Version</form:label>
			        <form:input path="currentVersion"/>
     		 		<form:errors path="currentVersion"/>
			    </p>
		    <input type="submit" value="Submit"/>
		</form:form>

</body>
</html>
    
