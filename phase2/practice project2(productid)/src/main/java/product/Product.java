package product;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Product
 */
@WebServlet("/Product")
public class Product extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Product() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String id  = request.getParameter("txtid"); 
		PrintWriter out = response.getWriter();
	     try {
	    	 Connection con = DB_connection.getConnection();
	    	 PreparedStatement ps = con.prepareStatement("select * from product where id=?");
				ps.setString(1, id);
				ResultSet res = ps.executeQuery();
				if(res.next())
				{
					out.println(" Product ID  : "+res.getInt(1)+" Product Name : "+res.getString(2));
				}
				else
				{
					out.println("<br> Please enter the correct id !!");
				}
			} catch (Exception e) {
				
				e.printStackTrace();
				
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}