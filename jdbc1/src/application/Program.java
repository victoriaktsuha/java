package application;

import java.sql.Connection;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		//Abre a conexão com o banco - configurado na classe DB.java
		Connection conn = DB.getConnection();
		
		//Fecha a conexão com o banco
		DB.closeConnection();

	}

}
