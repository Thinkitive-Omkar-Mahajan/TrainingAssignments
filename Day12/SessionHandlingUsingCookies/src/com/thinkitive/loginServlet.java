package com.thinkitive;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		if(user.equals("admin") && pass.equals("admin")) {
			Cookie ck = new Cookie("sessionId", "123456");
			response.addCookie(ck);
			RequestDispatcher rd = request.getRequestDispatcher("profileServlet");
			rd.forward(request, response);
		}else {
			PrintWriter out = response.getWriter();
			out.println("Invalid username or password");
		}
	}

}
