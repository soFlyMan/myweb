<?xml version="1.0" encoding="utf-8" ?>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Home</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Movie_store Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design" />
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- start plugins -->

</head>
<body>
<div class="container">
	<div class="container_wrap">
	
		<c:import url="header.jsp"></c:import>
		
	      <c:import url="index_slider.jsp"></c:import>
	      
      </div>
      <div class="content">
      	<div class="box_1">
      	 <h1 class="m_2">精选电影</h1>
      	 
      	  <c:import url="index_search.jsp"></c:import>
      	  
		<div class="clearfix"> </div>
		</div>
		
		<c:import url="index_box2.jsp"></c:import>
		
      </div>
   </div>
 </div>
 
<div class="container"> 

    <c:import url="footer.jsp"></c:import>
    
</div>		
</body>
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>

<script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>

<script src="js/responsiveslides.min.js"></script>

<script>
    $(function () {
      $("#slider").responsiveSlides({
      	auto: true,
      	nav: true,
      	speed: 500,
        namespace: "callbacks",
        pager: true,
      });
    });
</script>
</html>