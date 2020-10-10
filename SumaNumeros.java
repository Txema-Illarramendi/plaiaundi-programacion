package plaiaundi;

public class SumaNumeros {

	public static void main(String[] args) {

		int num=0;
		for(int i=1; i<=10; i++){
		int suma=i+num;
		num=suma;
		}
		System.out.println(num);
	}

}
