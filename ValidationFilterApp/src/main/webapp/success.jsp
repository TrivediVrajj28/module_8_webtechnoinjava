<%@ page contentType="text/html" %>
<html>
<head><title>Success</title></head>
<body>
  <h2>Registration Successful</h2>
  <p><b>Name:</b> <%= request.getAttribute("name") %></p>
  <p><b>Email:</b> <%= request.getAttribute("email") %></p>
</body>
</html>
