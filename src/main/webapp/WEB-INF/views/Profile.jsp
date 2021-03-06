<%@page language="java" %>
<%@page import="java.lang.*" %>
<%@ page session="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Spring MVC Index page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Project name</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Home</a></li>
					<li><a href="#about">About</a></li>
					<li><a href="#contact">Contact</a></li>
					<li class="dropdown">

						<ul class="dropdown-menu">
							<li><a href="#">Action</a></li>
							<li><a href="#">Another action</a></li>
							<li><a href="#">Something else here</a></li>
							<li role="separator" class="divider"></li>
							<li class="dropdown-header">Nav header</li>
							<li><a href="#">Separated link</a></li>
							<li><a href="#">One more separated link</a></li>
						</ul>
					</li>
				</ul>
				
			</div>
			<!--/.nav-collapse -->
		</div>
	</nav>
	<br>
	<br>
	<br/>
	<br/>
	<h1>var firstName = '<%= (String) (request.getAttribute("registrationsuccess")) %>'; </h1>
	<%  session.setAttribute("firstName",(request.getAttribute("registrationsuccess")));%>
	
	<div class="container" id="wrap">
		<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<form action="products" method="post" accept-charset="utf-8"
					class="form" role="form">
					<legend>Sign Up</legend>
					</br> </br>
					<h4>It's free and always will be.</h4>
					 <input type="hidden" name="firstName" value="${firstName}"/>
					<div class="row">
						<div class="col-xs-6 col-md-6">
							<input type="text" name="category" value=""
								class="form-control input-lg" placeholder="Category Name" />
						</div>

						<div class="col-xs-6 col-md-6">
							<input type="text" name="productName" value=""
								class="form-control input-lg" placeholder="Product Name" />
						</div>
					</div>
					</br> <input type="text" name="productDescription" value=""
						class="form-control input-lg" placeholder="Product Description" /> </br>
						 <input
						type="text" name="price" value=""
						class="form-control input-lg" placeholder="Price" /> </br>
					<div class="row">

						</br>
						<button class="btn btn-lg btn-primary btn-block signup-btn"
							type="submit">Add Products</button>
				</form>

			</div>
		</div>
	</div>
	</div>
	
	<div class="container">
		<div class="row">
			<hr>
			<div class="footer navbar-fixed-bottom">
			<div class="col-lg-12">
				<div class="col-md-8">
					<a href="#">Terms of Service</a> | <a href="#">Privacy</a>
				</div>
				<div class="col-md-4">
					<p class="muted pull-right">� 2013 Company Name. All rights
						reserved</p>
				</div>
			</div>
			</div>
		</div>
	</div>
</body>
</html>