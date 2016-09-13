<?xml version="1.0" encoding="utf-8" ?>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
    
    <div class="col-md-6 login-right">
			  	<h3>已注册用户</h3>
				<p>如果你有一个账户，请登录。</p>
				<form action="UserServlet?method=login"method="post">
				  <div>
					<span>电子邮件<label>*</label></span>
					<input type="text"name="uemail"id="useremail"> 
				  </div>
				  <div>
					<span>密码<label>*</label></span>
					<input type="password"name="upawd"id="userpwd"> 
				  </div>
				  <a class="forgot" href="#">忘记密码?</a>
				  <input type="submit" value="登陆"id="sub">
			    </form>
			   </div>	