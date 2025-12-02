<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>AddEmp.jsp</h3>

<fieldset >
<h2>Add Product Details</h2>

<form action="validate">
<table bgcolor="lightgrey">
<tr>
<td>Employee Number:</td> <td><input type="text" name="empno"></td></tr>
<tr><td>Employee Name:</td><td> <input type="text" name="name"></td></tr>
<tr><td>Salary:</td><td> <input type="text" name="salary"></td></tr>

<tr><td><input type="submit" value="Add Employee"></td></tr>
<tr><td><input type="Reset"></td></tr>
</table>
</form>


</fieldset>
<h4><a href="index.jsp">Go to Index Page..</a></h4>
</body>
</html>