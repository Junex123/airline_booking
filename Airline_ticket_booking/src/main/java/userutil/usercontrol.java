package userutil;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import userdao.userdao;
import userentity.user;

/**
 * Servlet implementation class usercontrol
 */
@WebServlet("/register")
public class usercontrol extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private userdao Userdao;
    
    public void init() {
 	   Userdao=new userdao();
    }
    /**
     * @see HttpServlet#HttpServlet()
     */
    public usercontrol() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstname = request.getParameter("ufname");
        String lastname = request.getParameter("ulname");
        String username = request.getParameter("uname");
        String email = request.getParameter("uemail");
        String phonenumber = request.getParameter("uphone");
        String dob = request.getParameter("udob");
        String address = request.getParameter("uadd");
        String password = request.getParameter("upass");
       
        
        user user = new user();
        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setUsername(username);
        user.setEmail(email);
        user.setPhonenumber(phonenumber);
        user.setDob(dob);
        user.setAddress(address);
        user.setPassword(password);
        
        Userdao.saveUser(user);
        response.sendRedirect("login.jsp");
    
	}
}



