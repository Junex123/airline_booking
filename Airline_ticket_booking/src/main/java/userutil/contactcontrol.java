package userutil;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import userdao.userdao;
import userentity.contact;


/**
 * Servlet implementation class contactcontrol
 */
@WebServlet("/contact")
public class contactcontrol extends HttpServlet {
	private static final long serialVersionUID = 1L;
private userdao Userdao;
    
    public void init() {
 	   Userdao=new userdao();
    }
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public contactcontrol() {
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
        String username = request.getParameter("cname");
        String email = request.getParameter("cemail");
        String phonenumber = request.getParameter("cphone");
        String dob = request.getParameter("cdob");
        String address = request.getParameter("cadd");
        String message = request.getParameter("cmes");
       
        
        contact contact = new contact();
        contact.setUsername(username);
        contact.setEmail(email);
        contact.setPhone(phonenumber);
        contact.setDob(dob);
        contact.setAddress(address);
        contact.setMessage(message);
        
        Userdao.savecontact(contact);
        response.sendRedirect("userdash.jsp");
	}

}
