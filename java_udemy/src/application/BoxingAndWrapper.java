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
		 * Boxing, unboxing, wrapper classes
		 * 
		 * - Boxing é o processo de conversão de um objeto tipo valor para um objeto
		 * tipo referência compatível
		 * 
		 * int x = 20; 
		 * Object obj = x;
		 * 
		 * Object é a classe mais genérica do Java, todas as classes por padrão são
		 * 'filhas' dessa classe object. No caso acima, x passa a ser do tipo object e
		 * será alocado um objeto no heap contendo o valor 20 e a variável obj será
		 * ponteiro para essa alocação.
		 * 
		 * - Unboxing é o processo de conversão de um objeto tipo referência para um
		 * objeto tipo valor compatível
		 * 
		 * int y = (int) obj;
		 * 
		 * Será criada no stack uma alocação y tipo valor com valor 20
		 * 
		 * - Wrapper classes 
		 * São classes equivalentes aos tipos primitivos, para que
		 * boxing e unboxing seja feito de forma natural na linguagem. Para cada tipo
		 * primitivo, ele tem um tipo classe compatível com o mesmo tipo - 
		 * Exemplo:
		 * int(primitivo) = Integer(classe), 
		 * boolean(primitivo) = Boolean(classe),
		 * char(primitivo) = Character(classe), 
		 * byte(primitivo) = Byte(classe). 
		 * Elas tem o objetivo de tratar os tipos primitivos como classes, de forma transparente
		 * ao compilador, evitando conversões e castings. Uso comum de wrapper classes:
		 * campos de entidade em sistemas de informação (IMPORTANTE!) - pois tipos
		 * referência (classes) aceitam valor null e usufruem dos recursos OO
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
		 * Utilizar em atributos de classes e declaração de variáveis
		 */
		

	}
}
