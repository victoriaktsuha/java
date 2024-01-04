import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

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
//	1037
		 
		 
		/*
		 * double valor = sc.nextDouble();
		 * 
		 * if(valor >= 0 && valor <= 25.00) { System.out.println("Intervalo [0,25]");
		 * }else if(valor >= 25.01 && valor <= 50.00){
		 * System.out.println("Intervalo (25,50]"); }else if(valor >= 50.01 && valor <=
		 * 75.00) { System.out.println("Intervalo (50,75]"); }else if(valor >= 75.01 &&
		 * valor <= 100.00) { System.out.println("Intervalo (75,100]"); }else {
		 * System.out.println("Fora do intervalo"); }
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
		 
//	1040 - corrigido
		 
		/*
		 * float n1 = sc.nextFloat(); float n2 = sc.nextFloat(); float n3 =
		 * sc.nextFloat(); float n4 = sc.nextFloat();
		 * 
		 * float media = (n1*2 + n2*3 + n3*4 + n4*1) / 10;
		 * 
		 * System.out.printf("Media: %.1f%n", media);
		 * 
		 * if(media >= 7.0) { System.out.println("Aluno aprovado."); }else if(media >=
		 * 5.0 && media <= 6.9) { System.out.println("Aluno em exame."); float notaExame
		 * = sc.nextFloat(); System.out.printf("Nota do exame: %.1f%n", notaExame);
		 * float mediaFinal = (media + notaExame) / 2; if(mediaFinal >= 5.0) {
		 * System.out.println("Aluno aprovado.");
		 * System.out.printf("Media final: %.1f%n", mediaFinal); }else {
		 * System.out.println("Aluno reprovado.");
		 * System.out.printf("Media final: %.1f%n", mediaFinal); } }else if(media < 5.0)
		 * { System.out.println("Aluno reprovado."); }
		 */
		 
//	1041
		 
		/*
		 * float x = sc.nextFloat(); float y = sc.nextFloat();
		 * 
		 * if(x == 0.0 && y == 0.0) { System.out.println("Origem"); }else if(x > 0.0 &&
		 * y > 0.0) { System.out.println("Q1"); }else if(x < 0.0 && y > 0.0) {
		 * System.out.println("Q2"); }else if(x < 0.0 && y < 0.0) {
		 * System.out.println("Q3"); }else if(x > 0.0 && y < 0.0) {
		 * System.out.println("Q4"); }else if(x == 0.0 && y > 0.0 || x == 0.0 && y < 0.0
		 * ) { System.out.println("Eixo Y"); }else if (x > 0.0 && y == 0.0 || x < 0.0 &&
		 * y == 0.0) { System.out.println("Eixo X"); }
		 */
		 

//	1042
		 
		/*
		 * int n1 = sc.nextInt(); int n2 = sc.nextInt(); int n3 = sc.nextInt();
		 * 
		 * int A, B, C;
		 * 
		 * if (n1 < n2 && n1 < n3) { A = n1; if (n2 < n3) { B = n2; C = n3; } else { B =
		 * n3; C = n2; } } else if (n2 < n3) { A = n2; if (n1 < n3) { B = n1; C = n3; }
		 * else { B = n3; C = n1; } } else { A = n3; if (n1 < n2) { B = n1; C = n2; }
		 * else { B = n2; C = n1; } }
		 * 
		 * System.out.println(A); System.out.println(B); System.out.println(C);
		 * System.out.println(""); System.out.println(n1); System.out.println(n2);
		 * System.out.println(n3);
		 */
		 
//	1043
		 
		/*
		 * float A = sc.nextFloat(); float B = sc.nextFloat(); float C = sc.nextFloat();
		 * float base, lado1, lado2;
		 * 
		 * if(A > B && A > C) { base = A; lado1 = B; lado2 = C; }else if(B > A && B >C){
		 * base = B; lado1 = A; lado2 = C; }else { base = C; lado1 = A; lado2 = B; }
		 * 
		 * if((lado1 + lado2) > base) { float perimetro = lado1 + lado2 + base;
		 * System.out.printf("Perimetro = %.1f%n", perimetro); }else { float area = (A +
		 * B)*C/2; System.out.printf("Area = %.1f%n", area); }
		 */
		 

