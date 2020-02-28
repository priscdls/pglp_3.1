package Priscille_Daoulas.pglp_3_1;

public class SalaireEmploye {
	
	private String name;
	private String adresse;

	public SalaireEmploye(String name, String adresse) 
	{
		this.name = name;
		this.adresse = adresse;
	}

	public double calculSalaire() 
	{
		return 1500.0;
	}
}
