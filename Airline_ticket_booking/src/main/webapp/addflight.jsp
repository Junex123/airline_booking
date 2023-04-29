<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="flight" method="post"><br><br>
Flight_no::<input type="text" name="fno"><br><br>
Flight_name::<input type="text" name="fname"><br><br>
From_city::<input type="text" name="ffrom"><br><br>
To_city::<input type="text" name="fto"><br><br>
Date::<input type="date" name="fdate"><br><br>
Time::<input type="time" name="ftime"><br><br>
Travel_duration::<input type="text" name="fdur"><br><br>
Airport::<input type="text" name="fair"><br><br>
Price::<input type="text" name="fprice"><br><br>
Description::<input type="text" name="fdes"><br><br>
<input type="submit" value="add_flight">

</form>
</body>
</html>