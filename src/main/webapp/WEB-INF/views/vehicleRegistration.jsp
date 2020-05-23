<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Vehicle Details</title>
<link href="<c:url value='/static/css/bootstrap.css' />"
	rel="stylesheet"></link>
<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
</head>

<body>

	<div class="generic-container">
		<div class="well lead">Add New Vehicle Details</div>
		<form:form modelAttribute="vehicle" class="form-horizontal"
			method="POST">
			<form:input type="hidden" path="vehicleId" id="vehicleId" />

			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="model">Model</label>
					<div class="col-md-7">
						<form:input type="text" path="model" id="model"
							class="form-control input-sm" />
					</div>
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="year">Year</label>
					<div class="col-md-7">
						<form:input type="text" path="year" id="year"
							class="form-control input-sm" />
					</div>
				</div>
			</div>


			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="brand">Brand</label>
					<div class="col-md-7">
						<form:input type="text" path="brand" id="brand"
							class="form-control input-sm" />
					</div>
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="registrationNumber">RegistrationNumber</label>
					<div class="col-md-7">
						<form:input type="text" path="registrationNumber"
							id="registrationNumber" class="form-control input-sm" />
					</div>
				</div>
			</div>
	      
			<div class="row">
				<div class="form-actions floatRight">
					<input type="submit" value="Save" class="btn btn-primary btn-sm" />
					or <a href="<c:url value='/listVehicles/${personId}' />">Go to View Vehicle Details</a>

				</div>
			</div>
     </form:form>
	</div>
</body>

</html>