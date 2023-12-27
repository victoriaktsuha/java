import java.util.Scanner;

public class BeeCrowdExecercises {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//	1001

		/*
		 * int a, b, x;
		 * 
		 * a = sc.nextInt(); b = sc.nextInt(); x = a + b;
		 * 
		 * System.out.println("X = " + x);
		 */

//	1002

		/*
		 * double raio = sc.nextDouble(); double pi = 3.14159; double area = pi * (raio
		 * * raio);
		 * 
		 * System.out.printf("A=%.4f%n", area);
		 */

//	1003

		/*
		 * int A, B, SOMA; A = sc.nextInt(); B = sc.nextInt(); SOMA = A + B;
		 * 
		 * System.out.println("SOMA = " + SOMA);
		 */

//	1004

		/*
		 * int A, B, PROD; A = sc.nextInt(); B = sc.nextInt(); PROD = A * B;
		 * 
		 * System.out.println("PROD = " + PROD);
		 */

//	1005

		/*
		 * double A, B, MEDIA; A = sc.nextDouble() * 3.5; B = sc.nextDouble() * 7.5;
		 * MEDIA = (A + B) / 11;
		 * 
		 * System.out.printf("MEDIA = %.5f%n", MEDIA);
		 */

//	1006

		/*
		 * double A, B, C, MEDIA; A = sc.nextDouble() * 2; B = sc.nextDouble() * 3; C =
		 * sc.nextDouble() * 5; MEDIA = (A + B + C) / 10;
		 * 
		 * System.out.println("MEDIA = " + MEDIA);
		 */

//	1007

		/*
		 * int A, B, C, D, DIFERENCA; A = sc.nextInt(); B = sc.nextInt(); C =
		 * sc.nextInt(); D = sc.nextInt(); DIFERENCA = (A * B - C * D);
		 * 
		 * System.out.println("DIFERENCA = " + DIFERENCA);
		 */

//	1008

		/*
		 * int funcionarioId, horasTrabalhadas; double valorHora, salario;
		 * 
		 * funcionarioId = sc.nextInt(); horasTrabalhadas = sc.nextInt(); valorHora =
		 * sc.nextDouble(); salario = horasTrabalhadas * valorHora;
		 * 
		 * 
		 * System.out.println("NUMBER = " + funcionarioId);
		 * System.out.printf("SALARY = U$ %.2f%n", salario);
		 */

//	1009

		/*
		 * String nome; double salarioFixo, vendasMes, totalVendas, totalReceita;
		 * 
		 * nome = sc.next(); salarioFixo = sc.nextDouble(); vendasMes = sc.nextDouble();
		 * totalVendas = vendasMes * 0.15; totalReceita = totalVendas + salarioFixo;
		 * 
		 * 
		 * System.out.printf("TOTAL = R$ %.2f%n", totalReceita);
		 */

//	1010

		/*
		 * int cod1, qntd1, cod2, qntd2; double valorUn1, valorUn2, valorTotal;
		 * 
		 * cod1 = sc.nextInt(); qntd1 = sc.nextInt(); valorUn1 = sc.nextDouble(); cod2 =
		 * sc.nextInt(); qntd2 = sc.nextInt(); valorUn2 = sc.nextDouble(); valorTotal =
		 * qntd1 * valorUn1 + qntd2 * valorUn2;
		 * 
		 * 
		 * System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);
		 */
		 
//	1011
		
		/*---------------------- informação ----------------------------------
		 * => formula para volume: (4/3) * pi * R³ pi = 3.14159 
		 * => substitua (4/3) por (4.0/3) ou (4/3.0) pois algumas linguagens (dentre elas o C++), 
		 * assumem que o resultado da divisão entre dois inteiros é outro inteiro.
		 * ----------------------------------------------------------
		 */
		
		/*
		 * double R; R = sc.nextDouble(); double volume = (4.0/3) * 3.14159 *
		 * Math.pow(R, 3.0);
		 * 
		 * System.out.printf("VOLUME = %.3f%n", volume);
		 */
		
//	1012
		
		/*---------------------- informação -------------------
		 * a) a área do triângulo retângulo que tem A por base e C por altura (b*h/2). 
		 * b) a área do círculo de raio C. (pi = 3.14159) (pi*r²)
		 * c) a área do trapézio que tem A e B por bases e C por altura. (B+b*h/2)
		 * d) a área do quadrado que tem lado B. (B²)
		 * e) a área do retângulo que tem lados A e B. (b * h)
		 * ---------------------------------------------------
		 */
		
		/*
		 * double A, B, C;
		 * 
		 * A = sc.nextDouble(); B = sc.nextDouble(); C = sc.nextDouble();
		 * 
		 * double areaTriangulo = A * C / 2; double areaCirculo = 3.14159 * Math.pow(C,
		 * 2.0); double areaTrapezio = (A + B) * C /2.0; double areaQuadrado =
		 * Math.pow(B, 2.0); double areaRetangulo = A * B;
		 * 
		 * System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
		 * System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		 * System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		 * System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		 * System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
		 */
		
//	1013
		
