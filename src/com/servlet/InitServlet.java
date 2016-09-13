package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.minfoDao;
import com.dao.impl.minfoDaoImpl;
import com.entity.minfo;

/**
 * Servlet implementation class InitServlet
 */
@WebServlet("/InitServlet")
public class InitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InitServlet() {
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
		
		
		minfoDao me=new minfoDaoImpl();
		List<minfo> list=me.getAllminfo("");
		request.getSession().setAttribute("listminfo", list);
		System.out.println(list.size());
		
		//response.sendRedirect("index.jsp");
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
		
	}

}
