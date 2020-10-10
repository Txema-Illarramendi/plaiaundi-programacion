package plaiaundi;

import java.util.Scanner;

public class NumeroMayor {

	public static void main(String[] args) {
		
		int num_mayor=0;
		int esta_iteracion=0;
		
		System.out.println("Introduce un n�mero de varios digitos y pulsa enter");
		Scanner lector = new Scanner(System.in);
		int cifra = lector.nextInt();
		
		String list_num = Integer.toString(cifra);
		
		for(int i=0; i<list_num.length(); i++) {
			char val_intermedio=list_num.charAt(i);
			esta_iteracion = Integer.parseInt(String.valueOf(val_intermedio));
			if(esta_iteracion>num_mayor) {
				num_mayor=esta_iteracion;
			}
		}
		System.out.println("El digito m�s alto de la cifra " + cifra + " es " + num_mayor);
		lector.close();
	}
}
