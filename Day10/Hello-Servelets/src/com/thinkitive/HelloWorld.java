package com.thinkitive;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private int counter = 0;   
    public HelloWorld() {
        super();
    }
    
    @Override
    public void init() throws ServletException {
    	super.init();
    	System.out.println("Init method");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();		
		
		String n = request.getParameter("txtNumber");
		out.println("Factorial of "+ n+ " is "+ factorial.CalculateFactorial(Integer.parseInt(n)));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("Post method");		
		
		String n = request.getParameter("txtNumber");
		out.println("Factorial of "+ n+ " is "+ factorial.CalculateFactorial(Integer.parseInt(n)));
	}

	@Override
	public void destroy() {
		super.destroy();
		System.out.println("destroy method");
	}
}
