<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page import="com.entity.*" %>
    <c:forEach items="${listminfo}" var="t">
    <h2 class="m_3">${t.dtype}</h1>
     </c:forEach>
    <!--  
    
    <div class="movie_top">
    <div class="col-md-9 movie_box">
                        <!-- Movie variant with time -->
                  <!--        <c:forEach items="${listDtype}" var="ty">
                           <div class="movie movie-test movie-test-dark movie-test-left">
                           
                           
                                <div class="movie__images">
                                    <a href="single.jsp" class="movie-beta__link">
                                        <img alt="" src="${ty.dimage}" class="img-responsive" alt=""/>
                                    </a>
                                </div>
								<div class="movie__info">
                                    <a href="single.jsp" class="movie__title">Ipsum (2015)  </a>
                                    <p class="movie__time">${ty.dtime}</p>
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
                         <!-- Movie variant with time -->
						<!-- Movie variant with time -->
                      <!--       </c:forEach>
                              <div class="clearfix"> </div>                         
                         <!-- Movie variant with time
                         </c:forEach>
                         
                      </div>
                         <div class="clearfix"> </div>
                  </div> 
                  -->
                     