import java.util.Locale;
import java.util.Scanner;

public class Exercicios {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
/* 	Calcule a área e o preço do terreno */
		
//			double largura = sc.nextDouble();
//			double comprimento = sc.nextDouble();
//			double metroQd = sc.nextDouble();
//			
//			double area = largura * comprimento;
//			double preco = area * metroQd;
//			
//			System.out.printf("AREA = %.2f%n", area);
//			System.out.printf("PRECO = %.2f%n", preco);
			
//	================================================================================
			
/* Fazer um programa para ler as medidas da base w ltura de um retângulo.
 * Em seguida, mostrar o valor da área, perímetro e diagonal deste retângulo,
 * com quatro casas decimais, conforme exemplo:
 * -----------------
 * EXEMPLO ENTRADA:
 * 5.0
 * 4.0
 * -----------------
 * EXEMPLO SAÍDA:
 * AREA = 20.0000
 * PERIMETRO = 18.0000
 * DIAGONAL = 6.4031
 * ------------------
 * Informações:
 * área = base * altura
 * perímetro = 2 * base + 2 * altura OU 2 * (base + altura)
 * diagonal = (base² + altura²)²
 * */ 		
			
//			double base, altura, area, perimetro, diagonal;
//			base = sc.nextFloat();
//			altura = sc.nextFloat();			
//			area = base*altura;
//			perimetro = 2.0 * (base + altura);
//			diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));
//			
//			System.out.printf("AREA = %.4f%n", area);
//			System.out.printf("PERIMETRO = %.4f%n", perimetro);
//			System.out.printf("DIAGONAL = %.4f%n", diagonal);
			
//	================================================================================

/* Fazer um programa para ler o nome (apenas uma palavra) e idade de duas pessoas.
 * Ao final, mostrar uma mensagem com os nomes e a idade média entre essas pessoas,
 * com uma casa decimal, conforme exemplo.
 * -------------------
 * EXEMPLO ENTRADA:
 * Maria 19
 * Joaquim 20
 * -------------------
 * EXEMPLO SAÍDA:
 * A idade média de Maria e Joaquim é de 19.5 anos
 * -------------------
 * */
			
//		String nome1 = sc.next();
//		int idade1 = sc.nextInt();
//		String nome2 = sc.next();
//		int idade2 = sc.nextInt();
//		
////		double media = (double)(idade1 + idade2) / 2;
//		double media = (idade1 + idade2) / 2.0;
//		
//		System.out.printf("A idade media de %s e %s e de %.1f anos%n", nome1, nome2, media);

//		================================================================================
		
/* Fazer um programa para ler as duas notas que um aluno obteve no primeiro e segundo semestres
 * de uma disciplina anual. Em seguida, mostrar a nota final que o aluno obteve no ano juntamente
 * com um texto explicativo. Caso a nota final do aluno seja inferior a 60.00,
 * mostrar a mensagem "REPROVADO", conforme exemplos. Todos os valores devem ter um casa decimal.
 * ----------
 * EXEMPLO ENTRADA 1:
 * 45.5
 * 31.3
 * --------------
 * EXEMPLO SAÍDA 1:
 * NOTA FINAL = 76.8
 * --------------
 * EXEMPLO ENTRADA 2:
 * 24.0
 * 23.5		
 * --------------
 * EXEMPLO SAÍDA 2:
 * NOTA FINAL = 57.5
 * REPROVADO
 * ---------------
 *  */
		
//		double nota1 = sc.nextDouble();
//		double nota2 = sc.nextDouble();
//		
//		double notaFinal = nota1 + nota2;
//		System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
//		
//		if(notaFinal < 60.0) {
//			System.out.println("REPROVADO");
//		}
		
//		================================================================================		

/* Fazer um programa para ler três números. 
 * Em seguida, mostrar qual o menor dentre os números lidos.
 * Em caso de empate, mostrar apenas uma vez.
 * -------------
 * EXEMPLO ENTRADA:
 * 7 3 8
 * -------------
 * EXEMPLO SAÍDA:
 * MENOR = 3
 * -------------
 * EXEMPLO ENTRADA:
 * 5 12 5
 * -------------
 * EXEMPLO SAIDA:
 * MENOR = 5
 * ---------------
 */
		
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		
//		if(a < b && a < c) {
//			System.out.println("MENOR = " + a);
//		}else if(b < c){
//			System.out.println("MENOR = " + b);
//		}else {
//			System.out.println("MENOR = " + c);
//		}
		
//		==============================================================		
		
/*
 * Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito
 * a 100 minutos de telefone. Cada minuto que exceder a franquia de 100 minutos
 * custa R$ 2.00. Fazer um programa para ler a quantidade de minutos que uma
 * pessoa consumiu, daí mostrar o valor a ser pago.
 * ----------
 * EXEMPLO ENTRADA:
 * 22
 * ---------------
 * 103
 * ----------
 * EXEMPLO SAIDA:
 * Valor a pagar: R$50.00
 * -------------------
 * Valor a pagar: R$56.00
 */		
//		int minutos = sc.nextInt();
//		
//		double conta = 50.0;
//		if(minutos > 100) {
//			conta += (minutos - 100) * 2.00;
//		}
//		System.out.printf("Valor da conta: R$ %.2f%n", conta);

//		===================================================================	
		
/*
 * Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da semana (sendo 1=domingo). 
 * Escrever na tela o dia da semana correspondente.
 */	
//		int x = sc.nextInt();
//		String dia;
//		
//		switch (x){
//			case 1:
//				dia = "Domingo";
//				break;
//			case 2:
//				dia = "Segunda-Feira";
//				break;
//			case 3:
//				dia = "Terca-Feira";
//				break;
//			case 4:
//				dia = "Quarta-Feira";
//				break;
//			case 5:
//				dia = "Quinta-Feira";
//				break;
//			case 6:
//				dia = "Sexta-Feira";
//				break;
//			case 7:
//				dia = "Sabado";
//				break;
//			default:
//				dia = "valor invalido";
//				break;
//		}
//		
//		
//		System.out.println("Dia da semana: " + dia);
		
//		===================================================================	
		
/*
 * Faça um programa para ler um número indeterminado de dados, contendo cada um,
 * a idade de um indivíduo. O último dado, que não entrará nos cálculos, contém
 * um valor de idade negativa. Calcular e imprimir a idade média deste grupo de
 * indivíduos. Se for entrado um valor negativo na primeira vez, mostrar a
 * mensagem "impossivel calcular"
 * -------------
 * EXEMPLO ENTRADA:
 * 31 27 46 -5
 * -------------
 * EXEMPLO SAÍDA:
 * 34.67
 * -------------
 * EXEMPLO ENTRADA:
 * -10
 * -------------
 * EXEMPLO SAIDA:
 * impossivel calcular
 * ---------------
 */
//		int idade = sc.nextInt();
//		int soma = 0;
//		int cont = 0;
//		
//		while (idade >= 0){
//			soma = soma + idade;
//			cont = cont + 1;
//			idade = sc.nextInt();
//		}
//		
//		if(cont > 0) {
//			double media = (double) soma / cont;
//			System.out.printf("%.2f%n",media);
//		}else {
//			System.out.println("impossivel calcular");
//		}

//		===================================================================	
		
/*
 * Escreva um programa que repita a leitura de uma senha até que ela seja
 * válida. Para cada leitura de senha incorreta informada, escrever a mensagem
 * "Senha Invalida". Quando a senha for informada corretamente deve ser impressa
 * a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha
 * correta é o valor 2002.
 * --------------- 
 * EXEMPLO ENTRADA:
 * 2200 
 * 1020 
 * 2022 
 * 2002
 * ----------------
 * EXEMPLO SAIDA:
 * Senha Invalida 
 * Senha Invalida 
 * Senha Invalida 
 * Acesso Permitido
 * ----------------
 */

//		int senha = sc.nextInt();
//		
//		while (senha != 2002) {
//			System.out.println("Senha invalida");
//			senha = sc.nextInt();
//		}
//		
//		System.out.println("Acesso permitido");
		
//		===================================================================			
/*
 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
 * indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o
 * quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos
 * uma de duas coordenadas for NULA (nesta situação sem escrever mensagem
 * alguma). 
 * ----------------
 * EXEMPLO ENTRADA: 
 * 2 2 
 * 3 -2 
 * -8 -1 
 * -7 1 
 * 0 2
 * -----------------
 * EXEMPLO SAIDA: 
 * primeiro 
 * quarto
 * segundo
 * terceiro 
 * -----------------
 */
		
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		
//		if(x < 0 && y < 0) {
//			System.out.println("terceiro");
//		}else if(x < 0 && y > 0) {
//			System.out.println("segundo");
//		}else if(x > 0 && y > 0) {
//			System.out.println("primeiro");
//		}else {
//			System.out.println("quarto");
//		}
		
//		===================================================================			
/*
 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a
 * preferência de seus clientes. Escreva um algoritmo para ler o tipo de
 * combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina
 * 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de
 * 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa
 * será encerrado quando o código informado for o número 4. Deve ser escrito a
 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
 * tipo de combustível, conforme exemplo. 
 * -----------------
 * EXEMPLO ENTRADA: 
 * 8 
 * 1 
 * 7 
 * 2 
 * 2 
 * 4
 * -----------------
 * EXEMPLO SAÍDA: 
 * MUITO OBRIGADO 
 * Alcool: 1 
 * Gasolina: 2 
 * Diesel: 0
 * -----------------
 */			
//		String combustivel;
//		int alcool = 0;
//		int gasolina = 0;
//		int diesel = 0;
//		int orderNumber = sc.nextInt();
//
//		while(orderNumber != 4) {
//			switch(orderNumber) {
//				case 1:
//					alcool++;
//					break;
//				case 2:
//					gasolina++;
//					break;
//				case 3: 
//					diesel++;
//					break;
//			}
//			orderNumber = sc.nextInt();
//		}
//		
//		System.out.println("MUITO OBRIGADO");
//		System.out.printf("Alcool: %s%n", alcool);
//		System.out.printf("Gasolina: %s%n", gasolina);
//		System.out.printf("Diesel: %s%n", diesel);

//		===================================================================	
/*
 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1
 * até X, um valor por linha, inclusive o X, se for o caso.
 * ---------------
 * EXEMPLO ENTRADA: 
 * 8
 * ---------------
 * EXEMPLO SAÍDA:
 * 1
 * 3
 * 5
 * 7
 * --------------- 
 */
//		int x = sc.nextInt();
//		
//		for(int i = 0; i < x; i++) {
//			if((i % 2) != 0) {
//				System.out.println(i);
//			}
//		}
		
//		===================================================================	
		
/*
 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X
 * que serão lidos em seguida. Mostre quantos destes valores X estão dentro do
 * intervalo [10,20] e quantos estão fora do intervalo, mostrando essas
 * informações conforme exemplo (use a palavra "in" para dentro do intervalo, e
 * "out" para fora do intervalo). 
 * ----------------
 * EXEMPLO ENTRADA:
 * 5 
 * 14 
 * 123 
 * 10 
 * -25 
 * 32 
 * ----------------
 * EXEMPLO SAIDA:  
 * 2 in 
 * 3 out
 * ----------------
 */
		
//		int N = sc.nextInt();
//		
//		int in = 0;
//		int out = 0;
//		
//		for(int i = 0; i < N; i++) {
//			int x = sc.nextInt();
//			if(x >= 10 && x <= 20) {
//				in++;
//			}else {
//				out++;
//			}
//		}
//		
//		System.out.printf("%s in%n", in);
//		System.out.printf("%s out%n", out);
		
//		===================================================================	
		
/*
 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a
 * seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma
 * casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3
 * valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e
 * o terceiro valor tem peso 5. 
 * ----------------
 * EXEMPLO ENTRADA:
 * 3 
 * 6.5 4.3 6.2 
 * 5.1 4.2 8.1 
 * 8.0 9.0 10.0 
 * -----------------
 * EXEMPLO SAÍDA:
 * 5.7 
 * 6.3 
 * 9.3
 * -----------------
 */
//		int N = sc.nextInt();
//		
//		double valor1, valor2, valor3;
//		
//		double media = 0;
//		for(int i = 0; i < N; i++) {
//			valor1 = sc.nextDouble();
//			valor2 = sc.nextDouble();
//			valor3 = sc.nextDouble();
//			
//			media = ((valor1*2) + (valor2*3) + (valor3*5)) / 10;	
//			
//			System.out.printf("%.1f%n", media);
//		}
		
//		===================================================================			
/*
 * Fazer um programa para ler um número N. Depois leia N pares de números e
 * mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero,
 * mostrar a mensagem "divisao impossivel". 
 * ---------------
 * EXEMPLO ENTRADA: 
 * 3 
 * 3 -2 
 * -8 0 
 * 0 8
 * ----------------
 * EXEMPLO SAÍDA: 
 *  -1.5 
 *  divisao impossivel 
 *  0.0
 * -----------------
 */
		
//		int N = sc.nextInt();
//		
//		for(int i = 0; i < N; i++) {
//			int valor1 = sc.nextInt();
//			int valor2 = sc.nextInt();
//					
//			if(valor2 == 0) {
//				System.out.println("Divisão Impossível");
//			}else {
//				double divisao = (double) valor1 / valor2;
//				System.out.printf("%.1f%n", divisao);
//			}
//		}
		
//		===================================================================	
		
/*
 * Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N =
 * N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição, fatorial
 * de 0 é 1. 
 * ---------------
 * EXEMPLO ENTRADA: 
 * 4
 * 1
 * 5
 * 0
 * ----------------
 * EXEMPLO SAÍDA: 
 * 24 
 * 1
 * 120
 * 1
 * ----------------
 */
		
//		int N = sc.nextInt();
//		int fatorial = 1;
//		
//		
//		for(int i = 1; i <= N; i++ ) {
//			fatorial *= i;
//		}
//		
//		
//		System.out.println(fatorial);

//		===================================================================
/*
 * Ler um número inteiro N e calcular todos os seus divisores. 
 * -------------
 * EXEMPLO ENTRADA:
 * 6
 * ------------
 * EXEMPLO SAÍDA:  
 * 1 
 * 2 
 * 3 
 * 6
 */
		int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			
			if(N % i == 0) {
				System.out.println(i);
			}
		}
		
