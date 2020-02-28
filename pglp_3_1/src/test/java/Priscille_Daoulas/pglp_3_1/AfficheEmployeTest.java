package Priscille_Daoulas.pglp_3_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class AfficheEmployeTest {

	@Test
	public void testAffichage() {
		
		AfficheEmploye a = new AfficheEmploye("Priscille","Versailles");
		a.afficheCoordonnees();
		
	}

}
