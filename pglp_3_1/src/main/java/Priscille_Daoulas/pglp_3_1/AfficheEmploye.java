package Priscille_Daoulas.pglp_3_1;

public class AfficheEmploye {
	/**
	 * Nom de l'employe
	 */
	private final String name;
	/**
	 * Adresse de l'employe
	 */
	private String adresse;
	
	/**
	 * Constructeur de la classe AfficheEmploye.
	 * @param name nom de l'employe
	 * @param adresse adresse de l'employe
	 */
	public AfficheEmploye(String name, String adresse) {
		this.name = name;
		this.adresse = adresse;
	}
	
	/**
	 * Affiche l'adresse d'un employe.
	 */
	public void afficheCoordonnees() {
		System.out.println(name + ", " + adresse);	
	}
}
