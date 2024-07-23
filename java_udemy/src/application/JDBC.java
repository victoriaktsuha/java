package application;

public class JDBC {

	public static void main(String[] args) {
		
		//266. Visão geral do JDBC
		
		/* 
		 * JDBC (Java Database Connectivity): API padrão do Java
		 * para acesso a dados - biblioteca que já vem no Java para 
		 * acessar algum banco de dados
		 * Packages: java.sql e javax.sql(API suplementar para servidores)
		 * A aplicação é convertida para os bancos de dados específicos
		 * através dos JDBC Drivers (PostgreSQL, Oracle, Sybase) para o código nativo
		 * apara acessar o banco de dados específico
		 */
		
		
		//267. Nivelamento: Álgebra Relacional e SQL
		
		/* Operações básicas da álgebra relacional
		 * - restrição
		 * - Projeção
		 * - Produto cartesiano
		 * - Junção (produto cartesiano + restrição de chaves correspondentes)
		 * 
		 * Operação "produto cartesiano"
		 * SELECT *
		 * FROM PRODUCT, CATEGORY
		 * Produto cartesiano: resultado da combinação de cada registro de uma tabela 
		 * com cada registro de outra tabela
		 * 
		 * 
		 * Operação "junção" 
		 * SELECT *
		 * FROM PRODUCT
		 * WHERE
		 * PRODUCT.CATEGORY_ID = CATEGORY.ID
		 * É um produto cartesiano mais uma restrição de chave estrangeira com chave primaria;
		 * Resultará em uma tabela com itens dos quais a chave estrangeira (ex.: CATEGORY_ID) é correspondente a
		 * chave primária (ex.: ID)
		 * 
		 * Outra opção:
		 * SELECT *
		 * FROM PRODUCT
		 * INNER JOIN CATEGORY cat
		 * ON PRODUCT.CATEGORY_ID = cat.ID
		 * 
		 * 
		 * Operação "restrição":
		 * SELECT * 
		 * FROM PRODUCT
		 * INNER JOIN CATEGORY cat ON PRODUCT.CATEGORY_ID = cat.ID
		 * WHERE CATEGORY.NAME = 'Computers'
		 * Resultará em uma tabela de acordo com a restrição especificada, como especificado
		 * em WHERE CATEGORY.NAME = 'Computers'
		 * 
		 * 
		 * Operação "projeção":
		 * SELECT PRODUCT.*, CATEGORY.NAME
		 * FROM PRODUCT
		 * INNER JOIN CATEGORY cat ON PRODUCT.CATEGORY_ID = cat.ID
		 * WHERE CATEGORY.NAME = 'Computers'
		 * Resultará em uma tabela de acordo com a restrição especificada, mas apenas com o
		 * nome da categoria, como especificado em SELECT
		 */
		
		
		//268. Instalação MySQL
		
		/* https://dev.mysql.com/downloads
		 * MySQL Community Server -> Go To Download Page -> MSI Installer (full)
		 */

		//269 e 270 - preparação do primeiro projeto no Eclipse Parte 1 e 2 ("jdbc1")
		
		/* (https://github.com/acenelio/jdbc1)
		 * 
		 * - Usando o MySQL Workbench, crie uma base de dados chamada "coursejdbc"
		 * 
		 * - Baixar o MySQL Java Connector
		 * 
		 * - Caso ainda não exista, criar uma User Library contendo o arquivo .jar do 
		 * driver do MySQL
		 * 		- Window -> Preferences -> Java -> Build path -> User Libraries
		 * 		- Dê o nome da User Library de MySQLConnector
		 * 		- Add external JARs -> (localize o arquivo jar)
		 * 
		 * - Criar um novo Java Project
		 * 		- Acrescentar a User Library MySQLConnector ao projeto
		 * 
		 * - Na pasta raiz do projeto, criar um arquivo "db.properties" contendo os 
		 * dados de conexão:
		 * 		user=developer
		 * 		password=1234567
		 * 		dburl=jdbc:mysql://localhost:3306/coursejdbc
		 * 		useSSL=false
		 * 
		 * - No pacote "db", criar uma exceção personalizada DbException
		 * 
		 * - No pacote "db", criar uma classe DB com métodos estáticos auxiliares
		 * 		- Obter e fechar uma conexão com o banco
		 */
		
		
		//271. Demo - Recuperar Dados ("jdbc2")
		
		/* SQL Script: https://github.com/acenelio/demo-dao-jdbc/blob/master/database.sql
		 * (https://github.com/acenelio/jdbc2)
		 * 
		 * API:
		 * - Statement
		 * - ResultSet
		 * - first() [move para posição 1, se houver]
		 * - beforeFirst() [move para posição 0]
		 * - next() [move para o próximo, retorna false se já estiver no último]
		 * - absolute(int) [move para a posição dada, lembrando que dados reais começam em 1]
		 * 
		 * Checklist:
		 * - Usar o script SQL para criar a base de dados "coursejdbc"
		 * - Fazer um pequeno programa para recuperar os departamentos
		 * - Na classe DB, criar métodos auxiliares estáticos para fechar ResultSet e Statement
		 * 
		 * Atenção: o objeto ResultSet contém os dados armazenados na forma de tabela
		 * 
		 */
		
		//272. Demo - inserir dados ("jdbc3")
		
		/* (https://github.com/acenelio/jdbc3)
		 * 
		 * API:
		 * - PreparedStatement
		 * - executeUpdate
		 * - Statement.RETURN_GENERATED_KEYS
		 * - getGeneratedKeys
		 * 
		 * Checklist:
		 * - Inserção simples com preparedStatement
		 * - Inserção com recuperação de Id
		 * 
		 */
		
		
		//273. Demo - atualizar dados (https://github.com/acenelio/jdbc4)
		
		/* Não dar "UPDATE sem WHERE"
		 * WHERE restringe/filtra quais items receberão a atualização
		 * Sem restrição, toda a tabela selecionada será afetada
		 * 
		 */
		
		//274. Demo - deletar dados (https://github.com/acenelio/jdbc5)

		/* Checklist:
		 * - Criar DbIntegrityException
		 * - Tratar a exceção de integridade referencial
		 * 
		 * PS.:! Chave estrangeira - valor atrelado a uma tabela que vem de outra tabela
		 * 
		 * Ao apagar um dado que ser de 'chave estrangeira' para outra tabela, 
		 * o item da outra tabela ficará com uma referência errada ocorrendo uma
		 * Falha de Integridade Referencial
		 * Criar uma exceção só para identificar esse tipo de erro.
		 * 
		 * Também não dar "DELETE sem WHERE"
		 */
		
		
		//275. Demo - Transações (https://github.com/acenelio/jdbc6)
		
		/* É uma operação que deve manter a consistência do banco de dados
		 * 
		 * A transação deve ter 4 propriedades:
		 * - Atomica: altera tudo ou altera nada
		 * - Consistente: começa e termina
		 * - Isolada
		 * - Durável
		 * (https://www.ibm.com/support/knowledgecenter/en/SSGMCP_5.4.0/product-overview/acid.html)
		 * 
		 * API:
		 * - setAutoCommit(false)
		 * - commit()
		 * - rollback()
		 * 
		 */
		
		
		//276. Padrão de projeto DAO (Data Access Object)
		
		/* Ideia geral do padrão DAO:
		 * - Para cada entidade, haverá um objeto responsável por fazer acesso a dados relacionado a esta
		 * entidade. Por exemplo:
		 * -- Cliente: ClienteDao
		 * -- Produto: ProdutoDao
		 * -- Pedido: PedidoDao
		 * -- Cada DAO será definido por uma interface.
		 * - A injeção de dependência pode ser feita por meio do padrão de projeto Factory
		 * 
		 */
		
		
		//277. PROJETO - criando projeto e repositório Git
		
		/* Project: http://github.com/acenelio/demo-dao-jdbc
		 * 
		 * Checklist:
		 * - Github: create a new project
		 * -- NOTE: choose .gitignore type as Java
		 * - Eclipse: create new java project with MySQLConnector library
		 * -- Copy db package and db.properties from: https://github.com/acenelio/jdbc5
		 * - Create local repository and push to Github:
		 * -- git init
		 * -- git remote add origin https://github.com/acenelio/jdbc-dao-demo.git
		 * -- git pull origin master
		 * -- git add .
		 * -- git commit -m "Project created"
		 * -- git push -u origin master
		 * 
		 */

		
		//278. Classe Department
		
		/* Entity class checklist:
		 * - Attributes
		 * - Constructors
		 * - Getters/Setters
		 * - hashCode and equals
		 * - toString
		 * - implements Serializable
		 * 
		 */
		
		
		//279. Classe Seller 
		
		//280. Interfaces DepartmentDao e SellerDao
		
		//281. SellerDaoJDBC e DaoFactory
		
		//283. Reutilizando a instanciação
		
		//284. Implementando findByDepartment
		
		//285. Implementando findAll
	
	}

}
