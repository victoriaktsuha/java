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
			
		String nome1 = sc.next();
		int idade1 = sc.nextInt();
		String nome2 = sc.next();
		int idade2 = sc.nextInt();
		
//		double media = (double)(idade1 + idade2) / 2;
		double media = (idade1 + idade2) / 2.0;
		
		System.out.printf("A idade media de %s e %s e de %.1f anos%n", nome1, nome2, media);
		
		sc.close();
				
	}
}