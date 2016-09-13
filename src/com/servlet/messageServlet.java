package com.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.messageDao;
import com.dao.impl.messageDaoImpl;
import com.entity.message;
/**
 * Servlet implementation class messageServlet
 */
@WebServlet("/messageServlet")
public class messageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public messageServlet() {
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
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		//设置页面的响应编码方式
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		String message = request.getParameter("message");
		String uemail=request.getParameter("uemail");
		if(uemail==""){
			out.print("<script>alert('请登陆！');location.href='login.jsp'</script>");
			
		}else{
	
		String dname =(String)request.getSession().getAttribute("dname");
		messageDao me=new messageDaoImpl();
		message mess=new message(message,dname,uemail);
		me.addMessage(mess);
		List<message> messagelist = me.getDisplay(dname);
		request.setAttribute("messagelist",messagelist);
		request.getRequestDispatcher("single.jsp").forward(request, response);
	//	out.print("<script>alert('评论成功！！');location.href='single.jsp'</script>");
	
		
		}
		
	}
}


