<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="payment" method="post">
card_name::<input type="text" name="cardname"><br><br>
card_no::<input type="text" name="cardno"><br><br>
expiry_month::<input type="text" name="cardmonth"><br><br>
expiry_year::<input type="text" name="cardyear"><br><br>
CVV::<input type="text" name="cardcvv"><br><br>
State::<input type="text" name="cardstat"><br><br>
zipcode::<input type="text" name="cardzip"><br><br>
<input type="submit" value="proceed">
</form>
</body>
</html>