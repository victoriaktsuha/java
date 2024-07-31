package application;

public class WebServicesSpringBootJPAHibernate {

	public static void main(String[] args) {
		
		//296-298.Projeto Web Services com Spring Boot e JPA / Hibernate - Vis�o geral
		
		/* Objetivos:
		 * - Criar projeto com Spring Boot Java
		 * - Implementar modelo de dom�nio (maior)
		 * - Estruturar camadas l�gicas: resource, service, repository
		 * - Configurar banco de dados de teste (H2)
		 * - Povoar banco de dados
		 * * criar base de dados relacional automaticamente
		 * - CRUD - Create, Retrieve, Update, Delete
		 * - Tratamento de exce��es
		 * 
		 * Para desenvolvimento:
		 * - Spring Boot - framework para criar aplica��o
		 * - Apache Tomcat - container do web para executar a aplica��o
		 * - Maven -  gerenciador de dependencias
		 * - H2 - db em mem�ria para testes
		 * - Postman - testa requisi��es
		 * 
		 * Para ambiente de produ��o:
		 * - PostgresSQL - db relacional
		 * - Heroku - para publicar aplica��o
		 * 
		 * (https://github.com/acenelio/workshop-springboot2-jpa)
		 * (https://github.com/acenelio/workshop-springboot3-jpa)
		 */
		
		//299. Cria��o do projeto em Spring Initializr
		
		//300.Entidade User e seu resource
		
		/* Resource � um recurso web correspondente a uma entidade - nesse caso, 
		 * disponibilizar� 2 endpoints para recuperar
		 * os usu�rios cadastrados e um usu�rio informando seu id
		 * 
		 * Em Java, criar entidades nessa ordem:
		 * - Basic attributes
		 * - Associations (instantiate collections)
		 * - Constructors
		 * - Getters & Setters (collections: only get)
		 * - hashCode & equals
		 * - Serializable
		 */
		
		

	}

}
