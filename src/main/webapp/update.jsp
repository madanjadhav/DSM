<%@page import="com.cjc.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
Welcome to Update Page
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Page</title>
</head>
<body>
<br><br>
<%Student s=(Student)request.getAttribute("stud"); %>
<form action="update">
Roll No::<input type="hidden" name="rollno" value="<%=s.getRollno() %>"><br><br>
Address No::<input type="hidden" name="addresnum" value="<%=s.getAddress().getAddresnum() %>">
Name::<input type="text" name="name" value="<%=s.getName() %>"><br><br>
Local Area::<input type="text" name="localarea" value="<%=s.getAddress().getLocalarea() %>"><br><br>
City::<input type="text" name="city" value="<%=s.getAddress().getCity() %>"><br><br>
User Name::<input type="text" name="username" value="<%=s.getUsername() %>"><br><br>
Password::<input type="text" name="password" value="<%=s.getPassword() %>"><br><br>
<input type="submit" value="Update">

</form>
</body>
</html>