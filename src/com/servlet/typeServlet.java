package com.servlet;


import java.io.PrintWriter;
import java.util.List;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.minfoDao;
import com.dao.impl.typeDaoImpl;
import com.entity.minfo;

/**
 * Servlet implementation class typeServlet
 */
@WebServlet("/typeServlet")
public class typeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public typeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		//设置页面的响应编码
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		//
		String type=request.getParameter("dtype");
		String dtype=new String(type.getBytes("ISO-8859-1"),"UTF-8"); 
		
		System.out.println("dtype = " + dtype);
		minfoDao td=new typeDaoImpl();
		List<minfo> list1=td.getDtype(dtype);
		System.out.println(list1.size());
		request.getSession().setAttribute("listDtype", list1);
		request.getRequestDispatcher("movie.jsp").forward(request, response);
	}

}
