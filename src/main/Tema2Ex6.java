package main;

public class Tema2Ex6 {

	public static void main(String[] args) {
		int x = 4, y = 3, z = 10, min;
		min = y;
		if(x < min)
			min = x;
		if(z < min)
			min = z;
		System.out.println("Cel mai mic numar este:" + min);		
	}
}