<%@page import="bean.MusicBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
result5<br>

${mBean.title }<br>
${param.title }<br>
 ${requestScope.mBean.title }<br>
<%=request.getParameter("title")%><br>
<%=((MusicBean)request.getAttribute("mBean")).getTitle() %><br>

<br><br>

${mBean.singer }<br>
${param.singer }<br>
 ${requestScope.mBean.singer }<br>
<%=request.getParameter("singer")%><br>
<%=((MusicBean)request.getAttribute("mBean")).getSinger() %><br>

<br><br>

${mBean.price }<br>
${param.price }<br>
 ${requestScope.mBean.price }<br>
<%=request.getParameter("price")%><br>
<%=((MusicBean)request.getAttribute("mBean")).getPrice() %><br>

<br><br>
