import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// DIFERENÇA DO PRODUTO
		Scanner sc = new Scanner (System.in);
		
		System.out.println("CALCULAR O VALOR DA DIFERENÇA DO PRODUTO!");
		System.out.println();
		
		int num1, num2, num3, num4, dif;
		
		System.out.printf("DIGITE O VALOR DO NÚMERO 1: ");
		num1 = sc.nextInt();
		
		System.out.printf("DIGITE O VALOR DO NÚMERO 2: ");
		num2 = sc.nextInt();
		
		System.out.printf("DIGITE O VALOR DO NÚMERO 3: ");
		num3 = sc.nextInt();
		
		System.out.printf("DIGITE O VALOR DO NÚMERO 4: ");
		num4 = sc.nextInt();
		
		dif = (num1 * num2 - num3 * num4);
		
		System.out.println();
		System.out.printf("O VALOR DA DIFERENÇA DO PRODUTO É DE: " + dif);
		
		sc.close();

	}

}
