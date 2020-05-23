<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vehicle Registration List</title>
<link href="<c:url value='/static/css/bootstrap.css' />"
	rel="stylesheet"></link>
<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
</head>

<body>
	<div class="generic-container">
		<div class="panel panel-default">
			<!-- Default panel contents -->
			<div class="panel-heading">
				<span class="lead">Person Registration List</span>
			</div>
			&nbsp; <br></br>
			<form method="get" action="search">
				<input type="text" name="keyword" /> &nbsp; <input type="submit"
					value="Search" />
			</form>
			<br></br>
			<div class="well">
				<a href="<c:url value='/showForm' />">Add New User</a>
			</div>
			<br></br>
			<table class="table table-hover">
				<thead>
					<tr>
						<th>Firstname</th>
						<th>Lastname</th>
						<th>Address</th>
					</tr>
				</thead>

				<tbody>
					<c:forEach items="${persons}" var="person">
						<tr>
							<td>${person.firstName}</td>
							<td>${person.lastName}</td>
							<td>${person.address}</td>
							<td><a
								href="<c:url value='/addVehicle/${person.personId}' />"
								class="btn btn-success custom-width">Add Vehicles</a></td>
							<td><a
								href="<c:url value='/listVehicles/${person.personId}' />"
								class="btn btn-success custom-width">View Vehicles</a></td>
						</tr>

					</c:forEach>
				</tbody>
			</table>

		</div>



	</div>
</body>
</html>