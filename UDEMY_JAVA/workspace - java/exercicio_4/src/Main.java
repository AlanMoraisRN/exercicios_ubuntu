import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//VALOR DA ÁREA DE UM CÍRCULO
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("CALCULAR O VALOR DA ÁREA DE UM CÍRCULO!");
		System.out.println();
		
		double area, raio, pi = 3.14159;
		
		System.out.printf("DIGITE O VALOR DA RAIO DO CÍRCULO: ");
		raio = sc.nextDouble();
		
		area = pi * Math.pow(raio, 2);
		
		System.out.println();
		System.out.printf("O VALOR DA ÁREA DO CÍRCULO É DE: %.4f%n", area);
		
		sc.close();
	}

}
