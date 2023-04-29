package userutil;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import userdao.userdao;
import userentity.user;
import userentity.payment;
/**
 * Servlet implementation class paymentcontroller
 */
@WebServlet("/payment")
public class paymentcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
   private userdao Userdao;
    
    public void init() {
 	   Userdao=new userdao();
    }
    /**
     * @see HttpServlet#HttpServlet()
     */
    public paymentcontroller() {
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
		String name = request.getParameter("cardname");
        String no = request.getParameter("cardno");
        String exmonth = request.getParameter("cardmonth");
        String exyear = request.getParameter("cardyear");
        String cvv = request.getParameter("cardcvv");
        String state = request.getParameter("cardstat");
        String zipcode = request.getParameter("cardzip");
       
       
        
        payment payment = new payment();
        payment.setName(name);
        payment.setNo(no);
        payment.setExmonth(exmonth);
        payment.setExyear(exyear);
        payment.setCvv(cvv);
        payment.setState(state);
        payment.setZipcode(zipcode);
       
        
        Userdao.payment(payment);
        response.sendRedirect("userdash.jsp");
	}

}
