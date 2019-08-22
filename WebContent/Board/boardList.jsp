<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>커뮤니티게시판</title>
<style>
#logo {
	font-size: 14px;
}
</style>

</head>
<body>
	<div class="container" id="topContainer" style="display: inline;">
		<header> <nav>
		<div id="logo">
			<img src="../img/ali_logo.png" width="100px" height="100px">
		</div>
		<div id="topMenu">
			<a href="boardServlet?command=board_notice" id="btn_topMenu_notice">공지사항</a>
		</div>

		<div id="topMenu_search_div">
			<form action="boardServlet?command=board_search" method="get"
				name="topMenu_search" id="search"
				onsubmit="return topMenu_search_check()">
				<input type="hidden" name="kind" value="search"> <select
					name="searchCombo">
					<option value="subject" selected>제목</option>
					<option value="name">이름</option>
				</select> <input type="text" size="20" name="keyword" > <input
					type="button" name="submit" value="검색">
			</form>
		</div>
		</nav> </header>
		<section class="content"> 
		<main>
			<table class="list">
				<tr>
					<td colspan="5" style="border: white; text-align: right"><a
						href="boardServlet?command=board_write_form"> 게시글 등록 </a></td>
				</tr>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>이름</th>
					<th>날짜</th>
					<th>조회</th>
					<th>추천</th>
				</tr>
				<c:forEach var="board" items="${boardList }">
				<tr class="record">
					<td>${board.num}</td>
					<td><a href="BoardServlet?command=board_view&num=${board.num}">
							${board.title}</a></td>
					<td>${board.name }</td>
					<td><fmt:formatDate value="${board.writedate }" /></td>
					<td>${board.readcount }</td>
					<td>${board.thumbsup }</td>
				</tr>
			</c:forEach>
		</table>
		</main> </section>
		<footer> footer </footer>
	</div>
</body>
</html>