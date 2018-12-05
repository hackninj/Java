<%--
  Created by IntelliJ IDEA.
  User: hackeru
  Date: 2018-12-05
  Time: 05:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Add Students</title>
  </head>
  <body>
      <form method="POST" action="add.jsp">
        <input type="text" placeholder="First Name..." name="firstName" title="First Name">
        <br>
        <input type="text" name="lastName" placeholder="Last Name..." title="Last Name">
        <br>
        <input type="submit" value="Save">
      </form>
  </body>
</html>
