<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>Registered User Data</title>
</head>
<body>
    <h2>User Details Submitted</h2>
    <table border="1">
        <tr>
            <th>Name</th>
            <th>Email</th>
            <th>Password</th>
        </tr>
        <tr>
            <td><%= request.getAttribute("name") %></td>
            <td><%= request.getAttribute("email") %></td>
            <td><%= request.getAttribute("password") %></td>
        </tr>
    </table>
</body>
</html>
