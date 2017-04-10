package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import exceptions.ClientExistePasException;
import metier.Client;
import service.ClientService;
import service.IClientService;

/**
 * Servlet implementation class MaServlet
 */
@WebServlet("/MaServletSupprimerClient")
public class MaServletSupprimerClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IClientService s = new ClientService();  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MaServletSupprimerClient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//1. recuperer les paramètres utilisateurs
		String id = request.getParameter("id");
		int ID = Integer.parseInt(id);
		
		//2. Faire des traitements avec la couche service
		Client c = new Client();
		c.setId(ID);
		try {
			s.supprimerClient(ID);
			//3.Preparer l'envoi des éléments à la JSP
			request.setAttribute("lid", id);

		} catch (ClientExistePasException e1) {
			// TODO Auto-generated catch block
			request.setAttribute("lid", null);
			e1.printStackTrace();
		}
		
		//4.Envoyer les éléments à la jsp
		request.getRequestDispatcher("/supprimer.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);                
	}

}
