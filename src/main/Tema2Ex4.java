package main;

public class Tema2Ex4 {

	public static void main(String[] args) {
		int suma = 0;
		for(int i=1; i<10 ; i++) {
			suma +=suma + i;
		}
		System.out.print("Suma este: " + suma);
		// Rezultatul este 1013
		// Se calculeaza pentru valorile lui i<10, dupa cum urmeaza:
		// 0+1, suma=1
		// 1+2, suma=4
		// 4+3, suma=11
		// 11+4, suma=26
		// 26+5, suma=57
		// 57+6, suma=120
		// 120+7, suma=247
		// 247+8, suma=502
		// 502+9, suma=1013

	}

}
