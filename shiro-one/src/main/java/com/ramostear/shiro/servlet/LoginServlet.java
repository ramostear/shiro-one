package com.ramostear.shiro.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;

/**
 * 
 * <p>@Author:Ramostear
 * <p>@Date	 :2016年2月24日
 * <p>@Link	 :<a href="http://www.ramostear.com">www.ramostear.com</a>
 * <p>@Vers  :1.0
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(username, password);
		String error = null;
		try {
			subject.login(token);
		} catch (UnknownAccountException e) {
			error = "用户名或密码不正确";
		}catch (IncorrectCredentialsException e) {
			error = "用户名或密码不正确";
		}catch (LockedAccountException e) {
			error = "用户已经被锁定";
		}catch (AuthenticationException e) {
			error = "未知异常";
		}
		if(error!=null){
			request.setAttribute("error", error);
			request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
		}else{
			response.sendRedirect(request.getContextPath()+"/");
		}
		
	}

}
