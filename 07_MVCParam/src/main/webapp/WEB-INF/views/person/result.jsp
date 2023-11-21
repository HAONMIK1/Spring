<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
result<br>
1. <%=request.getParameter("name")%><br>
2. ${param.name }<br>
3. ${name }<br>
4. ${requestScope.name }<br>
5. <%=request.getAttribute("name") %><br>
<br><br>
1. <%=request.getParameter("age")%><br>
2. ${param.age }<br>
3. ${age }<br>
4. ${requestScope.age }<br>
5. <%=request.getAttribute("age") %><br>