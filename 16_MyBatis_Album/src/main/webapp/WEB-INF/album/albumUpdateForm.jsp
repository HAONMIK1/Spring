<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<h1>앨범 수정</h1>
<form:form action="update.ab" commandName="albumBean">
	<input type="hidden" name="num" value="${albumBean.num }">
<p>
	<label>노래제목</label>
	<input type="text" name="title" value="${albumBean.title }">
	<form:errors path="title"/>
</p>
<p>
	<label>가수</label>
	<input type="text" name="singer" value="${albumBean.singer }">
	<form:errors path="singer"/>
</p>
<p>
	<label>가격</label>
	<input type="text" name="price" value="${albumBean.price }">
	<form:errors path="price"/>
</p>
<p>
	<label>발매일</label>
	<fmt:parseDate var="day" value="${albumBean.day}" pattern="yyyy-MM-dd" />
	<input type="text" name="day" value="<fmt:formatDate value="${day}" pattern="yyyy-MM-dd" />">
	<form:errors path="day"/>
</p>
<p>

	<input type="submit" value="수정하기">
</p>
</form:form>