<%@ page import="edu.tomerbu.models.StudentDataSource" %>
<%@ page import="edu.tomerbu.models.Student" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Student</title>
</head>
<body>

<h1>Edit Details</h1>
<form method="POST">
    <%
//        out.print("<h1>Request method: " + request.getMethod()+ "</h1>");

        if (request.getMethod().equals("POST")){
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            int id = Integer.valueOf(request.getParameter("id"));

            Student s = new Student(firstName, lastName, id);
            StudentDataSource.update(s);
            out.print("Edited successfully.");
        }
        String id = request.getParameter("id");
        Student s = StudentDataSource.getStudent(id);
    %>

    <input value="<%= s.getFirstName()%>" type="text" placeholder="First Name..." name="firstName" title="First Name">
    <br>
    <input value="<%=s.getLastName()%>" type="text" name="lastName" placeholder="Last Name..." title="Last Name">
    <br>
    <input type="hidden" name="id" value="<%=s.getId()%>">
    <br>
    <input type="submit" value="Save Changes">
</form>

<a href="students.jsp">Back To Students</a>
</body>
</html>
