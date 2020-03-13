<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Order fish page</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
	crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
	crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
	crossorigin="anonymous"></script>
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
	<form class="form-container" action="TheCartServlet" method="post">
	<h4>Fish Products</h4>
	<div class="card-deck" style="margin-top: 30px">	
			<div class="card">
				<img class="card-img-top" src="./images/t1.jpg" style="width: 344px;height: 200px;" alt="Card image cap">
				<div class="card-body">
					<h5 class="card-title" name="name">Tilapia fillet</h5>					
					<p class="card-text" name="price">$6.99/lb (Tax included)</p>
				</div>
				<div class="card-footer">
					<label for="quantity1">Quantity</label> <input type="text" id="quantity1" name="quantity1" value="0">
				</div>
			</div>
			<div class="card">
				<img class="card-img-top" src="./images/11.jpg" style="width: 344px;height: 200px;" alt="Card image cap">
				<div class="card-body">
					<h5 class="card-title" name="name">Salmon</h5>			
					<p class="card-text" name="price">$5.99/lb (Tax included)</p>
				</div>
				<div class="card-footer">
					<label for="quantity2">Quantity</label> <input type="text" id="quantity2" name="quantity2" value="0">
				</div>
			</div>
			<div class="card">
				<img class="card-img-top" src="./images/tuna.jpg" style="width: 344px;height: 200px;" alt="Card image cap">
				<div class="card-body">
					<h5 class="card-title">Tuna</h5>				
					<p class="card-text" name="price">$8.99/lb (Tax included)</p>
				</div>
				<div class="card-footer">
					<label for="quantity3">Quantity</label> <input type="text" id="quantity3" name="quantity3" value="0">
				</div>
			</div>			
	</div>
	<h4>Chicken Products</h4>
	<div class="card-deck" style="margin-top: 70px">	
			<div class="card">
				<img class="card-img-top" src="./images/Drumstick.jpg" style="width: 344px;height: 200px;" alt="Card image cap">
				<div class="card-body">
					<h5 class="card-title" name="name">Chicken drumstick</h5>				
					<p class="card-text" name="price">$7.99/lb (Tax included)</p>
				</div>
				<div class="card-footer">
					<label for="chicken1">Quantity</label> <input type="text" id="chicken1" name="chicken1" value="0">
				</div>
			</div>
			<div class="card">
				<img class="card-img-top" src="./images/Chicken-With-Skin.jpg" style="width: 344px;height: 200px;" alt="Card image cap">
				<div class="card-body">
					<h5 class="card-title" name="name">Whole chicken</h5>					
					<p class="card-text" name="price">$5.99/lb (Tax included)</p>
				</div>
				<div class="card-footer">
					<label for="chicken2">Quantity</label> <input type="text" id="chicken2" name="chicken2" value="0">
				</div>
			</div>
			<div class="card">
				<img class="card-img-top" src="./images/Boneless-Breast.jpg" style="width: 344px;height: 200px;" alt="Card image cap">
				<div class="card-body">
					<h5 class="card-title">Boneless chicken</h5>				
					<p class="card-text" name="price">$8.99/lb (Tax included)</p>
				</div>
				<div class="card-footer">
					<label for="chicken3">Quantity</label> <input type="text" id="chicken3" name="chicken3" value="0">
				</div>
			</div>			
	</div>
	<h4>Meat Products</h4>
	<div class="card-deck" style="margin-top: 70px">	
			<div class="card">
				<img class="card-img-top" src="./images/belly.jpg" style="width: 344px;height: 200px;" alt="Card image cap">
				<div class="card-body">
					<h5 class="card-title" name="name">Pork belly</h5>				
					<p class="card-text" name="price">$6.99/lb (Tax included)</p>
				</div>
				<div class="card-footer">
					<label for="meat1">Quantity</label> <input type="text" id="meat1" name="meat1" value="0">
				</div>
			</div>
			<div class="card">
				<img class="card-img-top" src="./images/14.jpg" style="width: 344px;height: 200px;" alt="Card image cap">
				<div class="card-body">
					<h5 class="card-title" name="name">Beef steak</h5>					
					<p class="card-text" name="price">$8.99/lb (Tax included)</p>
				</div>
				<div class="card-footer">
					<label for="meat2">Quantity</label> <input type="text" id="meat2" name="meat2" value="0">
				</div>
			</div>
			<div class="card">
				<img class="card-img-top" src="./images/rib.jpg" style="width: 344px;height: 200px;" alt="Card image cap">
				<div class="card-body">
					<h5 class="card-title">Beef rib</h5>			
					<p class="card-text" name="price">$9.99/lb (Tax included)</p>
				</div>
				<div class="card-footer">
					<label for="meat3">Quantity</label> <input type="text" id="meat3" name="meat3" value="0">
				</div>
			</div>	
	</div>
		<input type="submit" style="background-color: #4CAF50; font-weight: bold; margin-top: 20px;float: right;" value="Add to Cart" />		  
	</form>
	</div>
    </div>
  </div> 
	<footer class="footer">Copyright 2020 @Yosha</footer>
</body>
</html>