package application;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.Product;
import entities.Rent;
import model.entities.NewAccount;
import model.exceptions.AccountException;

public class BoxingAndWrapper {

	
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
		

	}
}
