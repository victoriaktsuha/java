package estudos;
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
		 * //for each pode substituir for for(String nome : nomes) {
		 * System.out.println(nome); }
		 */

		// Exemplos matriz

		// M - linhas
		// N - colunas
//		int M = sc.nextInt();
//		int N = sc.nextInt();
//		
//		
//		int[][] mat = new int[M][N];
//		
//		//precisa de um for dentro do outro para percorrer tanto linhas quantos colunas; variavel 'i' para linhas e variavel 'j' para colunas
//		for(int i = 0; i < M; i++) {
//			for(int j = 0; j < N; j++) {
//				mat[i][j] = sc.nextInt();
//			}
//		}
//		
//		for(int i = 0; i < M; i++) {
//			for(int j = 0; j < N; j++) {
//				System.out.print(mat[i][j] + " ");
//			}
//			System.out.println();
//		}

		// Exemplo Operação bitwise
		
		/*
		 * int n1 = 89; int n2 = 60;
		 * 
		 * System.out.println(n1 & n2); 
		 * System.out.println(n1 | n2);
		 * System.out.println(n1 ^ n2);
		 * 
		 * 
		 */
		
		//Testar se o 6º bit vale 1
		
		//int mask = 32; //pois 32 tem o 1 como 6° bit
//		int mask = 0b100000; //declaração de número binario
//		int n = sc.nextInt();
//		
//		if((n & mask) != 0) {
//			System.out.println("6th bit is true");
//		}else{
//			System.out.println("6th bit is false");
//		}
		
		//Funçõess para string
		
//		String original = "abcde FGHIJ ABC abc DEFG    ";
//		
//		String s01 = original.toLowerCase(); 
//		String s02 = original.toUpperCase(); 
//		String s03 = original.trim(); 
//		String s04 = original.substring(2); //será criada uma nova string utilizando o conteúdo a partir do caractere na posição informada, 2 
//		String s05 = original.substring(2, 9); //será criada uma nova string utilizando o conteúdo a partir do caractere na primeira posição informada, 2, ATÉ a segunda posição informada, 9
//		String s06 = original.replace('a', 'x'); //o primeiro caractere informado, 'a', todos os 'a's minúsculos, serão trocados pelo segundo caractere informado, 'x'
//		String s07 = original.replace("abc", "xy");
//		int i = original.indexOf("bc"); //recupera a posição a primeira ocorrencia do parametro, 1, em relação ao que foi informado, "bc"
//		int j = original.lastIndexOf("bc");//recupera a posição da última ocorrencia do parametro, 17, em relação ao que foi informado, "bc"
//		
//		System.out.println("Original: -" + original + "-");
//		System.out.println("toLowerCase: -" + s01 + "-");
//		System.out.println("toUpperCase: -" + s02 + "-");
//		System.out.println("trim: -" + s03 + "-");
//		System.out.println("substring(2): -" + s04 + "-");
//		System.out.println("substring(2, 9): -" + s05 + "-");
//		System.out.println("substring('a', 'x'): -" + s06 + "-");
//		System.out.println("substring(\"abc\", \"xy\"): -" + s07 + "-");
//		System.out.println("indexOf(\"bc\"): " + i);
//		System.out.println("lastIndexOf(\"bc\"): " + j);
		
//		String s = "potato apple lemon";
//		
//		String[] vect = s.split(" ");
//		
//		System.out.println(vect[0]);
//		System.out.println(vect[1]);
//		System.out.println(vect[2]);
		
		// Funções
		
//		System.out.println("Digite 3 números:");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		
//		int higher = max(a, b, c);
//		
//		showResult(higher);
				
		sc.close();

	}
	
	public static int max(int x, int y, int z) {
		int aux = 0;
		
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}
	//public para que essa função fique disponivel para outras classes
	//static para que a função possa ser chamada independente de se criar um objeto
	//int para o tipo de dado que a função retorna
	
	public static void showResult(int value) {
		System.out.println("Maior = " + value);
	}
	//void pois a função não retorna um valor que possa ser armazenado. Nesse caso, ela apenas imprime no console

}