//		===================================================================	
		
/*
 * 1) Faça um programa que leia N números reais e armazene-os em um vetor. 
 * Em seguida, mostrar na tela o maior número do vetor (supor não haver empates).
 * Mostrar também a posição do maior elemento.
 * -------------
 * EXEMPLO ENTRADA:
 * 6 
 * 8.0 4.0 10.0 14.0 13.0 7.0
 * -------------
 * EXEMPLO SAÍDA:
 * 14.0
 * 3
 * -------------
 */
		
//		int N = sc.nextInt();
//		
//		float[] vetor = new float[N];
//		
//		
//		for(int i = 0; i < N; i++) {
//			vetor[i] = sc.nextFloat();
//		}
//		
//		float maior = vetor[0];
//		int posicaoMaior = 0;
//
//		
//		for(int i = 0; i < N; i++) {
//			if(vetor[i] > maior) {
//				maior = vetor[i];	
//				posicaoMaior = i;
//
//			}
//		}
//		
//		System.out.printf("%.1f%n", maior);
//		System.out.println(posicaoMaior);
		

		
//		===================================================================	
				
		
/*
 * 2) Faça um programa que leia N números inteiros e armazene-os em um vetor. Em
 * seguida, mostre na tela todos os números pares e a quantidade de números pares
 * -------------
 * EXEMPLO ENTRADA:
 * 6
 * 8 2 11 14 13 20
 * -------------
 * EXEMPLO SAÍDA:
 * 8 2 14 20
 * 4
 * -------------
 */
