<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Budgeting Web App Login page</h2>
	
	<form method="post" action="LoginCheck">
		<table>
			<tr>
				<td>User Name</td><td><input type="text" name="uname"></td>
			</tr>
			<tr>
				<td>Password</td><td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td></td><td><input type="submit" name="Login"></td>
			</tr>
		</table>
	</form>
</body>
</html>