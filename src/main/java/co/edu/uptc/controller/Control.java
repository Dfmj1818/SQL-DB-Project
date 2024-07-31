package co.edu.uptc.controller;

import java.sql.Connection;

import co.edu.uptc.db.DbConnection;
import co.edu.uptc.db.Deletions;
import co.edu.uptc.db.Insertions;
import co.edu.uptc.db.Readings;
import co.edu.uptc.view.IoManager;

public class Control {

	private DbConnection dbConnection;
	private Connection connection;
	private Insertions insertions;
	private Readings readings;
	private Deletions deletions;
	private IoManager ioManager;

	public Control() {
		dbConnection = new DbConnection();    
		this.connection = dbConnection.getConnection();
		readings = new Readings(connection);
		insertions = new Insertions(connection);
		ioManager = new IoManager();
		deletions = new Deletions(connection);
	}


	public void runPrincipalMenu() {
		int digitedOption = 0;
		String message = " ";
		
		digitedOption = ioManager.readInt("Ingrese el ID del Empleado que desea eliminar de la base de datos");
		message = deletions.deleteEmployee(digitedOption);
		ioManager.printMessage(message);
	}


	public void delete() {

	}

	public void init() {
		runPrincipalMenu();
	}
}
