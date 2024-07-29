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
		//faz conexão com o db e acesso aos dados
		EntityManager em = emf.createEntityManager();
		
		//INICIA TRANSAÇÃO para db
//		em.getTransaction().begin();
		
		//quando o JPA faz uma operação que não é apenas leitura de dados, ele precisa de uma transação
		//INSERE/SALVA no db	
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);		
				
		//CONFIRMA/ENVIA as alterações para o db
//		em.getTransaction().commit();
		
		//BUSCAR no db pelo id, converter em obj e instanciar obj - aqui dá pra perceber a diferença do JPA
		Pessoa p = em.find(Pessoa.class, 2);
		System.out.println(p);
				
		//APAGAR do db - o jpa só apaga instancias/obj monitorados (que acabou de inserir ou recuperada pelo '.find()'), e não destacados
		//remove também é uma transação e precisa das linhas de begin e commit:
		em.getTransaction().begin();
		em.remove(p);		
		em.getTransaction().commit();
		
		System.out.println("Done!");
		
		//fecha conexões
		em.close();
		emf.close();
		

	}

}
