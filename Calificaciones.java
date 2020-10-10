package plaiaundi;

import java.util.Scanner;

public class Calificaciones {

	public static void main(String[] args) {

		System.out.println("Introduce tu nota de Sistemas, Redes, Programación, BBDD.\nPulsa intro tras introducir cada nota");
		Scanner lector = new Scanner(System.in);
		double sistemas = lector.nextInt();
		double redes = lector.nextInt();
		double programacion = lector.nextInt();
		double bbdd = lector.nextInt();
		
		System.out.println("Tu nota media es " + (sistemas + redes + programacion + bbdd)/4);
		lector.close();
	}

}
