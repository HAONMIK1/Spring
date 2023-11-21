<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<table border="1">
		<tr>
			 <td>ID</td>
			 <td>${id }</td>
			 <td>${requestScope.id }</td>
			 <td><%=request.getAttribute("id") %></td>
			 <td><%=request.getParameter("id") %></td>
			 </tr>
			 <tr>
			  <td>RID</td>
			 <td>${rid }</td>
			 <td>${requestScope.rid }</td>
			 <td><%=request.getAttribute("rid") %></td>
			 <td><%=request.getParameter("rid") %></td>
		</tr>
			<tr>
			 <td>pw</td>
			 <td>${pw }</td>
			 <td>${requestScope.pw }</td>
			 <td><%=request.getAttribute("pw") %></td>
			 <td><%=request.getParameter("pw") %></td>
			 		</tr>
			 	<tr>
			 <td>Rpw</td>
			 <td>${rpw }</td>
			 <td>${requestScope.rpw }</td>
			 <td><%=request.getAttribute("rpw") %></td>
			 <td><%=request.getParameter("rpw") %></td>
		</tr>
	</table>
