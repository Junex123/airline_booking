package userutil;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import userdao.userdao;


@WebServlet("/login")
public class logincontrol extends HttpServlet {
	private static final long serialVersionUID = 1L;
private userdao Userdao;
    
    public void init() {
 	   Userdao=new userdao();
    }
       
   
    public logincontrol() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  response.sendRedirect("login.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 try {
			    String username = request.getParameter("uname");
		        String password = request.getParameter("upass");

		        if (Userdao.validate(username, password)) {
		            RequestDispatcher dispatcher = request.getRequestDispatcher("userdash.jsp");
		            dispatcher.forward(request, response);
		        } else {
		            response.sendRedirect("loginfailed.jsp");		        }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		 
	    }

	}


