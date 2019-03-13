package fr.eseo.jee;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
		System.out.println("prixJournalier"+request.getParameter("prixJournalier"));
		System.out.println("nbPlaceLit"+request.getParameter("idChambre"));
		System.out.println("idChambre"+request.getParameter("nbPlaceLit"));

	}

}
