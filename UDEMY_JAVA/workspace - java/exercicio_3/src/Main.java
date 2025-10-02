import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//SOMA ENTRE DOIS NÚMEROS INTEIROS
		Scanner sc = new Scanner (System.in);
		
		int num1, num2, soma;
		
		System.out.printf("DIGITE O VALOR DO NÚMERO 1: ");
		num1 = sc.nextInt();
		
		System.out.printf("DIGITE O VALOR DO NÚMERO 2: ");
		num2 = sc.nextInt();
		
		soma = num1 + num2;
		
		System.out.printf("O VALOR DA SOMA DOS NÚMEROS É DE: " + soma);
		
		sc.close();
	}

}
