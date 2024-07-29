package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		//criar itens - para enviar ao db, o id (se houver), deve ser nulo		
//		Pessoa p1 = new Pessoa(null, "Bob", "bob@mail.com");
//		Pessoa p2 = new Pessoa(null, "Mary", "mary@mail.com");
//		Pessoa p3 = new Pessoa(null, "John", "john@mail.com");
		
		//cria o EntityManager - recebe o persistence unit name, criado no arquivo 'persistence.xml'
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		//faz conex�o com o db e acesso aos dados
		EntityManager em = emf.createEntityManager();
		
		//INICIA TRANSA��O para db
//		em.getTransaction().begin();
		
		//quando o JPA faz uma opera��o que n�o � apenas leitura de dados, ele precisa de uma transa��o
		//INSERE/SALVA no db	
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);		
				
		//CONFIRMA/ENVIA as altera��es para o db
//		em.getTransaction().commit();
		
		//BUSCAR no db pelo id, converter em obj e instanciar obj - aqui d� pra perceber a diferen�a do JPA
		Pessoa p = em.find(Pessoa.class, 2);
		System.out.println(p);
				
		//APAGAR do db - o jpa s� apaga instancias/obj monitorados (que acabou de inserir ou recuperada pelo '.find()'), e n�o destacados
		//remove tamb�m � uma transa��o e precisa das linhas de begin e commit:
		em.getTransaction().begin();
		em.remove(p);		
		em.getTransaction().commit();
		
		System.out.println("Done!");
		
		//fecha conex�es
		em.close();
		emf.close();
		

	}

}
