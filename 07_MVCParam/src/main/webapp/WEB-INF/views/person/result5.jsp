<%@page import="bean.MemberBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
result5<br>

${mbean.id }<br>
${param.id }<br>
 ${requestScope.mbean.id }<br>
<%=request.getParameter("id")%><br>
<%=((MemberBean)request.getAttribute("mbean")).getId() %><br>

<br><br>

<%=request.getParameter("name")%><br>
 ${param.name }<br>
 ${mbean.name }<br>
 ${requestScope.mbean.name }<br>
<%=((MemberBean)request.getAttribute("mbean")).getName() %><br>
<br><br>

<%=request.getParameter("pw")%><br>
 ${param.pw }<br>
 ${mbean.pw }<br>
 ${requestScope.mbean.pw }<br>
<%=((MemberBean)request.getAttribute("mbean")).getPw() %><br>
<br><br>

<%=request.getParameter("age")%><br>
 ${param.age }<br>
 ${mbean.age }<br>
 ${requestScope.mbean.age }<br>
<%=((MemberBean)request.getAttribute("mbean")).getAge() %><br>