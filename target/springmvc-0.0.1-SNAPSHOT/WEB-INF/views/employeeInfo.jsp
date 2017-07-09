<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<body>
<h2>Hello World!,welcome to Spring MVC Web App</h2>

<%=request.getAttribute("employee")  %>

<TABLE BORDER="1" CELLPADDING="3" CELLSPACING="1">
<TR>
   <TH>Hash</TH>
   <TH>Name</TH>
   <TH>Count</TH>
</TR>
<c:forEach var="rr" items="${employee}">
<TR>
   <TD>${rr.id}</TD>
   <TD>${rr.name}</TD>
   <TD>${rr.position}</TD>
</TR>
</c:forEach>
</TABLE>

</body>
</html>
