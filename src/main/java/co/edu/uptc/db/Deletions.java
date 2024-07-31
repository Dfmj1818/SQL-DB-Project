package co.edu.uptc.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Deletions {
	private Connection connection;
	private String sqlDeleteQuery;
	private int rowsAffected;

	public Deletions(Connection connection) {
		this.connection = connection;
		sqlDeleteQuery = " ";
		rowsAffected = 0;
	}

	public String deleteEmployee(int employeeId) {
		sqlDeleteQuery = "DELETE FROM EMPLEADO WHERE idEmpleado =?";
        String message = " ";
        
		try(PreparedStatement preparedStatement = connection.prepareStatement(sqlDeleteQuery)){
			preparedStatement.setInt(1, employeeId);	
			rowsAffected = preparedStatement.executeUpdate();
			message = checkRowsAffected(rowsAffected);
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return message;
	}

	public String checkRowsAffected(int rowsAffected) {
		String message = " ";
		if(rowsAffected>0){
			message = "Registro eliminado Exitosamente :-)";
		}
		else {
			message = "No se encontro ningun registro asociado a este ID";
		}
		return message;
	}
}
