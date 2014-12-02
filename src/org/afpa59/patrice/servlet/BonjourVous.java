package org.afpa59.patrice.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BonjourVous
 */
public class BonjourVous extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BonjourVous() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter page = response.getWriter();
		page.println("<html>");
		page.println("<head>");
		page.println("<title> Servlet Bonjour </title>");
		page.println("</head>");
//		page.println("<body>");
//		page.println("<font size=+5>");
//		page.println("Au revoir ...<br/> <strong>Adieu</strong>");
//		page.println("</font>");
//		page.println("</body>");	
		page.println("</html>");		
		
		String nom = request.getParameter("prenom");
		if (nom == null){
			page.println("<body>");
			page.println("BONJOUR");
			page.println("</body>");	
		}else{
			page.println("<body>");
			page.println("<font size=+5>");
			page.println("BONJOUR " + nom);
			page.println("</font>");
			page.println("</body>");			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
