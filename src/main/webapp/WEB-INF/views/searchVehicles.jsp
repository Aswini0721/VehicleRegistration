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
				<span class="lead">Search List</span>
			</div>
			<br>
			<br>
			<table class="table table-hover">
				<thead>
					<tr>
						<th>BrandOwner</th>
					</tr>
				</thead>

				<tbody>
					<c:forEach items="${vehicles}" var="vehicles">
						<tr>
							<td>${vehicles.owner}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>

		</div>
		<div class="well">
			<a href="<c:url value='/list' />">Back to Person List</a>
		</div>

	</div>
</body>
</html>