package com.luv2code.serveletdemo;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.luv2code.serveletdemo.mvctwo.student;
import com.luv2code.serveletdemo.mvctwo.studentDataUtil;

/**
 * Servlet implementation class mvcDemoServletTwo
 */
@WebServlet("/mvcDemoServletTwo")
public class mvcDemoServletTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public mvcDemoServletTwo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get the student data from helper class(model)
		   
		List<student> students = studentDataUtil.getStudent();
		
		//add student to the request object
		
		request.setAttribute("student_list",students);
		
		//get request dispatcher
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("view_student_two.jsp");
		
		//now forward to jsp
		
		dispatcher.forward(request,response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
