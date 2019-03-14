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
 * Servlet implementation class ConnexionServ
 */
@WebServlet("/ConnexionServ")
public class ConnexionServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConnexionServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Utilisation des variables du request
		String login = request.getParameter("login");
		String mdp = request.getParameter("mdp");
		//Utilisation du SW
		GestionHotelMethodesBisService service = new GestionHotelMethodesBisService(); 
		SEIGestionHotelMethodeBis port = service.getGestionHotelMethodesBisPort();
		if(login !="" && mdp != "") {
			int idClient = port.connexion(login, mdp);
			if(idClient != 0) {
				//Si l'utilisateur a bien un compte
				HttpSession session = request.getSession();
				session.setAttribute("idClient", idClient);
				RequestDispatcher dispat = request.getRequestDispatcher("menuClient.html"); 
				dispat.forward(request, response);
			} else {
				//Si l'utilisateur n'est pas reconnu
				RequestDispatcher dispat = request.getRequestDispatcher("index.html"); 
				dispat.forward(request, response);
			}
		}else {
			//Si l'utilisateur n'a pas renseigne les champs
			RequestDispatcher dispat = request.getRequestDispatcher("index.html"); 
			dispat.forward(request, response);
		}
	}

}
