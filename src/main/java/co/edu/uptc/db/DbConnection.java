package co.edu.uptc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class DbConnection {

	private Connection connection;
	private static String dataBaseUrl;
	private static String user;
	private static String password;
	
	
	public DbConnection () {
		dataBaseUrl = "jdbc:sqlserver://PP-PC:1433;databaseName=PrincipalDB;encrypt=false";
		user = "DFMJ8";
		password = "Brainstorm.9";
		startConnection();
	}
	
	public void startConnection() {
		try {
			connection = DriverManager.getConnection(dataBaseUrl, user, password);
			System.out.println("CONEXION EXITOSA :)");
		}catch(SQLException e) {
			System.out.println("ERROR DE TIPO "+e.getMessage());
		}
	}
	
	public void closeConnection() {
		try {
			connection.close();
		}catch(SQLException e){
			System.out.println("ERROR DE TIPO"+e.getMessage());
		}
	}
	
	public Connection getConnection() {
		return connection;
	}

	
}
