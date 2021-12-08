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
					<h1 id="logo"><a href="mainForm">BAEKSEON's PIC.</a></h1>
					<nav id="nav">
						<ul>
							<li><a href="mainForm">Home</a></li>
							<li>
								<a href="#">Category</a>
								<ul>
									<li><a href="picList?cat=Music">Music</a></li>
									<li><a href="picList?cat=Food">Food</a></li>
									<li><a href="picList?cat=Fashion">Fashion</a></li>
									<li><a href="picList?cat=Car">Car</a></li>
									<li><a href="picList?cat=Travel">Travel</a></li>
								</ul>
							</li>
							<li><a href="#">Board</a>
								<ul>
									<li><a href="brdList?cat=Free">Free</a></li>
									<li><a href="brdList?cat=Guest">Guest</a></li>
								</ul>
							</li>
							<li><a href="logIn" class="button primary">Log In</a></li>
						</ul>
					</nav>
				</header>

			<!-- Banner -->
		<div id="main" class="wrapper style1">
			<div class="container">
				<header class="major">
					<h2>Music</h2>
				</header>
				<section>
					<div class="box alt">
						<div class="row gtr-50 gtr-uniform">
							<div class="col-1 off-10">
								<input type="button" value="New PIC" onclick="location.href='inputPic'" />
							</div>
							<div class="col-4 col-6-xsmall">
								<a href="#" class="image fit"><img
									src="resources/images/main1.jpg" alt="" /></a>
							</div>
							<div class="col-4 col-6-xsmall">
								<a href="#" class="image fit"><img
									src="resources/images/main2.jpg" alt="" /></a>
							</div>
							<div class="col-4 col-6-xsmall">
								<a href="#" class="image fit"><img
									src="resources/images/main3.jpg" alt="" /></a>
							</div>
							<div class="col-4 col-6-xsmall">
								<a href="#" class="image fit"><img
									src="resources/images/main4.jpg" alt="" /></a>
							</div>
							<div class="col-4 col-6-xsmall">
								<a href="#" class="image fit"><img
									src="resources/images/main5.jpg" alt="" /></a>
							</div>
							<div class="col-4 col-6-xsmall">
								<a href="#" class="image fit"><img
									src="resources/images/main6.jpg" alt="" /></a>
							</div>
							<div class="col-4 col-6-xsmall">
								<a href="#" class="image fit"><img
									src="resources/images/main7.jpg" alt="" /></a>
							</div>
							<div class="col-4 col-6-xsmall">
								<a href="#" class="image fit"><img
									src="resources/images/main8.jpg" alt="" /></a>
							</div>
							<div class="col-4 col-6-xsmall">
								<a href="#" class="image fit"><img
									src="resources/images/main9.jpg" alt="" /></a>
							</div>
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