package fr.eseo.jee;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eseo.serviceswebbis.GestionHotelMethodesBisService;
import fr.eseo.serviceswebbis.SEIGestionHotelMethodeBis;

/**
 * Servlet implementation class AnnulerReservationServlet
 */
@WebServlet("/AnnulerResaServ")
public class AnnulerReservationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnnulerReservationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(); 
		String id = request.getParameter("idReservation");
		System.out.println("id"+id);
		System.out.println("----prixJournalier"+session.getAttribute("prixJournalier"));
		int idInt = Integer.parseInt(id);
		// Utiliser le serviceWeb
		GestionHotelMethodesBisService service = new GestionHotelMethodesBisService();
		SEIGestionHotelMethodeBis port = service.getGestionHotelMethodesBisPort();
		
		boolean resa = false;
		resa = port.annulerChambre(idInt);
		if (resa) {
			System.out.print("Exécution réussie");
			RequestDispatcher dispat = request.getRequestDispatcher("annuleOk.jsp"); 
			dispat.forward(request, response);
		} else {
			System.out.print("Problème d'exécution");
			RequestDispatcher dispat = request.getRequestDispatcher("annulePASOk.jsp"); 
			dispat.forward(request, response);
		}
		
		
	}
}