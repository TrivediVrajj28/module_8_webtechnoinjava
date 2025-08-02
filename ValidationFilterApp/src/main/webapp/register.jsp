<!DOCTYPE html>
<html>
<head><title>Register</title></head>
<body>
  <h2>User Registration</h2>
  <form method="post" action="register">
    Name: <input type="text" name="name"><br><br>
    Email: <input type="text" name="email"><br><br>
    <input type="submit" value="Register">
  </form>

  <p style="color:red;">
    <%= request.getAttribute("errorMsg") != null ? request.getAttribute("errorMsg") : "" %>
  </p>
</body>
</html>
