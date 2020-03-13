<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Order success Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="./styles/global.css">
	<link rel="stylesheet" href="./styles/newstyle.css"> 
</head>
<body>
<header class="header">
		<a href="index.jsp"><img src="./images/logo1.png" style="width: 200px" /></a>
		<div class="header-right">
		    <a href="LogoutServlet" class="btn btn-info btn-lg" style="background-color: #4CAF50;">
          <span class="glyphicon glyphicon-log-out"></span> Log out <a href="index.jsp" class="btn btn-info btn-lg" style="background-color: #4CAF50;">
          <span class="glyphicon glyphicon-home"></span> Home
        </a>
		</div>
	</header>
	<div class="row">
  <div class="col-75">
    <div class="container">
<H4><i>Welcome ${ name }</i> <br />
</H4>	
<div style="width:800px; margin:70px auto;float:center;font-family: cursive; font-size: 13px;"><h3>Thank you for your order! Your order will be delivered to your address soon.</h3>
	</div>
	    </div>
  </div>  
</div>
		<footer class="footer">Copyright 2020 @Yosha</footer>
</body>
</html>