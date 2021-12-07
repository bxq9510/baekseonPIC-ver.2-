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
					<h1 id="logo"><a href="after_mainForm" class="icon solid fa-camera"> BAEKSEON's PIC.</a></h1>
					<nav id="nav">
						<ul>
							<li><a href="after_mainForm">Home</a></li>
							<li>
								<a href="#">Category</a>
								<ul>
									<li><a href="after_picList?cat=music">Music</a></li>
									<li><a href="after_picList?cat=food">Food</a></li>
									<li><a href="after_picList?cat=fashion">Fashion</a></li>
									<li><a href="after_picList?cat=car">Car</a></li>
									<li><a href="after_picList?cat=travel">Travel</a></li>
								</ul>
							</li>
							<li><a href="#">Board</a>
								<ul>
									<li><a href="after_brdList?cat=free">Free</a></li>
									<li><a href="after_brdList?cat=guest">Guest</a></li>
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
				<header>
					<h2>Free Board</h2>
				</header>
				<section>
					<div class="row gtr-0 gtr-uniform">
						<div class="row col-1 off-10">
							<input type="button" value="New PIC"
								onclick="location.href='inputBrd'" />
						</div>
					</div>
					<div class="row gtr-0 gtr-uniform">
						<div class="row col-1 off-10">
							&nbsp;
						</div>
					</div>
					<div>
						<div class="table-wrapper">
							<table>
								<thead>
									<tr>
										<th>Name</th>
										<th>Description</th>
										<th>Price</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>Item 1</td>
										<td>Ante turpis integer aliquet porttitor.</td>
										<td>29.99</td>
									</tr>
									<tr>
										<td>Item 2</td>
										<td>Vis ac commodo adipiscing arcu aliquet.</td>
										<td>19.99</td>
									</tr>
									<tr>
										<td>Item 3</td>
										<td>Morbi faucibus arcu accumsan lorem.</td>
										<td>29.99</td>
									</tr>
									<tr>
										<td>Item 4</td>
										<td>Vitae integer tempus condimentum.</td>
										<td>19.99</td>
									</tr>
									<tr>
										<td>Item 5</td>
										<td>Ante turpis integer aliquet porttitor.</td>
										<td>29.99</td>
									</tr>
								</tbody>
								<tfoot>
									<tr>
										<td colspan="2"></td>
										<td>100.00</td>
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