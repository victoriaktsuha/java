package application;

public class DBJDBC {

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

		
		//269.

	}

}
