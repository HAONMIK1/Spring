<%@page import="bean.MemberBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
name2 ${param.name}<br>
name5 <%=request.getParameter("name")%><br>

id ${param.id}<br>
id <%=request.getParameter("id")%><br>

name ${memberBean.name}
name <%=((MemberBean)request.getAttribute("memberBean")).getName()%>
id ${memberBean.id}
id <%=((MemberBean)request.getAttribute("memberBean")).getId()%>