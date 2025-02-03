package test02;


public class Calcolatrice {
	
	public double somma(double...addendi) {
		double s = 0;
		for(double addendo : addendi) {
			if( addendo < 0) {
				System.out.println("addendo negativo"); 
			}
			if( addendo == 0) {
				System.out.println("addendo è 0");
			}
			if( addendo < 0) {
				System.out.println("addendo positivo");
			}
			s = s + addendo;
		}
		
		System.out.println("kat");
		return s;
		
	}

}
