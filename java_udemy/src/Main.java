import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("Hello World => ");
//		System.out.println("Olá mundo");
		
//		int y = 32; 
//		double x = 10.35784;
//		  
//		
//		System.out.printf("%.2f%n", x);
//		System.out.printf("%.4f%n", x);
//		
//		System.out.println("Resultado = " + x + " metros");
//		Locale.setDefault(Locale.US);
//		System.out.printf("Resultado = %.2f metros%n", x);
//		
//		String nome = "Maria"; 
//		int idade = 31; 
//		double renda = 4000.0;
//		
//		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
//		int x, y;		
//		int x;
//	    double y;
//		x = 5;
//		y = 2 * x;
//
//        System.out.println(x);
//        System.out.println(y);
        
//        double b, B, h, area;
//
//        b = 6.0;
//        B = 8.0;
//        h = 5.0;
//
//        area = (b + B) / 2.0 * h;

		
//        float b, B, h, area;
//
//        b = 6f;
//        B = 8f;
//        h = 5f;
//
//        area = (b + B) / 2f * h;
//
//        System.out.println(area);
        
//        int a, b;
//        double resultado;
//
//        a = 5;
//        b = 2;
//
//        resultado = (double) a / b;
//
//        System.out.println(resultado);
        
//        double a;
//        int b;
//
//        a = 5.0;
//        b = (int) a;
//
//        System.out.println(b);
//        
        // Exemplos saída
		/*
		 * Locale.setDefault(Locale.ITALIAN);
		 * 
		 * String product1 = "Computer"; String product2 = "Office desk";
		 * 
		 * int age = 30; int code = 5290; char gender = 'F';
		 * 
		 * double price1 = 2100.0; double price2 = 650.50; double measure = 53.234567;
		 * 
		 * System.out.println("Products:");
		 * System.out.printf("%s, which price is $ %.2f%n", product1, price1 );
		 * System.out.printf("%s, which price is $ %.2f%n%n", product2, price2 );
		 * 
		 * System.out.printf("Record: %d years old, code %d and gender: %s%n%n", age,
		 * code, gender);
		 * 
		 * System.out.printf("Measure with eight decimal places: %.8f%n", measure);
		 * System.out.printf("Rounded (three decimal places): %.3f%n", measure);
		 * Locale.setDefault(Locale.US); System.out.printf("US decimal point: %.3f%n",
		 * measure);
		 */
	    
		// Exemplos condicional
		
		/*
		 * int hora;
		 * 
		 * System.out.println("Quantas horas ?"); hora = sc.nextInt();
		 * 
		 * if(hora < 12) { System.out.println("Bom dia"); } else if(hora < 18) {
		 * System.out.println("Boa tarde"); } else { System.out.println("Boa noite"); }
		 */
		
		// Exemplos repetição 'while'
		
		int x = sc.nextInt();
		
		int soma = 0;
		
		while (x != 0) {
			soma = soma + x;
			x = sc.nextInt();
		}
		
		System.out.println(soma);
		
		sc.close();

	}	
	
	

}
