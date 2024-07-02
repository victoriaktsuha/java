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
		 * Listas 
		 * - Conceito de lista: é uma estrutura de dados homogênea (dados do
		 * mesmo tipo), ordenada (elementos acessados por meio de posições), inicia
		 * vazia, e seus elementos sãoa locados sob demanda, cada elemento ocupa um "nó"
		 * (ou nodo) da lista 
		 * - Tipo (interface): List (! não é classe, é interface) ->
		 * interface é um tipo que define apenas as especificações das operações. 
		 * - Classes que implementam: ArrayList(mistura de vetor e lista), LinkedList,
		 * etc. -> utilizadas para implementar a interface List, pois ela sozinha não
		 * pode ser implementada pois não é classe. 
		 * - Vantagens: tamanho variável,facilidade para se realizar inserções e deleções 
		 * - Desvantagens: acesso sequencial aos elementos* -> dependendo da implementação da lista, a navegação
		 * é otimizada, como é o caso de ArrayList 
		 * Demo: 
		 * - Tamanho da lista: size() 
		 * - Inserir elemento na lista: add(obj), add(int, obj) 
		 * - Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate) 
		 * - Encontrar posição de elemento: indexOf(obj), lastIndexOf(obj) 
		 * - Filtrar lista com base em predicado: 
		 * List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList()); 
		 * - Encontrar primeira ocorrência com base em predicado: 
		 * Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);
		 * - Assuntos pendentes: interfaces, generics, predicados (lambda)
		 */
		
		//List não aceita tipos primitivos, como int, char, etc
		//<Integer> é o generics, quando pode parametrizar a definição de um tipo informando um outro tipo específico
		//= new ArrayList<>(); é a classe que implementa a interface List
		List<String> list = new ArrayList<>();
		
		//adicionando itens a lista
		list.add("Maria");
		list.add("Ana");
		list.add("Bob");
		list.add("Joao");
		//adiciona elemento em uma posição específica
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
		//removendo da lista por predicado atráves de função lambda (que retorna true or false)
		//remove todos os itens que o primeiro caractere é M - "x -> x.charAt(0) == 'M'" é uma função lambda
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("--------------------");
		//encontrando a posição de um elemento
		System.out.println("index of Bob: " + list.indexOf("Bob"));
		//encontrando a posição de um elemento que não existe
		System.out.println("index of Felix: " + list.indexOf("Felix"));
		System.out.println("--------------------");
		//filtrar a lista por predicado
		//Uma nova lista irá receber os resultados filtrados de list; list por sua vez deve ser convertido em stream para poder filtrar pela operação lambda e depois o stream é convertido em lista novamente através do collect e retorna o resultado para a nova lista 
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for(String x : result) {
			System.out.println(x);
		}
		System.out.println("--------------------");
		//encontrar elemento da lista que atenda a um certo predicado
		//a lista será filtrada para encontrar o primeiro elemento que tenha a letra 'A' e será armzenada na variável name, se o elemento não exisitr, ele retorna nulo
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		System.out.println("--------------------");
		
		String name2 = list.stream().filter(x -> x.charAt(0) == 'L').findFirst().orElse(null);
		System.out.println(name2);
		
		/*
		 * Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario)
		 * de N funcionários. Não deve haver repetição de id.
		 * Em seguida, efetuar o aumento de x por ceno no salário de um determinado funcionário.
		 * Para isso, o programa deve ler um id e o valor X. Se o id informado não existir,
		 * mostrar uma mensagem e abortar a operação. Ao final, mostrar a listagem atualizada
		 * dos funcionários, conforme exemplos.
		 * Lembre-se de aplicar a técnica de encapsulamento para não permitr que o salário possa
		 * ser mudado livremente. Um salário só pode ser aumentado com base em uma operação
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
