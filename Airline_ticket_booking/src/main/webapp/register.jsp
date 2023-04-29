<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<form action="register" method="post">
Firstname::<input type="text" name="ufname"><br><br>
Lastname::<input type="text" name="ulname"><br><br>
Username::<input type="text" name="uname"><br><br>
Email::<input type="text" name="uemail"><br><br>
Phone_Number::<input type="text" name="uphone"><br><br>
Date_of_Birth::<input type="date" name="udob"><br><br>
Address::<input type="text" name="uadd"><br><br>
Password::<input type="password" name="upass"><br><br>
<input type="submit" value="register"><br><br>
<a href="login.jsp">if you are already registered please login</a>
</form>
</body>
</html>