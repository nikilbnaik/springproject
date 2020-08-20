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
				<li><a href="#" accesskey="2" title="">My Account</a></li>
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
				<h2>User Profile</h2>
			</div>
		</div>
		<div id="featured">
			<table align="center">
				<tr align="left">
					<td>
						<h2>First Name : </h2>
					</td>
					<td>
						<h2>${fname} </h2>
                    </td>
				</tr>
				<tr><td></td><td></td></tr>
				<tr><td></td><td></td></tr>
                                <tr align="left">
                                        <td>
						<h2>Last Name : </h2>
                                        </td>
                                        <td>
                                                <h2> ${lname} </h2>
                                        </td>
                                </tr>
				<tr><td></td><td></td></tr>
				<tr><td></td><td></td></tr>
                                <tr align="left">
                                        <td>
						<h2>User Name : </h2>
                                        </td>
                                        <td>
                                                <h2>${username}</h2>
                                        </td>
                                </tr>
				<tr><td></td><td></td></tr>
				<tr><td></td><td></td></tr>
                                <tr align="left">
                                        <td>
						<h2>Email ID : </h2>
                                        </td>
                                        <td>
                                                <h2>${email} </h2>
                                        </td>
                                </tr>
				<tr><td></td><td></td></tr>
				<tr><td></td><td></td></tr>
                                <tr align="left">
                                        <td>
						<h2>Education Qualification :</h2>
                                        </td>
                                        <td>
                                                <h2> ${qualification}</h2>
                                        </td>
                             	</tr>
				<tr><td></td><td></td></tr>
				<tr><td></td><td></td></tr>
                                <tr align="left">
                                        <td>
						<h2>Profession : </h2>
                                        </td>
                                        <td>
                                                <h2> ${profession} </h2>
                                        </td>
                                </tr>
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
