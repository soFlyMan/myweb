package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UsersDao;
import com.dao.impl.UsersDaoImpl;
import com.entity.Users;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UserServlet() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置页面的请求编码方式
		request.setCharacterEncoding("utf-8");
		//设置页面的响应编码方式
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		//
		String method= request.getParameter("method");
		UsersDao ud=new UsersDaoImpl();
		if("login".equals(method)){
			//获取单个值
			String name=request.getParameter("uname");
			String upwd=request.getParameter("upwd");
			
			System.out.println("uname: " + name + " upwd: " + upwd);
			//name=new String(name.getBytes("iso-8859-1"),"utf-8");
			//System.out.println("name:"+name);
			//获取一组值
			/*
			String[] hobbys=request.getParameterValues("hobby");
			for(String h:hobbys){
				h=new String(h.getBytes("iso-8859-1"),"utf-8");
				System.out.println(h);
			}
			*/
			/*
			if("admin".equals(name) && "a123".equals(upwd)){
				//转发跳转
			    //request键范围中的值，只在转发的本次请求中有效
				request.setAttribute("request", name);
				//session范围，在本次会话中(同一个浏览器中)有效
				request.getSession().setAttribute("session", name);
				//application范围，在整个应用程序中有效
				request.getServletContext().setAttribute("application", name);
				
				request.getRequestDispatcher("welcome.jsp").forward(request, response);
				//重定向跳转
				response.sendRedirect("welcome.jsp");
			}else{
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
			*/
			
		    boolean flag=ud.loginUser(name, upwd);
		    if(flag){
		    	out.print("<script>alert('登录成功！！');location.href='index.jsp'</script>");
		    }else{
		    	out.print("<script>alert('登录失败！！');location.href='login.jsp'</script>");
		    }
		}else if("register".equals(method)){
			String name=request.getParameter("uname");
			String upwd=request.getParameter("upwd");
			String birthday=request.getParameter("usename");
			//
			Users user=new Users(name, upwd, birthday);
			int num=ud.addUser(user);
			if(num>0){
		    	out.print("<script>alert('注册成功！！');location.href='login.jsp'</script>");
		    }else{
		    	out.print("<script>alert('注册失败！！');location.href='register.jsp'</script>");
		    }
		}
		
	}

}
