<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
				<a href="mainForm">BAEKSEON's PIC.</a>
			</h1>
			<nav id="nav">
				<ul>
					<li><a href="mainForm">Home</a></li>
					<li><a href="#">Category</a>
						<ul>
							<li><a href="#">Music</a></li>
							<li><a href="#">Food</a></li>
							<li><a href="#">Fashion</a></li>
							<li><a href="#">Car</a></li>
							<li><a href="#">Travel</a></li>
						</ul></li>
					<li><a href="#">Board</a>
						<ul>
							<li><a href="#">Free</a></li>
							<li><a href="#">Guest</a></li>
						</ul></li>
					<li><a href="#" class="button primary">Log In</a></li>
				</ul>
			</nav>
		</header>
		<div id="main" class="wrapper style1">
			<div class="container">
				<header class="major">
					<h2>Log In</h2>
				</header>
				<section class="special">
					<form action="#" method="post">
						<div class="row gtr-uniform gtr-50">
							<div class="col-4 off-4 col-12-xsmall">
								<input type="text" name="id" id="id" value=""
									placeholder="ID" />
							</div>
							<div class="col-4 off-4 col-12-xsmall">
								<input type="password" name="pw" id="password" value=""
									placeholder="Password" />
							</div>
							<div class="col-4 off-4">
								<ul class="actions">
									<li><input type="submit" value="LogIn"
										class="primary" /></li>
									<li><input type="button" value="SignUp" onclick="location.href='signUp'" /></li>
								</ul>
							</div>
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