package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.ClientService;
import service.IClientService;

/**
 * Servlet implementation class MaServlet
 */
@WebServlet("/MaServletModifierClient")
public class MaServletModifierClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IClientService s = new ClientService();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MaServletModifierClient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8"); // pour les accents
		//1. recuperer les paramètres utilisateurs
				String id = request.getParameter("id");
				String nom = request.getParameter("nom");
				String prenom= request.getParameter("prenom");
				
				int ID = Integer.parseInt(id); 
				
				//2. Faire des traitements avec la couche service
				s.modifierClient(ID, nom, prenom);
				
				
				//3.Preparer l'envoi des éléments à la JSP
				request.setAttribute("lid", id);
				request.setAttribute("lenom", nom);
				request.setAttribute("leprenom", prenom);
		
		//4.Envoyer les éléments à la jsp
		request.getRequestDispatcher("/modifier.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);                
	}

}
