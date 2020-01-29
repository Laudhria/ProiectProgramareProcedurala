package main;

public class Tema2Ex3 {

	public static void main(String[] args) {
		int a = 3;
		if( ++a < 4)
		 if( ++a < 4)
			System.out.println(a);
			else 
			System.out.println(a);
		// Se compileaza insa nu genereaza nimic intrucat a=3; prima expresie va fi citita ca 4 < 4, si nu se incadreaza in prima conditie, nemaitrecand la urmatoarea conditie

	}

}
