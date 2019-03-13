package fr.eseo.jee;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eseo.servicesweb.GestionHotelMethodesService;
import fr.eseo.servicesweb.Reservation;
import fr.eseo.servicesweb.SEIGestionHotelMethodes;

/**
 * Servlet implementation class EffectuerResaServ
 */
@WebServlet("/EffectuerResaServ")
public class EffectuerResaServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EffectuerResaServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		int prixJournalier = Integer.parseInt(request.getParameter("prixJournalier"));
//		int idChambre = Integer.parseInt(request.getParameter("idChambre"));
//		int nbPlaceLit = Integer.parseInt(request.getParameter("nbPlaceLit"));
		HttpSession session = request.getSession(); 
		String id = request.getParameter("idReserver");
		System.out.println("id"+id);
		System.out.println("----prixJournalier"+session.getAttribute("prixJournalier 0"));
		System.out.println("------idChambre"+session.getAttribute("idChambre"));
		System.out.println("----nbPlaceLit"+session.getAttribute("nbPlaceLit"));
		System.out.println("------dateDeb"+session.getAttribute("dateDeb"));
		System.out.println("------dateFin"+session.getAttribute("dateFin"));
		
		//Utiliser le serviceWeb 
		GestionHotelMethodesService service = new GestionHotelMethodesService(); 
		SEIGestionHotelMethodes port = service.getGestionHotelMethodesPort();
		
		//Reservation resa1 = new Reservation(idClient,nbPlaceLit,dateDeb,dateFin);
	}

}
