<%@page import="bean.BookBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
title1 ${param.title}<br>
title2 ${bookBean.title}<br>
title3 <%=((BookBean)request.getAttribute("bookBean")).getTitle()%><br>

author1 ${param.author}<br>
author2 ${bookBean.author}<br>
author3 <%=((BookBean)request.getAttribute("bookBean")).getAuthor()%><br>

price1 ${param.price}<br>
price2 ${bookBean.price}<br>
price3 <%=((BookBean)request.getAttribute("bookBean")).getPrice()%><br>

publisher1 ${param.publisher}<br>
publisher2 ${bookBean.publisher}<br>
publisher3 <%=((BookBean)request.getAttribute("bookBean")).getPublisher()%><br>

bookstore ${param.bookstore}<br>
bookstore ${bookBean.bookstore}<br>
bookstore <%=((BookBean)request.getAttribute("bookBean")).getBookstore()%><br>

bookstore ${param.kind}<br>
bookstore ${bookBean.kind}<br>
bookstore <%=((BookBean)request.getAttribute("bookBean")).getKind()%><br>