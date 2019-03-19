package fr.eseo.jee;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;

import fr.eseo.ee.servicesweb3.GestionHotelMethodes3Service;
import fr.eseo.ee.servicesweb3.Reservation;
import fr.eseo.ee.servicesweb3.SEIGestionHotelMethodes3;
import fr.eseo.ee.serviceweb.GestionHotelMethodesService;
import fr.eseo.ee.serviceweb.SEIGestionHotelMethodesJEE;

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
		// Récupération de la session
		System.out.println("Dans service effectuerResaServlet");
		HttpSession session = request.getSession(); 
		
		//Récupérer les attributs de la chambre choisie
		String chambreChoisie = request.getParameter("reservation");
		System.out.println("Chambre choisie : "+ chambreChoisie);
		String[] part = chambreChoisie.split("numero ");
		System.out.println("part 1 : 0"+part[1]+"0");
		int idClient = ((Integer) session.getAttribute("idClient")).intValue();
		System.out.println("Id Client : "+ idClient);
		Float prixJournalier =((Float) session.getAttribute("prixJournalier "+ part[1])).floatValue();
		System.out.println("----prixJournalier"+session.getAttribute("prixJournalier "+part[1]));
		int idChambre = ((Integer) session.getAttribute("idChambre "+ part[1])).intValue();
		session.setAttribute("idChambreChoisie", idChambre);
		System.out.println("idChambre : "+idChambre);
		int nbPlaceLit = ((Integer) session.getAttribute("nbPlaceLit "+ part[1])).intValue();
		System.out.println("nbPlacelit : "+nbPlaceLit);
		String dateDeb = ((String) session.getAttribute("dateDeb")).toString();
		String dateFin = ((String) session.getAttribute("dateFin")).toString();		
        
		System.out.println("------dateDeb récupéréé "+session.getAttribute("dateDeb"));
		System.out.println("------dateFin récupéréé "+session.getAttribute("dateFin"));
		
		System.out.println("Date debut : "+ dateDeb);
		System.out.println("Date fin : "+ dateFin);
		
       	//Utiliser le serviceWeb 
		GestionHotelMethodes3Service service = new GestionHotelMethodes3Service(); 
		SEIGestionHotelMethodes3 port = service.getGestionHotelMethodes3Port();

		Reservation reservation = new Reservation();
		reservation.setIdChambre(idChambre);
		reservation.setIdClient(idClient);
		System.out.println("new Date : "+ new Date());
		reservation.setDateDebString(dateDeb);
		reservation.setDateFinString(dateFin);
		reservation.setNbPlaces(nbPlaceLit);
		reservation.setPaiementEffectue(false);
		
		System.out.println("Avant méthode reserver chambre");
		int idReservation = port.reserverChambre(reservation);
		System.out.println("idReservation après méthode réserver chambre : " + idReservation);
		session.setAttribute("idReservation", idReservation);
		System.out.println("Après méthode reserver chambre");
		
		RequestDispatcher dispat = request.getRequestDispatcher("VisualiserReservation.jsp"); 
		dispat.forward(request, response);
	}

}
