
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<style>
table.center {
	margin-left: auto;
	margin-right: auto;
}
</style>

<meta charset="ISO-8859-1">
<title>Nusrin's Food Book</title>
</head>
   
   

<body>

		<form:form method="POST" modelAttribute="logindto"
			action="LoginDetails">

	<hr></hr>
	<div align="Right">
		<h1 align="center">Nusrin's Food Book</h1>

			<table>
				<tr>
					<td><label>Email or Login Id </label></td>
					<td></td>
					<td><label>Password </label></td>
				<tr>
					<td><form:input path="Login_Id"/></td>
					<td><form:errors path="Login_Id"/></td>
					<td><form:input path="Password"/></td>
					<td></td>
					<td><input type="submit" value="SignIn"></td>
					<td></td>
					
					<td><input type="button" Value="Sign Up"></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td><td></td>
					<td></td>
					<td></td><td></td>
					
				</tr>
				<tr>
					<td></td>
					<td></td>

					<td><a href="https://www.w3schools.com">Forgot account?</a></td>
				</tr>
			</table>
			<Hr>

	</div>
	
		</form:form>
	<%-- <div>
		<form:form method="Post" modelAttribute="registratioDTO"
			action="Registration-Process">

			<table>
				<tr>
					<td><font size="6">Create a New Account</font></td>
				</tr>
				<tr>
					<td><form:input path="first_Name" /></td>
					<td><form:input path="last_name" /></td>

				</tr>
				<tr>
					<td><input type="submit" Value="Sign Up"></td>
				</tr>


			</table>


		</form:form>

	</div>
 --%> </body>
</html>