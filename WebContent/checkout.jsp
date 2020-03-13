<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">    
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
 <link rel="stylesheet" href="./styles/global.css"> 
 	<link rel="stylesheet" href="./styles/newstyle.css">   
</head>
<body>
<header class="header">
<a href="index.jsp"><img src="./images/logo1.png" style = "width:200px" /></a>
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
<h3 align="left">Checkout</h3>
      <form action="CheckoutServlet" method="post">	      
        <div class="row">
          <div class="col-50">
            <h4>Billing Address</h4>
            <label for="fname"><i class="fa fa-user"></i> Full Name</label>
            <input type="text" id="fname" name="fullname" placeholder="Full name" required="required">
            <label for="email"><i class="fa fa-envelope"></i> Email</label>
            <input type="text" id="email" name="email" placeholder="Email address" required="required">
            <label for="adr"><i class="fa fa-address-card-o"></i> Address</label>
            <input type="text" id="adr" name="address" placeholder="Street Address"required="required">
            <label for="city"><i class="fa fa-institution"></i> City</label>
            <input type="text" id="city" name="city" placeholder="City"required="required">

            <div class="row">
              <div class="col-50">
                <label for="state">State</label>
                <input type="text" id="state" name="state" placeholder="State" required="required">
              </div>
              <div class="col-50">
                <label for="zip">Zip</label>
                <input type="text" id="zip" name="zip" placeholder="Zipcode" required="required">
              </div>
            </div>
          </div>

          <div class="col-50">
            <h4>Payment</h4>    
            <label for="cname">Name on Card</label>
            <input type="text" id="cname" name="cardname" required="required">
            <label for="ccnum">Credit card number</label>
            <input type="text" id="ccnum" name="cardnumber" required="required">
            <label for="expmonth">Exp Month</label>
            <input type="text" id="expmonth" name="expmonth" required="required">
            <div class="row">
              <div class="col-50">
                <label for="expyear">Exp Year</label>
                <input type="text" id="expyear" name="expyear" required="required">
              </div>
              <div class="col-50">
                <label for="cvv">CVV</label>
                <input type="text" id="cvv" name="cvv" required="required">
              </div>
            </div>
          </div>          
        </div>
        <label>
          <input type="checkbox" checked="checked" name="sameadr">Shipping address same as billing
        </label>
        <input type="submit" value="Continue checkout" class="btn">
      </form>
    </div>
  </div>  
</div>
<footer class="footer">Copyright 2020 @Yosha</footer>
</body>
</html>