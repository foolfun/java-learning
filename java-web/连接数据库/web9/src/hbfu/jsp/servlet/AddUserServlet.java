package hbfu.jsp.servlet;

import hbfu.jsp.bean.UserBean;
import hbfu.jsp.crud.user.AddUser;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddUserServlet extends HttpServlet{

	
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
		UserBean user = new UserBean();
		AddUser adduser = new AddUser();
		user.setUsername(request.getParameter("username"));
		user.setGender(request.getParameter("gender"));
		user.setAge(request.getParameter("age"));
		user.setBirth(request.getParameter("birth"));
		user.setPwd(request.getParameter("pwd"));
		System.out.println(user.getUsername());
		//request.setAttribute("username", user.getUsername());
		adduser.addUser(user);
		request.getRequestDispatcher("success.jsp").forward(request, response);
	}
	
	
}
