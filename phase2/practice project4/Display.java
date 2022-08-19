

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Display
 */
public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Display() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		PrintWriter out=response.getWriter();
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String price=request.getParameter("price");
		int i=Integer.parseInt(id);
		int p=Integer.parseInt(price);
		ProductDetails po=new ProductDetails();
		po.setId(i);
		po.setName(name);
		po.setPrice(p);
		
		ArrayList<String>pd=new ArrayList<String>();
		pd.add(id);
		pd.add(name);
		pd.add(price);
		out.println("<html><body>");
		out.println(pd);
		if(name!=null && i!=0 && p!=0) {
			session.setAttribute("products", pd);
			out.println("done");
		}
		RequestDispatcher rd = request.getRequestDispatcher("showdetails.jsp");
		rd.forward(request, response);
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
