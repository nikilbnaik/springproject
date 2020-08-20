<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Registration</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="static/image/png" href="static/images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="static/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="static/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="static/fonts/iconic/css/material-design-iconic-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="static/vendor/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="static/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="static/vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="static/vendor/select2/select2.min.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="static/vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="static/css/util.css">
	<link rel="stylesheet" type="text/css" href="static/css/main.css">
<!--===============================================================================================-->
</head>
<body>
	<div class="limiter">
		<div class="container-login100" style="background-image: url('static/images/bg-01.jpg');">
		<div class="wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54">
       <form:form method="post" action="/addUserDetails">    
        <span class="login100-form-title p-b-49">
						<img src="static/images/logo.png"></img>
					</span>
					<span class="login100-form-title p-b-49">
						Register
					</span>
					
					<div class="wrap-input100 validate-input m-b-23" data-validate = "Username is reauired">
                                                <span class="label-input100">Enter your first name</span>
                                                <form:input path="fname" class="input100" placeholder="Type your first name" />
  
                                                <span class="focus-input100" data-symbol="&#xf206;"></span>
                                        </div>
					
					<div class="wrap-input100 validate-input m-b-23" data-validate = "Username is reauired">
                                                <span class="label-input100">Enter your last name</span>
                                                <form:input path="lname" class="input100" placeholder="Type your last name" />
                                                
                                                <span class="focus-input100" data-symbol="&#xf206;"></span>
                                        </div>
					
					<div class="wrap-input100 validate-input m-b-23" data-validate = "Username is reauired">
						<span class="label-input100">Enter your username</span>
						<form:input path="username" class="input100" placeholder="Type your username" />
						
						<span class="focus-input100" data-symbol="&#xf206;"></span>
					</div>

					<div class="wrap-input100 validate-input m-b-23" data-validate = "Username is reauired">
						<span class="label-input100">Enter your password</span>
						<form:input path="password" class="input100" placeholder="Type your password" />
						
						<span class="focus-input100" data-symbol="&#xf206;"></span>
					</div>

					<div class="wrap-input100 validate-input" data-validate="Password is required">
						<span class="label-input100">Type your email ID</span>
						<form:input path="email" class="input100" placeholder="Type your email ID" />
						
						<span class="focus-input100" data-symbol="&#xf190;"></span>
					</div>
					
					<div class="wrap-input100 validate-input m-b-23" data-validate = "Username is reauired">
                                                <span class="label-input100">Enter your qualification</span>
                                                <form:input path="qualification" class="input100" placeholder="Type your qualification" />
                                                
                                                <span class="focus-input100" data-symbol="&#xf206;"></span>
                                        </div>
					
					<div class="wrap-input100 validate-input m-b-23" data-validate = "Username is reauired">
                                                <span class="label-input100">Enter your profession</span>
                                                <form:input path="profession" class="input100" placeholder="Type your profession" />
                                                
                                                <span class="focus-input100" data-symbol="&#xf206;"></span>
                                        </div>
					
					<div class="text-right p-t-8 p-b-31">
						
					</div>
					
					<div class="container-login100-form-btn">
						<div class="wrap-login100-form-btn">
							<div class="login100-form-bgbtn"></div>
							<button class="login100-form-btn">
								Register
							</button>
						</div>
					</div>    
       </form:form>    
       </div>
		</div>
	</div>
	

	<div id="dropDownSelect1"></div>
	
<!--===============================================================================================-->
	<script src="static/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="static/vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="static/vendor/bootstrap/js/popper.js"></script>
	<script src="static/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="static/vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="static/vendor/daterangepicker/moment.min.js"></script>
	<script src="static/vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="static/vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="static/js/main.js"></script>

</body>
</html>