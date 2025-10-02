import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("SALÁRIO E HORAS TRABALHADAS %n");
		System.out.println();
		
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner (System.in);
		
		int codTrabalhador, horasTrabalhadas;
		double valorHora, salarioTrabalhador;
		
		System.out.printf("INFORME O CÓDIGO DO TRABALHADOR: ");
		codTrabalhador = sc.nextInt();
		
		System.out.printf("INFORME A QUANTIDADE DE HORAS TRABALHADAS: ");
		horasTrabalhadas = sc.nextInt();
		
		System.out.printf("INFORME O VALOR DA HORA TRABALHADA: ");
		valorHora = sc.nextDouble();
		
		salarioTrabalhador = valorHora * horasTrabalhadas;
		
		System.out.println();
		System.out.printf("O VALOR DO SALÁRIO DO TRABALHADOR É DE U$: %.2f", salarioTrabalhador);
		
		sc.close();

	}

}
