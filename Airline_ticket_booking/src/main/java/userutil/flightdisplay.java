package userutil;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import userdao.userdao;
import userentity.flight;
import userentity.user;

/**
 * Servlet implementation class flightdisplay
 */
@WebServlet("/flightdisplay")
public class flightdisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;
private userdao Userdao;
    
    public void init() {
 	   Userdao=new userdao();
    }
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public flightdisplay() {
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
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		try {
			//1.register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2.get connection
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employee","root","9987626498root");
			
			//3.create statement
			
			Statement stmnt=connection.createStatement();
			
			//4.execute query
			
			ResultSet resultset=stmnt.executeQuery("select * from flight");
			
			out.print("<table width=75% border=1>");
			out.print("<caption>fligth list</caption><br/>");
			ResultSetMetaData rsmd= resultset.getMetaData();
			int totalcolumn=rsmd.getColumnCount();
			out.print("<tr>");
			for(int i=1;i<=totalcolumn;i++) {
				out.print("<th>"+rsmd.getColumnName(i)+"</th>");
			}
			out.print("</tr>");
			
			
			
			while(resultset.next()) {
				out.print("<tr><td>"
			+resultset.getInt(1)+"</td><td>"
			+resultset.getString(2)+"</td><td>"
			+resultset.getString(3)+"</td><td>"
			+resultset.getString(4)+"</td><td>"
			+resultset.getString(5)+"</td><td>"
			+resultset.getString(6)+"</td><td>"
			+resultset.getString(7)+"</td><td>"
			+resultset.getString(8)+"</td><td>"
			+resultset.getString(9)+"</td><td>"
			+resultset.getString(10)+"</td><td>"
			+resultset.getString(11)+"</td></tr>"
			);
			}
			  out.print("</table>");
			
			
			//5.close connection
			
			connection.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}}
	


