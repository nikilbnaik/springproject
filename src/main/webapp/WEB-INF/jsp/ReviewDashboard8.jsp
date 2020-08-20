<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900" rel="stylesheet" />
<link href="static/main/default.css" rel="stylesheet" type="text/css" media="all" />
<link href="static/main/fonts.css" rel="stylesheet" type="text/css" media="all" />

</head>
<body>

<div id="page" class="container">
	<div id="header">
		<div id="logo">
			<img src="static/main/images/pic.png" alt="" />
			<h1><a href="#">Welcome </a></h1>
		</div>
		<div id="menu">
			<ul>
				<li><a href="./welcome" accesskey="1" title="">Homepage</a></li>
				<li><a href="./profile" accesskey="2" title="">My Account</a></li>
				<li><a href="./review" accesskey="3" title="">Reviews</a></li>
				<li><a href="./dashboard" accesskey="4" title="">Dashboard</a></li>
				<li><a href="./login" accesskey="5" title="">Logout</a></li>
			</ul>
		</div>
	</div>
	<div id="main">
		<div id="banner">
			<img src="static/main/images/logo.png" alt="" class="image-full" />
		</div>
		<div id="welcome">
			<div class="title">
				<h2>Lenovo Ideapad 81EV00BLIN Reviews</h2>
			</div>
		</div>
		<div id="featured">
		<img src="static/main/images/pic06.jpg" width="800" height="400"></img>
			<br /><br />
		<table align="center">
			<tbody>
			<c:forEach var="review8" items="${reviews8}">
			<tr>
				<th colspan="2" align="left" bgcolor="grey">${review8.username}</th>
			</tr>
			<tr>
				<th align="left">Display :</th> <td align="left">${review8.display}</td>
			</tr>
			<tr>
				<th align="left">Performance :</th> <td align="left">${review8.performance}</td>
			</tr>
			<tr>
				<th align="left">Battery :</th> <td align="left">${review8.battery}</td>
			</tr>
			<tr>
				<th align="left">Ram :</th> <td align="left">${review8.ram}</td>
			</tr>
			<tr>
				<th align="left">Storage :</th> <td align="left">${review8.storage}</td>
			</tr>
			<tr>
				<th align="left">Interfaces :</th> <td align="left">${review8.interfaces}</td>
			</tr>
			</c:forEach>
			</tbody>
			</table>
	</div>
		<div id="copyright">
			<span>&copy; Untitled. All rights reserved. | Tech Geek</span>
			<span>Design by Nikil B Naik</span>
		</div>
	</div>
</div>
</body>
</html>