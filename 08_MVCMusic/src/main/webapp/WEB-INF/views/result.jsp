<%@page import="bean.MusicBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
result1<br>

${mbean.id }<br>
${param.id }<br>
 ${requestScope.mbean.id }<br>
<%=request.getParameter("id")%><br>
<%=((MusicBean)request.getAttribute("mbean")) %><br>

<br><br>

<%=request.getParameter("name")%><br>
 ${param.name }<br>
 ${mbean.name }<br>
 ${requestScope.mbean.name }<br>
<%=((MusicBean)request.getAttribute("mbean"))%><br>
<br><br>

<%=request.getParameter("pw")%><br>
 ${param.pw }<br>
 ${mbean.pw }<br>
 ${requestScope.mbean.pw }<br>
<%=((MusicBean)request.getAttribute("mbean")) %><br>
<br><br>

<%=request.getParameter("age")%><br>
 ${param.age }<br>
 ${mbean.age }<br>
 ${requestScope.mbean.age }<br>
<%=((MusicBean)request.getAttribute("mbean")) %><br>