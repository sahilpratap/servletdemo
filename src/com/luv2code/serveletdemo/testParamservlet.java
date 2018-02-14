package com.luv2code.serveletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class testParamservlet
 */
@WebServlet("/testParamservlet")
public class testParamservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public testParamservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	response.setContentType("text/html");
	
	PrintWriter out = response.getWriter();
	
    ServletContext context = getServletContext();
    
    String maxCartSize = context.getInitParameter("max-shopping-cart-size");
    
    String teamName = context.getInitParameter("project-team-name");
    
    out.println("<html><body>");
    
    out.println("max cart size : " + maxCartSize);
    
    out.println("<br/><br/>");
    
    out.println("Team name : " + teamName);
    
    
    
    out.println("</body></html>");
    
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
