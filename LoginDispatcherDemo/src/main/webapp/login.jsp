<!DOCTYPE html>
<html>
<head><title>Login Page</title></head>
<body>
  <h2>Login Form</h2>
  <form method="post" action="login">
    Username: <input type="text" name="username"><br><br>
    Password: <input type="password" name="password"><br><br>
    <input type="submit" value="Login">
  </form>

  <jsp:include page="error.jsp" />
</body>
</html>
