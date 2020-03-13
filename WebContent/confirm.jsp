<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Confirmation Page</title>
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
	<form class="form-container" action="PlaceOrderServlet" method="post">	
	<div class="content container-fluid list" style="margin-top:30px">		
			<div class="col-md-4 col-sm-4 col-xs-12">									
					<h4><b>Order Details</b></h4>				
	<table class="form-group" border="1" style="width:400px;">
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
			<div><h4><b>Address Details</b></h4>	
			<table class="form-group" style="width:400px;">
			<tr>
				<td><label for="custname">Name  :</label></td>
				<td><input type="hidden" id="custname" name="custname" value=${ fname }>${ fname }</td>
			</tr>
			<tr>
				<td><label>Email :</label></td>
				<td><input type="hidden" id="custemail" name="custemail" value=${ email }>${ email }</td>
			</tr>
			<tr>
				<td><label>Address :</label></td>
				<td><input type="hidden" id="custaddress" name="custaddress" value=${ address }>${ address }</td>
			</tr>
			<tr>
				<td><label>City :</label></td>
				<td><input type="hidden" id="custcity" name="custcity" value=${ city }>${ city }</td>		
			</tr>
			<tr>
				<td><label>State :</label></td>
				<td><input type="hidden" id="custstate" name="custstate" value=${ state }>${ state }</td>
			</tr>
			<tr>
				<td><label>Zip :</label></td>
				<td><input type="hidden" id="custzip" name="custzip" value=${ zip }>${ zip }</td>
			</tr>
		</table></div><div>			
			<h4><b>Payment Details</b></h4>
			<table class="form-group" style="width:400px;">
			<tr>
				<td><label>Name on Card : ${ cname }</label></td>
			</tr>
			<tr>
				<td><label>Card Number : ${ cnumber }</label></td>
			</tr>
			<tr>
				<td><label>Exp Month : ${ cmonth }</label></td>
			</tr>
			<tr>
				<td><label>Exp Year : ${ cyear }</label>	</td>		
			</tr>
			</table></div>
			</div>
	</div>	
	<input type="submit" value="Place the Order" style="background-color: #4CAF50; font-weight: bold;float: right;">
	<input type="button" value="Edit Details" onclick="window.location='checkout.jsp';" style="background-color: #4CAF50; font-weight: bold;float: right;">
	</form> 
	    </div>
  </div>  
</div>
<footer class="footer">Copyright 2020 @Yosha</footer>
</body>
</html>