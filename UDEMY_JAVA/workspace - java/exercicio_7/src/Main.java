import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("VALOR TOTAL DA COMPRA");
		System.out.println();
		System.out.println("-------------------------------------");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codPeca1, quantPeca1;
		double valorPeca1;
		
		int codPeca2, quantPeca2;
		double valorPeca2;
		
		double totalPagar;
		
		System.out.println("DADOS SOBRE A PEÇA 1");
		System.out.println();
		
		System.out.printf("INFORME O CÓDIGO: ");
		codPeca1 = sc.nextInt();
		
		System.out.printf("INFORME A QUANTIDADE: ");
		quantPeca1 = sc.nextInt();
		
		System.out.printf("INFORME O VALOR: ");
		valorPeca1 = sc.nextDouble();
		System.out.println();
		
		System.out.println("-------------------------------------");
		
		System.out.println("DADOS SOBRE A PEÇA 2");
		System.out.println();
		
		System.out.printf("INFORME O CÓDIGO: ");
		codPeca2 = sc.nextInt();
		
		System.out.printf("INFORME A QUANTIDADE: ");
		quantPeca2 = sc.nextInt();
		
		System.out.printf("INFORME O VALOR: ");
		valorPeca2 = sc.nextDouble();
		System.out.println();
		
		System.out.println("-------------------------------------");
		
		totalPagar = (quantPeca1 * valorPeca1) + (quantPeca2 * valorPeca2);
		
		System.out.println();
		System.out.printf("VALOR TOTAL À PAGAR R$: %.2f", totalPagar);
		
		sc.close();

	}

}
