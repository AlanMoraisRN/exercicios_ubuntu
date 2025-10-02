import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		String nome = "ALAN MORAIS";
		int idade = 35;
		double renda = 2500.0;
		
		double x = 10.38576;
		int y = 32;
		
		System.out.printf("%.2f%n", x); //DUAS CASAS DECIMAIS + QUEBRA DE LINHA %N
		System.out.printf("%.4f%n", x); //QUATRO CASAS DECIMAIS + QUEBRA DE LINHA %N
		System.out.println();
		
		//IMPORTAR PADRÃO DE ESCRITA ENGLISH USA
		Locale.setDefault(Locale.US);
		
		System.out.printf("%.4f%n", x);
		System.out.println();
		
		System.out.printf("A VARIÁVEL X É IGUAL A: " + "%.2f%n", x); //MINHA FORMA DE CONCATENAR USANDO O PRINTF
		System.out.println("A VARIÁVEL Y É IGUAL A: " + y);
		
		System.out.printf("A VARIÁVEL X É IGUAL A: %.2f%n", x); //FORMA CORRETA DE CONCATENAR USANDO O PRINTF
		System.out.println();
		
		
		//%S - STRING
		//%D - INTEIRO
		//%F - DOUBLE
		//%N - QUEBRA DE LINHA
		
		System.out.printf("OLÁ! SOU %s, TENHO %d ANOS E MEU SALÁRIO É DE %.2f REAIS. %n", nome, idade,renda);
	}

}
