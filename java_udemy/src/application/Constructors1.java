package application;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Constructors1 {

	
	public static void main(String[] args) throws ParseException {
	//public static void main(String[] args) throws ParseException {
		
		/* quando "throws ParseException" não é acrescentado ao método principal, estamos
		 * informando ao programa que esse método não lança nenhuma exceção/erro. Mas se 
		 * utilizarmos uma chamada dentro de Main que pode lançar uma exceção, como é o 
		 * caso do .parse(), o compilador vai indicar erro para que essa exceção seja 
		 * tratada ou propagada("jogada" para outro metodo resolver) no método que ela se encontra. Acrescentando esse termo, 
		 * indicdos que essa exceção não precisa ser tratada pelo método que ela está 
		 * inserida.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		/*
		 * Construtores
		 * 
		 * - É uma operação especial da classe, que executa no momento da instanciação
		 * do objeto
		 * 
		 * - Usos comuns: 
		 * - Iniciar valores dos atributos 
		 * - Permitir ou obrigar que o objeto receba dados / dependências no momento de sua instanciação (injeção da
		 * dependência)
		 * 
		 * - Se um construtor customizado não for especificado, a classe disponibiliza o
		 * construtor padrão: Product p = new Product();
		 * 
		 * - É possível especificar mais de um construtor na mesma classe (sobrecarga)
		 */
		
		//Proposta de melhoria para o exercício da class Product - this/construtor
		
		/* Quando executamos o comando abaixo, instanciamos um produto "product" com seus atributos "vazios":
		 * Na memória, os atributos dessa instancia (name, price, quantity) estão zerados.
		 * Entretanto, faz sentido um produto que não tem nome e não tem preço ?
		 * Com o intuito de evitar a existência de produtos sem nome e sem preço, é possível fazer
		 * com que seja obrigatória a iniciação desse valores ?
		 */
				
		//Primeiro é informado os dados através do scanner para que os parametros obrigatórios sejam recebidos pelo produto (objeto) depois
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
