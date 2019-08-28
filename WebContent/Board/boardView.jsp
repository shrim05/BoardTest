<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시글 상세페이지</title>

</head>
<body>
	<table>
		<tr>
			<th>번호</th> <td>${board.num}</td>
		</tr>
		<tr>
			<th>제목</th><td>${board.title }</td>
		</tr>
		<tr>
			<th>이름</th><td>${board.name }</td>
		</tr>
		<tr>
			<th>날짜</th><td><fmt:formatDate value="${board.writedate}"/></td>
		</tr>
		<tr>
			<th>조회</th><td>${board.readcount }</td>
		</tr>
		<tr>
			<th>추천</th><td>${board.thumbsup}</td>
		</tr>
		<tr>
			<th>내용</th><td>${board.content}</td>
		</tr>
	</table>
		<a href="javascript:history.back();">뒤로가기</a>
</body>
</html>