package application;

public class JDBC {

	public static void main(String[] args) {
		
		//266. Vis�o geral do JDBC
		
		/* 
		 * JDBC (Java Database Connectivity): API padr�o do Java
		 * para acesso a dados - biblioteca que j� vem no Java para 
		 * acessar algum banco de dados
		 * Packages: java.sql e javax.sql(API suplementar para servidores)
		 * A aplica��o � convertida para os bancos de dados espec�ficos
		 * atrav�s dos JDBC Drivers (PostgreSQL, Oracle, Sybase) para o c�digo nativo
		 * apara acessar o banco de dados espec�fico
		 */
		
		
		//267. Nivelamento: �lgebra Relacional e SQL
		
		/* Opera��es b�sicas da �lgebra relacional
		 * - restri��o
		 * - Proje��o
		 * - Produto cartesiano
		 * - Jun��o (produto cartesiano + restri��o de chaves correspondentes)
		 * 
		 * Opera��o "produto cartesiano"
		 * SELECT *
		 * FROM PRODUCT, CATEGORY
		 * Produto cartesiano: resultado da combina��o de cada registro de uma tabela 
		 * com cada registro de outra tabela
		 * 
		 * 
		 * Opera��o "jun��o" 
		 * SELECT *
		 * FROM PRODUCT
		 * WHERE
		 * PRODUCT.CATEGORY_ID = CATEGORY.ID
		 * � um produto cartesiano mais uma restri��o de chave estrangeira com chave primaria;
		 * Resultar� em uma tabela com itens dos quais a chave estrangeira (ex.: CATEGORY_ID) � correspondente a
		 * chave prim�ria (ex.: ID)
		 * 
		 * Outra op��o:
		 * SELECT *
		 * FROM PRODUCT
		 * INNER JOIN CATEGORY cat
		 * ON PRODUCT.CATEGORY_ID = cat.ID
		 * 
		 * 
		 * Opera��o "restri��o":
		 * SELECT * 
		 * FROM PRODUCT
		 * INNER JOIN CATEGORY cat ON PRODUCT.CATEGORY_ID = cat.ID
		 * WHERE CATEGORY.NAME = 'Computers'
		 * Resultar� em uma tabela de acordo com a restri��o especificada, como especificado
		 * em WHERE CATEGORY.NAME = 'Computers'
		 * 
		 * 
		 * Opera��o "proje��o":
		 * SELECT PRODUCT.*, CATEGORY.NAME
		 * FROM PRODUCT
		 * INNER JOIN CATEGORY cat ON PRODUCT.CATEGORY_ID = cat.ID
		 * WHERE CATEGORY.NAME = 'Computers'
		 * Resultar� em uma tabela de acordo com a restri��o especificada, mas apenas com o
		 * nome da categoria, como especificado em SELECT
		 */
		
		
		//268. Instala��o MySQL
		
		/* https://dev.mysql.com/downloads
		 * MySQL Community Server -> Go To Download Page -> MSI Installer (full)
		 */

		//269 e 270 - prepara��o do primeiro projeto no Eclipse Parte 1 e 2 ("jdbc1")
		
		/* (https://github.com/acenelio/jdbc1)
		 * 
		 * - Usando o MySQL Workbench, crie uma base de dados chamada "coursejdbc"
		 * 
		 * - Baixar o MySQL Java Connector
		 * 
		 * - Caso ainda n�o exista, criar uma User Library contendo o arquivo .jar do 
		 * driver do MySQL
		 * 		- Window -> Preferences -> Java -> Build path -> User Libraries
		 * 		- D� o nome da User Library de MySQLConnector
		 * 		- Add external JARs -> (localize o arquivo jar)
		 * 
		 * - Criar um novo Java Project
		 * 		- Acrescentar a User Library MySQLConnector ao projeto
		 * 
		 * - Na pasta raiz do projeto, criar um arquivo "db.properties" contendo os 
		 * dados de conex�o:
		 * 		user=developer
		 * 		password=1234567
		 * 		dburl=jdbc:mysql://localhost:3306/coursejdbc
		 * 		useSSL=false
		 * 
		 * - No pacote "db", criar uma exce��o personalizada DbException
		 * 
		 * - No pacote "db", criar uma classe DB com m�todos est�ticos auxiliares
		 * 		- Obter e fechar uma conex�o com o banco
		 */
		
		
		//271. Demo - Recuperar Dados ("jdbc2")
		
		/* SQL Script: https://github.com/acenelio/demo-dao-jdbc/blob/master/database.sql
		 * (https://github.com/acenelio/jdbc2)
		 * 
		 * API:
		 * - Statement
		 * - ResultSet
		 * - first() [move para posi��o 1, se houver]
		 * - beforeFirst() [move para posi��o 0]
		 * - next() [move para o pr�ximo, retorna false se j� estiver no �ltimo]
		 * - absolute(int) [move para a posi��o dada, lembrando que dados reais come�am em 1]
		 * 
		 * Checklist:
		 * - Usar o script SQL para criar a base de dados "coursejdbc"
		 * - Fazer um pequeno programa para recuperar os departamentos
		 * - Na classe DB, criar m�todos auxiliares est�ticos para fechar ResultSet e Statement
		 * 
		 * Aten��o: o objeto ResultSet cont�m os dados armazenados na forma de tabela
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
		 * - Inser��o simples com preparedStatement
		 * - Inser��o com recupera��o de Id
		 * 
		 */
		
		
		//273. Demo - atualizar dados (https://github.com/acenelio/jdbc4)
		
		/* N�o dar "UPDATE sem WHERE"
		 * WHERE restringe/filtra quais items receber�o a atualiza��o
		 * Sem restri��o, toda a tabela selecionada ser� afetada
		 * 
		 */
		
		//274. Demo - deletar dados (https://github.com/acenelio/jdbc5)

		/* Checklist:
		 * - Criar DbIntegrityException
		 * - Tratar a exce��o de integridade referencial
		 * 
		 * PS.:! Chave estrangeira - valor atrelado a uma tabela que vem de outra tabela
		 * 
		 * Ao apagar um dado que ser de 'chave estrangeira' para outra tabela, 
		 * o item da outra tabela ficar� com uma refer�ncia errada ocorrendo uma
		 * Falha de Integridade Referencial
		 * Criar uma exce��o s� para identificar esse tipo de erro.
		 * 
		 * Tamb�m n�o dar "DELETE sem WHERE"
		 */
		
		
		//275. Demo - Transa��es (https://github.com/acenelio/jdbc6)
		
		/* � uma opera��o que deve manter a consist�ncia do banco de dados
		 * 
		 * A transa��o deve ter 4 propriedades:
		 * - Atomica: altera tudo ou altera nada
		 * - Consistente: come�a e termina
		 * - Isolada
		 * - Dur�vel
		 * (https://www.ibm.com/support/knowledgecenter/en/SSGMCP_5.4.0/product-overview/acid.html)
		 * 
		 * API:
		 * - setAutoCommit(false)
		 * - commit()
		 * - rollback()
		 * 
		 */
		
		
		//276. Padr�o de projeto DAO (Data Access Object)
		
		/* Ideia geral do padr�o DAO:
		 * - Para cada entidade, haver� um objeto respons�vel por fazer acesso a dados relacionado a esta
		 * entidade. Por exemplo:
		 * -- Cliente: ClienteDao
		 * -- Produto: ProdutoDao
		 * -- Pedido: PedidoDao
		 * -- Cada DAO ser� definido por uma interface.
		 * - A inje��o de depend�ncia pode ser feita por meio do padr�o de projeto Factory
		 * 
		 */
		
		
		//277. PROJETO - criando projeto e reposit�rio Git
		
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
		
		//283. Reutilizando a instancia��o
		
		//284. Implementando findByDepartment
		
		//285. Implementando findAll
	
	}

}
