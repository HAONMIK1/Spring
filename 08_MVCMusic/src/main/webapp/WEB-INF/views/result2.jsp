<%@page import="bean.MusicBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
result2<br>

${mb.title }<br>
${param.title }<br>
 ${requestScope.mb.title }<br>
<%=request.getParameter("title")%><br>
<%=((MusicBean)request.getAttribute("mb")).getTitle() %><br>

<br><br>

${mb.singer }<br>
${param.singer }<br>
 ${requestScope.mb.singer }<br>
<%=request.getParameter("singer")%><br>
<%=((MusicBean)request.getAttribute("mb")).getSinger() %><br>

<br><br>

${mb.price }<br>
${param.price }<br>
 ${requestScope.mb.price }<br>
<%=request.getParameter("price")%><br>
<%=((MusicBean)request.getAttribute("mb")).getPrice() %><br>

<br><br>
