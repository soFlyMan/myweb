<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>注册</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Movie_store Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- start plugins -->
<script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
<script src="js/jquery.validate.min.js"></script>
<script src="js/messages_zh.min.js"></script>
</head>
<body>
<div class="container">
	<div class="container_wrap">
		
		<c:import url="header.jsp"></c:import>
		
		
		
		
	      <div class="content">
      	     
      	     <c:import url="register_content.jsp"></c:import>
      	     
           </div>
    </div>
</div>
<div class="container"> 
 
 
 <c:import url="footer.jsp"></c:import>
 
 
</div>		
</body>
<script>
$(document).ready(function(){
	$("form").validate();
})</script>
<script type="text/javascript">
function vForm(){
	var x=document.forms["form1"]["upwd"].value;
	var y=document.forms["form1"]["pwd"].value;
	if(x!=y){
		alert("两次输入的密码不相同，请重新输入！");
		location.href='register.jsp';
	return false;
	
	}
	
}
  
	

  

</script>
</html>