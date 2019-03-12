package fr.eseo.jee;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ReserverChambreServ
 */
@WebServlet("/ReserverChambreServ")
public class ReserverChambreServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReserverChambreServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int nbVoyageurs = Integer.parseInt(request.getParameter("nbVoyageurs")); 
		int budgetMin = Integer.parseInt(request.getParameter("budgetMin")); 
		int budgetMax = Integer.parseInt(request.getParameter("budgetMax")); 
		String typeChambre = request.getParameter("typeChambre"); 
		String dateArrivee = request.getParameter("dateArrivee"); 
		String dateDepart = request.getParameter("dateDepart"); 
		
		//Utiliser le serviceWeb 
		
		if (budgetMin>budgetMax) {
			RequestDispatcher dispat = request.getRequestDispatcher("ErreurBudgetMinetMax.jsp"); 
			dispat.forward(request, response);
		}
		else {
			Chambre[] listeChambres = new Chambre[100];
			trouverChambre(new Chambre(1,nbVoyageurs,typeChambre,50),budgetMin,budgetMax,dateDepart,dateArrivee);
			HttpSession session = request.getSession(); 
			session.setAttribute("listeChambres", listeChambres);
		
			RequestDispatcher dispat = request.getRequestDispatcher("VisualiserListeChambre.jsp"); 
			dispat.forward(request, response);
		}
		
		
		
			
	}

}
