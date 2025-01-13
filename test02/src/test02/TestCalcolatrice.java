package test02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



public class TestCalcolatrice {
	
	public TestCalcolatrice(){
		
	}

	@Test
	public void testSomma() {		
		Calcolatrice c = new Calcolatrice();
	
	
		double ris = c.somma(8, 4);

		assertEquals(12, ris, 0);
	}
	@Test
	public void testSomma2() {		
		Calcolatrice c = new Calcolatrice();
	
	
		double ris = c.somma(8, 0);

		assertEquals(8, ris, 0);
	}
	@Test   
	public void testSomma3() {		
		Calcolatrice c = new Calcolatrice();
	
	
		double ris = c.somma(8, -1);

		assertEquals(7, ris, 0);
	}

}