//	1044 - corrigido
		 
		/*
		 * int A = sc.nextInt(); int B = sc.nextInt();
		 * 
		 * if (A % B == 0 || B % A == 0) { System.out.println("Sao Multiplos"); } else {
		 * System.out.println("Nao sao Multiplos"); }
		 */
		 
		 
//	1045 - X
		 
		
		/*
		 * double n1 = sc.nextDouble(); double n2 = sc.nextDouble(); double n3 =
		 * sc.nextDouble();
		 * 
		 * double A, B, C; if (n1 > n2 && n1 > n3) { A = n1; if (n2 > n3) { B = n2; C =
		 * n3; } else { B = n3; C = n2; } } else if (n2 > n3) { A = n2; if (n1 > n3) { B
		 * = n1; C = n3; } else { B = n3; C = n1; } } else { A = n3; if (n1 > n2) { B =
		 * n1; C = n2; } else { B = n2; C = n1; } }
		 * 
		 * if (A >= B+C) { System.out.println("NAO FORMA TRIANGULO"); } else { //
		 * primeiro vamos testas as tres possibilidades em relacao a angulos if (A*A ==
		 * B*B + C*C) { System.out.println("TRIANGULO RETANGULO"); } else if (A*A > B*B
		 * + C*C) { System.out.println("TRIANGULO OBTUSANGULO"); } else {
		 * System.out.println("TRIANGULO ACUTANGULO"); }
		 * 
		 * // agora vamos testar se pode ser equilatero ou isosceles if (A == B && B ==
		 * C) { System.out.println("TRIANGULO EQUILATERO"); } else if (A == B || A == C
		 * || B == C) { System.out.println("TRIANGULO ISOSCELES"); } }
		 */
		 

		 
		 
//	1046 - corrigido
		 
		/*
		 * int horaInicial = sc.nextInt(); int horaFinal = sc.nextInt(); int duracao;
		 * 
		 * if (horaInicial < horaFinal) { duracao = horaFinal - horaInicial; } else {
		 * duracao = 24 - horaInicial + horaFinal; }
		 * 
		 * System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		 */
		
//	1047 - corrigido
			
		/*
		 * int hrInicial = sc.nextInt(); int minInicial = sc.nextInt(); int hrFinal =
		 * sc.nextInt(); int minFinal = sc.nextInt(); // 24hrs = 1440 minutos // 1hr =
		 * 60 minutos
		 * 
		 * // transformar horas em minutos int instanteInicial = hrInicial * 60 +
		 * minInicial; int instanteFinal = hrFinal * 60 + minFinal;
		 * 
		 * int duracao; if(instanteInicial < instanteFinal) { duracao = instanteFinal -
		 * instanteInicial; }else { duracao = (24 * 60 - instanteInicial) +
		 * instanteFinal; }
		 * 
		 * int duracaoHoras = duracao / 60; int duracaoMinutos = duracao % 60;
		 * 
		 * System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " +
		 * duracaoMinutos + " MINUTO(S)");
		 */

// 	1049 - corrigido (uso de .equals())
		 
		/*
		 * String tipo1 = sc.nextLine(); String tipo2 = sc.nextLine(); String tipo3 =
		 * sc.nextLine();
		 * 
		 * if(tipo1.equals("vertebrado")) { if(tipo2.equals("ave")) {
		 * if(tipo3.equals("carnivoro")) { System.out.println("aguia"); }else {
		 * System.out.println("pomba"); } }else { if(tipo3.equals("onivoro")) {
		 * System.out.println("homem"); }else { System.out.println("vaca"); } } }else {
		 * if(tipo2.equals("inseto")){ if(tipo3.equals("hematofago")) {
		 * System.out.println("pulga"); }else { System.out.println("lagarta"); } }else {
		 * if(tipo3.equals("hematofago")) { System.out.println("sanguessuga"); }else {
		 * System.out.println("minhoca"); } } }
		 */
//	1050
		 
		/*
		 * int DDD = sc.nextInt(); String cidade;
		 * 
		 * switch(DDD) { case 61: cidade = "Brasilia"; break; case 71: cidade =
		 * "Salvador"; break; case 11: cidade = "Sao Paulo"; break; case 21: cidade =
		 * "Rio de Janeiro"; break; case 32: cidade = "Juiz de Fora"; break; case 19:
		 * cidade = "Campinas"; break; case 27: cidade = "Vitoria"; break; case 31:
		 * cidade = "Belo Horizonte"; break; default: cidade = "DDD nao cadastrado"; }
		 * 
		 * System.out.println(cidade);
		 */
		 
