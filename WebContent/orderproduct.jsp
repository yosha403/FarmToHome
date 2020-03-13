<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">   
<title>Customer login page</title> 
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>  
      <script src=./scripts/table.js></script>    
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
<div class="content container-fluid list">
<div class="row mt-5">
  <div class="col-sm-6 col-md-5 col-lg-6" style="font-family: cursive; font-size: 17px;"><b>Organic fish products</b> </br>Sustainably farmed fish produce.Free of hormones or antibiotics.</div>
  <div class="col-sm-6 col-md-5 offset-md-2 col-lg-6 offset-lg-0"><a href="orderfish.jsp"><img src="./images/11.jpg"style="width: 170px;height: 120px;" /></a></div>
</div>

<div class="row mt-5">
  <div class="col-sm-6 col-md-5 col-lg-6" style="font-family: cursive; font-size: 17px;"><b>Organic chicken products</b></br>Our chicken live outdoor, grazing naturally. The birds are not treated with hormones or antibiotics.</div>
  <div class="col-sm-6 col-md-5 offset-md-2 col-lg-6 offset-lg-0"><a href="orderfish.jsp"><img src="./images/Chicken-With-Skin.jpg" style="width: 170px;height: 120px;" /></a></div>
</div>

<div class="row mt-5">
  <div class="col-sm-6 col-md-5 col-lg-6" style="font-family: cursive; font-size: 17px;"><b>Organic meat products</b></br>Raised on pasture in fresh air and sunshine. This is 100% natural grass fed beef. </div>
  <div class="col-sm-6 col-md-5 offset-md-2 col-lg-6 offset-lg-0"><a href="orderfish.jsp"><img src="./images/14.jpg" style="width: 170px;height: 120px;" /></a></div>
</div>
</div>
    </div>
  </div>  
</div>
<footer class="footer">Copyright 2020 @Yosha</footer>
</body>
</html>