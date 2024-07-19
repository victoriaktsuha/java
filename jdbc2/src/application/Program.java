package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

/* Connection, ResultSet e Statement não são recursos controlados pela JVM
 * Então é interessante que esses recursos sejam fechados manualmente
 * para evitar memory leak
 * 
 */

public class Program {

	public static void main(String[] args) {
		
		//Abre a conexão com o banco - configurado na classe DB.java
		Connection conn = null;
		
		//Consulta o banco
		Statement st = null;
		
		//Armazena o resultado da consulta
		ResultSet rs = null;
		
		try {
			//abre a conexão com o banco
			conn = DB.getConnection();
			
			//instancia objeto do tipo statement
			st = conn.createStatement();
			
			//executa consulta no banco e armazena em formato tabela/matriz
			rs = st.executeQuery("select * from department");
						
			//percorre os dados e imprime
			while (rs.next()) {
				System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		/* Connection, ResultSet e Statement não são recursos controlados pela JVM
		 * Então é interessante que esses recursos sejam fechados manualmente
		 * para evitar memory leak
		 * 
		 */
		finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}

	}

}
