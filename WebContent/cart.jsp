<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>View Cart Page</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
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
	<H4><i>Welcome ${ name }</i> <br />
</H4>	
<div class="row">
  <div class="col-75">
    <div class="container">
	<div class="content container-fluid list" style="margin-top:90px">
		<div class="row">
			<div class="col-md-4 col-sm-4 col-xs-12"></div>
			<div class="col-md-4 col-sm-4 col-xs-12">
				<!-- <div class="signup-form"> -->			
				<form class="form-container">	
					<h3>View Cart</h3>				
	<table class="form-group" border="2" style="width:400px;">
		<tr>
			<th>Product Name</th>
			<th>Price ea.</th>
			<th>Quantity</th>
			<th>Line Price</th>
		</tr>
		<c:forEach var="i" items="${cart}">
			<tr>
				<td><c:out value="${ i.itemName}"></c:out></td>
				<td><c:out value="$${ i.itemPrice }"></c:out></td>
				<td><c:out value="${ i.itemQuantity }"></c:out></td>
				<td><c:out value="$${ i.itemQuantity*i.itemPrice }"></c:out></td>
			</tr>
		</c:forEach>
	</table>
	<div><label>Total Amount: $${ total }</label></div>	
	</form>
			</div>
			<div class="col-md-4 col-sm-4 col-xs-12"></div>
		</div>
	</div>
	<input type="button" value="Continue Checkout" onclick="window.location='checkout.jsp';" style="background-color: #4CAF50; font-weight: bold; margin-top: 20px;float: right;"> 
		<footer class="footer">Copyright 2020 @Yosha</footer>
			</div>
    </div>
  </div> 
</body>
</html>