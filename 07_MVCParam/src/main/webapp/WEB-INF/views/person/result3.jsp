<%@page import="bean.MemberBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
result3<br>

${mb.id }<br>
${param.id }<br>
 ${requestScope.mb.id }<br>
<%=request.getParameter("id")%><br>
<%=((MemberBean)request.getAttribute("mb")).getId() %><br>

<br><br>

<%=request.getParameter("name")%><br>
 ${param.name }<br>
 ${mb.name }<br>
 ${requestScope.mb.name }<br>
<%=((MemberBean)request.getAttribute("mb")).getName() %><br>
<br><br>

<%=request.getParameter("pw")%><br>
 ${param.pw }<br>
 ${mb.pw }<br>
 ${requestScope.mb.pw }<br>
<%=((MemberBean)request.getAttribute("mb")).getPw() %><br>
<br><br>

<%=request.getParameter("age")%><br>
 ${param.age }<br>
 ${mb.age }<br>
 ${requestScope.mb.age }<br>
<%=((MemberBean)request.getAttribute("mb")).getAge() %><br>