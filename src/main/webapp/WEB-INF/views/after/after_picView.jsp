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
				<h2><a href="after_picList?cat=${pic.cat}">${pic.cat} Board</a></h2>
				<section class="special">
					<form method="post" action="after_comPic?no=${pic.no}">
						<div class="row gtr-uniform gtr-50">
							<ul class="col-12 alt" style="text-align: left">
								<li>&emsp;${pic.title}</li>
								<li>&emsp;${pic.name}</li>
								<c:forEach var="fname" items="${piclist }">
									<li>&emsp;<a href="${pageContext.request.contextPath }/download?filename=${fname}" class="icon solid fa-download"> ${fname}[다운로드]</a></li>
									<li><img src="${pageContext.request.contextPath }/download?filename=${fname}" style="width:100%"></li>
								</c:forEach>
								<li><textarea rows="1" readonly>&ensp;${pic.post}</textarea></li>
								<li>&emsp;${pic.day} / views: ${pic.views}</li>
								<li></li>
							</ul>
							<div class="col-12 col-12-xsmall" style="text-align: left">
								<h4 class="icon solid fa-comments">Comments as
									'${pic.title}'</h4>
							</div>
							<div class="col-10">
								<input type="hidden" name="name" value="${sessionScope.usrName}" />
								<input type="hidden" name="no" value="${pic.no}" /> <input
									type="text" name="com" id="com" value=""
									placeholder="What your thoughts?" />
							</div>
							<div class="col-2">
								<input type="submit" value="comment" />
							</div>
							<ul class="col-12 alt" style="text-align: left">
								<c:forEach items="${comlist}" var="vo">
									<li>${vo.name}<sub>(${vo.day.substring(5,19)})</sub> :
										${vo.com}
									</li>
								</c:forEach>
							</ul>
						</div>
					</form>
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