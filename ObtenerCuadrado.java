package plaiaundi;

import java.util.Scanner;

public class ObtenerCuadrado {

	public static void main(String[] args) {
		
		int index=0;
		int result=0;
		
		System.out.println("Introduce un n�mero y pulsa enter");
		Scanner lector = new Scanner(System.in);
		int numero = lector.nextInt();
		
		int[] nones=new int[numero];
		
		for(int i=0; i<=(numero*2); i++) {
			int valor=(i%2);
			if(valor!=0) {
				nones[index]=i;
				index++;
			}
		}
		for(int f: nones) {
			int valin=f;
			result=result+valin;
		}
		System.out.println("El n�mero " + numero + " al cuadrado es " + result);
		lector.close();
	}

}
