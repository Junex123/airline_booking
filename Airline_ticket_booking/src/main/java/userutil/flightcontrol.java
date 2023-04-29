package userutil;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import userdao.userdao;
import userentity.flight;

/**
 * Servlet implementation class flightcontrol
 */
@WebServlet("/flight")
public class flightcontrol extends HttpServlet {
	private static final long serialVersionUID = 1L;
private userdao Userdao;
    
    public void init() {
 	   Userdao=new userdao();
    }
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public flightcontrol() {
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
		    String no = request.getParameter("fno");
	        String name = request.getParameter("fname");
	        String from = request.getParameter("ffrom");
	        String to = request.getParameter("fto");
	        String date = request.getParameter("fdate");
	        String time = request.getParameter("ftime");
	        String duration = request.getParameter("fdur");
	        String airport = request.getParameter("fair");
	        String price = request.getParameter("fprice");
	        String description = request.getParameter("fdes");
	        
	        flight flight = new flight();
	        flight.setNo(no);
	        flight.setName(name);
	        flight.setFrom(from);
	        flight.setTo(to);
	        flight.setDate(date);
	        flight.setTime(time);
	        flight.setDuration(duration);
	        flight.setAirport(airport);
	        flight.setPrice(price);
	        flight.setDesc(description);
	        
	        Userdao.saveflight(flight);
	        response.sendRedirect("userdash.jsp");
	}

}
