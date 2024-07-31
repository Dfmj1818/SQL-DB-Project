package co.edu.uptc.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Readings {
	private Connection connection;

	public Readings(Connection connection) {
		this.connection = connection;
	}

	public void getEmployeeFromDb(int idEmpleado) {
		String readEmployeeQuery = "SELECT * FROM EMPLEADOS WHERE idEmpleado =?";
		
		boolean emptyRow = false;

		try(PreparedStatement preparedStatement = connection.prepareStatement(readEmployeeQuery)){
			preparedStatement.setInt(1, idEmpleado);
			preparedStatement.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
