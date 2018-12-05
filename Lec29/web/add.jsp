<%@ page import="edu.tomerbu.models.StudentDataSource" %>
<%@ page import="edu.tomerbu.models.Student" %><%--
  Created by IntelliJ IDEA.
  User: hackeru
  Date: 2018-12-05
  Time: 06:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add</title>
</head>
<body>
    <%
        String first = request.getParameter("firstName");
        String last = request.getParameter("lastName");

        out.print(first);
        out.print("<br>");
        out.print(last);

        //add to data source...
        StudentDataSource.addStudent(new Student(first, last, null));
    %>
    <a href="students.jsp">Students</a>
</body>
</html>
