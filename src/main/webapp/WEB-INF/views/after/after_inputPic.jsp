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
		<div id="main" class="wrapper style1">
			<div class="container">
				<h2>New PIC</h2>
				<section class="special">
					<form method="post" action="#">
						<div class="row gtr-uniform gtr-50">
							<div class="col-6 col-12-xsmall">
								<input type="text" name="name" id="name" value=""
									placeholder="Name" />
							</div>
							<div class="col-6 col-12-xsmall">
								<input type="email" name="email" id="email" value=""
									placeholder="Email" />
							</div>
							<div class="col-12">
								<select name="category" id="category">
									<option value="">- Category -</option>
									<option value="1">Manufacturing</option>
									<option value="1">Shipping</option>
									<option value="1">Administration</option>
									<option value="1">Human Resources</option>
								</select>
							</div>
							<div class="col-4 col-12-medium">
								<input type="radio" id="priority-low" name="priority" checked>
								<label for="priority-low">Low Priority</label>
							</div>
							<div class="col-4 col-12-medium">
								<input type="radio" id="priority-normal" name="priority">
								<label for="priority-normal">Normal Priority</label>
							</div>
							<div class="col-4 col-12-medium">
								<input type="radio" id="priority-high" name="priority">
								<label for="priority-high">High Priority</label>
							</div>
							<div class="col-6 col-12-medium">
								<input type="checkbox" id="copy" name="copy"> <label
									for="copy">Email me a copy of this message</label>
							</div>
							<div class="col-6 col-12-medium">
								<input type="checkbox" id="human" name="human" checked>
								<label for="human">I am a human and not a robot</label>
							</div>
							<div class="col-12">
								<textarea name="message" id="message"
									placeholder="Enter your message" rows="6"></textarea>
							</div>
							<div class="col-12">
								<ul class="actions">
									<li><input type="submit" value="Send Message"
										class="primary" /></li>
									<li><input type="reset" value="Reset" /></li>
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