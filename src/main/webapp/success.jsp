<%@page import="com.cjc.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
Welcome to Display Page
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br><br>
<%List<Student> list=(List<Student>)request.getAttribute("list"); %>

<table border="2">

<thead>
<th>Roll No</th>
<th>Name</th>
<th>Local Area</th>
<th>City</th>
<th>User Name</th>
<th>Password</th>
<th>Update</th>
<th>Delete</th>
</thead>

<tbody>
<%for(Student s:list){ %>
<tr>
<td><%=s.getRollno() %></td>
<td><%=s.getName() %></td>
<td><%=s.getAddress().getLocalarea() %></td>
<td><%=s.getAddress().getCity() %></td>
<td><%=s.getUsername() %></td>
<td><%=s.getPassword() %></td>
<td><a href="edit?rollno=<%=s.getRollno() %>">Click here to Update</a></td>
<td><a href="delete?rollno=<%=s.getRollno() %>">Click here to Delete</a></td>
</tr>
<% }%>

</tbody>
</table>
</body>
</html>