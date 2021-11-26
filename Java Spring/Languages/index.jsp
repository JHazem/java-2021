<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>Languages</title>
</head>
<body>
<form action="/index" method="POST">
<table border="">
<thead>
	<tr>
		<td> Name</td>
		<td> Creater</td>
		<td> Version</td>
		<td> Action</td>
	</tr>
</thead>
<tbody>
        <tr>
            <td><a href="languages/<c:out value="${lang.id}"/>"><c:out value="${lang.name}"/></a></td>
            <td><c:out value="${lang.creator}"/></td>
            <td><c:out value="${lang.currentVersion}"/></td>
            <td><a href="/languages/delete/<c:out value="${lang.id}"/>">delete</a> <a href="languages/edit/<c:out value="${lang.id}"/>">edit</a></td>
        </tr>

        <tr>
            <td><a href="languages/<c:out value="${lang.id}"/>"><c:out value="${lang.name}"/></a></td>
            <td><c:out value="${lang.creator}"/></td>
            <td><c:out value="${lang.currentVersion}"/></td>
            <td><a href="/languages/delete/<c:out value="${lang.id}"/>">delete</a> <a href="languages/edit/<c:out value="${lang.id}"/>">edit</a></td>
        </tr>
        
	<tr>
		<td> JavaScript</td>
		<td> Brendan Eich</td>
		<td>1.9.5.2.3.247.2 </td>
		<td><a href="/languages/delete/<c:out value="${lang.id}"/>">delete </a> <a href="/languages/edit/<c:out value="${language.id}"/>"> edit </a></td>

	</tr>
	
	</tbody>
</table>

    <p>Name: <input type="text" name="text"></p>

    <p>Creater: <input type="text" name="text"></p>
    
    <p>Version: <input type="text" name="text"></p>

    <input type="submit" value="Submit"/>


</form>





</body>
</head>