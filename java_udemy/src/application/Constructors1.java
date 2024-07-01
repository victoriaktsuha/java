package application;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Constructors1 {

	
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
		
		
		
		/*
		 * Construtores
		 * 
		 * - � uma opera��o especial da classe, que executa no momento da instancia��o
		 * do objeto
		 * 
		 * - Usos comuns: 
		 * - Iniciar valores dos atributos 
		 * - Permitir ou obrigar que o objeto receba dados / depend�ncias no momento de sua instancia��o (inje��o da
		 * depend�ncia)
		 * 
		 * - Se um construtor customizado n�o for especificado, a classe disponibiliza o
		 * construtor padr�o: Product p = new Product();
		 * 
		 * - � poss�vel especificar mais de um construtor na mesma classe (sobrecarga)
		 */
		
		//Proposta de melhoria para o exerc�cio da class Product - this/construtor
		
		/* Quando executamos o comando abaixo, instanciamos um produto "product" com seus atributos "vazios":
		 * Na mem�ria, os atributos dessa instancia (name, price, quantity) est�o zerados.
		 * Entretanto, faz sentido um produto que n�o tem nome e n�o tem pre�o ?
		 * Com o intuito de evitar a exist�ncia de produtos sem nome e sem pre�o, � poss�vel fazer
		 * com que seja obrigat�ria a inicia��o desse valores ?
		 */
				
		//Primeiro � informado os dados atrav�s do scanner para que os parametros obrigat�rios sejam recebidos pelo produto (objeto) depois
		System.out.println("Enter product data: ");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();	
		
		
		Product product = new Product(name, price, quantity);
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		

	}
}
