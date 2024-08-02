package application;

public class WebServicesSpringBootJPAHibernate {

	public static void main(String[] args) {
		
		//296-298.Projeto Web Services com Spring Boot e JPA / Hibernate - Visão geral
		
		/* Objetivos:
		 * - Criar projeto com Spring Boot Java
		 * - Implementar modelo de domínio (maior)
		 * - Estruturar camadas lógicas: resource, service, repository
		 * - Configurar banco de dados de teste (H2)
		 * - Povoar banco de dados
		 * * criar base de dados relacional automaticamente
		 * - CRUD - Create, Retrieve, Update, Delete
		 * - Tratamento de exceções
		 * 
		 * Para desenvolvimento:
		 * - Spring Boot - framework para criar aplicação
		 * - Apache Tomcat - container do web para executar a aplicação
		 * - Maven -  gerenciador de dependencias
		 * - H2 - db em memória para testes
		 * - Postman - testa requisições
		 * 
		 * Para ambiente de produção:
		 * - PostgresSQL - db relacional
		 * - Heroku - para publicar aplicação
		 * 
		 * (https://github.com/acenelio/workshop-springboot2-jpa)
		 * (https://github.com/acenelio/workshop-springboot3-jpa)
		 */
		
		//299. Criação do projeto em Spring Initializr
		
		//300.Entidade User e seu resource
		
		/* Resource é um recurso web correspondente a uma entidade - nesse caso, 
		 * disponibilizará 2 endpoints para recuperar
		 * os usuários cadastrados e um usuário informando seu id
		 * 
		 * Em Java, criar entidades nessa ordem:
		 * - Basic attributes
		 * - Associations (instantiate collections)
		 * - Constructors
		 * - Getters & Setters (collections: only get)
		 * - hashCode & equals
		 * - Serializable
		 */
		
		
		//301. H2 database, test profile, JPA
		
		/* - JPA & H2 dependencies -> H2 é um db de teste, muito utilizado em Java para 
		 * testes, sem instalação pois é em memória e já vem integrado ao projeto
		 * 
		 * - test profile - perfil do projeto para testes; Há outros tipos de perfil, 
		 * como perfil para desenvolvimento, com outro db especifico para não reiniciar
		 * toda vez que o projeto execução; Tem tbm o perfil de produção, quaando o 
		 * projeto está implantado no cliente que vai utilizar o sistema.
		 * 
		 * - application.properties
		 * - application-test.properties
		 * - Entity: JPA mapping
		 * - Repository
		 */

	}

}
