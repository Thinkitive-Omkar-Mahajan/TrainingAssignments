package com.thinkitive;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	CRUDClass db;
	
    public EmployeeServlet() {
        super();
        
    }
    
    @Override
    public void init() throws ServletException {
    	super.init();
    	
    	db = new CRUDClass();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		int id= Integer.parseInt(request.getParameter("eId"));
		String name = request.getParameter("eName");
		String add = request.getParameter("eAddress");
		db.Insert(new Employee(id, name, add));
		System.out.println("Inserted Successfully");
		
		db.Read();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		db.Close();
	}
}
