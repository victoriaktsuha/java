package application;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Company;
import entities.Individual;
import entities.Rectangle2;
import entities.Shape;
import entities.TaxPayer;
import entities.enums.Color;
import model.entities.NewAccount;
import model.exceptions.AccountException;

public class AbstractMethods {

	
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
		
		//M�todos abstratos
		
		/* S�o m�todos que n�o possuem implementa��o. M�todos precisam ser abstratos quando a cl asse � gen�rica demais
		 * para conter sua implementa��o. Se uma classe possuir pelo menos um m�todo abstrato, ent�o esta classe tamb�m
		 * � abstrata. No UML, sua nota��o � em it�lico.
		 */
		
		//Exercicio resolvido - (https://github.com/acenelio/inheritance7-java)
		
		/* Fazer um programa para ler os dados de N figuras (N fornecido pelo usu�rio), e 
		 * depois mostrar as �reas destas figuras na mesma ordem em que foram digitadas.
		 */
		
		List<Shape> list = new ArrayList<>();	
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = sc.next().charAt(0);	
			System.out.print("Color (BLACK/BLUE/RED): ");
			//o que for digitado aqui ser� convertido para objeto do tipo enumerado Color
			Color color = Color.valueOf(sc.next());
			
			if(ch == 'r') {
				System.out.print("Width: ");
				double width =  sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add(new Rectangle2(color, width, height));
			}else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));				
			}
			
		}		
		
		System.out.println();
		System.out.println("SHAPES AREAS:");
		for(Shape sh : list) {
			System.out.println(String.format("%.2f", sh.area()));
		}
		
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
		
		List<TaxPayer> list2 = new ArrayList<>();		
		
		System.out.print("Enter the number of tax payers: ");
		int n2 = sc.nextInt();
		
		for(int i = 1; i <= n2; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();
			if(ch == 'c') {				
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list2.add(new Company(name, anualIncome, numberOfEmployees));
			}else {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				list2.add(new Individual(name, anualIncome, healthExpenditures));
			}
		}
		
		System.out.println();		
		System.out.println("TAXES PAID:");
		
		double sum = 0.0;
		
		for(TaxPayer taxPayer : list2) {
			System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", taxPayer.tax()));
			sum += taxPayer.tax();
		}
		
		System.out.printf("%nTOTAL TAXES: $ %.2f", sum);
		
	}
}
