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
				
		
		/* La�o "for each" 
		 * Sintaxe opcional e simplificada para percorrer cole��es
		 * 
		 * Sintaxe:
		 * for (Tipo apelido : cole��o){
		 *		<comando 1>
		 *		<comando 2>
		 * }
		 */

		String[] vect = new String[]{"Maria", "Bob", "Joao"};
		
		System.out.println("la�o for");
		
		//la�o for
		for(int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("---------------------------");
		
		System.out.println("la�o for each");
		
		//la�o for each
		for(String obj : vect) {
			System.out.println(obj);
		}
		

	}
}
