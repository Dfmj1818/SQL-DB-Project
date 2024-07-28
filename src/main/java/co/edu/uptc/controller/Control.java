package co.edu.uptc.controller;

import java.sql.Connection;

import co.edu.uptc.db.DbConnection;
import co.edu.uptc.db.Insertions;
import co.edu.uptc.db.Readings;

public class Control {
	
	private DbConnection dbConnection;
	private Connection connection;
	private Insertions insertions;
	private Readings readings;
	
	public Control() {
	    dbConnection = new DbConnection();    
	    this.connection = dbConnection.getConnection();
	    readings = new Readings(connection);
	    insertions = new Insertions(connection);
	}
	
	public void executeDataReader() {
		readings.executeQuery();
	}
	
	public void init() {
		executeDataReader();
	}
}
