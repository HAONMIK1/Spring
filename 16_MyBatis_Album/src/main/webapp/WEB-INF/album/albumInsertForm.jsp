<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<h1>앨범 추가</h1>
<form:form action="insert.ab" commandName="albumBean">
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
	<input type="text" name="day" value="2023-01-01">
	<form:errors path="day"/>
</p>
<p>

	<input type="submit" value="추가하기">
</p>
</form:form>