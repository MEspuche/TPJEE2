package service;

import java.util.Collection;

import dao.Dao;
import dao.IDao;
import exceptions.ClientExistePasException;
import metier.Client;



public class ClientService implements IClientService {

	private IDao idao = new Dao();
	
	

	@Override
	public void ajouterClient(Client c) {
		idao.ajouterClient(c);
		
	}

	@Override
	public void modifierClient(int id, String nom, String prenom) {
		idao.modifierClient(id, nom, prenom);
		
	}

	@Override
	public void supprimerClient(int id) throws ClientExistePasException {
		idao.supprimerClient(id);
		
	}

	@Override
	public Collection<Client> listerClients() {
		return idao.listerClients();
	}

	@Override
	public Collection<Client> chercherParMC(String mc) {
		// TODO Auto-generated method stub
		return idao.chercherParMC(mc);
	}

	@Override
	public Client chercherClient(int id) throws ClientExistePasException {
		// TODO Auto-generated method stub
		return idao.chercherClient(id);
	}


	

}
