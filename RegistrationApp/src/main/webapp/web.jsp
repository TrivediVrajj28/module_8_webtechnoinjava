<web-app xmlns="http://jakarta.ee/xml/ns/jakartaee" version="5.0">

  <servlet>
    <servlet-name>RegisterServlet</servlet-name>
    <servlet-class>com.example.RegisterServlet</servlet-class>
  </servlet>

  <servlet-mapping>
    <servlet-name>RegisterServlet</servlet-name>
    <url-pattern>/register</url-pattern>
  </servlet-mapping>

</web-app>
