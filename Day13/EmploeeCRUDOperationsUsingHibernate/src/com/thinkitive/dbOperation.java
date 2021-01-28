package com.thinkitive;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.criteria.CriteriaBuilder.In;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class dbOperation
 */
@WebServlet("/dbOperation")
public class dbOperation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dbOperation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String operation = request.getParameter("db");
		int id=0,salary=0;
		String name="",newname="";
		PrintWriter out = response.getWriter();
		try {
			id = Integer.parseInt(request.getParameter("eid"));
			name = request.getParameter("ename");
			salary = Integer.parseInt(request.getParameter("esalary"));
			newname = request.getParameter("ename1");
		}catch (Exception e) {
			out.println("All fields are Empty for Read");
		}
		
		MyDBConnection db = new MyDBConnection();
		
		if(operation!=null) {
			if(operation.equals("Insert")) {
				db.insert(new Employee(id, name, salary));
				out.println("Insertion Completed");
			}
			if(operation.equals("Update")) {
				out.println(name + " "+ newname);
				db.update("omkar","ggg");
				out.println("Updation Completed");
			}
			if(operation.equals("Delete")) {
				db.delete(new Employee(id, name, salary));
				out.println("Deletion Completed");
			}
			if(operation.equals("Read")) {
				out.println(db.Read());
			}
		}
	}

}
