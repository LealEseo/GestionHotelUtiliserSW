package fr.eseo.jee;

import java.io.IOException;
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
		
		else {
			System.out.println("coucou1");
			List<Chambre> listeChambres = new ArrayList<Chambre>();
			System.out.println("coucou2");
			Chambre chambre1 = new Chambre();
			System.out.println("coucou3");
			chambre1.setNbPlaceLit(4);
			System.out.println("coucou4");
			chambre1.setTypeChambre("Suite");
			System.out.println("coucou5");
			listeChambres = port.trouverChambre(chambre1, prixMin, prixMax, dateDeb, dateFin);
			System.out.println("coucou6");
			//listeChambres = port.trouverChambre(chambre1,prixMin,prixMax,dateDeb,dateFin);
			HttpSession session = request.getSession(); 
			System.out.println("coucou7");
			session.setAttribute("listeChambres", listeChambres);
			System.out.println("************************************************************************************");
			System.out.println("nbVoyageurs"+nbVoyageurs);
			System.out.println("prixMin"+prixMin);
			System.out.println("prixMax"+prixMax);
			System.out.println("dateDeb"+dateDeb);
			System.out.println("dateFin"+dateFin);
			System.out.println("typeChambre"+typeChambre);
			System.out.println("*************************************************************Liste chambres : "+listeChambres.toString());
		
			RequestDispatcher dispat = request.getRequestDispatcher("VisualiserListeChambre.jsp"); 
			System.out.println("coucou8");
			dispat.forward(request, response);
			System.out.println("coucou9");
		}
		
		
		
			
	}

}
