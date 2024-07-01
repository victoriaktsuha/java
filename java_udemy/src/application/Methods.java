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
		
		
		//Criando um método para obtermos os benefícios de reaproveitamento e delegação
		
		/*
		 * Agora vamos melhorar nossa classe acrescentando nela um método para calcular a área. 
		 * Quais são os benefícios de se calcular a área de um triângulo por meio de um método dentro da classe Triangle ? 
		 * - Reaproveitamento de código: nós eliminamos o código repetido (cálculo das áreas dos triângulos x e y) no
		 * programa principal. 
		 * - Delegação das responsabilidades: quem deve ser responsável por saber como calcular a área de um triângulo é o próprio
		 * triângulo. A lógica do cálculo da área não deve estar em outro lugar.
		 */
		
		//utilizando método area
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Área do triângulo X: %.4f%n", areaX);
		
		System.out.printf("Área do triângulo Y: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Maior área: X");
		}else {
			System.out.println("Maior área: Y");
		}
		
		//classe é a definição do tipo e objeto é a instanciação da classe
		
		/*
		
		-- Instanciação --
		
		Exemplo:
		double areaX, areaY, p;
		Triangle x, y;
		
		- Memória
			> Stack - onde as variáveis estáticas como areaX, areaY e p são criadas.
			Durante a executação do programa, podemos fazer uma alocação dinâmica de memória através do 'new' 
			utilizado para instanciar um objeto, que será armazenado no Heap		
			> Heap - aqui são criados objetos dinâmicos através da alocação dinâmica de memória feita através do 'new'.
			As variáveis x e y, mesmo que objetos no heap, também estarão no Stack, mas armazenando um endereço de 
			memória do objeto criado no Heap
		 
		 */
		
		
	}
}
