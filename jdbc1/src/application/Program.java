package application;

import java.sql.Connection;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		//Abre a conex�o com o banco - configurado na classe DB.java
		Connection conn = DB.getConnection();
		
		//Fecha a conex�o com o banco
		DB.closeConnection();

	}

}
