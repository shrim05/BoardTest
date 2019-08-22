<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>3번째 게시판</title>
</head>
<body>
<div id="wrap" align="center">
	<h1>My Board</h1>
	<input type="button" value="임시" onclick="location.href='BoardServlet?command=board_list'">
	<table class="list">
		<tr>
			<td colspan="5" style="border:white; text-align: right">
				<a href="boardServlet?command=board_write_form"> 게시글 등록 </a>
			</td>
 		</tr>
 		<tr><th>번호</th><th>제목</th><th>작성자</th><th>작성일</th><th>조회</th></tr>
 		<c:forEach var="board" items="${boardList }">
 		<tr class="record">
 			<td>${board.num}</td>
 			<td>
 			<a href="BoardServlet?command=board_view&num=${board.num}"> ${board.title}</a>
 			</td>
 			<td>${board.name }</td>
 			<td><fmt:formatDate value="${board.writedate }"/></td>
 			<td>${board.readcount }</td>
 			</tr>
		</c:forEach>
	</table>
</div>

</body>
</html>