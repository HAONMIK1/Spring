<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
result1<br>

${title }<br>
 ${requestScope.title }<br>
<%=request.getParameter("title")%><br>
<%=request.getAttribute("title") %><br>

<br><br>

${singer }<br>
 ${requestScope.singer }<br>
<%=request.getParameter("singer")%><br>
<%=request.getAttribute("singer") %><br>

<br><br>

${price }<br>
 ${requestScope.price }<br>
<%=request.getParameter("price")%><br>
<%=request.getAttribute("price") %><br>

<br><br>
