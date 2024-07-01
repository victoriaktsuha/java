package application;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;
import model.entities.NewAccount;
import model.exceptions.AccountException;

public class Methods {

	
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
		
		
		//Criando um m�todo para obtermos os benef�cios de reaproveitamento e delega��o
		
		/*
		 * Agora vamos melhorar nossa classe acrescentando nela um m�todo para calcular a �rea. 
		 * Quais s�o os benef�cios de se calcular a �rea de um tri�ngulo por meio de um m�todo dentro da classe Triangle ? 
		 * - Reaproveitamento de c�digo: n�s eliminamos o c�digo repetido (c�lculo das �reas dos tri�ngulos x e y) no
		 * programa principal. 
		 * - Delega��o das responsabilidades: quem deve ser respons�vel por saber como calcular a �rea de um tri�ngulo � o pr�prio
		 * tri�ngulo. A l�gica do c�lculo da �rea n�o deve estar em outro lugar.
		 */
		
		//utilizando m�todo area
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("�rea do tri�ngulo X: %.4f%n", areaX);
		
		System.out.printf("�rea do tri�ngulo Y: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Maior �rea: X");
		}else {
			System.out.println("Maior �rea: Y");
		}
		
		//classe � a defini��o do tipo e objeto � a instancia��o da classe
		
		/*
		
		-- Instancia��o --
		
		Exemplo:
		double areaX, areaY, p;
		Triangle x, y;
		
		- Mem�ria
			> Stack - onde as vari�veis est�ticas como areaX, areaY e p s�o criadas.
			Durante a executa��o do programa, podemos fazer uma aloca��o din�mica de mem�ria atrav�s do 'new' 
			utilizado para instanciar um objeto, que ser� armazenado no Heap		
			> Heap - aqui s�o criados objetos din�micos atrav�s da aloca��o din�mica de mem�ria feita atrav�s do 'new'.
			As vari�veis x e y, mesmo que objetos no heap, tamb�m estar�o no Stack, mas armazenando um endere�o de 
			mem�ria do objeto criado no Heap
		 
		 */
		
		
	}
}
