package fr.eseo.jee;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;

import fr.eseo.serviceswebbis.GestionHotelMethodesBisService;
import fr.eseo.serviceswebbis.Reservation;
import fr.eseo.serviceswebbis.SEIGestionHotelMethodeBis;

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
		
		int idClient = Integer.parseInt((String) session.getAttribute("idClient"));
		int prixJournalier = Integer.parseInt((String) session.getAttribute("prixJournalier "));
		int idChambre = Integer.parseInt(request.getParameter("idChambre"));
		int nbPlaceLit = Integer.parseInt(request.getParameter("nbPlaceLit"));
		String dateDeb = (String) session.getAttribute("dateDeb");
		String dateFin = (String) session.getAttribute("dateFin");
		
		System.out.println("Après récupération des attibuts de la réservation");
		
		Date date1=null;
		Date date2=null;
		try {
			date1 = new SimpleDateFormat("YYYY-MM-dd").parse(dateDeb);
			date2 =new SimpleDateFormat("YYYY-MM-dd").parse(dateFin); 
		
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		String typeChambre = request.getParameter("reservation");
		System.out.println("idclient :"+ idClient);
		System.out.println("Chambre choisie : "+ typeChambre);
		System.out.println("----prixJournalier"+session.getAttribute("prixJournalier "));
		System.out.println("------idChambre"+session.getAttribute("idChambre "));
		System.out.println("----nbPlaceLit"+session.getAttribute("nbPlaceLit "));
		System.out.println("------dateDeb"+session.getAttribute("dateDeb"));
		System.out.println("------dateFin"+session.getAttribute("dateFin"));
		
		//Utiliser le serviceWeb 
		GestionHotelMethodesBisService service = new GestionHotelMethodesBisService(); 
		SEIGestionHotelMethodeBis port = service.getGestionHotelMethodesBisPort();
		
		Reservation reservation = new Reservation();
		reservation.setIdChambre(idChambre);
		reservation.setIdClient(idClient);
		reservation.setDateDeb(date1);
		reservation.setDateFin(date2);
		reservation.setNbPlaces(nbPlaceLit);
		reservation.setPaiementEffectue(false);
		
		int idReservation = port.reserverChambre(reservation);
		session.setAttribute("idReservation", idReservation);
		
		RequestDispatcher dispat = request.getRequestDispatcher("VisualiserReservation.jsp"); 
		dispat.forward(request, response);
	}

}
