<?xml version="1.0" encoding="utf-8" ?>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    

     
    <div class="box_2"> 
    
    
    <div class="row">
    
    <c:forEach items="${listminfo}" var="f">
    <div class="col-md-3">
  				
			<div class="grid_2 col_1"><a href="chaolianjie?dname=${f.dname}">
					<img src="${f.dimage}" class="img-responsive" alt=""/>
					<div class="caption1">
						<ul class="list_3">
				    		<li><i class="icon5"> </i><p>3,548</p></li>
				    	</ul>
				    	<i class="icon4"> </i>
				    	<p class="m_3">${f.dname}</p>
				    	</div>
				    	<div class="clearfix"></div>
					</a>
					</div>
				   
				  
				      
				  </div>
				  
				  </c:forEach>
				  
			</div>
			
		
			
			
		</div>
		