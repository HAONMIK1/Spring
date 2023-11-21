<%@page import="bean.MemberBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
result4<br>

${memberBean.id }<br>
${param.id }<br>
 ${requestScope.memberBean.id }<br>
<%=request.getParameter("id")%><br>
<%=((MemberBean)request.getAttribute("memberBean")).getId() %><br>

<br><br>

<%=request.getParameter("name")%><br>
 ${param.name }<br>
 ${memberBean.name }<br>
 ${requestScope.memberBean.name }<br>
<%=((MemberBean)request.getAttribute("memberBean")).getName() %><br>
<br><br>

<%=request.getParameter("pw")%><br>
 ${param.pw }<br>
 ${memberBean.pw }<br>
 ${requestScope.memberBean.pw }<br>
<%=((MemberBean)request.getAttribute("memberBean")).getPw() %><br>
<br><br>

<%=request.getParameter("age")%><br>
 ${param.age }<br>
 ${memberBean.age }<br>
 ${requestScope.memberBean.age }<br>
<%=((MemberBean)request.getAttribute("memberBean")).getAge() %><br>