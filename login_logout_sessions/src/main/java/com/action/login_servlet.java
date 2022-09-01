package com.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class login_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public login_servlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		doGet(request, response);
		String user = request.getParameter("username");
        String password = request.getParameter("password");
        if (password.equals("password")) {
            session.setAttribute("user", user);
            response.sendRedirect("welcome.jsp?name=" + user);
        }
        else {
            RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
            out.println("<font color=red>Password is wrong.</font>");
            rd.include(request, response);
        }
        out.close();
	}

}
