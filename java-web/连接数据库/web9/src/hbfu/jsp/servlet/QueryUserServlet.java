package hbfu.jsp.servlet;

import hbfu.jsp.crud.user.QueryUser;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class QueryUserServlet extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		ResultSet rs = null;
		String username=request.getParameter("username");
		rs = QueryUser.queryUserbyName(username);
		request.setAttribute("rs",rs);
		if(rs!=null){
		System.out.println("查询成功");
		request.getRequestDispatcher("result.jsp").forward(request, response);
		}else{
			System.out.println("查询失败");
		}
	}
	
	
}
