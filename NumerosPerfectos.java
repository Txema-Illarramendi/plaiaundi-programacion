package plaiaundi;

import java.util.Scanner;

public class NumerosPerfectos {

	public static void main(String[] args) {
		
		int index=0;
		int result=0;
		
		System.out.println("Introduce un n�mero y pulsa enter");
		Scanner lector = new Scanner(System.in);
		int numero = lector.nextInt();
		
		int[] perfectos=new int[numero];
		
		for(int i=1; i<(numero); i++) {
			if((numero%i)==0) {
				perfectos[index]=i;
				index++;
			}
		}
		for(int f: perfectos) {
			int valin=f;
			result=result+valin;
		}
		if(result==numero) {
			System.out.println("El n�mero " + numero + " es perfecto");
		}else {
			System.out.println("El n�mero " + numero + " no es perfecto");
		}
		lector.close();
	}

}
