<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>
	<head>
		<title>Landed by HTML5 UP</title>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/assets/css/main.css" />
	</head>
	<body class="is-preload landing">
		<div id="page-wrapper">

			<!-- Header -->
				<header id="header">
					<h1 id="logo"><a href="after_mainForm" class="icon solid fa-camera"> BAEKSEON's PIC.</a></h1>
					<nav id="nav">
						<ul>
							<li><a href="after_mainForm">Home</a></li>
							<li>
								<a href="#">Category</a>
								<ul>
									<li><a href="after_picList?cat=Music">Music</a></li>
									<li><a href="after_picList?cat=Food">Food</a></li>
									<li><a href="after_picList?cat=Fashion">Fashion</a></li>
									<li><a href="after_picList?cat=Car">Car</a></li>
									<li><a href="after_picList?cat=Travel">Travel</a></li>
								</ul>
							</li>
							<li><a href="#">Board</a>
								<ul>
									<li><a href="after_brdList?cat=Free">Free</a></li>
									<li><a href="after_brdList?cat=Guest">Guest</a></li>
								</ul>
							</li>
							<li><a href="#" class="icon solid fa-user-circle">${sessionScope.usrName}(${sessionScope.usrId}) </a></li>
							<li><a href="logOut" class="button primary">Log Out</a></li>
						</ul>
					</nav>
				</header>

			<!-- Banner -->
				<section id="banner">
					<div class="content">
						<header>
							<h2>BAEKSEON's PIC.</h2>
							<p>The internet’s source of freely-usable images.<br />
							Powered by creators everywhere.</p>
						</header>
						<span class="image"><img src="resources/images/logo.png" alt="" /></span>
					</div>
					<a href="#one" class="goto-next scrolly">Next</a>
				</section>

			<!-- Footer -->
				<footer id="footer">
					<ul class="icons">
						<li><a href="#" class="icon brands alt fa-twitter"><span class="label">Twitter</span></a></li>
						<li><a href="#" class="icon brands alt fa-facebook-f"><span class="label">Facebook</span></a></li>
						<li><a href="#" class="icon brands alt fa-instagram"><span class="label">Instagram</span></a></li>
						<li><a href="https://github.com/bxq9510" class="icon brands alt fa-github"><span class="label">GitHub</span></a></li>
						<li><a href="https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox" class="icon solid alt fa-envelope"><span class="label">Email</span></a></li>
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