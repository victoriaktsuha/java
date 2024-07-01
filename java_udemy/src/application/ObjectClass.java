package application;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.Product;
import entities.Rectangle;
import entities.Student;

public class ObjectClass {

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
		
		//Come�ando a resolver um segundo problema exemplo
		
		/*
		 * Fazer um programa para ler os dados de um produto em estoque (nome, pre�o e quantidade no estoque.) Em seguida: 
		 * - Mostrar os dados do produto (nome, pre�o, quantidade no estoque, valor total no estoque) 
		 * - Realizar uma entrada no estoque e mostrar novamente os dados do produto 
		 * - Realizar uma sa�da no estoque e mostrar novamente os dados do produto
		 * 
		 * Para resolver este problema, voc� deve criar uma classe conforme projeto abaixo:
		 * 
		 * ------------------------------------ 
		 * Product
		 * ------------------------------------ 
		 * - Name: string 
		 * - Price: double 
		 * - Quantity: int 
		 * ------------------------------------ 
		 * + TotalValueInStock():double 
		 * + AddProducts(quantity:int):void 
		 * + RemoveProducts(quantity:int):void 
		 * ------------------------------------ 
		 */
		
		/*Object e toString
		*- Toda classe java � uma subclasse da classe Object
		*	- Qualquer vari�vel que voc� tiver no seu programa, ela vai ser um tipo - ex.: Triangle, Product - 
		*e cada um desses tamb�m � do tipo Object, e o tipo Object tem alguns m�todos padr�o.
		*
		*- Object possui os seguintes m�todos:
		*	- getClass - retorna o tipo do objeto
		*	- equals - compara se o objeto � igual ao outro
		*	- hashCode - retorna um c�digo hash do objeto
		*	- toString - converte o objeto para string
		*/
		
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		
		System.out.print("Name: ");
		//product.name = sc.nextLine();
		product.setName(sc.nextLine());
		System.out.print("Price: ");
		//product.price = sc.nextDouble();
		product.setPrice(sc.nextDouble());
		System.out.print("Quantity in stock: ");		
		//product.quantity = sc.nextInt();				
		//product.setQuantity(sc.nextInt());		
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		// Exerc�cios
		
		/*
		 * 1) Fazer um programa para ler os valores da largura e altura de um ret�ngulo.
		 * Em seguida, mostrar na tela o valor de sua �rea, per�metro e diagonal. 
		 * Usar uma classe como mostrado no UML abaixo:
		 * 
		 * ----------------------- 
		 * Rectangle 
		 * ----------------------- 
		 * - Width: double 
		 * - Height: double 
		 * ----------------------- 
		 * + Area(): double 
		 * + Perimeter(): double
		 * + Diagonal(): double 
		 * -----------------------
		 * 
		 * Exemplo: 
		 * Enter rectangle width and height: 
		 * 3.00 
		 * 4.00 
		 * AREA = 12.00 
		 * PERIMETER = 14.00 
		 * DIAGONAL = 5.00 
		 */
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.println(rectangle);
		
		/*
		 * 2) Fazer um programa para ler os dados de um funcion�rio (nome, sal�rio bruto e imposto). 
		 * Em seguida, mostrar os dados do funcion�rio (nome e sal�rio l�quido). 
		 * Em seguida, aumentar o sal�rio do funcion�rio com base em uma porcentagem dada 
		 * (somente o sal�rio bruto � afetado pela porcentagem) e
		 * mostar novamente os dados do funcion�rio. Use a classe projetada abaixo:
		 * 
		 * ------------------------------------------- 
		 * Employee
		 * ------------------------------------------- 
		 * - Name: String 
		 * - GrossSalary: double 
		 * - Tax: double 
		 * ------------------------------------------- 
		 * + NetSalary(): double 
		 * + IncreaseSalary(percentage: double): void
		 * -------------------------------------------
		 * 
		 * Exemplo: 
		 * 
		 * Name: Joao Silva  
		 * Gross salary: 6000.00 
		 * Tax: 1000.00
		 * 
		 * Employee: Joao Silva, $ 5000.00
		 * 
		 * Which percentage to increase salary ? 10.0
		 * 
		 * Updated data: Joao Silva, $ 5600.00
		 * 
		 */
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		System.out.println();
				
		System.out.println("Employee: " + employee);
		System.out.println();
		System.out.print("Which percentage to increase salary ? ");
		double percentage = sc.nextDouble();
		employee.increasySalary(percentage);
		System.out.println();
		
		System.out.println("Updated data: " + employee);
		
		/*
		 * 3) Fazer um programa para ler o nome de um aluno e as tr�s notas que ele
		 * obteve nos tr�s trimestres do ano (primeiro trimestre vale 30 e o segundo e
		 * terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano.
		 * Dizer tamb�m se o aluno est� aprovado (PASS) ou n�o (FAILED) e, em caso
		 * negativo, quantos pontos faltam para o aluno obter o m�nimo para ser aprovado
		 * (que � 60% da nota). Voc� deve criar uma classe Student para resolver este
		 * problema. *elaborar diagrama de classe
		 * 
		 * ----------------------------
		 * Student
		 * ----------------------------
		 * - Name: String
		 * - Nota1: double
		 * - Nota2: double
		 * - Nota3: double
		 * ----------------------------
		 * + Media(): double
		 * + Faltante(): double
		 * ----------------------------
		 * 
		 * Exemplos: 
		 * ------------------- 
		 * Entrada: 
		 * Alex Green 
		 * 27.00
		 * 31.00
		 * 32.00
		 * 
		 * Sa�da: 
		 * FINAL GRADE = 90.00 
		 * PASS 
		 * -------------------- 
		 * Entrada: 
		 * Alex Green
		 * 17.00 
		 * 20.00 
		 * 15.00
		 * 
		 * Sa�da: 
		 * FINAL GRADE = 52.00 
		 * FAILED 
		 * MISSING 8.00 POINTS 
		 * ---------------------
		 */
		
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		
		double media = student.media();
		
		System.out.printf("FINAL GRADE = %.2f%n", media);
 
		/* minha solu��o - sem o m�todo faltante()
		if(media < 60) {
			System.out.println("FAILED");
			System.out.println("MISSING " + String.format("%.2f", 60 - media) + " POINTS");
		}else {
			System.out.println("PASS");
		}
		*/
		
		if(media < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.faltante());
		}else {
			System.out.println("PASS");
		}
		

	}
}
