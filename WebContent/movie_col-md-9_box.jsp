<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    
    
    <div class="col-md-9 movie_box">
   
                        <!-- Movie variant with time -->
                 
                             <c:forEach items="${listDtype}" var = "l">
                            
                                 <div class="movie movie-test movie-test-dark movie-test-left">
                                <div class="movie__images">
                                    <a href="chaolianjie?dname=${l.dname}" class="movie-beta__link">
                                        <img alt="" src="${l.dimage}" class="img-responsive" alt=""/>
                                    </a>
                                </div>
								<div class="movie__info">
                                    <a href="single.jsp" class="movie__title">${l.dname}</a>
                                    <p class="movie__time">80 min</p>
									<p class="movie__option"><a href="single.jsp">Contray</a> | <a href="single.jsp">Dolor sit</a> | <a href="single.jsp">Drama</a></p>
                                    <ul class="list_6">
						    			<li><i class="icon1"> </i><p>2,548</p></li>
						    			<li><i class="icon3"> </i><p>546</p></li>
						    			<li>Rating : &nbsp;&nbsp;<p><img src="images/rating1.png" alt=""></p></li>
						    			<div class="clearfix"> </div>
						    		</ul>
                                 </div>
                                <div class="clearfix"> </div>
                            </div>
                            </c:forEach>
                            
                            </div>
                            
               
              
             
            
         
            
            
            
          
               
           
            