<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
list.jps
<form action="write" method="post">
	<table>
	<tr>
			<td>번호</td>
			<td>아이디</td>
			<td>비번</td>
			<td>우승예상국가</td>
			<td>16강 예상국가</td>
			<td>수정</td>
			<td>삭제</td>
			
	</tr>	
	
		<c:forEach var="dto" items="${lists}">
		<tr>
			<td>${dto.num }</td>
			<td>${dto.id }</td>
			<td>${dto.pw}</td>
			<td>${dto.win }</td>
			<td>${dto.round16 }</td>
			<td><a href="updateForm?num=${dto.num }">수정</a></td>
			<td><a href="delete?num=${dto.num }">삭제</a></td>
		</tr>
		</c:forEach>
	</table>
</form>
			<a href="write">추가</a>