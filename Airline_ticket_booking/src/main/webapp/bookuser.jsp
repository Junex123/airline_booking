<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="booking" method="post">
Class::<select name="nclass">
<option>Business</option>
<option>Economy</option>
</select><br><br>
no_of_seats::<input type="text" name="nseat"><br><br>
Adult::<input type="text" name="nadult"><br><br>
Children::<input type="text" name="nchild"><br><br>
Infant::<input type="text" name="ninfant"><br><br>
<input type="submit" value="proceed">
</form>
</body>
</html>