//	1051 - X
		 
		/*
		 * double salario = sc.nextDouble(); double imposto;
		 * 
		 * if(salario <= 2000.0) { imposto = 0.0; }else if(salario <= 3000.0) { imposto
		 * = (salario - 2000.0) * 0.08; }else if(salario <= 4500.00) { imposto =
		 * (salario - 3000.0) * 0.18 + 1000.0 * 0.08; }else { imposto = (salario -
		 * 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08; }
		 * 
		 * if(imposto == 0.0) { System.out.println("Isento"); }else {
		 * System.out.printf("R$ %.2f%n", imposto); }
		 */

//	1052
		 
		/*
		 * int valor = sc.nextInt(); String mes;
		 * 
		 * switch(valor) { case 1: mes = "January"; break; case 2: mes = "February";
		 * break; case 3: mes = "March"; break; case 4: mes = "April"; break; case 5:
		 * mes = "May"; break; case 6: mes = "June"; break; case 7: mes = "July"; break;
		 * case 8: mes = "August"; break; case 9: mes = "September"; break; case 10: mes
		 * = "October"; break; case 11: mes = "November"; break; case 12: mes =
		 * "December"; break; default: mes = ""; }
		 * 
		 * System.out.println(mes);
		 */
		 
//	1060
		  
		/*
		 * int valoresPositivos = 0; float arr[] = new float[6];
		 * 
		 * for(int i = 0; i <= 5; i++) { arr[i] = sc.nextFloat(); if(arr[i] > 0) {
		 * valoresPositivos++; } }
		 * 
		 * System.out.println(valoresPositivos + " valores positivos");
		 */
		 
//	1064
		
		/*
		 * int valoresPositivos = 0; double media = 0; double soma = 0; float arr[] =
		 * new float[6];
		 * 
		 * for(int i = 0; i < arr.length; i++) { arr[i] = sc.nextFloat();
		 * 
		 * if(arr[i] > 0) { valoresPositivos++; soma += arr[i]; } media = soma /
		 * valoresPositivos; }
		 * 
		 * System.out.println(valoresPositivos + " valores positivos");
		 * System.out.printf("%.1f%n",media);
		 */
		 
//	1065
		 
		/*
		 * int valoresPares = 0;
		 * 
		 * float arr[] = new float[5];
		 * 
		 * for(int i = 0; i < arr.length; i++) { arr[i] = sc.nextFloat();
		 * 
		 * if(arr[i] % 2 == 0) { valoresPares++; } }
		 * 
		 * System.out.println(valoresPares + " valores pares");
		 */
		 	 
//	1066
		 
		/*
		 * int valoresPares = 0; int valoresImpares = 0; int valoresPositivos = 0; int
		 * valoresNegativos = 0;
		 * 
		 * float[] arr = new float[5];
		 * 
		 * for(int i = 0; i < arr.length; i++){ arr[i] = sc.nextInt();
		 * 
		 * if(arr[i] % 2 == 0){ valoresPares++; }else { valoresImpares++; }
		 * 
		 * if(arr[i] > 0 ){ valoresPositivos++; }else if(arr[i] < 0 && arr[i] != 0){
		 * valoresNegativos++; } }
		 * 
		 * System.out.println(valoresPares + " valor(es) par(es)");
		 * System.out.println(valoresImpares + " valor(es) impar(es)");
		 * System.out.println(valoresPositivos + " valor(es) positivo(s)");
		 * System.out.println(valoresNegativos + " valor(es) negativo(s)");
		 */
		 
		 
//	1067 - corrigido (variavel)
		 
		/*
		 * int X = sc.nextInt();
		 * 
		 * for(int i = 1; i <= X; i++) { if(i % 2 != 0) { System.out.println(i); } }
		 */
		 
		 

//	1070
	       
		/*
		 * int X = sc.nextInt();
		 * 
		 * for(int i = 0; i < 5; i++) { X++; if(X % 2 != 0) { System.out.println(X); X
		 * += 1; } }
		 */
		 
