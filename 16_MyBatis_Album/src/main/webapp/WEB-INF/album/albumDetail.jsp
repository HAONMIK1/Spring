<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<h1>앨범</h1>
<p>
	<label>노래제목</label>
	${albumBean.title }
</p>
<p>
	<label>가수</label>
	${albumBean.singer }
</p>
<p>
	<label>가격</label>
	${albumBean.price }
</p>
<p>
	<label>발매일</label>
	<fmt:parseDate var="day" value="${albumBean.day}" pattern="yyyy-MM-dd" /> 
	<fmt:formatDate value="${day}" pattern="yyyy-MM-dd" />
</td>
</p>
<p>
	<a href="updateForm.ab?num=${albumBean.num}">수정</a>
</p>
<p>
	<a href="list.ab">목록보기</a>
</p>

