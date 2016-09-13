package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.messageDao;
import com.dao.minfoDao;
import com.dao.impl.messageDaoImpl;
import com.dao.impl.minfoDaoImpl;
import com.entity.message;
import com.entity.minfo;

/**
 * Servlet implementation class chaolianjie
 */
@WebServlet("/chaolianjie")
public class chaolianjie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public chaolianjie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				request.setCharacterEncoding("utf-8");
				//设置页面的响应编码方式
				response.setContentType("text/html;charset=utf-8");
				PrintWriter out=response.getWriter();
				
				String name= request.getParameter("dname"); 
				String dname=new String(name.getBytes("ISO-8859-1"),"UTF-8"); 
				System.out.println("dname = " + dname);
				
				request.getSession().setAttribute("dname", dname);
				
				messageDao sd = new messageDaoImpl();
				List<message> messagelist = sd.getDisplay(dname);
				request.getSession().setAttribute("messagelist", messagelist);
				
				minfoDao md=new minfoDaoImpl();
				minfo minfo = md.getmindf(dname);
				request.getSession().setAttribute("minfo", minfo);
				
				request.getRequestDispatcher("single.jsp").forward(request, response);
				
	}

}
