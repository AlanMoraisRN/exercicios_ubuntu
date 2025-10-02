import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		//VALOR ÁREA E PREÇO DE TERRENO
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); 
		
		double largura, comprimento, valor;
		
		System.out.printf("DIGITE O VALOR DA LARGURA DO TERRENO: ");
		largura = sc.nextDouble();
		
		System.out.printf("DIGITE O VALOR DO COMPRIMENTO DO TERRENO: ");
		comprimento = sc.nextDouble();
		
		System.out.printf("DIGITE O VALOR DO PREÇO DO TERRENO: ");
		valor = sc.nextDouble();
		System.out.println();
		
		double area = largura * comprimento;
		double preco = area * valor;
		
		System.out.printf("O VALOR DO DA ÁREA DO TERRENO É DE: %.2f%n", area);
		System.out.printf("O VALOR DO PREÇO DO TERRENO DO TERRENO É DE: %.2f%n", preco);
		
		sc.close();

	}

}
