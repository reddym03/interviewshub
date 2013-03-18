<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
	<META http-equiv="Content-Type" content="text/html;charset=UTF-8">
	<title>Create Account</title>
	<link rel="stylesheet" href="<c:url value="/resources/blueprint/screen.css" />" type="text/css" media="screen, projection">
	<link rel="stylesheet" href="<c:url value="/resources/blueprint/print.css" />" type="text/css" media="print">
	<!--[if lt IE 8]>
		<link rel="stylesheet" href="<c:url value="/resources/blueprint/ie.css" />" type="text/css" media="screen, projection">
	<![endif]-->
</head>	
<body>
<div class="container">
	<h1>
		Create College ${message}
	</h1>
	<div class="span-12 last">	
		<form:form modelAttribute="college" action="college/addcollege" method="post">
		  	<fieldset>		
				<legend>College Fields</legend>
				<p>
					<form:label	for="collegeName" path="collegeName" cssErrorClass="error">College Name</form:label><br/>
					<form:input path="collegeName" /> <form:errors path="collegeName" />			
				</p>
				<p>
					<form:label for="collegePassword" path="collegePassword" cssErrorClass="error">Password</form:label><br/>
					<form:input path="collegePassword" /> <form:errors path="collegePassword" />
				</p>

				<p>	
					<form:label for="collegeContactPerson" path="collegeContactPerson" cssErrorClass="error">College Contact Person</form:label><br/>
					<form:input path="collegeContactPerson" /> <form:errors path="collegeContactPerson" />
				</p>
				
				<p>
					<form:label	for="collegeContactEmail" path="collegeContactEmail" cssErrorClass="error">College Contact Email</form:label><br/>
					<form:input path="collegeContactEmail" /> <form:errors path="collegeContactEmail" />			
				</p>
				<p>	
					<form:label for="conpanyContactPhone" path="conpanyContactPhone" cssErrorClass="error">College Contact Phone</form:label><br/>
					<form:input path="conpanyContactPhone" /> <form:errors path="conpanyContactPhone" />
				</p>
				<p>	
					<input type="submit" />
				</p>
			</fieldset>
		</form:form>
	</div>
	<hr>	
	<ul>
		<li> <a href="?locale=en_us">us</a> |  <a href="?locale=en_gb">gb</a> | <a href="?locale=es_es">es</a> | <a href="?locale=de_de">de</a> </li>
	</ul>	
</div>
</body>
</html>