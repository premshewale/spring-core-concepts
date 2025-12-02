<%@page import="java.util.List"%>
<%@page import="com.demo.bean.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>EditProduct.jsp</h3>
<fieldset >
<h2>Edit Product Details</h2>
<% Employee p=(Employee)request.getAttribute("employee"); %>

<form action="EditData" method="get">

<table bgcolor="lightgrey">

<tr>
<td>Employee no:</td> <td><input type="text" value="<%=p.getEmpno() %>" name="id" readonly="readonly"></td></tr>
<tr><td>Employee Name:</td> <td><input type="text" value="<%=p.getName() %>" name="name"></td></tr>
<tr><td>Salary:</td><td> <input type="text" value="<%=p.getSalary() %>" name="cat"></td></tr>

<tr><td><input type="submit" value="Update Employee"></td></tr>
<tr><td><input type="Reset"></td></tr>

</table>
</form>


</fieldset>
<h4><a href="index.jsp">Go to Index Page..</a></h4>

</body>
</html>