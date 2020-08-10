
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<div>
		<form:form method="Post" modelAttribute="registratioDTO"
			action="Registration-Process">

			<table>
				<tr>
					<td><font size="6">Create a New Account</font></td>
				</tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
			</table>
			<table>

				<tr>
					<td><label for="first_Name">First Name</label></td>
					<td><form:input path="first_Name" id="first_Name" placing="First Name"  /></td>
					<td><form:errors path="first_Name" /></td>
					<td><label for="last_name">Last Name</label></td>
					<td><form:input path="last_name" /></td>

				</tr>

				<tr></tr>
				<tr></tr>

				<tr></tr>
				<tr></tr>
				<tr>
					<td><label for="user_Id">UserId</label></td>
					<td><form:input path="user_Id" /></td>
					<td></td>
					<td><label for="email_Id">Email Id</label></td>
					<td><form:input path="email_Id" /></td>

				</tr>


				<tr></tr>
				<tr></tr>

				<tr></tr>
				<tr></tr>
				<tr>
					<td><label for="mob_Number">Mobile Number</label></td>
					<td><form:input path="mob_Number" /></td>
					<td></td>
					<td><label for="birthday">Birthday (mm/dd/yyyy)</label></td>
					<td><form:input path="birthday" /></td>



				</tr>

				<tr></tr>
				<tr></tr>

				<tr></tr>
				<tr></tr>
				<tr>
					<td><label>Gender</label></td>
					<td>Male<form:radiobutton path="gender" value="male" />
						Female<form:radiobutton path="gender" value="female" />
					</td>
					<td></td>
					<td></td>
				</tr>
				
				<tr></tr>
				<tr></tr>

				<tr></tr>
				<tr></tr>
				<tr>
					<td><label>Hobbies</label></td>
					<td>Cooking <form:checkbox path="hobbies" value="cooking" />
					<td>Sports <form:checkbox path="hobbies" value="cooking" />
					<td>Reading <form:checkbox path="hobbies" value="cooking" />
					<td>Movies <form:checkbox path="hobbies" value="cooking" />


					</td>
					<td></td>
				</tr>
				<tr></tr>
				<tr></tr>

				<tr></tr>
				<tr></tr>
				
				<tr>
					<td><label for="password ">New Password</label></td>
					<td><form:input path="password" /></td>
					<td></td>
				</tr>
				
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>

				<tr></tr>
				<tr></tr>


				<tr>
					<td><input type="submit" Value="Sign Up"></td>
				</tr>


			</table>


		</form:form>

	</div>

</body>
</html>