//	1071
		/*
		 * int x = sc.nextInt(); int y = sc.nextInt();
		 * 
		 * int min, max; if(x < y) { min = x; max = y; }else { min = y; max = x; }
		 * 
		 * int soma = 0; for(int i = min + 1; i < max; i++) { if(i % 2 != 0) { soma +=
		 * i; } }
		 * 
		 * System.out.println(soma);
		 */

//	1072 - corrigido (ordem de saída)
		 
		/*
		 * int N = sc.nextInt(); int countIn = 0; int countOut = 0;
		 * 
		 * for(int i = 0; i < N; i++) { int X = sc.nextInt();
		 * 
		 * if(X >= 10 && X <= 20) { countIn++; }else { countOut++; } }
		 * 
		 * System.out.println(countIn + " in"); System.out.println(countOut + " out");
		 */
		 
//	1074
		 
		/*
		 * int N = sc.nextInt();
		 * 
		 * for(int i = 0; i < N; i++) { int X = sc.nextInt();
		 * 
		 * if(X % 2 == 0 && X > 0) { System.out.println("EVEN POSITIVE"); }else if(X % 2
		 * == 0 && X < 0) { System.out.println("EVEN NEGATIVE"); }else if(X % 2 != 0 &&
		 * X > 0) { System.out.println("ODD POSITIVE"); }else if(X % 2 != 0 && X < 0) {
		 * System.out.println("ODD NEGATIVE"); }else { System.out.println("NULL"); } }
		 */
		 
		 
//	1078 
		 
		/*
		 * int N = sc.nextInt();
		 * 
		 * for(int i = 1; i<=10; i++) { int produto = i * N; System.out.println(i +
		 * " x " + N + " = " + produto); }
		 */
		 
//	1079
		 
		/*
		 * int N = sc.nextInt();
		 * 
		 * for(int i = 0; i < N; i++) { float valor1 = sc.nextFloat(); float valor2 =
		 * sc.nextFloat(); float valor3 = sc.nextFloat();
		 * 
		 * float media = (valor1 * 2 + valor2 * 3 + valor3 * 5) / 10;
		 * 
		 * System.out.printf("%.1f%n", media); }
		 */
		
		 
//	1080 - X
		 
		/*
		 * int maior = sc.nextInt(); int posicao = 1;
		 * 
		 * for(int i = 2; i <= 100; i++) { int valor = sc.nextInt();
		 * 
		 * if(valor > maior ) { maior = valor; posicao = i; } }
		 * 
		 * System.out.println(maior); System.out.println(posicao);
		 */
		 
		 
//	1094 - corrigido (resultado percentual)
		 
		 int N = sc.nextInt();

		 int coelhos = 0;
		 int ratos = 0;
		 int sapos = 0;
		 
		 for(int i = 0; i < N; i++) {
			 
			 int Quantia = sc.nextInt();
			 char Tipo = sc.next().charAt(0);
			 			 
			 			 
			 if(Tipo == 'C') {
				 coelhos += Quantia;
			 }else if(Tipo == 'R') {			
				 ratos += Quantia;
			 }else {			
				 sapos += Quantia;
			 }
			 
		 }
		 
		 int soma = coelhos + ratos + sapos;
		 
		 double percentualCoelho = (double) coelhos / soma * 100.0;
		 double percentualRato = (double) ratos / soma * 100.0;
		 double percentualSapo = (double) sapos / soma * 100.0;
		 
		 System.out.println("Total: " + soma + " cobaias");
		 System.out.println("Total de coelhos: " + coelhos);
		 System.out.println("Total de ratos: " + ratos);
		 System.out.println("Total de sapos: " + sapos);
		 
		 System.out.printf("Percentual de coelhos: %.2f %%%n", percentualCoelho);
		 System.out.printf("Percentual de ratos: %.2f %%%n", percentualRato);
		 System.out.printf("Percentual de sapos: %.2f %%%n", percentualSapo);
		 
		 
		 
//	1113
	       
		/*
		 * int X = sc.nextInt(); int Y = sc.nextInt();
		 * 
		 * while (X != Y) { if(X < Y) { System.out.println("Crescente"); }else {
		 * System.out.println("Decrescente"); } X = sc.nextInt(); Y = sc.nextInt(); }
		 */
	       
