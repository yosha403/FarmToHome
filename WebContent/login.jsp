<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Customer login page</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="stylesheet" href="./styles/global.css">
</head>
<body>
	<header class="header">
		<a href="index.jsp"><img src="./images/logo1.png" style="width: 200px" /></a>
		<div class="header-right">
		<a href="login.jsp" class="btn btn-info btn-lg" style="background-color: #4CAF50;">
		<span class="glyphicon glyphicon-log-in"></span> Log In <a href="register.jsp" class="btn btn-info btn-lg" style="background-color: #4CAF50;"> 
		<span class="glyphicon glyphicon-user"></span> Register</a>
		</div>
	</header>
	
	<div class="container-fluid list content" style="margin-top: 90px">
		<div class="row">
			<div class="col-md-4 col-sm-4 col-xs-12"></div>
			<div class="col-md-4 col-sm-4 col-xs-12">
				<form class="form-container" action="MyFirstServlet" method="post">					
					 <!--  <h1 id="signin">The Tracker</h1> -->
					 <h4><i>${welcome}</i></h4>
                		<h3><i>Sign In</i></h3>
                  		<div class="form-group">
	                 	 <div class="input-group">
							<span class="input-group-addon"><i class="fa fa-user"></i></span>
	                    	<input type="text" class="form-control" id="username" placeholder="Enter your email" name="username" required="required">
	                    	 </div>
	                 	</div>
                  <div class="form-group">
	                    <div class="input-group">
							<span class="input-group-addon"><i class="fa fa-lock"></i></span>
                    	<input type="password" class="form-control" id="password" name="password"  placeholder="Enter your password" required="required">                    	
	                  </div>
	                 </div>
                  <div class="form-group">
                  <input type="submit" class="btn btn-block" name="submit" value="Login" onclick="login()" style="background-color: #f7d695; font-weight: bold;"> 
                  <br>
                  <input type="button" class="btn btn-block" value="Create Account" onclick="window.location='register.jsp';" style="background-color: #f7d695; font-weight: bold;"> 
                  </div>
				</form>
			</div>
			<div class="col-md-4 col-sm-4 col-xs-12"></div>
		</div>
	</div>
	<footer class="footer">Copyright 2020 @Yosha</footer>
</body>
</html>