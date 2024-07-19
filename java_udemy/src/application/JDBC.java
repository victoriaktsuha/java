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
		
		
		

	}

}
