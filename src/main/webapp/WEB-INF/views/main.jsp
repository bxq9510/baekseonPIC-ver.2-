<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
	<head>
		<title>Eventually by HTML5 UP</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/main/assets/css/main.css" />
	</head>
	<body class="is-preload">

		<!-- Header -->
			<header id="header">
				<h1>BAEKSEON's PIC</h1>
				<p>The internet’s source of freely-usable images.<br />Powered by creators everywhere.<br />by <a href="mainForm">BAEKSEON's PIC</a>.</p>
			</header>

		<!-- Signup Form -->
			<form action="signUp_main" id="signup-form" method="post" >
				<input type="text" name="name" id="name" placeholder="Create your ID in BAEKSEON's PIC" />
				<input type="submit" value="Join!" />
			</form>

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

		<!-- Scripts -->
			<script src="resources/main/assets/js/main.js"></script>

	</body>
</html>