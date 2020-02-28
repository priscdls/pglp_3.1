package Priscille_Daoulas.pglp_3_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class SalaireEmployeTest {

	@Test
	public void testSalaire() {
		
		SalaireEmploye s = new SalaireEmploye("Priscille", "Versailles");
		assertTrue(s.calculSalaire() == 1500.0);
	}

}
