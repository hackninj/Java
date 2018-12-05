<%@ page import="edu.tomerbu.models.StudentDataSource" %>
<%@ page import="edu.tomerbu.models.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: hackeru
  Date: 2018-12-05
  Time: 07:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student List</title>
</head>
<body>
<%--TODO Loop over all the students and show them--%>
<%
    List<Student> students = StudentDataSource.getStudents();
    //iter
    out.print("<table>");
    out.print("<tr>");
        out.print("<th>First Name</th>");
        out.print("<th>Last Name</th>");
        out.print("<th>Action</th>");
    out.print("</tr>");
    for (Student s : students) {
        out.print("<tr>");
            out.print("<td>"+s.getFirstName()+"</td>");
            out.print("<td>"+s.getLastName()+"</td>");
            out.print("<td>" +
                            "<a href='update.jsp?id=" + s.getId()+ "'>Edit</a>" +
                      "</td>");
        out.print("</tr>");
    }
    out.print("</table>");
%>
</body>
</html>
