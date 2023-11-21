<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

사이즈: ${fn:length(lists)}
<table border="1">
	<tr>
		<td>Num</td>
		<td>아이디</td>
		<td>이름</td>
		<td>나이</td>
		<td>삭제</td>
		<td>수정</td>
	</tr>
	
	<c:forEach var="dto" items="${lists}">
	<tr>
		<td>${dto.num }</td>
		<td>${dto.id }</td>
		<td>${dto.name }</td>
		<td>${dto.age }</td>
		<td><a href="delete?num=${dto.num}">삭제</a></td>
		<td><a href="updateForm?num=${dto.num}">수정</a></td>
	</tr>
	</c:forEach>

</table>
<a href="write">삽입</a>
<input type="button" onclick="location.href='write'" value="삽입">