//		int N = sc.nextInt();
//		
//		int[] vetor = new int[N];
//		
//		for(int i = 0; i < N; i++) {			
//			vetor[i] = sc.nextInt();
//		}
//		
//		int soma = 0;
//		
//		for(int i = 0; i < N; i++) {
//			if(vetor[i] % 2 == 0) {
//				System.out.printf("%d ", vetor[i]);
//				soma++;
//			}
//		}
//		
//		System.out.println();		
//		System.out.println(soma);		

		
//		===================================================================	
		
		
/*
 * 3) Faça um programa para ler dois vetores A e B, contendo N elementos cada. 
 * Em seguida, gere um terceiro vetor C onde cada elemento de C é a soma dos
 * elementos correspondentes de A e B. Imprima o vetor C gerado.
 * -------------
 * EXEMPLO ENTRADA:
 * 6
 * 8 2 11 14 13 20
 * 5 10 3 1 10 7
 * -------------
 * EXEMPLO SAÍDA:
 * 13 12 14 15 23 27
 * -------------
 */
		
//		int N = sc.nextInt();
//		
//		int[] vetorA = new int[N];
//		int[] vetorB = new int[N];
//		int[] vetorC = new int[N];
//		
//		for(int i = 0; i < N; i++) {
//			vetorA[i] = sc.nextInt();
//		}
//		
//		for(int i = 0; i < N; i++) {
//			vetorB[i] = sc.nextInt();
//		}
//		
//		for(int i = 0; i < N; i++) {
//			vetorC[i] = vetorA[i] + vetorB[i];
//		}
//		
//		for(int i = 0; i < N; i++) {
//			System.out.printf("%d ",vetorC[i]);
//		}
		
		
//		===================================================================	
		
