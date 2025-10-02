import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("CALCULAR ÁREA");
		System.out.println();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double valorA, valorB, valorC;
		double tri, cir, tra, quad, ret, pi = 3.14159;
		
		System.out.printf("INFORME O VALOR A: ");
		valorA = sc.nextDouble();
		
		System.out.printf("INFORME O VALOR B: ");
		valorB = sc.nextDouble();
		
		System.out.printf("INFORME O VALOR C:  ");
		valorC = sc.nextDouble();
		System.out.println();
		
		tri = (valorA * valorC) / 2;
		cir = pi * Math.pow(valorC, 2);
		tra = ((valorA + valorB) * valorC) / 2;
		quad = Math.pow(valorB, 2);
		ret = valorA * valorB;
		
		System.out.printf("ÁREA DO TRIÂNGULO = %.3f%n", tri);
		System.out.printf("ÁREA DO CÍRCULO = %.3f%n", cir);
		System.out.printf("ÁREA DO TRAPÉZIO = %.3f%n", tra);
		System.out.printf("ÁREA DO QUADRADO = %.3f%n", quad);
		System.out.printf("ÁREA DO RETÂNGULO = %.3f", ret);
		
		sc.close();

	}

}
