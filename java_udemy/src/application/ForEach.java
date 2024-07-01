package application;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.Product;
import entities.Rent;
import model.entities.NewAccount;
import model.exceptions.AccountException;

public class ForEach {

	
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
				
		
		/* Laço "for each" 
		 * Sintaxe opcional e simplificada para percorrer coleções
		 * 
		 * Sintaxe:
		 * for (Tipo apelido : coleção){
		 *		<comando 1>
		 *		<comando 2>
		 * }
		 */

		String[] vect = new String[]{"Maria", "Bob", "Joao"};
		
		System.out.println("laço for");
		
		//laço for
		for(int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("---------------------------");
		
		System.out.println("laço for each");
		
		//laço for each
		for(String obj : vect) {
			System.out.println(obj);
		}
		

	}
}
