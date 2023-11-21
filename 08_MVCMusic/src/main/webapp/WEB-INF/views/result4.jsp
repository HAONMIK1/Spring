<%@page import="bean.MusicBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
result4<br>

${musicBean.title }<br>
${param.title }<br>
 ${requestScope.musicBean.title }<br>
<%=request.getParameter("title")%><br>
<%=((MusicBean)request.getAttribute("musicBean")).getTitle() %><br>

<br><br>

${musicBean.singer }<br>
${param.singer }<br>
 ${requestScope.musicBean.singer }<br>
<%=request.getParameter("singer")%><br>
<%=((MusicBean)request.getAttribute("musicBean")).getSinger() %><br>

<br><br>

${musicBean.price }<br>
${param.price }<br>
 ${requestScope.musicBean.price }<br>
<%=request.getParameter("price")%><br>
<%=((MusicBean)request.getAttribute("musicBean")).getPrice() %><br>

<br><br>
