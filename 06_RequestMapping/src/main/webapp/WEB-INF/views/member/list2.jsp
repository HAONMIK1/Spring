<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
list2<br>
name1 = ${name}<br>
name2 = ${requestScope.name}<br>
name3 = <%=request.getAttribute("name") %><br>
name4 = <%=request.getParameter("name") %><br>
name5 = ${param.name}<br>
<br>
pw1 = ${pw}<br>
pw2 = ${requestScope.pw}<br>
pw3 = <%=request.getAttribute("pw") %><br>