		/*
		 * int A, B, C;
		 * 
		 * A = sc.nextInt(); B = sc.nextInt(); C = sc.nextInt();
		 * 
		 * int MaiorAB = (A + B + Math.abs(A - B))/2;
		 * 
		 * if(MaiorAB > C) { System.out.println(MaiorAB + " eh o maior"); }else {
		 * System.out.println(C + " eh o maior"); }
		 */
		

//	1014

		/*
		 * int X; float Y, consumoMedio;
		 * 
		 * X = sc.nextInt(); Y = sc.nextFloat(); consumoMedio = X/Y;
		 * 
		 * 
		 * System.out.printf("%.3f km/l%n", consumoMedio);
		 */
		
//	1015
		
		/*
		 * double x1, y1, x2, y2; x1 = sc.nextDouble(); y1 = sc.nextDouble(); x2 =
		 * sc.nextDouble(); y2 = sc.nextDouble();
		 * 
		 * double distancia = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		 * 
		 * System.out.printf("%.4f%n", distancia);
		 */

//	1016

		/*
		 * int km, minutos;
		 * 
		 * km = sc.nextInt(); minutos = km * 2;
		 * 
		 * System.out.println(minutos + " minutos");
		 */
		
//	1017
		
		/*
		 * int horas, velocidade;
		 * 
		 * horas = sc.nextInt(); velocidade = sc.nextInt();
		 * 
		 * double combustivel = (horas * velocidade) / 12.0;
		 * 
		 * System.out.printf("%.3f%n", combustivel);
		 */
		
//	1018 - corrigido
		
		/*-------------------------------------------------------
		 * Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.
		 * 
		 * Entrada: 
		 * O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).
		 * 
		 * Saída: 
		 * Imprima o valor lido e, em seguida, a quantidade mínima de notas decada tipo necessárias, conforme o exemplo fornecido. 
		 * Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
		 * ------------------------------------------------------
		 */
				
		
		
		/*
		 * int N, resto, notas100, notas50, notas20, notas10, notas5, notas2, notas1; N
		 * = sc.nextInt(); notas100 = N/100; resto = N % 100; notas50 = resto / 50;
		 * resto = resto % 50; notas20 = resto / 20; resto = resto % 20; notas10 = resto
		 * / 10; resto = resto % 10; notas5 = resto / 5; resto = resto % 5; notas2 =
		 * resto / 2; resto = resto % 2; notas1 = resto / 1;
		 * 
		 * System.out.println(N); System.out.printf("%d nota(s) de R$ 100,00%n",
		 * notas100); System.out.printf("%d nota(s) de R$ 50,00%n", notas50);
		 * System.out.printf("%d nota(s) de R$ 20,00%n", notas20);
		 * System.out.printf("%d nota(s) de R$ 10,00%n", notas10);
		 * System.out.printf("%d nota(s) de R$ 5,00%n", notas5);
		 * System.out.printf("%d nota(s) de R$ 2,00%n", notas2);
		 * System.out.printf("%d nota(s) de R$ 1,00%n", notas1)
		 */;
		 
		 

//	1019 - corrigido
		
		/* -----------------
		 * 1 min = 60s
		 * 1 h = 60 min = 3600s
		 * -------------------------
		 * Exemplo: 140153s
		 * - Quantas horas são 140153s ? => 140153s / 3600s = 38,931388.. horas
		 * - Quantos segundos tem 38 horas ? => 38h x 3600s = 136800s 
		 * - 140153 - 136800 = após 38 horas, ainda sobram 3353s (resto/mod, que seria 140153 % 3600)
		 * - Quantos minutos tem 3353s ? => 3353s / 60s = 55,8833.. minutos
		 * - 55 min x 60s = 3300s
		 * - 3353s - 3333s = após 55 min sobram 53 segundos (resto/mod, que seria 3353 % 60)

		 * -------------------*/
		
		/*
		 * int N, resto, horas, minutos, segundos;
		 * 
		 * N = sc.nextInt(); horas = N/3600; resto = N % 3600; minutos = resto/60;
		 * segundos = resto % 60;
		 * 
		 * System.out.printf("%d:%d:%d", horas, minutos, segundos);
		 */
		
//	1020
		// 1 ano = 12 meses = 365 dias
		// 1 mes = 30 dias
		
		/*
		 * int idadeEmDias, resto, anos, meses, dias;
		 * 
		 * idadeEmDias = sc.nextInt(); anos = idadeEmDias / 365; resto = idadeEmDias %
		 * 365; meses = resto / 30; dias = resto % 30;
		 * 
		 * 
		 * System.out.println(anos + " ano(s) "); System.out.println(meses +
		 * " mes(es) "); System.out.println(dias + " dia(s) ");
		 */
		
//	1021 - corrigido
		  
