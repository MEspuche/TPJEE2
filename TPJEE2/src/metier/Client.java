package metier;

public class Client {
	private int id;
	private String nom;
	private String prenom;
	private String couleurYeux;
	private int age;
	
	
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCouleurYeux() {
		return couleurYeux;
	}
	public void setCouleurYeux(String couleurYeux) {
		this.couleurYeux = couleurYeux;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public Client(int id, String nom, String prenom, String couleurYeux, int age) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.couleurYeux = couleurYeux;
		this.age = age;
	}
	public String getPrenom() {
		return prenom;
	}
	public Client(int id, String nom, String prenom, String couleurYeux) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.couleurYeux = couleurYeux;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	
	public Client(int id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}
	public Client() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", couleurYeux=" + couleurYeux + "]";
	}
	
	
	
	
}
