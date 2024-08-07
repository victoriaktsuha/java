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
		
		
		/* Resource Layer
		 * Resource é um recurso web correspondente a uma entidade - nesse caso, 
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
		
		//302. JPA repository, injeção de dependência, database seeding
		
		/* Data Access Layer
		 * - Implementar o primeiro repository utilizando o JPA
		 * repository, do Spring Data JPA, que é um sub-framework
		 * do ecossistema Spring
		 * - Injeção de dependência automatica feita pelo container
		 * do framework
		 * - Primeira instanciação do banco de dados - database seeding
		 */
		
		//303. Camada de serviço, registro de componentes		
		
		//304. Entidade Pedido. Datas com Instant e padrão ISO 8601 - PARTE 1	
		
		/* Se relaciona/associa com User 
		 */
		
		//305. Entidade Pedido. Datas com Instant e padrão ISO 8601 - PARTE 2
		
		/* lazy loading - quando existe uma associação 'para muitos', o JPA não carrega
		 * os objetos 'para muitos' a não ser que sejam acionados.
		 * 
		 */
		
		//306. Enum OrderStatus
		
		//307. Entidade Category
		
		/* Se relaciona/associa com product
		 */
		
		//308. Entidade Product
		
		/* Se relaciona/associa com category
		 */
		
		//309. Associação muitos-para-muitos com JoinTable
		
		/* Uma categoria pode ter vários produtos
		 * assim como um produto pode ter várias categorias
		 * Isso da visão OO;
		 * Em questão de db relacional, terá uma tabela de associação
		 * Então as classes deveram ser mapeadas (Product e Category, no caso) para que
		 * a tabela de associação apareça no db relacional
		 */
		
		//310. Entidade OrderItem. Associação muitos-para-muitos com dados extras - PARTE 1
		
		//311. Entidade OrderItem. Associação muitos-para-muitos com dados extras - PARTE 2
		
		//312. Associação muitos para muitos entre Product e OrderItem
		
		//313. Entidade Payment, associação um para um
		
		//314. Métodos subtotal e total
		
		//315. Inserção de User
		
		//316. Deleção de User
		
		//317. Atualização de User
		
		//318. Tratamento de exceção - findById (Erro 500 => Erro 404)
		
		//319. Tratamento de exceção - delete

	}

}