/*
 * 4) Fazer um programa para ler um vetor de N números reais. Em seguida, mostrar
 * na tela a média aritmética de todos elementos. Depois mostrar todos os
 * elementos do vetor que estejam abaixo da média.
 * -------------
 * EXEMPLO ENTRADA:
 * 4
 * 10.0 15.5 13.2 9.8
 * -------------
 * EXEMPLO SAÍDA:
 * 12.125
 * 10.0
 * 9.8
 * -------------
 */
		
//		int N = sc.nextInt();
//		
//		double[] vetor = new double[N]; 
//			
//		for(int i = 0; i < N; i++) {
//			vetor[i] = sc.nextDouble();
//		}
//		
//		double soma = 0;
//		
//		for(int i = 0; i < N; i++) {
//			soma =  soma + vetor[i];
//		}
//		
//		double media = soma / N;
//		
//		System.out.println(media);
//		
//		for(int i = 0; i < N; i++) {
//			if(vetor[i] < media) {
//				System.out.println(vetor[i]);
//			}
//		}
		
		
//		===================================================================
		
/*
 * 5) Fazer um programa para ler um vetor de N números inteiros. Em seguida,
 * mostrar na tela a média aritmética somente dos números pares lidos.
 * -------------
 * EXEMPLO ENTRADA:
 * 6
 * 8 2 11 14 13 20
 * -------------
 * EXEMPLO SAÍDA:
 * 11.0
 * -------------
 */
		
