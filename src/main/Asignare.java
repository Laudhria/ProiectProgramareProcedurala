package main;

public class Asignare{

	public static void main(String[] args){
		int a=3;
		int b=(a=2)*a;
		int c=b*(b=5);
		System.out.println("a="+ a +",b="+ b +",c="+ c);
	}
	//rezultatul este a=2,b=5,c=20
	//initial a=3, insa valoarea este schimbata in urmatorul rand, unde a=2; b=2*2=4, insa valoarea sa este schimbata in urmatoarea expresie, b=5
	//c=4(valoarea initiala a lui b)*5(noua valoare)=20

}


