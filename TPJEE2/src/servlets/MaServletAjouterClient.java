package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Client;
import service.ClientService;
import service.IClientService;

/**
 * Servlet implementation class MaServlet
 */
@WebServlet("/MaServletAjouterClient")
public class MaServletAjouterClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IClientService s = new ClientService();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MaServletAjouterClient() {
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
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String couleurYeux= request.getParameter("couleurYeux");
		String age = request.getParameter("age");
		int AGE = Integer.parseInt(age);
		//2. Faire des traitements avec la couche service
		Client c = new Client();
		c.setNom(nom);
		c.setPrenom(prenom);
		c.setCouleurYeux(couleurYeux);
		c.setAge(AGE);
		s.ajouterClient(c);
		
		
		//3.Preparer l'envoi des éléments à la JSP
		request.setAttribute("lenom", nom);
		request.setAttribute("leprenom", prenom);
		request.setAttribute("lacouleurYeux", couleurYeux);
		request.setAttribute("lage", age);
		
		//4.Envoyer les éléments à la jsp
		request.getRequestDispatcher("/ajouter.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);                
	}

}
