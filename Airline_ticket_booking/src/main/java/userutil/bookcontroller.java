package userutil;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import userdao.userdao;
import userentity.book;

/**
 * Servlet implementation class bookcontroller
 */
@WebServlet("/booking")
public class bookcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
private userdao Userdao;
    
    public void init() {
 	   Userdao=new userdao();
    }
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bookcontroller() {
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
		String class1 = request.getParameter("nclass");
        String seat = request.getParameter("nseat");
        String adult = request.getParameter("nadult");
        String children = request.getParameter("nchild");
        String infant = request.getParameter("ninfant");
     
       
       
        
        book book = new book();
        book.setClass1(class1);
        book.setSeat(seat);
        book.setAdult(adult);
        book.setChild(children);
        book.setInfant(infant);
  ;
       
        
        Userdao.booking(book);
        response.sendRedirect("payment.jsp");
	}

}
