package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
@WebServlet("/MaServletListerClient")
public class MaServletListerClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
      private IClientService s = new ClientService();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MaServletListerClient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//1. recuperer les paramètres utilisateurs
		String motcle = request.getParameter("motcle");
		List<Client> lesClients  = new ArrayList<Client>();
		lesClients = (List<Client>) s.chercherParMC(motcle);
		
		//2. Faire des traitements avec la couche service
		
		//3.Preparer l'envoi des éléments à la JSP
		request.setAttribute("lesClients", lesClients);
	
		
		//4.Envoyer les éléments à la jsp
		request.getRequestDispatcher("/listerjstl.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);                
	}

}
