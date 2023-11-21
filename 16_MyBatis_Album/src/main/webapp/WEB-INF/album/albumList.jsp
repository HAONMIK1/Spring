<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
list.jsp
<script type="text/javascript">
function insert() {
	location.href='insert.ab';
}
</script>
<style>

table {
	margin: auto;
}
</style>
<center>
<form action="list.ab" method="get">
	<select name="whatColumn">
		<option value="all">전체검색
		<option value="title">노래제목
		<option value="singer">가수명
	</select>
	<input type="text" name="keyword">
	<input type="submit" value="전송">
</form>
<h1>레코드수 : ${totalCount}</h1>
</center>
<table border="1">
<tr>
	<td colspan="7" align="right">
		<input type="button" onclick="insert()" value="추가하기">
	</td>
</tr>
<tr>
<td>번호</td>
<td>제목</td>
<td>가수</td>
<td>가격</td>
<td>날짜</td>
<td>수정</td>
<td>삭제</td>
</tr>
<c:forEach var="bean" items="${albumLists}">
<tr>
<td>${bean.num }</td>
<td><a href="detail.ab?num=${bean.num }">${bean.title }</a></td>
<td>${bean.singer }</td>
<td>${bean.price }</td>
<td>
<fmt:parseDate var="day" value="${bean.day}" pattern="yyyy-MM-dd" /> 
				<fmt:formatDate value="${day}" pattern="yyyy-MM-dd" />
</td>

<td><a href="updateForm.ab?num=${bean.num }">수정</a></td>
<td><a href="delete.ab?num=${bean.num }">삭제</a></td>
</tr>
</c:forEach>
</table>

<br><br>
<center>
${pageInfo.pagingHtml}
</center>