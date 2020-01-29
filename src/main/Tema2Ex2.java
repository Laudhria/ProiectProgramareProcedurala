package main;

public class Tema2Ex2 {

	public static void main(String[] args) {
		double d = 2.95;
		int i = 4;
		System.out.println(++d>i?d:i);
		
		// se compileaza si afiseaza 4.0
		// daca ++d (2.95+1=3.95) este mai mare decat i (4), atunci avem valoarea lui d, altfel este egal cu i
		// rezultatul este 3.95, de aceea se afiseaza valoarea lui i=4
	}
	
}

