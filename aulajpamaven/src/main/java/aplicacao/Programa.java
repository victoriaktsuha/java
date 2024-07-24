package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		//criar itens 		
//		Pessoa p1 = new Pessoa(null, "Bob", "bob@mail.com");
//		Pessoa p2 = new Pessoa(null, "Mary", "mary@mail.com");
//		Pessoa p3 = new Pessoa(null, "John", "john@mail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		//inicia transa��o para db
//		em.getTransaction().begin();
		
		//adiciona ao db	
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);		
		
		//envia transa��o para db
//		em.getTransaction().commit();
		
		//buscar pelo id, converter em obj e instanciar obj
		Pessoa p = em.find(Pessoa.class, 2);
//		System.out.println(p);
				
		//apagar do db - o jpa s� apaga instancias/obj monitorados (que acabou de inserir ou recuperada pelo '.find()'), e n�o destacados
		//remove tamb�m � uma transa��o e precisa das linhas:
		em.getTransaction().begin();
		em.remove(p);		
		em.getTransaction().commit();
		
		System.out.println("Done!");
		
		//fecha conex�o
		em.close();
		emf.close();
		
		//Incluindo JPA para persistir os objetos em banco de dados (etapas no PDF)

	}

}
