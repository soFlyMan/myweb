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
		//����ҳ���������뷽ʽ
		request.setCharacterEncoding("utf-8");
		//����ҳ�����Ӧ���뷽ʽ
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		//
		String method= request.getParameter("method");
		UsersDao ud=new UsersDaoImpl();
		if("login".equals(method)){
			//��ȡ����ֵ
			String name=request.getParameter("uname");
			String upwd=request.getParameter("upwd");
			
			System.out.println("uname: " + name + " upwd: " + upwd);
			//name=new String(name.getBytes("iso-8859-1"),"utf-8");
			//System.out.println("name:"+name);
			//��ȡһ��ֵ
			/*
			String[] hobbys=request.getParameterValues("hobby");
			for(String h:hobbys){
				h=new String(h.getBytes("iso-8859-1"),"utf-8");
				System.out.println(h);
			}
			*/
			/*
			if("admin".equals(name) && "a123".equals(upwd)){
				//ת����ת
			    //request����Χ�е�ֵ��ֻ��ת���ı�����������Ч
				request.setAttribute("request", name);
				//session��Χ���ڱ��λỰ��(ͬһ���������)��Ч
				request.getSession().setAttribute("session", name);
				//application��Χ��������Ӧ�ó�������Ч
				request.getServletContext().setAttribute("application", name);
				
				request.getRequestDispatcher("welcome.jsp").forward(request, response);
				//�ض�����ת
				response.sendRedirect("welcome.jsp");
			}else{
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
			*/
			
		    boolean flag=ud.loginUser(name, upwd);
		    if(flag){
		    	out.print("<script>alert('��¼�ɹ�����');location.href='index.jsp'</script>");
		    }else{
		    	out.print("<script>alert('��¼ʧ�ܣ���');location.href='login.jsp'</script>");
		    }
		}else if("register".equals(method)){
			String name=request.getParameter("uname");
			String upwd=request.getParameter("upwd");
			String birthday=request.getParameter("usename");
			//
			Users user=new Users(name, upwd, birthday);
			int num=ud.addUser(user);
			if(num>0){
		    	out.print("<script>alert('ע��ɹ�����');location.href='login.jsp'</script>");
		    }else{
		    	out.print("<script>alert('ע��ʧ�ܣ���');location.href='register.jsp'</script>");
		    }
		}
		
	}

}
