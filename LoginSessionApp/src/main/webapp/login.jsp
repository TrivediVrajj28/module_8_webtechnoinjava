<!DOCTYPE html>
<html>
<head><title>Login</title></head>
<body>
  <h2>Login</h2>
  <form method="post" action="login">
    Username: <input type="text" name="username"><br><br>
    Password: <input type="password" name="password"><br><br>
    <input type="submit" value="Login">
  </form>

  <p style="color:red;">
    <%= request.getAttribute("error") != null ? request.getAttribute("error") : "" %>
  </p>
</body>
</html>
