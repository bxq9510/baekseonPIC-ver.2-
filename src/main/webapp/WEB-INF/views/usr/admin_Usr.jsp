<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Landed by HTML5 UP</title>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/assets/css/main.css" />
</head>
<style>
a.tb {
	border: 0;
	color: inherit;
	display: inline-block;
	height: inherit;
	line-height: inherit;
	outline: 0;
}

a.tb:before {
	margin-right: 0.5em;
}

active>a.tb {
	color: #e44c65;
}
</style>
<body class="is-preload landing">
	<div id="page-wrapper">

		<!-- Header -->
		<header id="header">
			<h1 id="logo">
				<a href="mainForm">BAEKSEON's PIC.</a>
			</h1>
			<nav id="nav">
				<ul>
					<li><a href="mainForm">Home</a></li>
					<li><a href="#">Category</a>
						<ul>
							<li><a href="picList?cat=Travel">Travel</a></li>
							<li><a href="picList?cat=Music">Music</a></li>
							<li><a href="picList?cat=Food">Food</a></li>
							<li><a href="picList?cat=Fashion">Fashion</a></li>
							<li><a href="picList?cat=Car">Car</a></li>
						</ul></li>
					<li><a href="#">Board</a>
						<ul>
							<li><a href="brdList?cat=Free">Free</a></li>
							<li><a href="brdList?cat=Guest">Guest</a></li>
						</ul></li>
					<c:catch>
						<c:choose>
							<c:when test="${empty sessionScope.usrId}">
								<li><a href="logIn" class="button primary">Log In</a></li>
							</c:when>
							<c:otherwise>
								<c:choose>
									<c:when test="${sessionScope.usrId eq 'admin' }">
										<li><a href="#">Admin</a>
											<ul>
												<li><a href="admin_Usr">User</a></li>
												<li><a href="admin_Board">Post</a></li>
											</ul></li>
										<li><a href="#" class="icon solid fa-user-circle">${sessionScope.usrName}(${sessionScope.usrId})</a></li>
										<li><a href="logOut" class="button primary">Log Out</a></li>
									</c:when>
									<c:otherwise>
										<li><a href="#" class="icon solid fa-user-circle">${sessionScope.usrName}(${sessionScope.usrId})</a></li>
										<li><a href="logOut" class="button primary">Log Out</a></li>
									</c:otherwise>
								</c:choose>
							</c:otherwise>
						</c:choose>
					</c:catch>
				</ul>
			</nav>
		</header>

		<!-- Banner -->
		<div id="main" class="wrapper style1">
			<div class="container">
				<header class="major">
					<h2>User</h2>
				</header>
				<section>
					<div class="row gtr-0 gtr-uniform">
						<div class="row col-1 off-10">
							<input type="button" value="New Post"
								onclick="location.href='after_inputBrd'" />
						</div>
					</div>
					<div class="row gtr-0 gtr-uniform">
						<div class="row col-1 off-10">&nbsp;</div>
					</div>
					<div>
						<div class="table-wrapper">
							<table>
								<thead>
									<tr>
										<th>No.</th>
										<th>ID</th>
										<th>PW</th>
										<th>NAME</th>
										<th>Joining Date</th>
										<th>Edit / Del</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${usrlist}" var="vo" varStatus="status">
										<tr>
											<td>${status.count + pageVO.perPageNum * (pageVO.page -1)}</td>
											<td>${vo.id}</td>
											<td>${vo.pw}</td>
											<td>${vo.name}</td>
											<td>${vo.day.substring(0,9)}</td>
											<td><a href="#" class="icon solid fa-edit">수정 </a>/ 
												<a href="#" class="icon solid fa-trash">삭제</a></td>
										</tr>
									</c:forEach>
								</tbody>
								<tfoot>
									<tr>
										<td><c:if test="${pageusr.prev}">
												<a
													href="brdList?page=${pageusr.startPage-1}&cat=${pageusr.cat}"
													class="tb">[이전]</a>
											</c:if> <c:forEach begin="${pageusr.startPage}"
												end="${pageusr.endPage}" var="idx">
												<a href="brdList?page=${idx}&cat=${pageusr.cat}" class="tb">${idx}</a>
											</c:forEach> <c:if test="${pageusr.next}">
												<a href="brdList?page=${pageusr.endPage+1}&cat=${pageusr.cat}"
													class="tb">[Next]</a>
											</c:if></td>
									</tr>
								</tfoot>
							</table>
						</div>
					</div>
				</section>
			</div>
		</div>

		<!-- Footer -->
		<footer id="footer">
			<ul class="icons">
				<li><a href="#" class="icon brands alt fa-twitter"><span
						class="label">Twitter</span></a></li>
				<li><a href="#" class="icon brands alt fa-facebook-f"><span
						class="label">Facebook</span></a></li>
				<li><a href="#" class="icon brands alt fa-instagram"><span
						class="label">Instagram</span></a></li>
				<li><a href="https://github.com/bxq9510"
					class="icon brands alt fa-github"><span class="label">GitHub</span></a></li>
				<li><a
					href="https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox"
					class="icon solid alt fa-envelope"><span class="label">Email</span></a></li>
			</ul>
			<ul class="copyright">
				<li>&copy; bsy.</li>
			</ul>
		</footer>

	</div>

	<!-- Scripts -->
	<script src="resources/assets/js/jquery.min.js"></script>
	<script src="resources/assets/js/jquery.scrolly.min.js"></script>
	<script src="resources/assets/js/jquery.dropotron.min.js"></script>
	<script src="resources/assets/js/jquery.scrollex.min.js"></script>
	<script src="resources/assets/js/browser.min.js"></script>
	<script src="resources/assets/js/breakpoints.min.js"></script>
	<script src="resources/assets/js/util.js"></script>
	<script src="resources/assets/js/main.js"></script>

</body>
</html>