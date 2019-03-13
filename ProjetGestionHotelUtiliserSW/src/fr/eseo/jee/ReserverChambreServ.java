package fr.eseo.jee;

import eseo.gestionhotel.*;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eseo.servicesweb.GestionHotelMethodesService;
import fr.eseo.servicesweb.SEIGestionHotelMethodes;
import fr.eseo.servicesweb.Chambre;
import fr.eseo.servicesweb.test.SEITrouverChambreSW;
import fr.eseo.servicesweb.test.TrouverChambreSWService;

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
		int prixMin = Integer.parseInt(request.getParameter("prixMin")); 
		int prixMax = Integer.parseInt(request.getParameter("prixMax"));
		
		String typeChambre = request.getParameter("typeChambre"); 
		String dateDeb = request.getParameter("dateDeb"); 
		String dateFin = request.getParameter("dateFin");
		
		LocalDate dateAujourdhui = LocalDate.now();
		LocalDate dateDebLocalDate = DateUtil.parse(dateDeb);
		LocalDate dateFinLocalDate = DateUtil.parse(dateFin);
	
		//Utiliser le serviceWeb 
		GestionHotelMethodesService service = new GestionHotelMethodesService(); 
		SEIGestionHotelMethodes port = service.getGestionHotelMethodesPort();
		
		
		if (prixMin>prixMax) {
			RequestDispatcher dispat = request.getRequestDispatcher("ErreurBudgetMinetMax.jsp"); 
			dispat.forward(request, response);
		
		}
		else if (nbVoyageurs<=0 || prixMin <=0 || prixMax <=0) {
			RequestDispatcher dispat = request.getRequestDispatcher("ErreurFormat.jsp"); 
			dispat.forward(request, response);
		}
		
		else if (dateDebLocalDate.isBefore(dateAujourdhui) || dateFinLocalDate.isBefore(dateAujourdhui)) {
			RequestDispatcher dispat = request.getRequestDispatcher("ErreurDates.jsp"); 
			dispat.forward(request, response);
		}
		
		else if (dateDebLocalDate.isAfter(dateFinLocalDate) || dateFinLocalDate.isBefore(dateDebLocalDate)) {
			RequestDispatcher dispat = request.getRequestDispatcher("ErreurDates.jsp"); 
			dispat.forward(request, response);
		}
		
		
		else {
			System.out.println("datepasnull");
			List<Chambre> listeChambres = new ArrayList<Chambre>();
			Chambre chambre1 = new Chambre();
			chambre1.setNbPlaceLit(4);
			chambre1.setTypeChambre("Suite");
			listeChambres = port.trouverChambre(chambre1, prixMin, prixMax, dateDeb, dateFin);
			//listeChambres = port.trouverChambre(chambre1,prixMin,prixMax,dateDeb,dateFin);
			HttpSession session = request.getSession(); 
			session.setAttribute("listeChambres", listeChambres);
			System.out.println("************************************************************************************");
			System.out.println("nbVoyageurs"+nbVoyageurs);
			System.out.println("prixMin"+prixMin);
			System.out.println("prixMax"+prixMax);
			System.out.println("dateDeb"+dateDeb);
			System.out.println("dateFin"+dateFin);
			System.out.println("typeChambre"+typeChambre);
			System.out.println("************************************************************* \n Liste chambres : "+listeChambres.toString());
		
			//On met le rÃ©sultat dans la session 
			System.out.println("avant for");
			session.setAttribute("listeChambres", listeChambres);
			int size = listeChambres.size();
			session.setAttribute("tailleListe", size);
			
			
			for(int i=0; i<size;i++) {
				System.out.println("For : "+ i );
			session.setAttribute("idChambre " + i, listeChambres.get(i).getIdChambre());
			System.out.println(session.getAttribute("idChambre "+i));
			session.setAttribute("nbPlaceLit " + i, listeChambres.get(i).getNbPlaceLit());
			session.setAttribute("prixJournalier " + i, listeChambres.get(i).getPrixJournalier());
			session.setAttribute("typeChambre " + i, listeChambres.get(i).getTypeChambre());
			}
			
			
			RequestDispatcher dispat = request.getRequestDispatcher("VisualiserListeChambre.jsp"); 
			dispat.forward(request, response);
		}
		
	 
			 
		
		
		
			
	}

}