//		int N = sc.nextInt();
//		
//		int[] vetor =  new int[N];
//		
//		for(int i = 0; i < N; i++) {
//			vetor[i] = sc.nextInt();
//		}
//		
//		int soma = 0;
//		int count = 0;
//		
//		for(int i = 0; i < N; i++) {
//			if(vetor[i] % 2 == 0) {
//				soma = soma + vetor[i];
//				count++;
//			}
//		}
//		
//		double media = (double) soma / count;
//		
//		System.out.println(media);
		
		
//		===================================================================
		
		
/*
 * 6) Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas
 * idades. Depois, mostrar na tela o nome da pessoa mais velha.
 * -------------
 * EXEMPLO ENTRADA:
 * 5
 * Joao 16
 * Maria 21
 * Teresa 15
 * Carlos 23
 * Paulo 17
 * -------------
 * EXEMPLO SAÍDA:
 * Pessoa mais velha: Carlos
 * -------------
 */		
		
//		int N = sc.nextInt();
//		
//		String[] nomes = new String[N];
//		int[] idades = new int[N];
//		
//		for(int i = 0; i< N; i++) {
//			nomes[i] = sc.next();
//			idades[i] = sc.nextInt();
//		}
//		
//		int maior = 0;
//		int posicao = 0;
//		
//		for(int i = 0; i< N; i++) {
//			if(idades[i] > maior) {
//				maior = idades[i];
//				posicao++;
//			}
//		}
//		
//		// System.out.println(maior);
//		// System.out.println(posicao);
//		
//		String pessoaMaisVelha = nomes[posicao];		
//
//		System.out.println("Pessoa mais velha: " + pessoaMaisVelha);
				
