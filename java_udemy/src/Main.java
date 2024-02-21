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

		/*
		 * int x = sc.nextInt();
		 * 
		 * int soma = 0;
		 * 
		 * while (x != 0) { soma = soma + x; x = sc.nextInt(); }
		 * 
		 * System.out.println(soma);
		 */

		// Exemplos repetição 'for'

		/*
		 * int N = sc.nextInt(); int soma = 0;
		 * 
		 * for(int i = 0; i < N; i++) { int x = sc.nextInt(); soma += x; }
		 * System.out.println(soma);
		 */

		// Exemplos repetição 'do-while'

		/*
		 * char resp; do { System.out.print("Digite a temperatura em Celsius:"); double
		 * C = sc.nextDouble(); double F = 9.0 * C / 5.0 + 32.0;
		 * System.out.printf("Equivalente em Fahrenheit: %.2f%n", F);
		 * System.out.print("Deseja repetir (s/n)? "); resp = sc.next().charAt(0); }
		 * while (resp != 'n');
		 */

		// Exemplos vetor

		/*
		 * Fazer um programa para ler um número inteiro positivo N, depois ler N números
		 * quaisquer e armazená-los em um vetor. Em seguida, mostrar na telas todos os
		 * elementos do vetor.
		 */

		/*
		 * int N = sc.nextInt();
		 * 
		 * double[] vetor = new double[N];
		 * 
		 * for(int i = 0; i < N; i++) { vetor[i] = sc.nextDouble(); }
		 * 
		 * for(int i = 0; i < N; i++) { System.out.printf("%.2f%n", vetor[i]); }
		 */

		/*
		 * Fazer um programa que leia N números inteiros e armazene-os em um vetor. Em
		 * seguida, mostrar na tela todos os números negativos lidos.
		 */

		
		/*
		 * int N = sc.nextInt();
		 * 
		 * int[] vetor = new int[N];
		 * 
		 * for(int i = 0; i < N; i++) { vetor[i] = sc.nextInt(); }
		 * 
		 * for(int i = 0; i < N; i++) { if(vetor[i] < 0) { System.out.println(vetor[i]);
		 * } }
		 */
		 
		
		/*
		 * Faça um programa que leia N números reais e armazene-os em um vetor. Em
		 * seguida imprima todos os elementos do vetor e mostre na tela a soma e a média
		 * dos elementos do vetor.
		 */
		
		/*
		 * int N = sc.nextInt();
		 * 
		 * double[] vet = new double[N];
		 * 
		 * for(int i = 0; i < N; i++) { vet[i] = sc.nextDouble(); }
		 * 
		 * for(int i = 0; i < N; i++) { System.out.print(vet[i] + " "); }
		 * System.out.println();
		 * 
		 * double soma = 0; for(int i = 0; i < N; i++) { soma += vet[i]; }
		 * System.out.printf("%.2f%n", soma);
		 * 
		 * double media = soma / N;
		 * 
		 * System.out.printf("%.2f%n", media);
		 */
		
		
		/*
		 * Fazer um programa para ler um número N, depois nome (apenas uma palavra sem
		 * espaços), idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
		 * tela a altura média das pessoas, e mostrar também a porcentagem de pessoas
		 * com menos de 16 anos.
		 */
		
		/*
		 * int N = sc.nextInt();
		 * 
		 * String nomes[] = new String[N]; int idades[] = new int[N]; double alturas[] =
		 * new double[N];
		 * 
		 * for(int i = 0; i < N; i++) { nomes[i] = sc.next(); idades[i] = sc.nextInt();
		 * alturas[i] = sc.nextDouble(); }
		 * 
		 * double soma = 0;
		 * 
		 * for(int i = 0; i < N; i++) { soma = soma + alturas[i]; }
		 * 
		 * double media = soma / N; System.out.printf("Altura media: %.2f%n", media);
		 * 
		 * int cont = 0;
		 * 
		 * for(int i = 0; i < N; i++) { if(idades[i] < 16) { cont++; } }
		 * 
		 * double x = cont * 100.0 / N;
		 * System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", x);
		 */
		
		
		/*
		 * Fazer um programa para ler um valor N e depois o nome de N pessoas. Em
		 * seguida, mostrar seus nomes.
		 */
		
		/*
		 * int N = sc.nextInt();
		 * 
		 * String[] nomes = new String[N];
		 * 
		 * for(int i = 0; i < N; i++) { nomes[i] = sc.next(); }
		 * 
		 * System.out.println("Nomes lidos:");
		 * 
		 * //for each pode substituir for 
		 * for(String nome : nomes) {
		 * 	System.out.println(nome); 
		 * }
		 */
		
		
		// Exemplos matriz
		
		// M - linhas
		//N - colunas
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		
		int[][] mat = new int[M][N];
		
		//precisa de um for dentro do outro para percorrer tanto linhas quantos colunas; variavel 'i' para linhas e variavel 'j' para colunas
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		
		sc.close();

	}

}
