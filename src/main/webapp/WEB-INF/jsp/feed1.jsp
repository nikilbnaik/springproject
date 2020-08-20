<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900" rel="stylesheet" />
<link href="static/main/default.css" rel="stylesheet" type="text/css" media="all" />
<link href="static/main/fonts.css" rel="stylesheet" type="text/css" media="all" />
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">

<style>
th, td {
  height: 50px;
}
</style>
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
		<form method="POST" action="save-review">
		<div id="banner">
			<img src="static/main/images/logo.png" alt="" class="image-full" />
		</div>
		<div id="welcome">
			<div class="title">
				<h2>Dell Alienware Area-51M</h2>
			</div>
		</div>
		<div id="featured">
			<img src="static/main/images/pic01.jpg" width="800" height="400"></img>
			<br /><br />
			<h2>Please leave your feedback here</h2>
			<br /><br />
			<table>
			<tr>
			<td align="left"><h2>Display :</h2></td>
			<td align="right"><textarea rows="10" cols="56" name="display" value="${Review.display }"></textarea></td>
			</tr>
			<tr>
			<td align="left"><h2>Performance :</h2></td>
			<td align="right"><textarea rows="10" cols="56" name="performance" value="${Review.performance }"></textarea></td>
			</tr>
			<tr>
			<td align="left"><h2>Battery Backup :</h2></td>
			<td align="right"><textarea rows="10" cols="56" name="battery" value="${Review.battery }"></textarea></td>
			</tr>
			<tr>
			<td align="left"><h2>RAM :</h2></td>
			<td align="right"><textarea rows="10" cols="56" name="ram" value="${Review.ram }"></textarea></td>
			</tr>
			<tr>
			<td align="left"><h2>Storage :</h2></td>
			<td align="right"><textarea rows="10" cols="56" name="storage" value="${Review.storage }"></textarea></td>
			</tr>
			<tr>
			<td align="left"><h2>Interface :</h2></td>
			<td align="right"><textarea rows="10" cols="56" name="interfaces" value="${Review.interfaces }"></textarea></td>
			</tr>
			</table>
			<br /><br />
			<button class="rev">Submit</button>
		</div>
		
		<div id="copyright">
			<span>&copy; Untitled. All rights reserved. | Tech Geek</span>
			<span>Design by Nikil B Naik</span>
		</div>
	</div>
	</form
</div>
</body>
</html>