//		===================================================================
		
/*
 * 7) Fazer um programa para ler um conjunto de N nomes de alunos, bem como as
 * notas que eles tiraram no 1º e 2º semestres. Cada uma dessas informações deve
 * ser armazenada em um vetor. Depois, imprimir os nomes dos alunos aprovados,
 * considerando aprovados aqueles cuja média das notas seja maior ou igual a
 * seis.
 * -------------
 * EXEMPLO ENTRADA:
 * 4
 * Joao 7.0 8.5
 * Maria 9.2 6.5
 * Carlos 5.0 6.0
 * Teresa 5.5 6.5
 * -------------
 * EXEMPLO SAÍDA:
 * Alunos aprovados:
 * Joao
 * Maria
 * Teresa
 * -------------
 */
//		int N = sc.nextInt();
//		
//		String[] alunos = new String[N];
//		double[] nota1Sem = new double[N];
//		double[] nota2Sem = new double[N];
//		
//		double media = 0;
//		int posicao = 0;
//		
//		for(int i = 0; i < N;i++) {
//			alunos[i] = sc.next();
//			nota1Sem[i] = sc.nextFloat();
//			nota2Sem[i] = sc.nextFloat();
//			
//		}
//
//		
//		
//	  for(int i = 0; i < N;i++) { 
//		  media = (nota1Sem[i] + nota2Sem[i]) / 2;
//		  
//		  if(media >= 6.0) { 
//			  System.out.println(alunos[i]);
//		  } 
//	  }
		 		
//		===================================================================
		
/*
 * 8) Tem-se um conjunto de dados contendo a altura e o sexo (M, F) de N
 * pessoas. Fazer um programa que calcule e escreva: 
 * - a maior e a menor altura do grupo 
 * - a média de altura das mulheres 
 * - o número de homens
 */	
		
//		int N = sc.nextInt();
//		
//		double[] alturas = new double[N];
//		char[] generos = new char[N];
//		
//		for(int i = 0; i < N;i++) { 
//		  alturas[i] = sc.nextDouble();
//		  generos[i] = sc.next().charAt(0);
//		}
//		
//		double menorAltura = 0;
//		double maiorAltura = 0;
//		double media = 0;
//		int mulheres = 0;
//		int homens = 0;
//		
//		for(int i = 0; i < N;i++) { 
//			if(alturas[i] > maiorAltura) {
//				maiorAltura = alturas[i];
//			}  
//		}
//		
//		menorAltura = maiorAltura;
//		
//		for(int i = 0; i < N;i++) { 
//			if(alturas[i] < menorAltura) {
//				menorAltura = alturas[i];
//			}  
//		}
//		
//		for(int i = 0; i < N;i++) { 
//			if(generos[i] == 'F') {
//				mulheres++;				
//			} 
//			media = (media + alturas[i]) / mulheres;
//		}
//		
//		for(int i = 0; i < N;i++) { 
//			if(generos[i] == 'M') {
//				homens++;			
//			}  
//		}
//		
//		System.out.printf("Menor altura = %.2f%n", menorAltura);
//		System.out.printf("Maior altura = %.2f%n", maiorAltura);
//		System.out.printf("Media das alturas das mulheres = %.2f%n", media);
//		System.out.println("Numero de homens = " + homens);

//		===================================================================
		
/*
 * Um comerciante deseja fazer o levantamento do lucro das mercadorias que ele
 * comercializa. Para isto, mandou digitar um conjunto de N mercadorias, cada
 * uma contendo nome, preço de compra e preço de venda das mesmas. Fazer um
 * programa que leia tais dados e determine e escreva quantas mercadorias
 * proporcionaram: 
 * - lucro < 10% 
 * - 10% <= lucro <= 20% 
 * - lucro> 20% 
 * Determine e escreva também o valor total de compra e de venda de todas as mercadorias,
 * assim como o lucro total.
 */		
		
