<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII" import="com.spring.dto.Employee,java.util.List"%>
<html>
<body>
<h2>Hello World!,welcome to Spring MVC Web App</h2>

<%

List<Employee> employee= (List<Employee>) request.getAttribute("employees");
out.write("<table>");

for(Employee e:employee){
	out.write("<tr>");
	out.write("<td>");out.println(e.getId()); out.write("</td>");
	out.write("<td>");out.println(e.getId()); out.write("</td>");
	out.write("<td>");out.println(e.getName()); out.write("</td>");
	out.write("</tr>");
}
out.write("</table>");

%>
</body>
</html>
