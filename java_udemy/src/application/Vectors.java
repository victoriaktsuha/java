package application;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.Product;
import entities.Rent;
import model.entities.NewAccount;
import model.exceptions.AccountException;

public class Vectors {

	
	public static void main(String[] args) throws ParseException {
	//public static void main(String[] args) throws ParseException {
		
		/* quando "throws ParseException" n�o � acrescentado ao m�todo principal, estamos
		 * informando ao programa que esse m�todo n�o lan�a nenhuma exce��o/erro. Mas se 
		 * utilizarmos uma chamada dentro de Main que pode lan�ar uma exce��o, como � o 
		 * caso do .parse(), o compilador vai indicar erro para que essa exce��o seja 
		 * tratada ou propagada("jogada" para outro metodo resolver) no m�todo que ela se encontra. Acrescentando esse termo, 
		 * indicdos que essa exce��o n�o precisa ser tratada pelo m�todo que ela est� 
		 * inserida.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		// Vetores tipo valor (tipo primitivo)
		
		/*
		 * Em programa��o, "vetor" � o nome dado a arranjos unidimensionais. 
		 * Arranjo (array) � uma estrutura de dados: Homog�nea (dados do mesmo tipo), Ordenada
		 * (elementos acessados por meio de posi��es) e Alocada de uma vez s�, em um
		 * bloco cont�guo de mem�ria. 
		 * Vantagens: acesso imediato aos elementos pela sua posi��o. 
		 * Desvantagens: tamanho fixo, dificuldade para se realizar inser��es e dele��es.
		 * 
		 * Problema exemplo 1
		 * Fazer um programa para ler um n�mero inteiro N e a altura de N pessoas.
		 * Armazene as N alturas em um vetor. Em seguida, mostrar a altura m�dia dessas pessoas.
		 */
			
		
			int n1 = sc.nextInt();
			
			double[] vect1 = new double[n1];
			
			for(int i = 0; i < n1; i++) {				
				vect1[i] = sc.nextDouble();
			}
			
			double sum1 = 0.0;
			
			for(int i = 0; i < n1; i++) {				
				sum1 += vect1[i];
			}
			
			double avg1 = sum1 / n1;
			
			System.out.printf("AVERAGE HEIGHT: %.2f", avg1);
		
		/*
		 * Problema exemplo 2 Fazer um programa para ler um n�mero inteiro N e os dados
		 * (nome e pre�o) de N produtos. Armazene os N produtos em um vetor. Em seguida,
		 * mostrar pre�o m�dio dos produtos.
		 */
		
		int n2 = sc.nextInt();		
		Product[] vect2 = new Product[n2];
		
		for(int i = 0; i < vect2.length; i++) {
			sc.nextLine();
			String name = sc.next();
			double price = sc.nextDouble();
			vect2[i] = new Product(name, price);
		}
		
		double sum2 = 0.0;
		
		for(int i = 0; i < vect2.length; i++) {				
			sum2 += vect2[i].getPrice();
		}
		
		double avg2 = sum2 / vect2.length;
		
		System.out.printf("AVERAGE PRICE: %.2f", avg2);
		
		
		//Exercicios de fixa��o vetores
		
		/* A corre��o foi primeiro criar um vetor de 10 indices, indicar pelo scanner
		 * n�mero de quartos a serem alugados, depois dentro do for iniciar o contador
		 * com 1 para que exclua o 0 como 'quarto', e ent�o imprimir o n�mero de quartos
		 * alugados indicados. Depois digitar o nome, email e o n� do quarto alugado
		 * pelo inquilino, e no fim do la�o armazenar nome e email no vetor, sendo
		 * o n�mero do quarto alugado representante do �ndice a armazenar cada inquilino.
		 * Depois foi feito outro la�o for para passar por todos os 10 �ndices e
		 * imprimir somente os dados daquele que atender a condi��o de n�o ser nulo.
		 * A analogia seria um hotel de 10 quartos (vetor) onde 3 foram alugados
		 * e o restante est� vazio (�ndices).
		 * Esse solu��o s� foi poss�vel pois sabia-se previamente o n�mero mais alto
		 * dentre os 3 'quartos' a serem alugados.
		 */
		
		Rent[] vect3 = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		int r = sc.nextInt();
		
		for(int i = 1; i <= r; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect3[room] = new Rent(name, email);			
		}		
		
		System.out.println();
		System.out.println("Busy rooms:");
		for(int i = 0; i < 10; i++) {
			if(vect3[i] != null) {
				System.out.println(i + ": " + vect3[i]);
			}
		}
		
		
		/*
		 * Fa�a um programa que leia um n�mero inteiro positivo N (m�ximo = 10) 
		 * e depois N n�meros inteiros e armazene-os em um vetor. 
		 * Em seguida, mostrar na tela todos os n�meros negativos lidos.
		 */
		
		
		System.out.println("QuantOs numero voce vai digitar? ");
		int n4 = sc.nextInt();
		
		int[] vect4 = new int[n4];
		
		for(int i = 0; i < n4; i++) {
			System.out.print("Digite um n�mero: ");
			vect4[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS:");
		for(int i = 0; i < vect4.length; i++) {
			if(vect4[i] < 0) {				
				System.out.println(vect4[i]);
			}
		}
		
		/*
		 * Fa�a um programa que leia N n�meros reais e armazene-os em um vetor. 
		 * Em seguida: 
		 * - Imprimir todos os elementos do vetor 
		 * - Mostrar na tela a soma e a m�dia dos elementos do vetor
		 * corrigido
		 */
		
		System.out.print("QuantOs numero voce vai digitar? ");
		int n5 = sc.nextInt();	
		
		double[] vect5 = new double[n5];
		
				
		for(int i = 0; i < n5; i++) {
			System.out.print("Digite um n�mero: ");
			vect5[i] = sc.nextDouble();		
		}
		
		double soma5, media5;
		
		soma5 = 0;
		
		for(int i = 0; i < vect5.length; i++) {
			soma5 += vect5[i];
		}
		
		media5 = soma5 / vect5.length;
		
		System.out.print("VALORES = ");
		for(int i = 0; i < vect5.length; i++) {
			System.out.printf("%.1f ", vect5[i]);			
		}	
		System.out.printf("\nSOMA = %.2f\n", soma5);
		System.out.printf("MEDIA = %.2f\n", media5);
		
		/*
		 * Fazer um programa para ler nome, idade e altura de N pessoas, 
		 * conforme exemplo. Depois, mostrar na tela a altura m�dia das pessoas, 
		 * e mostrar tamb�m a porcentagem de pessoas com menos de 16 anos, 
		 * bem como os nomes dessas pessoas caso houver. - corrigido
		 */
		
		System.out.print("Quantas pessoas ser�o registradas? ");
		int n6 = sc.nextInt();
		
		Pessoa[] pessoas6 = new Pessoa[n6];
		
		for(int i = 1; i <= n6; i++) {
			System.out.println();
			System.out.printf("Dados da %da pessoa:\n", i);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.next();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			pessoas6[i-1] = new Pessoa(name, age, height);	
			System.out.println();
		}
		
		double alturaMedia6 = 0;
				
		for(int i = 0; i < pessoas6.length; i++) {
			alturaMedia6 += pessoas6[i].getHeight(); 
		}
		
		alturaMedia6 /= (double) pessoas6.length; 
		
		System.out.printf("Altura m�dia: %.2f%n", alturaMedia6);
		
		double menorDe16 = 0;
		
		for(int i = 0; i < pessoas6.length; i++) {
			if(pessoas6[i].getAge() < 16) {	
				menorDe16++;
			}
		}						
		
		menorDe16 = ((double) menorDe16 / pessoas6.length) * 100.0;
		
		System.out.println("Pessoas com menos de 16 anos: " + menorDe16 + "%");

		for(int i = 0; i < pessoas6.length; i++) {
			if(pessoas6[i].getAge() < 16) {				
				System.out.println(pessoas6[i].getName());
			}
		}
		
		/*
		 * Fa�a um programa que leia N n�meros inteiros e armazene-os em um vetor. 
		 * Em seguida, mostre na tela todos os n�meros pares, e tamb�m a quantidade de
		 * n�meros pares. - corrigido
		 */
		
		int n7, qntdPares7;  
		
		System.out.print("Quantos numeros voc� vai digitar? ");
		n7 = sc.nextInt();
		
		int[] numeros7 = new int[n7];
		
		for(int i = 0; i < n7; i++) {
			System.out.print("Digite um numero: ");
			numeros7[i] = sc.nextInt();			
		}
		
		System.out.println("\nNUMEROS PARES:");
		
		qntdPares7 = 0;		
		for(int i = 0; i < numeros7.length; i++) {
			if(numeros7[i] % 2 == 0) {
				System.out.printf("%d ", numeros7[i]);
				qntdPares7++;
			}
		}
		
		System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", qntdPares7);	
		
		/*
		 * Fa�a um programa que leia N n�meros reais e armazene-os em um vetor. Em
		 * seguida, mostrar na tela o maior n�mero do vetor (supor n�o haver empates).
		 * Mostrar tamb�m a posi��o do maior elemento, considerando a primeira posi��o
		 * como 0 (zero). - corrigido
		 */
			
		
		int n8, posMaior8;
		double maior8;
		
		System.out.print("Quantos numeros voc� vai digitar? ");
		n8 = sc.nextInt();
		
		double[] vetor8 = new double[n8];
		
		for(int i = 0; i < n8; i++) {
			System.out.print("Digite um n�mero: ");
			vetor8[i] = sc.nextDouble();
		}
		
		maior8 = vetor8[0];
		posMaior8 = 0;
				
		for(int i = 0; i < vetor8.length; i++) {
			if(vetor8[i] > maior8) {
				maior8 = vetor8[i];
				posMaior8 = i;
			}
		}
		
		System.out.println();
		System.out.printf("MAIOR VALOR = %.1f\n", maior8);
		System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posMaior8);

		
		/*
		 * Fa�a um programa para ler dois vetores A e B, contendo N elementos cada. Em
		 * seguida, gere um terceiro vetor C onde cada elemento de C � a soma dos
		 * elementos correspondentes de A e B. Imprima o vetor C gerado. - ok
		 */
			
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n9 = sc.nextInt();
		
		int[] vetorA = new int[n9];
		int[] vetorB = new int[n9];
		int[] vetorC = new int[n9];
		
		System.out.println("Digite os valores do vetor A:");
		for(int i = 0; i < n9; i++) {
			vetorA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for(int i = 0; i < n9; i++) {
			vetorB[i] = sc.nextInt();
		}
				
		System.out.println("VETOR RESULTANTE:");
		for(int i = 0; i < n9; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
			System.out.println(vetorC[i]);
		}
		
		/*
		 * Fazer um programa para ler um n�mero inteiro N e depois um vetor de N n�meros
		 * reais. Em seguida, mostrar na tela a m�dia aritm�tica de todos elementos com
		 * tr�s casas decimais. Depois mostrar todos os elementos do vetor que estejam
		 * abaixo da m�dia, com uma casa decimal cada. - ok
		 */
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n10 = sc.nextInt();
		
		double[] vetor10 = new double[n10];
		
		double media10, soma10;
		
		for(int i = 0; i < n10; i++) {
			System.out.print("Digite um n�mero: ");
			vetor10[i] = sc.nextDouble();
		}
			
		soma10 = 0.0;
		for(int i = 0; i < vetor10.length; i++) {			
			soma10 += vetor10[i];
		}
		
		media10 = (double) soma10 / vetor10.length;
		
		System.out.println();
		System.out.printf("MEDIA DO VETOR = %.3f%n", media10);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for(int i = 0; i < vetor10.length; i++) {
			if(vetor10[i] < media10) {
				System.out.printf("%.1f%n", vetor10[i]);
			}
		}
		
		/*
		 * Fazer um programa para ler um vetor de N n�meros inteiros. Em seguida,
		 * mostrar na tela a m�dia aritm�tica somente dos n�meros pares lidos, com uma
		 * casa decimal. Se nenhum n�mero par for digitado, mostrar a mensagem
		 * "NENHUM NUMERO PAR" - ok
		 */
		
		double media11;
		int n11, soma11, qtdPares11;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n11 = sc.nextInt();
		
		int[] vetor11 = new int[n11];
				
		for(int i = 0; i < n11; i++) {
			vetor11[i] = sc.nextInt();			
		}
		
		soma11 = 0;
		qtdPares11 = 0;
		for(int i = 0; i < vetor11.length; i++) {
			if(vetor11[i] % 2 == 0) {
				soma11 += vetor11[i];
				qtdPares11++;
			}
		}		
		
		if(soma11 > 0) {
			media11 = soma11 / qtdPares11;
			System.out.printf("MEDIA DOS PARES = %.1f%n", media11);
		}else {
			System.out.println("NENHUM NUMERO PAR");
		}
		
		
		/*
		 * Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas
		 * idades. Os nomes devem ser armazenados em um vetor, e as idades em um outro
		 * vetor. Depois, mostrar na tela o nome da pessoa mais velha. - corrigido
		 */
			
		int n12, idadeMaior12;
		String posMaior12;
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		n12 = sc.nextInt();
		
		String[] nomes12 = new String[n12];		
		int[] idades12 = new int[n12];
		
		for(int i = 0; i < n12; i++) {
			System.out.printf("Dados da %da pessoa: %n", i + 1);
			System.out.print("Nome: ");
			nomes12[i] = sc.next();
			System.out.print("Idade: ");
			idades12[i] = sc.nextInt();			
		}
		
		idadeMaior12 = 0;
		posMaior12 = nomes12[0];
		
		for(int i = 0; i < n12; i++) {
			if(idadeMaior12 < idades12[i]) {
				idadeMaior12 = idades12[i];
				posMaior12 = nomes12[i];
			}
		}
				
		System.out.println("PESSOA MAIS VELHAS: " + posMaior12);
		
		
		/*
		 * Fazer um programa para ler um conjunto de N nomes de alunos, bem como as
		 * notas que eles tiraram no 1� e 2� semestres. Cada uma dessas informa��es deve
		 * ser armazenada em um vetor. Depois, imprimir os nomes dos alunos aprovados,
		 * considerando aprovados aqueles cuja m�dia das notas seja maior ou igual a 6.0
		 * (seis). - corrigido
		 */
		
		int n13;
		double media13;
		
		System.out.print("Quantos alunos serao digitados? ");
		n13 = sc.nextInt();
		
		String[] alunos13 = new String[n13];
		double[] notas113 = new double[n13];
		double[] notas213 = new double[n13];
		
		for(int i = 0; i < n13; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i + 1);
			sc.nextLine();
			alunos13[i] = sc.nextLine();
			notas113[i] = sc.nextDouble();
			notas213[i] = sc.nextDouble();
		}
		
				
		for(int i = 0; i < n13; i++) {
			media13 = (notas113[i] + notas213[i]) / 2;
			if(media13 >= 6.0) {
				System.out.println(alunos13[i]);
			}
		}
							
		
		/*
		 * Tem-se um conjunto de dados contendo a altura e o g�nero (M, F) de N pessoas.
		 * Fazer um programa que calcule e escreva a maior e a menor altura do grupo, a
		 * m�dia de altura das mulheres, e o n�mero de homens. - corrigido
		 */
		
		
		/*
		 * Boxing, unboxing, wrapper classes
		 * 
		 * - Boxing � o processo de convers�o de um objeto tipo valor para um objeto
		 * tipo refer�ncia compat�vel
		 * 
		 * int x = 20; 
		 * Object obj = x;
		 * 
		 * Object � a classe mais gen�rica do Java, todas as classes por padr�o s�o
		 * 'filhas' dessa classe object. No caso acima, x passa a ser do tipo object e
		 * ser� alocado um objeto no heap contendo o valor 20 e a vari�vel obj ser�
		 * ponteiro para essa aloca��o.
		 * 
		 * - Unboxing � o processo de convers�o de um objeto tipo refer�ncia para um
		 * objeto tipo valor compat�vel
		 * 
		 * int y = (int) obj;
		 * 
		 * Ser� criada no stack uma aloca��o y tipo valor com valor 20
		 * 
		 * - Wrapper classes 
		 * S�o classes equivalentes aos tipos primitivos, para que
		 * boxing e unboxing seja feito de forma natural na linguagem. Para cada tipo
		 * primitivo, ele tem um tipo classe compat�vel com o mesmo tipo - 
		 * Exemplo:
		 * int(primitivo) = Integer(classe), 
		 * boolean(primitivo) = Boolean(classe),
		 * char(primitivo) = Character(classe), 
		 * byte(primitivo) = Byte(classe). 
		 * Elas tem o objetivo de tratar os tipos primitivos como classes, de forma transparente
		 * ao compilador, evitando convers�es e castings. Uso comum de wrapper classes:
		 * campos de entidade em sistemas de informa��o (IMPORTANTE!) - pois tipos
		 * refer�ncia (classes) aceitam valor null e usufruem dos recursos OO
		 * 
		 * Sem wrapper 
		 * class int x = 20; 
		 * Object obj = x; 
		 * int y = (int) obj;
		 * 
		 * Com wrapper 
		 * class int x = 20; 
		 * Integer obj = x; 
		 * int y = obj;
		 * 
		 * Utilizar em atributos de classes e declara��o de vari�veis
		 */
		
		/* La�o "for each" 
		 * Sintaxe opcional e simplificada para percorrer cole��es
		 * 
		 * Sintaxe:
		 * for (Tipo apelido : cole��o){
		 *		<comando 1>
		 *		<comando 2>
		 * }
		 */

//		String[] vect = new String[]{"Maria", "Bob", "Joao"};
//		
//		System.out.println("la�o for");
//		
//		//la�o for
//		for(int i = 0; i < vect.length; i++) {
//			System.out.println(vect[i]);
//		}
//		
//		System.out.println("---------------------------");
//		
//		System.out.println("la�o for each");
//		
//		//la�o for each
//		for(String obj : vect) {
//			System.out.println(obj);
//		}
		
		/*
		 * Listas 
		 * - Conceito de lista: � uma estrutura de dados homog�nea (dados do
		 * mesmo tipo), ordenada (elementos acessados por meio de posi��es), inicia
		 * vazia, e seus elementos s�oa locados sob demanda, cada elemento ocupa um "n�"
		 * (ou nodo) da lista 
		 * - Tipo (interface): List (! n�o � classe, � interface) ->
		 * interface � um tipo que define apenas as especifica��es das opera��es. 
		 * - Classes que implementam: ArrayList(mistura de vetor e lista), LinkedList,
		 * etc. -> utilizadas para implementar a interface List, pois ela sozinha n�o
		 * pode ser implementada pois n�o � classe. 
		 * - Vantagens: tamanho vari�vel,facilidade para se realizar inser��es e dele��es 
		 * - Desvantagens: acesso sequencial aos elementos* -> dependendo da implementa��o da lista, a navega��o
		 * � otimizada, como � o caso de ArrayList 
		 * Demo: 
		 * - Tamanho da lista: size() 
		 * - Inserir elemento na lista: add(obj), add(int, obj) 
		 * - Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate) 
		 * - Encontrar posi��o de elemento: indexOf(obj), lastIndexOf(obj) 
		 * - Filtrar lista com base em predicado: 
		 * List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList()); 
		 * - Encontrar primeira ocorr�ncia com base em predicado: 
		 * Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);
		 * - Assuntos pendentes: interfaces, generics, predicados (lambda)
		 */
		
		//List n�o aceita tipos primitivos, como int, char, etc
		//<Integer> � o generics, quando pode parametrizar a defini��o de um tipo informando um outro tipo espec�fico
		//= new ArrayList<>(); � a classe que implementa a interface List
//		List<String> list = new ArrayList<>();
		
		//adicionando itens a lista
//		list.add("Maria");
//		list.add("Ana");
//		list.add("Bob");
//		list.add("Joao");
//		//adiciona elemento em uma posi��o espec�fica
//		list.add(2, "Marco");
		
		//consultar tamanho da lista
//		System.out.println("Tamanho da lista: " + list.size());
		
		//percorrendo e imprimindo a lista
//		for(String x : list) {
//			System.out.println(x);
//		}
		
		//removendo da lista
			//list.remove("Ana");
			//list.remove(3);
//		System.out.println("--------------------");
		//removendo da lista por predicado atr�ves de fun��o lambda (que retorna true or false)
		//remove todos os itens que o primeiro caractere � M - "x -> x.charAt(0) == 'M'" � uma fun��o lambda
//		list.removeIf(x -> x.charAt(0) == 'M');
//		
//		for(String x : list) {
//			System.out.println(x);
//		}
//		System.out.println("--------------------");
		//encontrando a posi��o de um elemento
//		System.out.println("index of Bob: " + list.indexOf("Bob"));
		//encontrando a posi��o de um elemento que n�o existe
//		System.out.println("index of Felix: " + list.indexOf("Felix"));
//		System.out.println("--------------------");
		//filtrar a lista por predicado
		//Uma nova lista ir� receber os resultados filtrados de list; list por sua vez deve ser convertido em stream para poder filtrar pela opera��o lambda e depois o stream � convertido em lista novamente atrav�s do collect e retorna o resultado para a nova lista 
//		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
//		for(String x : result) {
//			System.out.println(x);
//		}
//		System.out.println("--------------------");
		//encontrar elemento da lista que atenda a um certo predicado
		//a lista ser� filtrada para encontrar o primeiro elemento que tenha a letra 'A' e ser� armzenada na vari�vel name, se o elemento n�o exisitr, ele retorna nulo
//		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
//		System.out.println(name);
//		System.out.println("--------------------");
//		
//		String name2 = list.stream().filter(x -> x.charAt(0) == 'L').findFirst().orElse(null);
//		System.out.println(name2);
		
		/*
		 * Fazer um programa para ler um n�mero inteiro N e depois os dados (id, nome e salario)
		 * de N funcion�rios. N�o deve haver repeti��o de id.
		 * Em seguida, efetuar o aumento de x por ceno no sal�rio de um determinado funcion�rio.
		 * Para isso, o programa deve ler um id e o valor X. Se o id informado n�o existir,
		 * mostrar uma mensagem e abortar a opera��o. Ao final, mostrar a listagem atualizada
		 * dos funcion�rios, conforme exemplos.
		 * Lembre-se de aplicar a t�cnica de encapsulamento para n�o permitr que o sal�rio possa
		 * ser mudado livremente. Um sal�rio s� pode ser aumentado com base em uma opera��o
		 * de aumento por porcentagem dada.
		 */
		

//		List<EmployeeList> list = new ArrayList<EmployeeList>();
//		
//		System.out.print("How many employees will be registered? ");
//		int n = sc.nextInt();
//				
//		for (int i = 0; i < n; i++) {
//			System.out.println();
//			System.out.printf("Employee #%d:\n", i + 1);
//			System.out.print("Id:");
//			Integer id = sc.nextInt();
//			System.out.print("Name:");
//			sc.nextLine();
//			String name = sc.nextLine();
//			System.out.print("Salary:");
//			Double salary = sc.nextDouble();
//			
//			EmployeeList funcionario = new EmployeeList(id, name, salary);
//			
//			list.add(funcionario);
//		}
//		
//		System.out.println();
//		System.out.print("Enter the employee id that will have salary increase: ");
//		int idSalary = sc.nextInt();
//		
//		Integer pos = position(list, idSalary);
//		if(pos == null) {
//			System.out.println("This id does not exist!");
//		}else {
//			System.out.print("Enter the percentage: ");
//			double percent = sc.nextDouble();
//			list.get(pos).increaseSalary(percent);
//		}
//		
//		System.out.println();
//		System.out.println("List of employees: ");
//		
//		for(EmployeeList emp : list) {
//			System.out.println(emp);
//		}
		
		// Matrizes
		
		/*- Conceito de matriz: nome dado a arranjos (array) bidimensionais - linhas (1� indice) e colunas (2� indice) - 
		 * (ao contr�rio do vetor, que seria um arranjo unidimensional) - "vetor de vetores"; 
		 * Assim como todo array, ele � uma estrutura de dados homog�nea, ordenada e � alocada de uma vez s�, em um bloco cont�guo de mem�ria.
		 * - Vantagens: acesso imediato aos elementos pela sua posi��o.
		 * - Desvantagens: tamanho fixo e dificuldade para se realizar inser��es e dele��es
		 */
		
		/*
		 * Fazer um programa para ler um n�mero inteiro N e uma matriz de ordem N
		 * contendo n�meros inteiros. Em seguida, mostrar a diagonal principal e a
		 * quantidade de valores negativos da matriz.
		 * ------------
		 * ENTRADA:
		 * 3
		 * 5 -3 10
		 * 15 8 2
		 * 7 9 -4
		 * ------------
		 * SA�DA:
		 * Main diagonal:
		 * 5 8 -4
		 * Negative numbers = 2 
		 * -------------
		 */
		
//		int n = sc.nextInt();
		//numero de colchetes de acordo com a dimens�o (uni, bi, tri..)
//		int[][] mat = new int[n][n];
//		
//		for(int i = 0; i < mat.length; i++) {
//			for(int j = 0; j < mat[i].length; j++) {
//				mat[i][j] = sc.nextInt();
//			}
//		}
//		
//		System.out.println("Main diagonal:");
//		for(int i = 0; i < n; i++) {
//			System.out.print(mat[i][i] + " ");
//		}
//		System.out.println();
//		
//		int count = 0;
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < n; j++) {
//				if(mat[i][j] < 0) {
//					count++;
//				}
//			}
//		}
//		System.out.println("Negative numbers = " + count);
		
		/*
		 * Fazer um programa para ler dois n�meros inteiros M e N, e depois ler
		 * uma matriz M linhas por N colunas contendo n�meros inteiros, podendo haver
		 * repeti��es. Em seguida, ler um n�mero inteiro X que pertence � matriz.
		 * Para casa ocorr�ncia de X, mostrar os valores � esquerda, acima, � direita e 
		 * abaixo de X, quando houver, conforme exemplo. - corrigido
		 * ---------------
		 * ENTRADA
		 * 3 4 
		 * 10 8 15 12
		 * 21 11 23 8
		 * 14 5 13 19
		 * 8
		 * ---------------
		 * SA�DA
		 * Position 0,1:
		 * Left: 10
		 * Right: 15
		 * Down: 11
		 * Position 1,3:
		 * Left: 23
		 * Up: 12
		 * Down: 19
		 */
		
//		int m = sc.nextInt();
//		int n = sc.nextInt();
//		
//		int[][] mat = new int[m][n];
//		
//		for(int i = 0; i < mat.length; i++) {
//			for(int j = 0; j < mat[i].length; j++) {
//				mat[i][j] = sc.nextInt();
//			}
//		}
//		
//		int x = sc.nextInt();
//		//int posX = 0;
//		//int posY = 0;
//		for(int i = 0; i < mat.length; i++) {
//			for(int j = 0; j < mat[i].length; j++) {
//				if(mat[i][j] == x) {
//					//posX = i;
//					//posY = j;
//					System.out.println("Position " + i + "," + j + ":");
					//if(i == 0 && j > 0 && j < mat[i].length) {						
						//System.out.println("Left: " + mat[posX][posY - 1]);
						//System.out.println("Right: " + mat[posX][posY + 1]);
						//System.out.println("Down: " + mat[posX + 1][posY]);
					//}else if(i == 0 && j == 0) {
						//System.out.println("Right: " + mat[posX][posY + 1]);
						//System.out.println("Down: " + mat[posX + 1][posY]);						
					//}else if(i > 0 && j == mat[i].length ) {
						//System.out.println("Left: " + mat[posX][posY - 1]);
						//System.out.println("Down: " + mat[posX + 1][posY]);						
					//}else if(i > 0 && i < mat.length && j > 0 && j < mat[i].length) {
						//System.out.println("Up: " + mat[posX - 1][posY]);
						//System.out.println("Left: " + mat[posX][posY - 1]);
						//System.out.println("Right: " + mat[posX][posY + 1]);
						//System.out.println("Down: " + mat[posX + 1][posY]);
					//}else if(i > 0 && i < mat.length && j == mat[i].length) {
						//System.out.println("Up: " + mat[posX - 1][posY]);
						//System.out.println("Left: " + mat[posX][posY - 1]);
						//System.out.println("Down: " + mat[posX + 1][posY]);
					//}else if(i > 0 && i < mat.length && j == 0) {
						//System.out.println("Up: " + mat[posX - 1][posY]);
						//System.out.println("Right: " + mat[posX][posY + 1]);
						//System.out.println("Down: " + mat[posX + 1][posY]);
					//}else if(i == mat.length && j == mat[i].length){
						//System.out.println("Up: " + mat[posX - 1][posY]);
						//System.out.println("Left: " + mat[posX][posY - 1]);
					//}	
//					if(j > 0) {
//						System.out.println("Left: " + mat[i][j - 1]);
//					}
//					if(i > 0) {
//						System.out.println("Up: " + mat[i - 1][j]);
//					}
//					if(j < mat[i].length-1) {
//						System.out.println("Right: " + mat[i][j + 1]);
//					}
//					if(i < mat.length-1) {
//						System.out.println("Down: " + mat[i+1][j]);
//					}
//				}
//			}
//		}
		
		// Opera��es data-hora
		
		//cria objeto modelo para formatar data
//		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		//withZone(ZoneId.systemDefault())recupera o fuso hor�rio do computador do usu�rio e o horario argumento ser� convertido para 
//		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		//formato ISO
//		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
//		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		//Instancia��o - agora
		
		//data local
//		LocalDate d01 = LocalDate.now();
//		System.out.println("d01 = " + d01);
		
		//data-hora local
//		LocalDateTime d02 = LocalDateTime.now();
//		System.out.println("d02 = " + d02);
		
		//data-hora global (GMT/Z/UTC - Londres)
//		Instant d03 = Instant.now();
//		System.out.println("d03 = " + d03);
		
		//Instancia��o - ISO 8601
		
//		LocalDate d04 = LocalDate.parse("2021-08-15");
//		System.out.println("d04 = " + d04);
		//exemplos de formata��o
//		System.out.println("d04 = " + d04.format(fmt1));
//		System.out.println("d04 = " + fmt1.format(d04));
//		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
//		LocalDateTime d05 = LocalDateTime.parse("2021-08-15T01:30:26");
//		System.out.println("d05 = " + d05);
		//exemplos de formata��o
//		System.out.println("d05 = " + d05.format(fmt1));
//		System.out.println("d05 = " + d05.format(fmt2));
//		System.out.println("d05 = " + d05.format(fmt4));
		
//		Instant d06 = Instant.parse("2021-08-15T01:30:26Z");
//		System.out.println("d06 = " + d06);
		//exemplos de formata��o
		//Instant n�o aceita .format direto
//		System.out.println("d06 = " + fmt3.format(d06));
//		System.out.println("d06 = " + fmt5.format(d06));

		// ERRO - Exception "could not be parsed"
		//Instant d07 = Instant.parse("2021-08-15T01:30:26-03:00");
		//System.out.println("d07 = " + d07);
		
		//Instancia��o - Texto customizado (DateTimeFormatter)
		
//		LocalDate d08 = LocalDate.parse("15/08/2021", fmt1);
//		System.out.println("d08 = " + d08);

		// ERRO - n�o aparece hor�rio
//		LocalDate d09 = LocalDate.parse("15/08/2021 01:30", fmt2);
//		System.out.println("d09 = " + d09);
//		
//		LocalDate d10 = LocalDate.parse("15/08/2021", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//		System.out.println("d10 = " + d10);
//		
//		LocalDate d11 = LocalDate.of(2022, 7, 20);
//		System.out.println("d11 = " + d11);
//		
//		LocalDateTime d12 = LocalDateTime.of(2021, 8 , 15, 1, 30);
//		System.out.println("d12 = " + d12);
		
		
		//la�o mostra todos os fusos hor�rios dispon�veis
//		System.out.println("\n---------- FUSO HOR�RIOS: ----------");
//		for(String s : ZoneId.getAvailableZoneIds()) {			
//			System.out.println(s);
//		}
		
		//converter data-hora global para local		
		//converte o obj d06 para uma data-hora local considerando o fuso hor�rio da maquina atual
//		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());		
//		System.out.println(r1);
		//converte o obj d06 para uma data-hora local considerando o fuso hor�rio como argumento
//		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));		
//		System.out.println(r2);
		
//		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
//		System.out.println(r3);
//		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
//		System.out.println(r4);
		
		//obter dados de uma data-hora local
//		System.out.println("d04 dia = " + d04.getDayOfMonth());
//		System.out.println("d04 mes = " + d04.getMonthValue());
//		System.out.println("d04 ano = " + d04.getYear());
//		System.out.println("d04 dia do ano = " + d04.getDayOfYear());
//		
//		System.out.println("d05 hora = " + d05.getHour());
//		System.out.println("d05 minuto = " + d05.getMinute());
		
		//calculos com data-hora
		
//		LocalDate d13 = LocalDate.parse("2024-06-03");
//		LocalDateTime d14 = LocalDateTime.parse("2024-06-03T16:27:15");
//		Instant d15 = Instant.parse("2024-06-03T16:27:15Z");
//		
//		LocalDate pastWeekLocalDate = d13.minusDays(7);
//		LocalDate nextWeekLocalDate = d13.plusDays(7);
//		LocalDate yearsLocalDate = d13.plusYears(7);
//		
//		System.out.println("a week ago = " + pastWeekLocalDate);
//		System.out.println("next week = " + nextWeekLocalDate);
//		System.out.println("in 7 years = " + yearsLocalDate);
//		
//		LocalDateTime pastWeekLocalDateTime = d14.minusDays(7);
//		LocalDateTime nextWeekLocalDateTime = d14.plusDays(7);
//		LocalDateTime yearsLocalDateTime = d14.plusYears(7);
//		
//		System.out.println("a week ago = " + pastWeekLocalDateTime);
//		System.out.println("next week = " + nextWeekLocalDateTime);
//		System.out.println("in 7 years = " + yearsLocalDateTime);
//		
//		Instant pastWeekInstant  = d15.minus(7, ChronoUnit.DAYS);
//		Instant nextWeekInstant = d15.plus(7, ChronoUnit.DAYS);
//		
//		System.out.println("a week ago = " + pastWeekInstant);
//		System.out.println("next week = " + nextWeekInstant);
		
		//dura��o - deve ser calculada entre mesmos tipos (! obrigatorio ser LocalDateTime - n�o LocalDate, ou, converter por para horas (atTime() ou similar))
//		Duration t1 = Duration.between(pastWeekLocalDate.atTime(0, 0), d13.atTime(0, 0));
//		System.out.println("t1 days = " + t1.toDays());
//		
//		Duration t2 = Duration.between(pastWeekLocalDateTime, d14);
//		System.out.println("t2 days = " + t2.toDays());
//		
//		Duration t3 = Duration.between(pastWeekInstant, d15);
//		System.out.println("t3 days = " + t3.toDays());
		
		//quando a primeira dara � maior que a segunda, o resultado � negativo
//		Duration t4 = Duration.between(d15, pastWeekInstant);
//		System.out.println("t4 days = " + t4.toDays());
		
		//enumera��es, composi��o
		
		//utilizando classe que utiliza enum como atributo
//		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);		
//		System.out.println(order);
		
		//convers�o de string para enum - ambos ser�o o mesmo valor enum caso a escrita esteja correta
		
//		OrderStatus os1 = OrderStatus.DELIVERED;		
//		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
//		
//		System.out.println(os1);
//		System.out.println(os2);
		
		//Nota��o UML para enum
		
		/*
		-----------------------
		<<enum>>
		OrderStatus
		-----------------------
		PENDING_PAYMENT: int = 0
		PROCESSING: int = 1
		SHIPPED: int = 2
		DELIVERED: int = 3
		-----------------------
		*/
		
		//design
		
		/* - Categoria de classes: em um sistema orientado a objetos, 
		 * de modo geral "tudo" � objeto.
		 * - Por quest�es de design tais como organiza��o, flexibilidade, reuso, 
		 * delega��o, etc. h� v�rias categorias de classes: 
		 * Views - telas/front
		 * Controllers - mediador entre view e sistema
		 * Entities - classes entidades do neg�cio
		 * Services - classes servi�os do neg�cio
		 * Repositories - objetos respons�veis por acessar DB
		 */
		
		//composi��o
		
		/* - � um tipo de associa��o que permite que um objeto contenha outro
		 * - Rela��o "tem-um" ou "tem-v�rios"
		 * - Vantagens: Organiza��o (divis�o de responsabilidades), coes�o, 
		 * flexibilidade, reuso
		 * - Nota: embora o s�mbolo UML para composi��o (todo-parte) seja o diamante preto, 
		 * neste contexto estamos chamando de composi��o qualquer associa��o tipo "tem-um" e 
		 * "tem-v�rios"
		 */
		
		//Exercicio 1 - resolvido (https://github.com/acenelio/composition1-java)
		
		/* Ler os dados de um trabalhador com N contratos (N fornecido pelo usu�rio). 
		 * Depois, solicitar do usu�rio um m�s e mostrar qual foi o sal�rio do funcion�rio
		 * nesse m�s, conforme exemplo
		 */	
		
//		System.out.print("Enter department's name: ");
//		String departmentName = sc.nextLine();
//		System.out.print("Enter worker data: ");
//		String workerName = sc.nextLine();
//		System.out.print("Enter worker level: ");
//		String workerLevel = sc.nextLine();
//		System.out.print("Base salary: ");
//		double baseSalary = sc.nextDouble();
		
		//WorkerLevel.valueOf(workerLevel) => para equiparar a string digitada a variavel da enumera��o
		//new Department(departmentName) => foi instanciada pois esse argumento trata-se de outro objeto, recebendo a string digitada
		//na mem�ria, criam-se 2 objetos relacionados: worker e department
//		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		
//		System.out.print("How many contracts to this worker? ");
//		int n = sc.nextInt();
		
		//mascara para data
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
						
//		for(int i = 1; i <= n; i++) {
//			System.out.println("Enter contract #" + i + " data: ");
//			System.out.print("Date (DD/MM/YYYY): ");
//			Date contractDate = sdf.parse(sc.next());
//			System.out.print("Value per hour: ");
//			double valuePerHour = sc.nextDouble();
//			System.out.print("Duration (hours): ");
//			int hours = sc.nextInt();
//			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
//			worker.addContract(contract);
//		}
//		
//		System.out.println();
//		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
//		String monthAndYear = sc.next();
		//recebe a data monthAndYear em string, depois recorta o que diz respeito ao m�s e armazena convertendo para int; o mesmo se repete para o ano
//		int month = Integer.parseInt(monthAndYear.substring(0, 2));
//		int year = Integer.parseInt(monthAndYear.substring(3));
//		
//		System.out.println("Name: " + worker.getName());
//		System.out.println("Department: " + worker.getDepartment().getName());
//		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		//Exercicio 2 - resolvido (https://github.com/acenelio/composition2-java)
		
		/*
		 * Instancie manualmente (hard code) os objetos mostrados abaixo e mostre-os na tela do terminal, 
		 * conforme exemplo
		 */
		
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//		
//		Comment c1 = new Comment("Have a nice trip");
//		Comment c2 = new Comment("Wow that's awesome!");
//		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);
//		
//		p1.addComment(c1);
//		p1.addComment(c2);
//		
//		System.out.println(p1);
//		
//		Comment c3 = new Comment("Good night");
//		Comment c4 = new Comment("May the force be with you");
//		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys", "See you tomorrow", 5);
//		
//		p2.addComment(c3);
//		p2.addComment(c4);
//		
//		System.out.println(p2);
		
		//Exercicio de fixa��o (https://github.com/acenelio/composition3-java)
		
		/*
		 * Ler os dados de um pedido com N itens (N fornecido pelo usu�rio). Depois, mostrar um sum�rio 
		 * do pedido conforme exemplo. Nota: o instante do pedido deve ser o instante do sistema: new Date();
		 */
		
//		SimpleDateFormat maskDate = new SimpleDateFormat("dd/MM/yyyy");
//		
//		
//		System.out.println("Enter client data:");
//		System.out.print("Name: ");
//		String name = sc.nextLine();
//		System.out.print("Email: ");
//		String email = sc.nextLine();
//		System.out.print("Birth date (DD/MM/YYYY): ");
//		Date birthDate = maskDate.parse(sc.next());
//		
//		Client client = new Client(name, email, birthDate);
//		
//		System.out.println("Enter order data: ");
//		System.out.print("Status: ");
//		sc.nextLine();
//		OrderStatus status = OrderStatus.valueOf(sc.next());
//		
//		OrderShop order = new OrderShop(new Date(), status, client);
//		
//		System.out.print("How many items to this order ? ");	
//		int n = sc.nextInt();
//								
//		for(int i = 1; i <= n; i++) {
//			System.out.println("Enter #" + i + " item data:");
//			System.out.print("Product name: ");
//			sc.nextLine();
//			String productName = sc.nextLine();
//			System.out.print("Product price: ");
//			double price = sc.nextDouble();
//			
//			ProductShop product = new ProductShop(productName, price);
//			
//			System.out.print("Quantity: ");
//			int qtd = sc.nextInt();
//			
//			OrderItem item = new OrderItem(qtd, price, product);	
//			
//			order.addItem(item);
//		}
//	
//		
//		System.out.println();
//		System.out.println("ORDER SUMMARY:");
//		System.out.println(order);
		
		//Heran�a - class Account e class BusinessAccount
		
		/*
		 * - � um tipo de associa��o que permite que uma classe herde todos dados e 
		 * comportamento de outra
		 * - Defini��es importantes
		 * - Vantagens: reuso e polimorfismo
		 * - Sintaxe: class A extends B
		 * - Rela��o "�-um" - no exemplo, a conta empresarial tamb�m � uma conta comum 
		 * quando extende a super classe
		 * - Generaliza��o/especializa��o - no exemplo, a conta comum � uma generaliza��o 
		 * e a conta empresarial � uma especializa��o
		 * - superclasse (classe base) / subclasse (classe derivada)
		 * - Heran�a/extens�o
		 * - Heran�a � uma associa��o entre classes (e n�o entre objetos)
		 * heran�a � associa��o entre classes e composi��o � associa��o entre objetos 
		 * - na mem�ria, a heran�a teria apenas um objeto com todos os atributos de ambas 
		 * as classes e na composi��o criam-se objetos distintos
		 * Heran�a permite o reuso de atributos e m�todos (dados e comportamento)
		 * 
		 * Exemplo na classe Account e BusinessAccount:
		 * suponha um neg�cio de banco que possui uma conta comum e uma conta para empresas,
		 * sendo que a conta para empresa possui todos membros da conta comum, mais um limite 
		 * de empr�stimo e uma opera��o de realizar empr�stimo.
		 * A classe conta comum ser� a super classe, que ser� extendida pela agora 
		 * subclasse conta para empresas e os atributos do construtor da super classe 
		 * ser�o atribuidos no construtor da subclasse atrav�s do m�todo super(); junto com
		 * qualquer outra atribui��o pr�pria 

		 */
		
		//Upcasting e Downcasting
		
		/*
		 * Upcasting: casting da subclasse para a superclasse; 
		 * Uso comum: polimorfismo
		 * 
		 * Downcasting: casting da superclasse para subclasse; 
		 * Palavra instaceof; 
		 * Uso comum: m�todos que recebem par�metros gen�ricos (ex: Equals)
		 * 
		 * Exemplo na classe Account, BusinessAccount e SavingsAccount:
		 */
		
//		Account acc = new Account(1001, "Bob", 0.0);
//		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING	- objeto da subclasse (bacc) sendo atribuido a objeto da superclasse (acc)
		//n�o � acusado erro nessa rela��o pois a heran�a � rela��o "�-um", tornando subclasse e superclasse um mesmo tipo
//		Account acc1 = bacc;
//		acc1.getBalance();	
//		
//		Account acc2 = new BusinessAccount(1003, "Jo�o", 0.0, 200.0);
//		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
		
		//DOWNCASTING - objeto da superclasse (acc2) sendo atribuido a objeto da subclasse (acc4)
		//para evitar erro, � necess�rio o casting manual
//		BusinessAccount acc4 = (BusinessAccount) acc2;
//		acc4.loan(100.0);
		
		//SIMULA��O DE ERRO
		//SavingsAccount N�O pode ser convertido para BusinessAccount
		//BusinessAccount acc5 = (BusinessAccount) acc3;
		
		/* ! subclasses distintas que estendem a mesma superclasse n�o podem se instanciar uma a outra */
		
		//TESTE - se acc3 recebe um objeto que seja instancia do tipo BusinessAccount, ele ent�o poder� realizar o casting
//		if(acc3 instanceof BusinessAccount) {
//			BusinessAccount acc5 = (BusinessAccount) acc3;
//			acc5.loan(200.0);
//			System.out.println("Loan");
//		}
//		
//		if(acc3 instanceof SavingsAccount) {
//			SavingsAccount acc5 = (SavingsAccount) acc3;
//			acc5.updateBalance();
//			System.out.println("Update");
//		}
		
		//Sobreposi��o ou sobrescrita
		
		/*
		 * � a implementa��o de um m�todo de uma superclasse na subclasse; � fortemente recomend�vel usar 
		 * a anota��o @Override em um m�todo sobrescrito - facilita a leitura e compreens�o do c�digo; 
		 * Avisamos ao compilador (boa pr�tica)
		 */
		
		/* Suponha que a opera��o de saque possui uma taxa no valor de 5.0. Entretanto, se a conta for do tipo
		 * poupan�a, esta taxa n�o deve ser cobrada.
		 * Para resolver, sobreescrevemos o m�todo withdraw na subclasse SavingsAccount
		 * 
		 */
		
		//m�todo withdraw original
//		Account acc1 = new Account(1001, "Bob", 1000.0);
//		acc1.withdraw(200.0);
//		System.out.println(acc1.getBalance());
		
		//Override do m�todo withdraw
//		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
//		acc2.withdraw(200.0);
//		System.out.println(acc2.getBalance());
		
		//Override do m�todo withdraw original c/ super
//		Account acc3 = new BusinessAccount(1003, "Jo�o", 1000.0, 500.0);
//		acc3.withdraw(200.0);
//		System.out.println(acc3.getBalance());
		
		//Polimorfismo
		
		/*
		 * Pilares da OOP:
		 * - Encapsulamento
		 * - Heran�a 
		 * - Polimorfismo
		 * Em programa��o orientada a objetos, polimorfismo � recurso que permite que vari�veis de um mesmo tipo mais 
		 * gen�rico possam apontar para objetos de tipos espec�ficos diferentes, tendo assim comportamentos diferentes 
		 * conforme cada tipo espec�fico.
		 * 
		 * No exemplo acima, haver�o objetos de tipos diferentes na mem�ria, mas as variaveis que apontam para esses 
		 * objetos s�o de um mesmo tipo.
		 */
		
//		Account x = new Account(1020, "Bob", 1000.0);
//		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
//
//		x.withdraw(50.0);
//		y.withdraw(50.0);
//		
//		System.out.println(x.getBalance());
//		System.out.println(y.getBalance());
		
		/* No exemplo acima, haver�o objetos de tipos diferentes na mem�ria, mas as variaveis que apontam para esses 
		 * objetos s�o de um mesmo tipo.
		 * 
		 * IMPORTANTE ENTENDER:
		 * - A associa��o do tipo espec�fico com o tipo gen�rico � feita em tempo de execu��o (upcasting).
		 * - O compilador n�o sabe para qual tipo espec�fico a chamada do m�todo Withdraw est� sendo feita (ele s�
		 * sabe que s�o duas vari�veis tipo Account);
		 */
		
		//Exerc�cio resolvido - polimorfismo (https://github.com/acenelio/inheritance4-java)
		
		/*
		 * Uma empresa possui funcionparios pr�prios e terceirizados. Para cada funcion�rio, deseja-se registrar nome,
		 * horas trabalhadas e valor por hora. Funcion�rios terceirizados possuem ainda uma despesa adicional.
		 * O pagamento dos funcion�rios corresponde ao valor da hora multiplicado pelas horas trabalhadas, sendo que 
		 * os funcion�rios terceirizados ainda recebem um bonus correspondente a 110% de sua despesa adicional.
		 * Fazer um programa para ler os dados de N funcion�rios (N fornecido pelo usu�rio) e armazen�-los em uma lista.
		 * Depois de ler todos os dados, mostrar nome e pagamento de casa funcion�rio na mesma ordem em que foram 
		 * digitados.
		 * Construa o programa conforme projeto UML (pdf)
		 * ----------------------
		 * Employee
		 * ----------------------
		 * - name: String
		 * - hours: Integer
		 * - valuePerHour: Double
		 * ----------------------
		 * + payment(): Double
		 * ----------------------
		 *  ^
		 * /_\
		 *  |
		 *  |
		 * ----------------------
		 * OutsourcedEmployee
		 * ----------------------
		 * - additionalCharge(): Double
		 * ---------------------
		 * 
		 */
		
//		List<Employee2> list = new ArrayList<>();
//		
//		System.out.print("Enter the number of employees: ");
//		int n = sc.nextInt();
//		
//		for(int i = 1; i <= n; i++) {
//			System.out.println("Employee #" + i + " data:");
//			System.out.print("Outsourced (y/n)? ");
//			char ch = sc.next().charAt(0);
//			System.out.print("Name: ");
//			sc.nextLine();
//			String name = sc.nextLine();
//			System.out.print("Hours: ");
//			int hours = sc.nextInt();
//			System.out.print("Value per hour: ");
//			double valuePerHour = sc.nextDouble();
//			if(ch == 'y') {
//				System.out.print("Additional charge: ");
//				double additionalCharge = sc.nextDouble();
//				//forma altenativa de adi��o a lista
////				Employee2 emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
////				list.add(emp);
//				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
//			}else {
////				Employee2 emp = new Employee2(name, hours, valuePerHour);
////				list.add(emp);
//				list.add(new Employee2(name, hours, valuePerHour));
//			}
//			
//		}
//		
//		System.out.println();
//		System.out.println("PAYMENTS:");
//		for(Employee2 emp : list) {
//			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
//		}
		
		/* No exerc�cio acima foi criada uma lista do tipo Employee2, mas a instancia de cada objeto pode ser tanto do tipo Employee2 quanto 
		 * do tipo OutsourcedEmployee; Quando � feita a chamada para imprimir o pagamento de cada objeto, o c�lculo
		 * vai se comporta de acordo com o tipo de cada objeto, tendo ent�o o polimorfismo.
		 *
		 */
		
		//Exerc�cio de fixa��o - polimorfismo (https://github.com/acenelio/inheritance5-java)
		
		/* Fazer um programa para ler os dados de N produtos (N fornecido pelo usu�rio). Ao final, mostar a etiqueta
		 * de pre�o de cada produto na mesma ordem em que foram digitados.
		 * Todo produto possui nome e pre�o. Produtos importados possuem uma taxa de alf�ndega, e produtos usados 
		 * possuem data de fabrica��o.
		 * Estes dados espec�ficos devem ser acrescentados na etiqueta de pre�o conforme exemplo. Para produtos
		 * importados, a taxa de alf�ndega deve ser acrescentada ao pre�o final do produto. Favor implementar programa
		 * conforme projeto UML.
		 * 
		 */
		
//		List<Product2> list = new ArrayList<>();
//		SimpleDateFormat maskDate = new SimpleDateFormat("dd/MM/yyyy");
//		
//		System.out.print("Enter the number of products: ");;
//		int n = sc.nextInt();
//		
//		for(int i = 1; i <= n; i++) {
//			System.out.printf("Product #%d data:\n", i);
//			System.out.print("Common, used or imported (c/u/i)? ");
//			char ch = sc.next().charAt(0);
//			System.out.print("Name: ");
//			sc.nextLine();
//			String name = sc.nextLine();
//			System.out.print("Price: ");
//			double price = sc.nextDouble();			
//			if(ch == 'i') {
//				System.out.print("Customs fee: ");
//				double customsFee = sc.nextDouble();
//				list.add(new ImportedProduct(name, price, customsFee));				
//			}else if(ch == 'u') {
//				System.out.print("Manufacture date (DD/MM/YYYY): ");
//				Date date = maskDate.parse(sc.next());
//				list.add(new UsedProduct(name, price, date));
//			}else {
//				list.add(new Product2(name, price));
//			}
//		}
//		
//		System.out.println();
//		System.out.println("PRICE TAGS:");
//		
//		for(Product2 product : list) {
//			System.out.println(product.priceTag());
//		}
		
		//Classes abstratas
		
		/* S�o classes que n�o podem ser instanciadas;
		 * � uma forma de garantir heran�a total: somente subclasses n�o abstratas podem ser instanciadas, mas nunca a 
		 * superclasse abstrata
		 * Exemplo: suponha que em um neg�cio relacionado a banco, apenas contas poupan�as e contas para empresas s�o 
		 * permitidas. N�o existe conta comum.
		 * Para garantir que contas comuns n�o possam ser instanciadas, basta acrescentarmos a palavra "abstract" na 
		 * declara��o da classe => public abstratc class Account{}
		 * No desenho UML, ela � representada pelo titulo em it�lico;
		 * Se a superclasse n�o pode ser instanciada, por que simplesmente n�o criar somente as subclasses ?
		 * - Reuso
		 * - Polimorfismo: a superclasse classe gen�rica nos permite tratar de forma f�cil e uniforme todos os tipos de 
		 * conta, inclusive com polimorfismo se for o caso, nos nos exercicios anteriores. Po rexemplo, voc� pode 
		 * colocar todos os tipos de conta em uma mesma cole��o.
		 */
		
		//caso a classe Account for "public abstract class Account", ela n�o pode ser instanciada como abaixo
		//Account acc1 = new Account(1001, "Bob", 1100.0);
//		Account acc2 = new SavingsAccount(1002, "Maria", 1100.0, 0.01);
//		Account acc3 = new BusinessAccount(1003, "Jo�o", 1100.0, 500.0);
		
		//Exercicio: totalizar o saldo de todas as contas e acrescentar 10.00 em todas as contas (https://github.com/acenelio/inheritance6-java)

		//Account - tipo gen�rico
//		List<Account> list = new ArrayList<>();
//		
//		list.add(new SavingsAccount(1001, "Jo�o", 500.0, 0.01));
//		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
//		list.add(new SavingsAccount(1003, "Bob", 300.0, 0.01));
//		list.add(new BusinessAccount(1004, "Ana", 500.0, 500.0));
		
		//soma do saldo de todas as contas
//		double sum = 0;		
//		for(Account acc : list) {
//			sum += acc.getBalance();
//		}		
//		System.out.printf("Total balance: %.2f%n", sum);
		
		//saldo de todas as contas acrescido de 10.00 e seus respectivos numeros
//		for(Account acc : list) {
//			acc.deposit(10.0);
//		}		
//		for(Account acc : list) {
//			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
//		}
		
		//M�todos abstratos
		
		/* S�o m�todos que n�o possuem implementa��o. M�todos precisam ser abstratos quando a cl asse � gen�rica demais
		 * para conter sua implementa��o. Se uma classe possuir pelo menos um m�todo abstrato, ent�o esta classe tamb�m
		 * � abstrata. No UML, sua nota��o � em it�lico.
		 */
		
		//Exercicio resolvido - (https://github.com/acenelio/inheritance7-java)
		
		/* Fazer um programa para ler os dados de N figuras (N fornecido pelo usu�rio), e 
		 * depois mostrar as �reas destas figuras na mesma ordem em que foram digitadas.
		 */
		
//		List<Shape> list = new ArrayList<>();	
//		
//		System.out.print("Enter the number of shapes: ");
//		int n = sc.nextInt();
//		
//		for(int i = 1; i <= n; i++) {
//			System.out.println("Shape #" + i + " data:");
//			System.out.print("Rectangle or Circle (r/c)? ");
//			char ch = sc.next().charAt(0);	
//			System.out.print("Color (BLACK/BLUE/RED): ");
//			//o que for digitado aqui ser� convertido para objeto do tipo enumerado Color
//			Color color = Color.valueOf(sc.next());
//			
//			if(ch == 'r') {
//				System.out.print("Width: ");
//				double width =  sc.nextDouble();
//				System.out.print("Height: ");
//				double height = sc.nextDouble();
//				list.add(new Rectangle2(color, width, height));
//			}else {
//				System.out.print("Radius: ");
//				double radius = sc.nextDouble();
//				list.add(new Circle(color, radius));				
//			}
//			
//		}		
//		
//		System.out.println();
//		System.out.println("SHAPES AREAS:");
//		for(Shape sh : list) {
//			System.out.println(String.format("%.2f", sh.area()));
//		}
		
		//Exerc�cio de fixa��o (https://github.com/acenelio/inheritance8-java)
		
		/* Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usu�rio), os quais
		 * podem ser pessoa f�sica ou pessoa jur�dica, e depois mostrar o valor do imposto pago por cada um,
		 * bem como o total de imposto arrecadado.
		 * Os dados de pessoa f�sica s�o: nome, renda anual e gastos com sa�de. Os dados de pessoa jur�dica
		 * s�o nome, renda anual e n�mero de funcion�rios. As regras para c�lculo de imposto s�o as
		 * seguintes:
		 * Pessoa f�sica: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com
		 * renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa teve gastos com sa�de, 50%
		 * destes gastos s�o abatidos no imposto.
		 * Exemplo: uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com sa�de, o imposto
		 * fica: (50000 * 25%) - (2000 * 50%) = 11500.00
		 * Pessoa jur�dica: pessoas jur�dicas pagam 16% de imposto. Por�m, se a empresa possuir mais de 10
		 * funcion�rios, ela paga 14% de imposto.
		 * Exemplo: uma empresa cuja renda foi 400000.00 e possui 25 funcion�rios, o imposto fica:
		 * 400000 * 14% = 56000.00
		 */
		
//		List<TaxPayer> list = new ArrayList<>();		
//		
//		System.out.print("Enter the number of tax payers: ");
//		int n = sc.nextInt();
//		
//		for(int i = 1; i <= n; i++) {
//			System.out.println("Tax payer #" + i + " data:");
//			System.out.print("Individual or company (i/c)? ");
//			char ch = sc.next().charAt(0);
//			System.out.print("Name: ");
//			sc.nextLine();
//			String name = sc.nextLine();
//			System.out.print("Anual income: ");
//			Double anualIncome = sc.nextDouble();
//			if(ch == 'c') {				
//				System.out.print("Number of employees: ");
//				int numberOfEmployees = sc.nextInt();
//				list.add(new Company(name, anualIncome, numberOfEmployees));
//			}else {
//				System.out.print("Health expenditures: ");
//				Double healthExpenditures = sc.nextDouble();
//				list.add(new Individual(name, anualIncome, healthExpenditures));
//			}
//		}
//		
//		System.out.println();		
//		System.out.println("TAXES PAID:");
//		
//		double sum = 0.0;
//		
//		for(TaxPayer taxPayer : list) {
//			System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", taxPayer.tax()));
//			sum += taxPayer.tax();
//		}
//		
//		System.out.printf("%nTOTAL TAXES: $ %.2f", sum);
		
		//Exce��es - Try-catch
		
		/* - Bloco try: contem o c�digo que representa a execu��o normal do trecho de c�digo que 
		 * pode acarretar em uma exce��o
		 * - Bloco catch: cont�m o c�digo a ser executado caso uma exce��o ocorra; Deve ser especificado o tipo da 
		 * exce��o a ser tratada (upcasting � permitido)
		 * 
		 * Onde:
		 * - o bloco try{} tem o c�digo que pode gerar uma ou mais exce��es
		 * - 'ExceptionType' � o tipo da exce��o que se quer capturar
		 * - 'e' � um apelido pra exce��o
		 * - 'catch(){}' recebe alguma l�gica a ser executada caso a exce��o ocorra
		 */
		
		
//		try {
//			String[] vect = sc.nextLine().split(" ");
//			int position = sc.nextInt();
//			System.out.println(vect[position]);
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Invalid position");
//		}
//		catch(InputMismatchException e) {
//			System.out.println("Input error");
//		}
//			
//		System.out.println("End of program");
		
		/* No bloco de try � adicionado esse trecho que c�digo que pode vir a apresentar exce��es como excesso do 
		 * limite do vetor e tipo de input n�o correspondente e nos blocos catch a seguir s�o tratadas esas mesmas 
		 * exce��es, onde ser� exibida uma mensagem especifica caso ocorram
		 * Sem o tratamento das exce��es, a linha "End of program" nem seria impressa pois o programa 
		 * finalizaria antes em caso de exce��o
		 */
		
		//Stack trace (pilha de chamadas de m�todos)
		
//		method1();			
//		System.out.println("End of program");
		
		
		//Bloco finally
		
		/* � um bloco que cont�m c�digo a ser executado independemente de ter corrido ou n�o uma execu��o com sucesso.
		 * Exemplo cl�ssico: fechar um arquivo, conex�o de DB ou outro recurso espec�fico ao final do processamento.
		 * 
		 * Para testar o try sem erro, criar arquivo in.txt com duas linhas de texto nas pasta temp
		 */
		
//		File file = new File("C:\\temp\\in.txt");
//		Scanner sc = null;
//		try {
//			sc = new Scanner(file);
//			while (sc.hasNextLine()) {
//				System.out.println(sc.nextLine());
//			}
//		} catch (IOException e) {
//			System.out.println("Error opening file: " + e.getMessage());
//		} finally {
//			if (sc != null) {
//				sc.close();
//			}
//			System.out.println("Finally block executed");
//		}
		
		//Exce��es personalizadas + Model package (https://github.com/acenelio/exceptions1-java)
		
		/* Fazer um programa para ler os dados de uma reserva de hotel (n�mero do quarto, 
		 * data de entrada e data de sa�da) e mostar os dados da reserva, inclusive sua
		 * dura��o. Em seguida, ler novas datas de entrada e sa�da, atualizar a reserva,
		 * e mostrar novamente a reserva com os dados atualizados. O programa n�o deve
		 * aceitar dados inv�lidos para a reserva, conforme as seguintes regras:
		 * - Altera��es de reserva s� podem ocorrer para datas futuras
		 * - A data de sa�da deve ser maior que a data de entrada
		 * 
		 * Solu��o 1 (muito ruim): l�gica de valida��o no programa principal
		 * - L�gica de valida��o n�o delegada � reserva
		 * 
		 * Solu��o 2 (ruim): m�todo retornando string
		 * - A sem�ntica da opera��o � prejudicada
		 * 		- Retornar string n�o tem nada a ver com atualiza��o de reserva
		 * 		- E se a opera��o tivesse que retornar um string ?
		 * - Ainda n�o � poss�vel tratar exce��es em construtores
		 * - Ainda n�o h� aux�lio do compilador: o programador deve "lembrar" de verificar se houve erro
		 * - A l�gica fica estruturada em condicionais aninhadas
		 * 
		 * Solu��o 3 (boa): tratamento de exce��es
		 */
		
		//Solu��o 1
		
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//		
//		System.out.print("Room number: ");
//		int number = sc.nextInt();
//		System.out.print("Check-in date (dd/MM/yyyy): ");
//		Date checkIn = sdf.parse(sc.next());
//		System.out.print("Check-out date (dd/MM/yyyy): ");
//		Date checkOut = sdf.parse(sc.next());
//		
//		if(!checkOut.after(checkIn)) {
//			System.out.println("Error in reservation: Check-out date must be after check-in date");
//		}
//		else {
//			Reservation reservation = new Reservation(number, checkIn, checkOut);
//			System.out.println("Reservation: " + reservation);
//			
//			System.out.println();
//			System.out.println("Enter data to update the reservation:");
//			System.out.print("Check-in date (dd/MM/yyyy): ");
//			checkIn = sdf.parse(sc.next());
//			System.out.print("Check-out date (dd/MM/yyyy): ");
//			checkOut = sdf.parse(sc.next());
//			
//			Date now = new Date();
//
//			//Date tem o m�todo .after() que testa se uma data depois da outra
//			if(checkIn.before(now) || checkOut.before(now)) {
//				System.out.println("Error in reservation: Reservation dates for update must be future dates");
//			}
//			else if(!checkOut.after(checkIn)) {
//				System.out.println("Error in reservation: Check-out date must be after check-in date");
//			}
//			else {
//				reservation.updateDates(checkIn, checkOut);
//				System.out.println("Reservation: " + reservation);
//			}
//			
//		}
		
		
		//Solu��o 2 
		
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//		
//		System.out.print("Room number: ");
//		int number = sc.nextInt();
//		System.out.print("Check-in date (dd/MM/yyyy): ");
//		Date checkIn = sdf.parse(sc.next());
//		System.out.print("Check-out date (dd/MM/yyyy): ");
//		Date checkOut = sdf.parse(sc.next());
//		
//		if(!checkOut.after(checkIn)) {
//			System.out.println("Error in reservation: Check-out date must be after check-in date");
//		}
//		else {
//			Reservation reservation = new Reservation(number, checkIn, checkOut);
//			System.out.println("Reservation: " + reservation);
//			
//			System.out.println();
//			System.out.println("Enter data to update the reservation:");
//			System.out.print("Check-in date (dd/MM/yyyy): ");
//			checkIn = sdf.parse(sc.next());
//			System.out.print("Check-out date (dd/MM/yyyy): ");
//			checkOut = sdf.parse(sc.next());			
//			
//			String error = reservation.updateDates(checkIn, checkOut);			
//			if(error != null) {
//				System.out.println("Error in reservation: " + error);
//			}
//			else {
//				System.out.println("Reservation: " + reservation);		
//			}
//		}
		
		//Solu��o 3
		
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//		
//		
//		try {
//			System.out.print("Room number: ");
//			int number = sc.nextInt();
//			System.out.print("Check-in date (dd/MM/yyyy): ");
//			Date checkIn = sdf.parse(sc.next());
//			System.out.print("Check-out date (dd/MM/yyyy): ");
//			Date checkOut = sdf.parse(sc.next());
//			
//			Reservation reservation = new Reservation(number, checkIn, checkOut);
//			System.out.println("Reservation: " + reservation);
//	
//			System.out.println();
//			System.out.println("Enter data to update the reservation:");
//			System.out.print("Check-in date (dd/MM/yyyy): ");
//			checkIn = sdf.parse(sc.next());
//			System.out.print("Check-out date (dd/MM/yyyy): ");
//			checkOut = sdf.parse(sc.next());
//	
//			reservation.updateDates(checkIn, checkOut);
//			System.out.println("Reservation: " + reservation);
//		}
//		//trata exce��o de formato de data inv�lido
//		catch(ParseException e) {
//			System.out.println("Invalid date format");
//		}
//		//trata a exce��o com uma mensagem personalizada
//		catch(DomainException e) {
//			System.out.println("Error in reservation: " + e.getMessage());
//		}
//		//trata exce��o gen�rica - qualquer outra exce��o n�o mapeada
//		catch(RuntimeException e) {
//			System.out.println("Unexpected error");
//		}
		
		
		//Exerc�cio de fixa��o - (https://github.com/acenelio/exceptions2-java)
		
		/* fazer um porgrama para ler os dados de uma conta banc�ria e depois realizar um
		 * saque nesta conta banc�ria, mostrando o novo saldo. Um saque n�o pode ocorrer
		 * ou se n�o houver saldo na conta, ou se o valor do saque for superior ao limite
		 * de saque da conta. Implemente a conta banc�ria conforme projeto.
		 */
		
//		try {
//			System.out.println("Enter account data");
//			System.out.print("Number: ");
//			int number = sc.nextInt();
//			System.out.print("Holder: ");
//			sc.next();
//			String holder = sc.nextLine();
//			System.out.print("Initial balance: ");
//			double initialBalance = sc.nextDouble();
//			System.out.print("Withdraw limit: ");
//			double withdrawLimit = sc.nextDouble();
//			
//			NewAccount acc = new NewAccount(number, holder, initialBalance, withdrawLimit);	
//			
//			System.out.println();
//			System.out.print("Enter amount for withdraw: ");
//			double withdraw = sc.nextDouble();				
//			acc.withdraw(withdraw);			
//			System.out.println("New balance: " + String.format("%.2f", acc.getBalance()));
//			
//		}
//		catch(AccountException e) {
//			System.out.println("Withdraw error: " + e.getMessage());
//		}
//		catch(RuntimeException e) {
//			System.out.println("Unexpected error");
//		}
		
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.next();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double initialBalance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();

		NewAccount acc = new NewAccount(number, holder, initialBalance, withdrawLimit);

		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double withdraw = sc.nextDouble();
			
		try {
			acc.withdraw(withdraw);			
			System.out.println("New balance: " + String.format("%.2f%n", acc.getBalance()));
			
		}
		catch(AccountException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		
		sc.close();	
				
	}
	
	// m�todo p/stack trace
	
//	public static void method1(){
//		System.out.println("***METHOD1 START***");
//		method2();
//		System.out.println("***METHOD1 END***");
//	}
//	
//	public static void method2(){
//		System.out.println("***METHOD2 START***");
//		Scanner sc = new Scanner(System.in);
//		
//		try {
//			String[] vect = sc.nextLine().split(" ");
//			int position = sc.nextInt();
//			System.out.println(vect[position]);
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Invalid position");
//			//imprime o rastreamento do stack mostrando o tipo da exce��o, a mensagem da exce��o e a sequencia de chamadas que gerou a exce��o
//			e.printStackTrace();
//		}
//		catch(InputMismatchException e) {
//			System.out.println("Input error");
//		}
//		
//		sc.close();	
//		
//		System.out.println("***METHOD2 END***");
//	}
	
	
	// m�todos vers�o 1 de m�todos est�ticos 
//	public static double circumference(double radius) {
//		return 2.0 * PI * radius;
//	}
//
//	public static double volume(double radius) {
//		return 4.0 * PI * Math.pow(radius, 3) / 3.0;
//	}
//
//	public static Integer position(List<EmployeeList> list, int id) {
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i).getId() == id) {
//				return i;
//			}
//		}
//		// se esgotar o for, o m�todo retorna nulo
//		return null;
//	}
}
