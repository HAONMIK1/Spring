<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
result2<br>
1. <%=request.getParameter("name")%><br>
2. ${param.name }<br>
3. ${name }<br>
4. ${requestScope.name }<br>
5. <%=request.getAttribute("name") %><br>
<br><br>
1. <%=request.getParameter("age")%><br>
2. ${param.age }<br>
3. ${age }<br>
4. ${requestScope.age }<br>
5. <%=request.getAttribute("age") %><br>
============================================================
 ${pb.name }<br>
 ${pb.age }<br>
 ${pb.addr }<br>
 
 
 
 
 
 
 
 
<%PersonBean pb = (PersonBean)request.getAttribute("pb");%>
<b>PersonBean 사용하기</b><br>
name : ${pb.name } / ${requestScope.name} / <%=pb.getName()%> / ${pb['name'] }/ ${pb.getName() }<br>
age : ${pb.age } / ${requestScope.age} / <%=pb.getAge()%><br>
addr : ${pb.addr } / ${requestScope.addr} / <%=pb.getAddr()%><br>


<hr>

<%=((PersonBean)request.getAttribute("pb")).getName()%>
<%=((PersonBean)request.getAttribute("pb")).getAge()%>
<%=((PersonBean)request.getAttribute("pb")).getAddr()%>