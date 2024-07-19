package application;

public class DBJDBC {

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

		
		//269.

	}

}
