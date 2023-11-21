<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
name1 ${name}<br>
name2 ${param.name}<br>
name3 ${requestScope.name}<br>
name4 <%=request.getAttribute("name")%><br>
name5 <%=request.getParameter("name")%><br>
name6 ${map1.mname}<br>
age1 ${map1.mage}<br>