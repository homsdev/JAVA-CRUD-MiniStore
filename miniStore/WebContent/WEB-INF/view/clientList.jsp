<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Client List View</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/CSS/style.css">
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Name</th>
				<th>LastaName</th>
				<th>email</th>
			</tr>

		</thead>

		<tbody>
			<c:forEach var="client" items="${clientList}">
				<c:url var="updateClient" value="/client/update-form">
					<c:param name="idClient" value="${client.id}"></c:param>
				</c:url>
				<tr>
					<td>${client.name}</td>
					<td>${client.lastname}</td>
					<td>${client.email}</td>
					<td><a class="btn" type="button" href="${updateClient}">Update</a></td>
				</tr>
			</c:forEach>

		</tbody>
	</table>

	<a class="btn" type="button" href="showForm">Add</a>
</body>
</html>