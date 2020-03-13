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
</head>
<body>
<header class="header">
<a href="index.jsp"><img src="./images/logo1.png" style = "width:200px" /></a>
  <div class="header-right">
          <a href="login.jsp" class="btn btn-info btn-lg" style="background-color: #4CAF50;">
          <span class="glyphicon glyphicon-log-in"></span> Log In <a href="register.jsp" class="btn btn-info btn-lg" style="background-color: #4CAF50;">
          <span class="glyphicon glyphicon-user"></span> Register
        </a>
  </div>
</header>
<div class="container-fluid">
    <div class="row mt-5">
        <div class="col-sm-12 col-md-8 col-lg-5 mx-auto">
            <div id="placesCarousel" class="carousel slide" data-ride="carousel">          
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img class="d-block w-100" src="./images/Boneless-Breast.jpg" style="width: 700px;height: 300px;" alt="">
                        <div class="carousel-caption d-none d-md-block">
                        </div>
                    </div>                    
                    <div class="carousel-item">
                        <img class="d-block w-100" src="./images/Chicken-With-Skin.jpg" style="width: 700px;height: 300px;" alt="">
                        <div class="carousel-caption d-none d-md-block">                           
                        </div>
                    </div>                   
                      <div class="carousel-item">
                        <img class="d-block w-100" src="./images/Drumstick.jpg" style="width: 700px;height: 300px;"  alt="">
                        <div class="carousel-caption d-none d-md-block">                           
                        </div>
                    </div>
                    </div>                    
                </div>
                <a class="carousel-control-prev" href="#placesCarousel" role="button" data-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#placesCarousel" role="button" data-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
        </div>             
<div class="container-fluid">
  <div class="row mt-5">
        <div class="col-sm-12 col-md-8 col-lg-5 mx-auto" style="font-family: cursive; font-size: 17px;">Bringing to your home a wide range of organic fish and meat products directly from the farm. We only offer grass fed hormone and antibiotic free beef.
    </div>
</div>
</div>
</div>
<footer class="footer">Copyright 2020 @Yosha</footer>
</body>
</html>