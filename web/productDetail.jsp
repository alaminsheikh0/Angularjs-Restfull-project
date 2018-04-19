

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>  
        <link href="ootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="resources/bootstrap.min.js" type="text/javascript"></script>
        <script src="resources/angular.min.js" type="text/javascript"></script>
        
        
        <meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

	<title>E-SHOP HTML Template</title>

	<!-- Google font -->
	

	<!-- Bootstrap -->
	<link type="text/css" rel="stylesheet" href="css/bootstrap.min.css" />

	<!-- Slick -->
	<link type="text/css" rel="stylesheet" href="css/slick.css" />
	<link type="text/css" rel="stylesheet" href="css/slick-theme.css" />

	<!-- nouislider -->
	<link type="text/css" rel="stylesheet" href="css/nouislider.min.css" />

	<!-- Font Awesome Icon -->
	<link rel="stylesheet" href="css/font-awesome.min.css">

	<!-- Custom stlylesheet -->
	<link type="text/css" rel="stylesheet" href="css/style.css" />css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="resources/bootstrap.min.js" type="text/javascript"></script>
        <script src="resources/angular.min.js" type="text/javascript"></script>
        
        
        <meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

	<title>E-SHOP HTML Template</title>

	<!-- Google font -->
	

	<!-- Bootstrap -->
	<link type="text/css" rel="stylesheet" href="css/bootstrap.min.css" />

	<!-- Slick -->
	<link type="text/css" rel="stylesheet" href="css/slick.css" />
	<link type="text/css" rel="stylesheet" href="css/slick-theme.css" />

	<!-- nouislider -->
	<link type="text/css" rel="stylesheet" href="css/nouislider.min.css" />

	<!-- Font Awesome Icon -->
	<link rel="stylesheet" href="css/font-awesome.min.css">

	<!-- Custom stlylesheet -->
	<link type="text/css" rel="stylesheet" href="css/style.css" />


    </head>
    <body ng-app="simpleApp" ng-controller="simpleCtrl">
        
          <!-- HEADER -->
        <header>
            <!-- top Header -->
            <div id="top-header">
                <div class="container">
                    <div class="pull-left">
                        <span>Welcome to E-shop!</span>
                    </div>
                    <div class="pull-right">
                        <ul class="header-top-links">
                            <li><a href="#">Store</a></li>
                            <li><a href="#">Newsletter</a></li>
                            <li><a href="#">FAQ</a></li>
                            <li class="dropdown default-dropdown">
                                <a class="dropdown-toggle" data-toggle="dropdown" aria-expanded="true">ENG <i class="fa fa-caret-down"></i></a>
                                <ul class="custom-menu">
                                    <li><a href="#">English (ENG)</a></li>
                                    <li><a href="#">Russian (Ru)</a></li>
                                    <li><a href="#">French (FR)</a></li>
                                    <li><a href="#">Spanish (Es)</a></li>
                                </ul>
                            </li>

                        </ul>
                    </div>
                </div>
            </div>
            <!-- /top Header -->

            <!-- header -->
            <div id="header">
                <div class="container">
                    <div class="pull-left">
                        <!-- Logo -->
                        <div class="header-logo">
                            <a class="logo" href="#">
                                <img src="./img/logo.png" alt="">
                            </a>
                        </div>
                        <!-- /Logo -->

                        <!-- Search -->
                        <div class="header-search">
                            <form>
                                <input class="input search-input" type="text" placeholder="Enter your keyword">
                                <select class="input search-categories">
                                    <option value="0">All Categories</option>
                                    <option value="1">Category 01</option>
                                    <option value="1">Category 02</option>
                                </select>
                                <button class="search-btn"><i class="fa fa-search"></i></button>
                            </form>
                        </div>
                        <!-- /Search -->
                    </div>
                    <div class="pull-right">
                        <ul class="header-btns">
                            <!-- Account -->
                            <li class="header-account dropdown default-dropdown">
                                <div class="dropdown-toggle" role="button" data-toggle="dropdown" aria-expanded="true">
                                    <div class="header-btns-icon">
                                        <i class="fa fa-user-o"></i>
                                    </div>
                                    <strong class="text-uppercase">My Account <i class="fa fa-caret-down"></i></strong>
                                </div>
                                <a href="#" class="text-uppercase">Login</a> / <a href="#" class="text-uppercase">Join</a>
                                <ul class="custom-menu">
                                    <li><a href="#"><i class="fa fa-user-o"></i> My Account</a></li>
                                    <li><a href="#"><i class="fa fa-heart-o"></i> My Wishlist</a></li>
                                    <li><a href="#"><i class="fa fa-exchange"></i> Compare</a></li>
                                    <li><a href="#"><i class="fa fa-check"></i> Checkout</a></li>
                                    <li><a href="#"><i class="fa fa-unlock-alt"></i> Login</a></li>
                                    <li><a href="#"><i class="fa fa-user-plus"></i> Create An Account</a></li>
                                </ul>
                            </li>
                            <!-- /Account -->

                            <!-- Cart -->
                            <li class="header-cart dropdown default-dropdown">
                                <a class="dropdown-toggle" data-toggle="dropdown" aria-expanded="true">
                                    <div class="header-btns-icon">
                                        <i class="fa fa-shopping-cart"></i>
                                        <span class="qty">3</span>
                                    </div>
                                    <strong class="text-uppercase">My Cart:</strong>
                                    <br>
                                    <span>35.20$</span>
                                </a>
                                <div class="custom-menu">
                                    <div id="shopping-cart">
                                        <div class="shopping-cart-list">
                                            <div class="product product-widget">
                                                <div class="product-thumb">
                                                    <img src="./img/thumb-product01.jpg" alt="">
                                                </div>
                                                <div class="product-body">
                                                    <h3 class="product-price">$32.50 <span class="qty">x3</span></h3>
                                                    <h2 class="product-name"><a href="#">Product Name Goes Here</a></h2>
                                                </div>
                                                <button class="cancel-btn"><i class="fa fa-trash"></i></button>
                                            </div>
                                            <div class="product product-widget">
                                                <div class="product-thumb">
                                                    <img src="./img/thumb-product01.jpg" alt="">
                                                </div>
                                                <div class="product-body">
                                                    <h3 class="product-price">$32.50 <span class="qty">x3</span></h3>
                                                    <h2 class="product-name"><a href="#">Product Name Goes Here</a></h2>
                                                </div>
                                                <button class="cancel-btn"><i class="fa fa-trash"></i></button>
                                            </div>
                                        </div>
                                        <div class="shopping-cart-btns">
                                            <button class="main-btn">View Cart</button>
                                            <button class="primary-btn">Checkout <i class="fa fa-arrow-circle-right"></i></button>
                                        </div>
                                    </div>
                                </div>
                            </li>
                            <!-- /Cart -->

                            <!-- Mobile nav toggle-->
                            <li class="nav-toggle">
                                <button class="nav-toggle-btn main-btn icon-btn"><i class="fa fa-bars"></i></button>
                            </li>
                            <!-- / Mobile nav toggle -->
                        </ul>
                    </div>
                </div>
                <!-- header -->
            </div>
            <!-- container -->
        </header>
        <!-- /HEADER -->

        <!-- NAVIGATION -->
        <div id="navigation">
            <!-- container -->
            <div class="container">
                <div id="responsive-nav">
                    <!-- category nav -->
                    <div class="category-nav">
                        <span class="category-header">Categories <i class="fa fa-list"></i></span>

                    </div>
                    <!-- /category nav -->

                    <!-- menu nav -->
                    <div class="menu-nav">
                        <span class="menu-header">Menu <i class="fa fa-bars"></i></span>
                        <ul class="menu-list">
                            <li><a href="#">Home</a></li>
                            <li><a href="#">Shop</a></li>
                            <li ><a >Women </a>

                            </li>
                            <li ><a >Men </a>


                            </li>
                            <li><a href="#">Sales</a></li>
                            <li ><a href="#"> Pages </a>

                            </li>
                        </ul>
                    </div>
                    <!-- menu nav -->
                </div>
            </div>
            <!-- /container -->
        </div>
        <!-- /NAVIGATION -->

        
        
        <div class="container">
            <h1>
                Product Detail with AngularJS 
            </h1> 
            <input type="button" value="{{simples.length}}" class="btn btn-success btn-lg" />
            <div class="row">
                <div class="col-sm-6"> 
                    <form class="form-horizontal" ng-submit="submitSimple()">
                        <div class="form-group">
                            <label class="control-label col-sm-3" >Product Name</label>
                            <div class="col-sm-9">
                                <input class="form-control" ng-model="simpleForm.pname"  />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-3" >Product Type</label>
                            <div class="col-sm-9">
                                <input class="form-control" ng-model="simpleForm.ptype"  />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-3" >Product Description</label>
                            <div class="col-sm-9">
                                <input class="form-control" ng-model="simpleForm.pdesc"  />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-3" >Price By Product</label>
                            <div class="col-sm-9">
                                <input class="form-control" ng-model="simpleForm.pprice"  />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-3" >Stock</label>
                            <div class="col-sm-9">
                                <input class="form-control" ng-model="simpleForm.pstock"  />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-3" >Origin</label>
                            <div class="col-sm-9">
                                <input class="form-control" ng-model="simpleForm.porigin"  />
                            </div>
                        </div>
                        


                        <input type="submit" value="Submit" class="btn btn-success btn-lg" />
                    </form>

                </div>
            </div>

            <div class="col-sm-12">
                <table class="table">
                    <tr>

                        <th>ID</th>
                        <th>Product Name</th>
                        <th>Product Type</th>
                        <th>Product Description</th>
                        <th>Price By Product</th>
                        <th>Stock</th>
                        <th>Origin</th>
                        
                        <th>Action</th>

                    </tr>

                    <tr ng-repeat="simple in simples">
                        <td> {{ simple.pid}}</td>
                        <td> {{ simple.pname}}</td>
                        <td >{{ simple.ptype}}</td>  
                        <td >{{ simple.pdesc}}</td>  
                        <td >{{ simple.pprice}}</td>  
                        <td >{{ simple.pstock}}</td>  
                        <td >{{ simple.porigin}}</td>  

                        <td><a ng-click="editSimple(simple)" class="blue-button">Edit</a> | <a ng-click="deleteSimple(simple)" class="red-button">Delete</a></td>
                    </tr>
                </table>

            </div>



        </div>



        <script>


                    var app = angular.module("simpleApp", []);

                    app.controller("simpleCtrl", function ($scope, $http) {


                        $scope.simples = [];//Array
                        $scope.simpleForm = {//$scope.simpleForm ata akti object
                            pid: -1,
                            pname: "",  
                            ptype: "",
                            pdesc:"",
                            pprice: 0.0,
                            pstock:0,
                            porigin:""
                        };

                        _refreshSimpleData();

                        $scope.submitSimple = function () {

                            var method = "";
                            var url = "";
                            if ($scope.simpleForm.pid == -1) {
                                method = "POST";
                                url = 'service/pro';
                            } else {

                                method = "PUT";
                                url = 'service/pro/up/' + $scope.simpleForm.pid;
                            }

                            $http({
                                method: method,
                                url: url,
                                data: angular.toJson($scope.simpleForm),
                                headers: {
                                    'Content-Type': 'application/json'
                                }
                            }).then(_success, _error);
                        };

                        //HTTP DELETE- delete Message by Id
                        $scope.deleteSimple = function (simple) {
                            $http({
                                method: 'DELETE',
                                url: 'service/pro/del/' + simple.pid
                            }).then(_success, _error);
                        };

                        $scope.editSimple = function (simple) {
                            $scope.simpleForm.pid = simple.pid,
                                    $scope.simpleForm.pname = simple.pname,
                                    $scope.simpleForm.ptype = simple.ptype,
                                    $scope.simpleForm.pdesc = simple.pdesc,
                                    $scope.simpleForm.pprice = simple.pprice,
                                    $scope.simpleForm.pstock = simple.pstock,
                                    $scope.simpleForm.porigin = simple.porigin;
                        };

                        function _refreshSimpleData() {
                            $http({
                                method: 'GET',
                                url: 'http://localhost:8080/CompanyManagementSystemWithRESTfullWebService/service/pro'
                            }).then(function xx(response) {
                                $scope.simples = response.data;
                                console.log(response.data);
                            }, function yy(response) {
                                console.log(response.statusText);
                            });
                        }

                        function _success(response) {
                            _refreshSimpleData();
                            _clearFormData();
                        }

                        function _error(response) {
                            console.log(response.statusText);
                        }


                        function _clearFormData() {
                            $scope.simpleForm.pid = -1,
                                    $scope.simpleForm.pname = "",
                                    $scope.simpleForm.ptype = "",
                                    $scope.simpleForm.pdesc = "",
                                    $scope.simpleForm.pprice = 0.0,
                                    $scope.simpleForm.pstock = 0,
                                    $scope.simpleForm.porigin = "";

                        }
                        ;

                    });
        </script>
        
        
          <!-- FOOTER -->
        <footer id="footer" class="section section-grey">
            <!-- container -->
            <div class="container">
                <!-- row -->
                <div class="row">
                    <!-- footer widget -->
                    <div class="col-md-3 col-sm-6 col-xs-6">
                        <div class="footer">
                            <!-- footer logo -->
                            <div class="footer-logo">
                                <a class="logo" href="#">
                                    <img src="./img/logo.png" alt="">
                                </a>
                            </div>
                            <!-- /footer logo -->

                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna</p>

                            <!-- footer social -->
                            <ul class="footer-social">
                                <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                                <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                                <li><a href="#"><i class="fa fa-instagram"></i></a></li>
                                <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
                                <li><a href="#"><i class="fa fa-pinterest"></i></a></li>
                            </ul>
                            <!-- /footer social -->
                        </div>
                    </div>
                    <!-- /footer widget -->

                    <!-- footer widget -->
                    <div class="col-md-3 col-sm-6 col-xs-6">
                        <div class="footer">
                            <h3 class="footer-header">My Account</h3>
                            <ul class="list-links">
                                <li><a href="#">My Account</a></li>
                                <li><a href="#">My Wishlist</a></li>
                                <li><a href="#">Compare</a></li>
                                <li><a href="#">Checkout</a></li>
                                <li><a href="#">Login</a></li>
                            </ul>
                        </div>
                    </div>
                    <!-- /footer widget -->

                    <div class="clearfix visible-sm visible-xs"></div>

                    <!-- footer widget -->
                    <div class="col-md-3 col-sm-6 col-xs-6">
                        <div class="footer">
                            <h3 class="footer-header">Customer Service</h3>
                            <ul class="list-links">
                                <li><a href="#">About Us</a></li>
                                <li><a href="#">Shiping & Return</a></li>
                                <li><a href="#">Shiping Guide</a></li>
                                <li><a href="#">FAQ</a></li>
                            </ul>
                        </div>
                    </div>
                    <!-- /footer widget -->

                    <!-- footer subscribe -->
                    <div class="col-md-3 col-sm-6 col-xs-6">
                        <div class="footer">
                            <h3 class="footer-header">Stay Connected</h3>
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor.</p>
                            <form>
                                <div class="form-group">
                                    <input class="input" placeholder="Enter Email Address">
                                </div>
                                <button class="primary-btn">Join Newslatter</button>
                            </form>
                        </div>
                    </div>
                    <!-- /footer subscribe -->
                </div>
                <!-- /row -->
                <hr>
                <!-- row -->
                <div class="row">
                    <div class="col-md-8 col-md-offset-2 text-center">
                        <!-- footer copyright -->
                        <div class="footer-copyright">
                            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                            Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
                            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                        </div>
                        <!-- /footer copyright -->
                    </div>
                </div>
                <!-- /row -->
            </div>
            <!-- /container -->
        </footer>
        <!-- /FOOTER -->

        
          <!-- jQuery Plugins -->
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/slick.min.js"></script>
        <script src="js/nouislider.min.js"></script>
        <script src="js/jquery.zoom.min.js"></script>
        <script src="js/main.js"></script>



    </body>
</html>