package Priscille_Daoulas.pglp_3_1;

public class SalaireEmploye {
	/**
	 * Nom de l'employe
	 */
	private final String name;
	/**
	 * Adresse de l'employe
	 */
	private String adresse;
	/**
	 * Constructeur de la classe SalaireEmploye.
	 * @param name nom de l'employe
	 * @param adresse adresse de l'employe
	 */
	public SalaireEmploye(String name, String adresse) {
		this.name = name;
		this.adresse = adresse;
	}
	/**
	 * Fonction pour connaitre le salaire d'un employe.
	 * @return le salaire de l'employe
	 */
	public double calculSalaire() {
		return 1500.0;
	}
}