		/*
		 * double N; int quociente, resto, nota, moeda;
		 * 
		 * N = sc.nextDouble();
		 * 
		 * // Vamos multiplicar N por 100 e forçar a conversão para int. // Desse modo,
		 * por exemplo, 576.73 vai se tornar 57673
		 * 
		 * // Vamos tambem somar 0.5 antes de converter, para assegurar // que o numero
		 * seja devidamente arredondado, pois o tipo double // as vezes da problema de
		 * arredondamento (por exemplo: se digitarmos // 576.81 e multiplicarmos por
		 * 100, o resultado sera 57680.99999999, // dai o casting resultaria em 57680 e
		 * nao 57681 como desejado)
		 * 
		 * resto = (int) (N * 100.0 + 0.5);
		 * 
		 * System.out.println("NOTAS:");
		 * 
		 * // como multiplicamos o valor por 100 acima, o valor de cada nota // também
		 * deverá ser multiplicado por 100 a seguir
		 * 
		 * nota = 100; quociente = resto / (nota * 100); System.out.println(quociente +
		 * " nota(s) de R$ " + nota + ".00"); resto = resto % (nota * 100);
		 * 
		 * nota = 50; quociente = resto / (nota * 100); System.out.println(quociente +
		 * " nota(s) de R$ " + nota + ".00"); resto = resto % (nota * 100);
		 * 
		 * nota = 20; quociente = resto / (nota * 100); System.out.println(quociente +
		 * " nota(s) de R$ " + nota + ".00"); resto = resto % (nota * 100);
		 * 
		 * nota = 10; quociente = resto / (nota * 100); System.out.println(quociente +
		 * " nota(s) de R$ " + nota + ".00"); resto = resto % (nota * 100);
		 * 
		 * nota = 5; quociente = resto / (nota * 100); System.out.println(quociente +
		 * " nota(s) de R$ " + nota + ".00"); resto = resto % (nota * 100);
		 * 
		 * nota = 2; quociente = resto / (nota * 100); System.out.println(quociente +
		 * " nota(s) de R$ " + nota + ".00"); resto = resto % (nota * 100);
		 * 
		 * System.out.println("MOEDAS:");
		 * 
		 * // o valor de cada moeda deverá ser representado em centavos
		 * 
		 * moeda = 100; quociente = resto / moeda; System.out.println(quociente +
		 * " moeda(s) de R$ 1.00"); resto = resto % moeda;
		 * 
		 * moeda = 50; quociente = resto / moeda; System.out.println(quociente +
		 * " moeda(s) de R$ 0.50"); resto = resto % moeda;
		 * 
		 * moeda = 25; quociente = resto / moeda; System.out.println(quociente +
		 * " moeda(s) de R$ 0.25"); resto = resto % moeda;
		 * 
		 * moeda = 10; quociente = resto / moeda; System.out.println(quociente +
		 * " moeda(s) de R$ 0.10"); resto = resto % moeda;
		 * 
		 * moeda = 5; quociente = resto / moeda; System.out.println(quociente +
		 * " moeda(s) de R$ 0.05"); resto = resto % moeda;
		 * 
		 * System.out.println(resto + " moeda(s) de R$ 0.01");
		 */
//	1035
		 
		/*
		 * int A = sc.nextInt(); int B = sc.nextInt(); int C = sc.nextInt(); int D =
		 * sc.nextInt();
		 * 
		 * if (B > C && D > A && C + D > A + B && C > 0 && D > 0 && A % 2 == 0) {
		 * System.out.println("Valores aceitos"); } else {
		 * System.out.println("Valores nao aceitos"); }
		 */
		 
//	1036
		 
		/*
		 * double A = sc.nextDouble(); double B = sc.nextDouble(); double C =
		 * sc.nextDouble();
		 * 
		 * double delta = Math.pow(B, 2.0) - 4.0 * A * C;
		 * 
		 * if(A == 0 || delta < 0.0) { System.out.println("Impossivel calcular"); } else
		 * { double R1 = (-B + Math.sqrt(delta)) / (2.0 * A); double R2 = (-B -
		 * Math.sqrt(delta)) / (2.0 * A);
		 * 
		 * System.out.printf("R1 = %.5f%n",R1); System.out.printf("R2 = %.5f%n",R2);
		 * 
		 * }
		 */
		 
//	1038
		 
		/*
		 * int codigoItem = sc.nextInt(); int qntdItem = sc.nextInt(); double preco = 0;
		 * 
		 * switch(codigoItem) { case 1: preco = 4.00; break; case 2: preco = 4.50;
		 * break; case 3: preco = 5.00; break; case 4: preco = 2.00; break; case 5:
		 * preco = 1.50; break; }
		 * 
		 * double total = qntdItem * preco;
		 * 
		 * System.out.printf("Total: R$ %.2f%n", total);
		 */
		 
//	1044 - corrigido
		 
		/*
		 * int A = sc.nextInt(); int B = sc.nextInt();
		 * 
		 * if (A % B == 0 || B % A == 0) { System.out.println("Sao Multiplos"); } else {
		 * System.out.println("Nao sao Multiplos"); }
		 */
		 
//	1046
		 
		 int horaInicial = sc.nextInt();
		 int horaFinal = sc.nextInt();
		 int duracao;
		 
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
			 
		 System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();

	}

}
