<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<style type="text/css">
.err {
	font-size: 9pt;
	color: red;
	font-weight: bold;
}
</style>
<form:form action="result" method="post" commandName="bookBean">
   제목 <input type="text" name="title" value="${ bookBean.title}">
	<form:errors cssClass="err" path="title" />
	<br>
   저자 <input type="text" name="author" value="${ bookBean.author}">
	<form:errors cssClass="err" path="author" />
	<br>
   가격 <input type="text" name="price" value="${ bookBean.price}">
	<form:errors cssClass="err" path="price" />
	<br>
   출판사 <input type="text" name="publisher"
		value="${ bookBean.publisher}">
	<form:errors cssClass="err" path="publisher" />
	<br>
   구입 가능 서점
   교보문고<input type="checkbox" name="bookstore" value="교보문고" <c:if test="${fn:contains(bookBean.bookstore,'교보문고')}">checked</c:if>>
   알라딘<input type="checkbox" name="bookstore" value="알라딘" <c:if test="${fn:contains(bookBean.bookstore,'알라딘')}">checked</c:if>>
   yes24<input type="checkbox" name="bookstore" value="yes24" <c:if test="${fn:contains(bookBean.bookstore,'yes24')}">checked</c:if>>
   인터파크<input type="checkbox" name="bookstore" value="인터파크"<c:if test="${fn:contains(bookBean.bookstore,'인터파크')}">checked</c:if>>
   <form:errors cssClass = "err" path="bookstore"/>
	<br>
 배송비
 <input type="radio" name="kind" value="유료" <c:if test="${bookbean.kind =='유료' }"> checked </c:if>>유료
 <input type="radio" name="kind" value="무료" <c:if test="${bookbean.kind =='무료' }"> checked </c:if>>무료
 	<form:errors cssClass="err" path="kind" />
	<br>
	<input type="submit" value="전송">
</form:form>

<!-- 
title : 제목 입력 누락
author : 5글자 이상 입력
price : 숫자로 입력 5자링 이하로 입력
publisher : 출판사 입력 누락
-->