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
<body class="is-preload landing">
	<div id="page-wrapper">

		<!-- Header -->
		<header id="header">
			<h1 id="logo">
				<a href="after_mainForm" class="icon solid fa-camera">
					BAEKSEON's PIC.</a>
			</h1>
			<nav id="nav">
				<ul>
					<li><a href="after_mainForm">Home</a></li>
					<li><a href="#">Category</a>
						<ul>
							<li><a href="after_picList?cat=Music">Music</a></li>
							<li><a href="after_picList?cat=Food">Food</a></li>
							<li><a href="after_picList?cat=Fashion">Fashion</a></li>
							<li><a href="after_picList?cat=Car">Car</a></li>
							<li><a href="after_picList?cat=Travel">Travel</a></li>
						</ul></li>
					<li><a href="#">Board</a>
						<ul>
							<li><a href="after_brdList?cat=Free">Free</a></li>
							<li><a href="after_brdList?cat=Guest">Guest</a></li>
						</ul></li>
					<li><a href="#" class="icon solid fa-user-circle">${sessionScope.usrName}(${sessionScope.usrId})
					</a></li>
					<li><a href="logOut" class="button primary">Log Out</a></li>
				</ul>
			</nav>
		</header>

		<!-- Banner -->
		<div id="main" class="wrapper style1">
			<div class="container">
				<header class="major">
					<h2>${pagevo.cat}</h2>
				</header>
				<section>
					<div class="box alt">
						<div class="row gtr-50 gtr-uniform">
							<div class="col-1 off-10">
								<input type="button" value="New PIC"
									onclick="location.href='after_inputPic'" />
							</div>
							<c:forEach items="${piclist}" var="vo">
								<div class="col-4 col-6-xsmall">
									<a href="after_picView?no=${vo.pic_no}" class="image fit"><img src="${pageContext.request.contextPath }/download?filename=${vo.filename}" /></a>
								</div>
							</c:forEach>
							<table style="margin-top: 2em">
								<tfoot>
									<tr>
										<td><c:if test="${pageVO.prev}">
												<a href="brdList?page=${pageVO.startPage-1}&cat=${pageVO.cat}" class="tb">[이전]</a>
											</c:if> <c:forEach begin="${pageVO.startPage}"
												end="${pageVO.endPage}" var="idx">
												<a href="brdList?page=${idx}&cat=${pageVO.cat}" class="tb">${idx}</a>
											</c:forEach> <c:if test="${pageVO.next}">
												<a href="brdList?page=${pageVO.endPage+1}&cat=${pageVO.cat}"
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