<% String msg = (String) request.getAttribute("error"); %>
<% if (msg != null) { %>
  <p style="color:red;"><%= msg %></p>
<% } %>
