import java.util.Locale;
import java.util.Scanner;

public class Exercicios {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
/* 	Calcule a �rea e o pre�o do terreno */
		
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
			
/* Fazer um programa para ler as medidas da base w ltura de um ret�ngulo.
 * Em seguida, mostrar o valor da �rea, per�metro e diagonal deste ret�ngulo,
 * com quatro casas decimais, conforme exemplo:
 * -----------------
 * EXEMPLO ENTRADA:
 * 5.0
 * 4.0
 * -----------------
 * EXEMPLO SA�DA:
 * AREA = 20.0000
 * PERIMETRO = 18.0000
 * DIAGONAL = 6.4031
 * ------------------
 * Informa��es:
 * �rea = base * altura
 * per�metro = 2 * base + 2 * altura OU 2 * (base + altura)
 * diagonal = (base� + altura�)�
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
 * Ao final, mostrar uma mensagem com os nomes e a idade m�dia entre essas pessoas,
 * com uma casa decimal, conforme exemplo.
 * -------------------
 * EXEMPLO ENTRADA:
 * Maria 19
 * Joaquim 20
 * -------------------
 * EXEMPLO SA�DA:
 * A idade m�dia de Maria e Joaquim � de 19.5 anos
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
 * EXEMPLO SA�DA 1:
 * NOTA FINAL = 76.8
 * --------------
 * EXEMPLO ENTRADA 2:
 * 24.0
 * 23.5		
 * --------------
 * EXEMPLO SA�DA 2:
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

/* Fazer um programa para ler tr�s n�meros. 
 * Em seguida, mostrar qual o menor dentre os n�meros lidos.
 * Em caso de empate, mostrar apenas uma vez.
 * -------------
 * EXEMPLO ENTRADA:
 * 7 3 8
 * -------------
 * EXEMPLO SA�DA:
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
 * Uma operadora de telefonia cobra R$ 50.00 por um plano b�sico que d� direito
 * a 100 minutos de telefone. Cada minuto que exceder a franquia de 100 minutos
 * custa R$ 2.00. Fazer um programa para ler a quantidade de minutos que uma
 * pessoa consumiu, da� mostrar o valor a ser pago.
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
 * Fa�a um programa para ler um n�mero indeterminado de dados, contendo cada um,
 * a idade de um indiv�duo. O �ltimo dado, que n�o entrar� nos c�lculos, cont�m
 * um valor de idade negativa. Calcular e imprimir a idade m�dia deste grupo de
 * indiv�duos. Se for entrado um valor negativo na primeira vez, mostrar a
 * mensagem "impossivel calcular"
 * -------------
 * EXEMPLO ENTRADA:
 * 31 27 46 -5
 * -------------
 * EXEMPLO SA�DA:
 * 34.67
 * -------------
 * EXEMPLO ENTRADA:
 * -10
 * -------------
 * EXEMPLO SAIDA:
 * impossivel calcular
 * ---------------
 */
		int idade = sc.nextInt();
		int soma = 0;
		int cont = 0;
		
		while (idade >= 0){
			soma = soma + idade;
			cont = cont + 1;
			idade = sc.nextInt();
		}
		
		if(cont > 0) {
			double media = (double) soma / cont;
			System.out.printf("%.2f%n",media);
		}else {
			System.out.println("impossivel calcular");
		}
		
//		===================================================================	
		
		sc.close();
				
	}
}