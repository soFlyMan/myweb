<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.entity.*" %>
      	         <div class="col-md-9 movie_box">
                        <div class="grid images_3_of_2">
                        	<div class="movie_image">
                                <span class="movie_rating">5.0</span>
                                <img src="${minfo.dimage}" class="img-responsive" alt=""/>
                            </div>
                            <div class="movie_rate">
                            	<div class="rating_desc"><p>你的投票:</p></div>
                            	<form action="" class="sky-form">
							     <fieldset>					
								   <section>
								     <div class="rating">
										<input type="radio" name="stars-rating" id="stars-rating-5">
										<label for="stars-rating-5"><i class="icon-star"></i></label>
										<input type="radio" name="stars-rating" id="stars-rating-4">
										<label for="stars-rating-4"><i class="icon-star"></i></label>
										<input type="radio" name="stars-rating" id="stars-rating-3">
										<label for="stars-rating-3"><i class="icon-star"></i></label>
										<input type="radio" name="stars-rating" id="stars-rating-2">
										<label for="stars-rating-2"><i class="icon-star"></i></label>
										<input type="radio" name="stars-rating" id="stars-rating-1">
										<label for="stars-rating-1"><i class="icon-star"></i></label>
									 </div>
								  </section>
							    </fieldset>
						  	   </form>
						  	   <div class="clearfix"> </div>
                            </div>
                        </div>

                        <div class="desc1 span_3_of_2">
                        	<p class="movie_option"><strong>国家: </strong><a href="#">发行</a>, <a href="#">${minfo.dcountry}</a></p>
                        	
                        	<p class="movie_option"><strong>类型: </strong><a href="typeServlet?dtype=${minfo.dtype}">${minfo.dtype}</a></p>
                        	<p class="movie_option"><strong>上映日期: </strong>${minfo.dtime}</p>
                        	<p class="movie_option"><strong>导演: </strong><a href="#">${minfo.ddirector}</a></p>
                        	<p class="movie_option"><strong>主演: </strong><a href="#">${minfo.dactor}</a></p>
                            <p class="movie_option"><strong>年龄限制: </strong>${minfo.dage}</p> 
                            <div class="down_btn"><a class="btn1" href="#"><span> </span>Download</a></div>
                         </div>
                        <div class="clearfix"> </div>
                        <p class="m_4">There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, making this the first true generator on the Internet.</p>
		                <form action="messageServlet?uemail=${user}" method="post">
							
							<div class="text">
			                   <textarea value="Message:" name="message" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Message';}">Message:</textarea>
			                </div>
			                <div class="form-submit1">
					           <input name="submit" type="submit" id="submit" value="提交评论"><br>
					        </div>
							<div class="clearfix"></div>
                 		</form>
		                <div class="single">
		                <h1>评论</h1>
		                <ul class="single_list">
		                <c:forEach items="${messagelist }" var="m">
					        <li>
					            <div class="preview"><a href="#"><img src="images/2.jpg" class="img-responsive" alt=""></a></div>
					            <div class="data">
					                <div class="title">${m.uemail}  / <a href="#">回复</a></div>
					                <p>${m.umessage}</p>
					            </div>
					            <div class="clearfix"></div>
					        </li>
		                </c:forEach>
	
			  			</ul>
                      </div>
                      </div>