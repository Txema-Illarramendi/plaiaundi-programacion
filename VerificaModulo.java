package plaiaundi;

import java.util.Scanner;

public class VerificaModulo {

	public static void main(String[] args) {
		
		int contador=0;
		int valor=0;

		System.out.println("Introduce un n�mero y pulsa enter");
		Scanner lector = new Scanner(System.in);
		int numero = lector.nextInt();
		
		for(int i=1; i<=numero; i++) {
			valor=(numero%i);
			if(valor==0) {
				System.out.println("El n�mero " + numero + " entre " + i + " da un resto de " + valor);
				contador++;
			}
		}
		if(contador<=2) {
			System.out.println("El n�mero " + numero + " es primo");
		}else {
			System.out.println("El n�mero " + numero + " no es primo");
		}
		lector.close();
	}

}
