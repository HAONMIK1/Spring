<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<style type="text/css">
	.err{
		font-size: 9pt;
		color: red;
		font-weight: bold;
	}
</style>   
<form:form action="memberForm" method="post" commandName="memberBean">
이름
<input type="text" name="name" value="${memberBean.name }">
<form:errors path="name" />
<br>

아이디
<input type="text" name="id" value="${memberBean.id }">
<form:errors path="id" />
<br>
<br>

<input type="submit" value="전송">
<br>
<br>
<br>
</form:form>

