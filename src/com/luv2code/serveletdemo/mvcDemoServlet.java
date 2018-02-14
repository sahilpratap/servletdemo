package com.luv2code.serveletdemo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class mvcDemoServlet
 */
@WebServlet("/mvcDemoServlet")
public class mvcDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public mvcDemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	// step 0: add additional data
		
	String [] students = {"Alic","Rabin","warsell","Cruskal"};
	request.setAttribute("student_list",students);
		
	// step 1: get request dispatcher
		
	
    RequestDispatcher dispatcher = request.getRequestDispatcher("/view_student.jsp");
    
    
	// step 2: 	forward the request to jsp
		
	 
    dispatcher.forward(request, response);
    
    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
