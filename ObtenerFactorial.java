package plaiaundi;

import java.util.Scanner;

public class ObtenerFactorial {

	public static void main(String[] args) {

		int result=1;
		int index=0;
		int vlr_itrmdio=1;
		
		System.out.println("Introduce un n�mero del 1 al 10");
		Scanner lector = new Scanner(System.in);
		int numero = lector.nextInt();
		
		int[] lista = new int[numero];
		
		for(int i=1; i<=numero; i++){
			lista[index]=i;
			index++;
		}
		
		for(int f: lista) {
			vlr_itrmdio=vlr_itrmdio*f;
			result=vlr_itrmdio;
		}
		
		System.out.print(result);
		lector.close();
	}
}