//		int N = sc.nextInt();
//		
//		String[] produto = new String[N];
//		double[] precoCompra = new double[N];
//		double[] precoVenda = new double[N];
//		
//		for(int i = 0; i < N; i++) {
//			produto[i] = sc.next();
//			precoCompra[i] = sc.nextDouble();
//			precoVenda[i] = sc.nextDouble();
//		}
//		
//			
//		int lucroDeMenos10 = 0;
//		for(int i = 0; i < N; i++) {
//			if(precoVenda[i] < precoCompra[i] * 0.10 + precoCompra[i]) {
//				lucroDeMenos10++;
//			}
//		}
//		
//		
//		int lucroEntre10E20 = 0;
//		for(int i = 0; i < N; i++) {
//			if(precoVenda[i] >= precoCompra[i] * 0.10 + precoCompra[i] && precoVenda[i] <= precoCompra[i] * 0.20 + precoCompra[i]) {
//				lucroEntre10E20++;
//			}
//		}
//		
//		int lucroAcimaDe20 = 0;
//		for(int i = 0; i < N; i++) {
//			if(precoVenda[i] > precoCompra[i] * 0.20 + precoCompra[i]) {
//				lucroAcimaDe20++;
//			}
//		}
//		
//		double valorTotalCompra = 0;
//		for(int i = 0; i < N; i++) {
//			valorTotalCompra += precoCompra[i]; 
//		}
//		
//		double valorTotalVenda = 0;
//		for(int i = 0; i < N; i++) {
//			valorTotalVenda += precoVenda[i]; 
//		}
//		
//		double lucroTotal = 0;
//		for(int i = 0; i < N; i++) {
//			lucroTotal = valorTotalVenda - valorTotalCompra;
//		}
//		
//		System.out.println("Lucro abaixo de 10%: " + lucroDeMenos10);
//		System.out.println("Lucro entre 10% e 20%: " + lucroEntre10E20);
//		System.out.println("Lucro acima de 20%: " + lucroAcimaDe20);
//		System.out.printf("Valor total de compra: %.2f%n", valorTotalCompra);
//		System.out.printf("Valor total de venda: %.2f%n", valorTotalVenda);
//		System.out.printf("Lucro total: %.2f%n", lucroTotal);

		
		
/*
 * Fazer um programa que leia um numero inteiro N e uma matriz quadrada de ordem
 * N contendo numeros inteiros. Em seguida, mostrar diagonal (0,0 / 1,1 / 2,2 ) principal e a
 * quantidade de valores negativos da matriz.
 */
		
//		int N = sc.nextInt();
//		
//		int[][] mat = new int[N][N];
//		
//		for(int i = 0; i < N; i++) {
//			for(int j = 0; j < N; j++) {
//				mat[i][j] = sc.nextInt();			
//			}
//		}
//		
//		System.out.println("DIAGONAL PRINCIPAL:");
//		
//		for(int i = 0; i < N; i++){
//			System.out.print(mat[i][i] + " ");
//		}
//		System.out.println();
//		
//		int cont = 0;
//		for(int i = 0; i < N; i++) {
//			for(int j = 0; j < N; j++) {
//				if(mat[i][j] < 0) {
//					cont++;
//				}
//			}
//		}
//		
//		System.out.println("QUANTIDADE DE NEGATIVOS = " + cont);
		
/*
 * Fazer um programa para ler dois números inteiros M e N. Em seguida, ler uma
 * matriz de M linhas e N colunas contendo números double. Gerar um vetor de
 * modo que cada elemento do vetor seja a soma dos elementos da linha
 * correspondente da matriz. Mostrar o vetor gerado.
 */
		
//		int M = sc.nextInt();
//		int N = sc.nextInt();
//		
//		double[][] mat = new double[M][N];
//		
//		for(int i = 0; i < M; i++) {
//			for(int j = 0; j < N; j++) {
//				mat[i][j] = sc.nextDouble();
//			}
//		}
//		
//		double[] vet = new double[M];
//		
//		for(int i = 0; i < M; i++) {
//			double soma = 0.0;
//			for(int j = 0; j < N; j++) {
//				soma = soma + mat[i][j];
//			}
//			vet[i] = soma;
//		}
//		
//		
//		for(int i = 0; i < M; i++) {
//			System.out.printf("%.1f%n", vet[i]);
//		}
		
		sc.close();
				
	}
}