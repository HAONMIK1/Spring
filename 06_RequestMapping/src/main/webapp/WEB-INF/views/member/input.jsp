<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
member/input.jsp
id1 = ${id}<br>
id2 = <%=request.getParameter("id") %><br>
id3 = ${requestScope.id}<br>
id4 = <%=request.getAttribute("id") %><br>
id5 = ${param.id}<br>