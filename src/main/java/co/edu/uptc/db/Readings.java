package co.edu.uptc.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Readings {
	private Connection connection;

	public Readings(Connection connection) {
		this.connection = connection;
	}

	public void executeQuery() {
		String sqlQuery = "SELECT * FROM EMPLEADOS";
		boolean emptyRow;
		try(java.sql.Statement statement = connection.createStatement()){
			try(ResultSet resultSet = statement.executeQuery(sqlQuery)){
				while(emptyRow = resultSet.next()){
					int idEmpleado = resultSet.getInt("idEmpleado");
					String nombreEmpleado = resultSet.getString("nombre");
					String apellidoEmpleado = resultSet.getString("apellido");
					int edad = resultSet.getInt("edad");
					System.out.println("IdEmpleado: "+idEmpleado+" Nombre: "+nombreEmpleado+" Apellido: "+apellidoEmpleado+" Edad: "+edad);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
