<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Client</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/CSS/form.css">
</head>
<body>
	
	Hello you are modifying client with id: ${idClient} 
	
	<div class="form-container medium mg-auto">
		<form:form action="insert" modelAttribute="newClient" method="POST">
			<div class="form-title">
				<h1>Form Title</h1>
			</div>
			<div class="form-input">
				<form:input path="name" type="text" class="form-input__box"
					placeholder="Name" />
			</div>
			<div class="form-input">
				<form:input path="lastname" type="text" class="form-input__box"
					placeholder="Lastname" />
			</div>
			<div class="form-input">
				<form:input path="email" type="email" class="form-input__box"
					placeholder="Email" />
			</div>

			<button type="submit" class="btn mg-auto">Submit</button>
		</form:form>
	</div>
</body>
</html>