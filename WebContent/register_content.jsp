<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<div class="register">
<div class="register-but">
		  	  <form name="form1"action="UserServlet?method=register"onsubmit="return vForm()"method="post"> 
				 <div class="register-top-grid">
					<h3>个人信息</h3>
					 <div>
						<span>姓名<label>*</label></span>
						<input type="text"name="usename"> 
					 </div>
					
					 <div>
						 <span>电子邮件<label>*</label></span>
						 <input type="text"name="uname"> 
					 </div>
					 <div class="clearfix"> </div>
					   <a class="news-letter" href="#">
						 <label class="checkbox"><input type="checkbox" name="checkbox" checked=""><i> </i>登记邮件列表</label>
					   </a>
					 </div>
				     <div class="register-bottom-grid">
						    <h3>登录信息</h3>
							 <div>
								<span>密码<label>*</label></span>
								<input type="password"name="upwd">
							 </div>
							 <div>
								<span>确认密码<label>*</label></span>
								<input type="password"name="pwd">
							 </div>
							 <div class="clearfix"> </div>
					 </div>
					
					 	<div class="clearfix"> </div>
					 	
				
				   
					   <input type="submit" value="提交">
					   <div class="clearfix"> </div>
				   
				
		   
				</form>
				</div>
				</div>
			