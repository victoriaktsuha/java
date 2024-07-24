package aplicacao;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(1, "Bob,", "bob@mail.com");
		Pessoa p2 = new Pessoa(2, "Mary,", "mary@mail.com");
		Pessoa p3 = new Pessoa(3, "John,", "john@mail.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}

}
