package application;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.EmployeeList;
import model.entities.NewAccount;
import model.exceptions.AccountException;

public class ListType {

	
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
		 * Listas 
		 * - Conceito de lista: � uma estrutura de dados homog�nea (dados do
		 * mesmo tipo), ordenada (elementos acessados por meio de posi��es), inicia
		 * vazia, e seus elementos s�oa locados sob demanda, cada elemento ocupa um "n�"
		 * (ou nodo) da lista 
		 * - Tipo (interface): List (! n�o � classe, � interface) ->
		 * interface � um tipo que define apenas as especifica��es das opera��es. 
		 * - Classes que implementam: ArrayList(mistura de vetor e lista), LinkedList,
		 * etc. -> utilizadas para implementar a interface List, pois ela sozinha n�o
		 * pode ser implementada pois n�o � classe. 
		 * - Vantagens: tamanho vari�vel,facilidade para se realizar inser��es e dele��es 
		 * - Desvantagens: acesso sequencial aos elementos* -> dependendo da implementa��o da lista, a navega��o
		 * � otimizada, como � o caso de ArrayList 
		 * Demo: 
		 * - Tamanho da lista: size() 
		 * - Inserir elemento na lista: add(obj), add(int, obj) 
		 * - Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate) 
		 * - Encontrar posi��o de elemento: indexOf(obj), lastIndexOf(obj) 
		 * - Filtrar lista com base em predicado: 
		 * List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList()); 
		 * - Encontrar primeira ocorr�ncia com base em predicado: 
		 * Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);
		 * - Assuntos pendentes: interfaces, generics, predicados (lambda)
		 */
		
		//List n�o aceita tipos primitivos, como int, char, etc
		//<Integer> � o generics, quando pode parametrizar a defini��o de um tipo informando um outro tipo espec�fico
		//= new ArrayList<>(); � a classe que implementa a interface List
		List<String> list = new ArrayList<>();
		
		//adicionando itens a lista
		list.add("Maria");
		list.add("Ana");
		list.add("Bob");
		list.add("Joao");
		//adiciona elemento em uma posi��o espec�fica
		list.add(2, "Marco");
		
		//consultar tamanho da lista
		System.out.println("Tamanho da lista: " + list.size());
		
		//percorrendo e imprimindo a lista
		for(String x : list) {
			System.out.println(x);
		}
		
		//removendo da lista
			//list.remove("Ana");
			//list.remove(3);
		System.out.println("--------------------");
		//removendo da lista por predicado atr�ves de fun��o lambda (que retorna true or false)
		//remove todos os itens que o primeiro caractere � M - "x -> x.charAt(0) == 'M'" � uma fun��o lambda
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("--------------------");
		//encontrando a posi��o de um elemento
		System.out.println("index of Bob: " + list.indexOf("Bob"));
		//encontrando a posi��o de um elemento que n�o existe
		System.out.println("index of Felix: " + list.indexOf("Felix"));
		System.out.println("--------------------");
		//filtrar a lista por predicado
		//Uma nova lista ir� receber os resultados filtrados de list; list por sua vez deve ser convertido em stream para poder filtrar pela opera��o lambda e depois o stream � convertido em lista novamente atrav�s do collect e retorna o resultado para a nova lista 
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for(String x : result) {
			System.out.println(x);
		}
		System.out.println("--------------------");
		//encontrar elemento da lista que atenda a um certo predicado
		//a lista ser� filtrada para encontrar o primeiro elemento que tenha a letra 'A' e ser� armzenada na vari�vel name, se o elemento n�o exisitr, ele retorna nulo
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		System.out.println("--------------------");
		
		String name2 = list.stream().filter(x -> x.charAt(0) == 'L').findFirst().orElse(null);
		System.out.println(name2);
		
		/*
		 * Fazer um programa para ler um n�mero inteiro N e depois os dados (id, nome e salario)
		 * de N funcion�rios. N�o deve haver repeti��o de id.
		 * Em seguida, efetuar o aumento de x por ceno no sal�rio de um determinado funcion�rio.
		 * Para isso, o programa deve ler um id e o valor X. Se o id informado n�o existir,
		 * mostrar uma mensagem e abortar a opera��o. Ao final, mostrar a listagem atualizada
		 * dos funcion�rios, conforme exemplos.
		 * Lembre-se de aplicar a t�cnica de encapsulamento para n�o permitr que o sal�rio possa
		 * ser mudado livremente. Um sal�rio s� pode ser aumentado com base em uma opera��o
		 * de aumento por porcentagem dada.
		 */
		

		List<EmployeeList> list2 = new ArrayList<EmployeeList>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
				
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.printf("Employee #%d:\n", i + 1);
			System.out.print("Id:");
			Integer id = sc.nextInt();
			System.out.print("Name:");
			sc.nextLine();
			String name3 = sc.nextLine();
			System.out.print("Salary:");
			Double salary = sc.nextDouble();
			
			EmployeeList funcionario = new EmployeeList(id, name3, salary);
			
			list2.add(funcionario);
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idSalary = sc.nextInt();
		
		Integer pos = position(list2, idSalary);
		if(pos == null) {
			System.out.println("This id does not exist!");
		}else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			list2.get(pos).increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		
		for(EmployeeList emp : list2) {
			System.out.println(emp);
		}
		
		sc.close();
	}
	
	public static Integer position(List<EmployeeList> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