//	1114
		 
		/*
		 * int senha = sc.nextInt();
		 * 
		 * while (senha != 2002) { System.out.println("Senha Invalida"); senha =
		 * sc.nextInt(); }
		 * 
		 * System.out.println("Acesso Permitido");
		 */
	       	      	         
		 
//	1115
		 
		/*
		 * int X = sc.nextInt(); int Y = sc.nextInt();
		 * 
		 * while (X != 0 && Y != 0) { if(X > 0 && Y > 0) {
		 * System.out.println("primeiro"); }else if(X < 0 && Y > 0) {
		 * System.out.println("segundo"); }else if(X < 0 && Y < 0) {
		 * System.out.println("terceiro"); }else { System.out.println("quarto"); } X =
		 * sc.nextInt(); Y = sc.nextInt(); }
		 */
		 
//	1116
		 
		/*
		 * int N = sc.nextInt();
		 * 
		 * for(int i = 0; i < N; i++) { int x = sc.nextInt(); int y = sc.nextInt();
		 * double quociente = (double) x / y;
		 * 
		 * if(y == 0) { System.out.println("divisao impossivel"); }else {
		 * System.out.printf("%.1f%n", quociente); } }
		 */
		 
//	1117
		 
		/*
		 * float nota1 = sc.nextFloat();
		 * 
		 * while (nota1 < 0.0 || nota1 > 10.0) { System.out.println("nota invalida");
		 * nota1 = sc.nextFloat(); }
		 * 
		 * float nota2 = sc.nextFloat();
		 * 
		 * while (nota2 < 0.0 || nota2 > 10.0) { System.out.println("nota invalida");
		 * nota2 = sc.nextFloat(); }
		 * 
		 * float soma = nota1 + nota2; float media = soma / 2;
		 * System.out.printf("media = %.2f%n", media);
		 */
		 
//	1132 - corrigido (interpretação)
		 
		/*
		 * int x = sc.nextInt(); int y = sc.nextInt();
		 * 
		 * int min, max;
		 * 
		 * if(x > y) { max = x; min = y; }else { max = y; min = x; }
		 * 
		 * int soma = 0;
		 * 
		 * for(int i = min; i <= max; i++) { if(i % 13 != 0 ) { soma = soma + i; } }
		 * 
		 * System.out.println(soma);
		 */
		 
//	1134
		 
		/*
		 * int codigo = sc.nextInt(); int countAlcool = 0; int countGasolina = 0; int
		 * countDiesel = 0;
		 * 
		 * while(codigo != 4) { if(codigo == 1 ) { countAlcool += 1; }else if(codigo ==
		 * 2) { countGasolina += 1; }else if(codigo == 3) { countDiesel += 1; } codigo =
		 * sc.nextInt(); }
		 * 
		 * 
		 * System.out.println("MUITO OBRIGADO"); System.out.println("Alcool: " +
		 * countAlcool); System.out.println("Gasolina: " + countGasolina);
		 * System.out.println("Diesel: " + countDiesel);
		 */
		 
		 
//	1153 - X
		 
		/*
		 * int N = sc.nextInt(); int fatorial = 1;
		 * 
		 * for(int i = 1; i <= N; i++) { fatorial = fatorial * i; }
		 * 
		 * System.out.println(fatorial);
		 */
		 
//	1154
		 
		/*
		 * int idade = sc.nextInt(); int soma = 0; int count = 0;
		 * 
		 * while (idade > 0) { soma += idade; count += 1; idade = sc.nextInt(); }
		 * 
		 * if(count > 0) { double media = (double) soma / count;
		 * System.out.printf("%.2f%n", media); }
		 */
		
		 
//	1157
		 
		/*
		 * int N = sc.nextInt();
		 * 
		 * for(int i = 1; i <= N;i++) { if(N % i == 0) { System.out.println(i); } }
		 */
		 
		 
//	1159 - corrigido
		 
		/*
		 * int X = sc.nextInt();
		 * 
		 * while(X != 0) { if(X % 2 != 0) { X = X + 1; }
		 * 
		 * int soma = X + X + 2 + X + 4 + X + 6 + X + 8; // int soma = 5 * X + 20;
		 * System.out.println(soma);
		 * 
		 * X = sc.nextInt(); }
		 */	 

		 

		 
	       sc.close();
	 
	    }
}
