package org.afpa59.patrice.services.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.afpa59.patrice.donnees.Article;

/**
 * Servlet implementation class LaServlet
 */
public class LaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LaServlet() {
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
		page.println("<title> La Servlet </title>");
		page.println("</head>");
		page.println("</html>");		

		page.println("<body> Je suis là dans le doGET<br><br></body>");
		
		

	
		
		Article article = (Article) request.getAttribute("Article");
		
	
		
		if (article.getCode()== 0 | article.getDesignation().equals("")){
			page.println("<body>");
			page.println("Veuillez saisir tous les champs.");
			page.println("<br><br><a href='SaisieArticle.html'> Retour index</a>");
			page.println("</body>");	
		}else{
			page.println("<body>");
			page.println("<font size=+2>");
			page.println("Votre Article est code "
					+ article.getCode()
					+ " designation: "
					+ article.getDesignation());
			page.println("</font>");
			page.println("<br><br><a href='SaisieArticle.html'> Retour index</a>");
			page.println("</body>");			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter page = response.getWriter();
		page.println("<html>");
		page.println("<head>");
		page.println("<title> Servlet Bonjour </title>");
		page.println("</head>");
		page.println("</html>");		

		page.println("<body> Je suis là dans le doPOST<br><br></body>");
		
		String id = request.getParameter("id");
		String designation = request.getParameter("designation");
		
		if (/*id == null | */designation.equals("")){
			page.println("<body>");
			page.println("Veuillez saisir tous les champs.");
			page.println("<br><br><a href='SaisieArticle.html'> Retour index</a>");
			page.println("</body>");	
		}else{
			page.println("<body>");
			page.println("<font size=+2>");
			page.println("Votre Article est code "
					+ id
					+ " designation: "
					+ designation);
			page.println("</font>");
			page.println("<br><br><a href='SaisieArticle.html'> Retour index</a>");
			page.println("</body>");			
		}
	}

}
