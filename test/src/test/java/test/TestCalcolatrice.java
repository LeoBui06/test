package test;

import static org.junit.jupiter.api.Assertion.*;

import org.junit.jupiter.api.Test;

import org.junit.Assert;


public class TestCalcolatrice {
	
	public TestCalcolatrice(){
		
	}

	@Test
	public void testSomma() {		
		Calcolatrice c = new Calcolatrice();
	
	
		double ris = c.somma(8, 4);

		Assert.assertEquals(12, ris, 0);
	}
	@Test
	public void testSomma2() {		
		Calcolatrice c = new Calcolatrice();
	
	
		double ris = c.somma(8, 4);

		Assert.assertEquals(12, ris, 0);
	}
	@Test   
	public void testSomma3() {		
		Calcolatrice c = new Calcolatrice();
	
	
		double ris = c.somma(8, 4, 3);

		Assert.assertEquals(15, ris, 0);
	}

}
