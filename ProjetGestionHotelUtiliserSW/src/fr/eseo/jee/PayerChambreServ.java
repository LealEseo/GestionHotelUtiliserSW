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
 * Servlet implementation class PayerChambreServ
 */
@WebServlet("/PayerChambreServ")
public class PayerChambreServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PayerChambreServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int idReservation = (int) session.getAttribute("idReservation");
		GestionHotelMethodesBisService service = new GestionHotelMethodesBisService(); 
		SEIGestionHotelMethodeBis port = service.getGestionHotelMethodesBisPort();
		if(idReservation != Integer.valueOf(null)) {
			boolean paiement = port.payerChambre(idReservation);
			if(paiement) {
				RequestDispatcher dispat = request.getRequestDispatcher("paiementReussi.jsp");
				dispat.forward(request, response);
			} else {
				RequestDispatcher dispat = request.getRequestDispatcher("erreurPaiement.jsp");
				dispat.forward(request, response);
			}
		} else {
			RequestDispatcher dispat = request.getRequestDispatcher("erreurPaiement.jsp");
			dispat.forward(request, response);
		}
		
	}


}
