package plaiaundi;

import java.util.Scanner;

public class DividirConRestas {

	public static void main(String[] args) {
		
		int cociente=0;
		int resto=0;
		
		
		System.out.println("Introduce un dividendo");
		Scanner lector = new Scanner(System.in);
		int dividendo = lector.nextInt();
		System.out.println("Introduce un divisor");
		int divisor = lector.nextInt();
		
		int valin=dividendo;
		
		for(int i=dividendo; i>=divisor; i=i-divisor) {
			resto=valin-divisor;
			valin=valin-divisor;
			cociente++;
		}
		System.out.print("Dividir " + dividendo +" entre " + divisor + " da un cociente de " + cociente + " y un resto de " + resto);
		lector.close();
	}
}
