
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		String produto1 = "COMPUTER";
		String produto2 = "OFFICE DESK";
		
		int idade = 30;
		int code = 5290;
		
		char genero = 'F';
		
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double media = 53.234567;
		
		System.out.println("PRODUCTS:");
		System.out.printf("%s, WHICH PRICE IS $ %.2f%n", produto1, preco1);
		System.out.printf("%s, WHICH PRICE IS $ %.2f%n", produto2, preco2);
		
		System.out.println();
		
		System.out.printf("RECORD: %d YEARS OLD, CODE %d AND GENDER: %s%n", idade, code, genero);
		
		System.out.println();
		
		System.out.printf("MEASUE WITH EIGHT DECIMAL PLACES: %.8f%n", media);
		System.out.printf("ROUDED (THREE DECIMAL PLACES): %.3f%n", media);
		
		Locale.setDefault(Locale.US);
		System.out.printf("US DECIMAL POINT: %.3f%n", media);
		

	}

}
