package plaiaundi;

import java.util.Scanner;

public class BasePotencia {

	public static void main(String[] args) {

		int result=1;
		
		System.out.println("Introduce un n�mero base");
		Scanner lector = new Scanner(System.in);
		int base = lector.nextInt();
		System.out.println("Introduce un n�mero exponente");
		int exponente = lector.nextInt();
		
		for(int i=1; i<=exponente; i++){
		result=result * base;
		}
		
		System.out.println(base + " elevado a " + exponente + " es " + result);
		lector.close();
	}

}
