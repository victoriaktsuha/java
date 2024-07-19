package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

/* Connection, ResultSet e Statement não são recursos controlados pela JVM
 * Então é interessante que esses recursos sejam fechados manualmente
 * para evitar memory leak
 * 
 */

public class Program {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = DB.getConnection();
			
			//Adicionando um novo item a tabela seller
			//prepareStatement() espera uma string como comando sql / ? funciona como placeholder / retorna o id do novo item criado no db
			/*
			st = conn.prepareStatement("INSERT INTO seller (Name, Email, BirthDate, BaseSalary, DepartmentId) VALUES (?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
			
			//recebe a ordem da '?' e o valor a ser inserido nela
			st.setString(1, "Betty Pink");
			st.setString(2, "betty@mail.com");
			st.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
			st.setDouble(4, 3000.0);
			st.setInt(5, 4);
			*/
			
			//insere 2 departamentos ao mesmo tempo
			st = conn.prepareStatement("insert into department (name) values ('D1'),('D2')", Statement.RETURN_GENERATED_KEYS);
			
			//executeUpdate() o resultado é um numero inteiro indicando quantas linhas foram alteradas
			int rowsAffected = st.executeUpdate();
			
			if(rowsAffected > 0) {
				//getGeneratedKeys() retorna um objeto do tipo resultSet
				ResultSet rs = st.getGeneratedKeys();
				while(rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Done! Id = " + id);
				}
			}else {
				System.out.println("No rows affected!");
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		/*catch(ParseException e) {
			e.printStackTrace();
		}*/
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}
