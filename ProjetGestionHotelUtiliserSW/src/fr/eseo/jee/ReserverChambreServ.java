package fr.eseo.jee;

import java.io.IOException;
import java.util.Date; 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		//COUCOU
	}

}
