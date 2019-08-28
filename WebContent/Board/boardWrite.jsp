<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Write Posting</title>
</head>
<body>
<div id="wrap" align="center">
	<h1>글작성</h1>
	<form name="frm" method="post" action="BoardServlet">
		<table>
		<tr>
			<th>번호</th> <td><input type="text" name="bno"></td>
		</tr>
		<tr>
			<th>제목</th><td><input type="text" name="title"></td>
		</tr>
		<tr>
			<th>이름</th><td><input type="text" name="name"></td>
		</tr>
		<tr>
			<th>날짜</th><td><%=new Date() %></td>
		</tr>
		<tr>
			<th>내용</th><td><textarea rows="5" cols="30" name="contents"></textarea></td>
		</tr>
	</table>
		<input type="submit" value="제출">
		<input type="reset" value="취소">
		<a href="javascript:history.back();">뒤로가기</a>
	</form>
</div>
</body>
</html>