package com.thinkitive;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/profileServlet")
public class profileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public profileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie ar[] = request.getCookies();
		PrintWriter out = response.getWriter();
		if(ar!=null) {
			out.println("WELCOME TO YOUR PROFILE------");
			out.println(ar[0].getValue());
			
			ar[0].setMaxAge(0);
			response.addCookie(ar[0]);
		}else {
			out.println("Please Login");
		}
	}

}
